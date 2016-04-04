package de.cau.cs.se.instrumentation.rl.generator.java.record

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.generator.InternalErrorException
import de.cau.cs.se.instrumentation.rl.recordLang.ArrayLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize
import de.cau.cs.se.instrumentation.rl.recordLang.BaseType
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.BuiltInValueLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.ComplexType
import de.cau.cs.se.instrumentation.rl.recordLang.Constant
import de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Literal
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation
import java.io.File
import java.util.ArrayList
import java.util.Calendar
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension de.cau.cs.se.instrumentation.rl.generator.java.IRL2JavaTypeMappingExtensions.*

class RecordTypeGenerator extends AbstractRecordTypeGenerator {

	/**
	 * Return the unique id.
	 */
	override getId() '''java'''
	
	/**
	 * Return the preferences activation description.
	 */
	override getDescription() '''Java record generator'''
	
	/**
	 * Java requires abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { true }
	
	/**
	 * Define language/generation type, which is also used to define the outlet.
	 */
	override getOutletType() '''java'''
	
	/**
	 * Compute the directory name for a record type.
	 */
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''

	/**
	 * Compute file name.
	 */
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name».java'''
	
	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version) {
		val serialUID = ComputeUID.computeDefaultSUID(type) + 'L'
		val allDataProperties = PropertyEvaluation::collectAllDataProperties(type)
		val allDeclarationProperties = collectAllDeclarationProperties(type)
		val definedAuthor = if (type.author == null) author else type.author
		val definedVersion = if (type.since == null) version else type.since
		'''
		/***************************************************************************
		 * Copyright «Calendar.getInstance().get(Calendar.YEAR)» Kieker Project (http://kieker-monitoring.net)
		 *
		 * Licensed under the Apache License, Version 2.0 (the "License");
		 * you may not use this file except in compliance with the License.
		 * You may obtain a copy of the License at
		 *
		 *     http://www.apache.org/licenses/LICENSE-2.0
		 *
		 * Unless required by applicable law or agreed to in writing, software
		 * distributed under the License is distributed on an "AS IS" BASIS,
		 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		 * See the License for the specific language governing permissions and
		 * limitations under the License.
		 ***************************************************************************/
		
		package «(type.eContainer as Model).name»;
		
		«IF (!type.abstract)»import java.nio.BufferOverflowException;
		«ENDIF»import java.nio.BufferUnderflowException;
		import java.nio.ByteBuffer;

		«IF (type.parent == null)»import kieker.common.record.AbstractMonitoringRecord;
		import kieker.common.record.IMonitoringRecord;
		«ENDIF»import kieker.common.util.registry.IRegistry;
		import kieker.common.util.Version;
		
		«if (type.parent != null) type.createParentImport»
		«if (type.parents != null && type.parents.size > 0) type.parents.map[i | i.createInterfaceImport].join»
		
		/**
		 * @author «definedAuthor»
		 * 
		 * @since «definedVersion»
		 */
		public «if (type.abstract) 'abstract '»class «type.name» extends «type.createParent»«type.createImplements» {
			«IF (!type.abstract) »/** Descriptive definition of the serialization size of the record. */
			public static final int SIZE = «if (allDataProperties.size == 0) '0' else allDataProperties.map[property | property.createSizeConstant(type)].join('\n\t\t + ')»
			;
			«ENDIF»
			private static final long serialVersionUID = «serialUID»;
			
			«IF (!type.abstract) »public static final Class<?>[] TYPES = {
				«allDataProperties.map[property | property.createPropertyType(type)].join»
			};«ENDIF»
			
			/* user-defined constants */
			«type.constants.map[const | createDefaultConstant(const)].join»
			/* default constants */
			«val filteredProperties = allDeclarationProperties.filter[it.value != null || PropertyEvaluation::findType(it).type.name.equals('string')]»
			«filteredProperties.map[property | createDefaultConstant(property)].join»
			/* property declarations */
			«allDeclarationProperties.map[property | createPropertyDeclaration(property)].join»
		
			/**
			 * Creates a new instance of this class using the given parameters.
			 * 
			 «allDataProperties.map[property |createPropertyComment(property)].join»
			 */
			public «type.name»(«allDataProperties.map[property | createPropertyParameter(property)].join(', ')») {
				«if (type.parent!=null) 'super('+PropertyEvaluation::collectAllDataProperties(type.parent).map[name].join(', ')+');'»
				«allDeclarationProperties.map[property | createPropertyAssignment(property)].join»
			}
		
			«IF (!type.abstract)»
			/**
			 * This constructor converts the given array into a record.
			 * It is recommended to use the array which is the result of a call to {@link #toArray()}.
			 * 
			 * @param values
			 *            The values for the record.
			 */
			public «type.name»(final Object[] values) { // NOPMD (direct store of values)
				«IF (type.parent==null)»AbstractMonitoringRecord.checkArray(values, TYPES);
				«ELSE»super(values, TYPES);
				«ENDIF»«allDeclarationProperties.createPropertyGenericAssignments(if (type.parent!=null) PropertyEvaluation::collectAllDataProperties(type.parent).size else 0)»
			}
			«ENDIF»
			
			/**
			 * This constructor uses the given array to initialize the fields of this record.
			 * 
			 * @param values
			 *            The values for the record.
			 * @param valueTypes
			 *            The types of the elements in the first array.
			 */
			protected «type.name»(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
				«IF (type.parent==null)»AbstractMonitoringRecord.checkArray(values, valueTypes);
				«ELSE»super(values, valueTypes);
				«ENDIF»«allDeclarationProperties.createPropertyGenericAssignments(if (type.parent!=null) PropertyEvaluation::collectAllDataProperties(type.parent).size else 0)»
			}
		
			/**
			 * This constructor converts the given array into a record.
			 * 
			 * @param buffer
			 *            The bytes for the record.
			 * 
			 * @throws BufferUnderflowException
			 *             if buffer not sufficient
			 */
			public «type.name»(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
				«IF (type.parent!=null)»super(buffer, stringRegistry);
				«ENDIF»«allDeclarationProperties.map[property | createPropertyBinaryDeserialization(property)].join('\n')»
			}
		
		«IF (!type.abstract)»
			/**
			 * {@inheritDoc}
			 */
			@Override
			public Object[] toArray() {
				return new Object[] {
					«allDataProperties.map[property | createPropertyArrayEntry(property)].join(',\n')»
				};
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void registerStrings(final IRegistry<String> stringRegistry) {	// NOPMD (generated code)
				«allDataProperties.map[
					val classifier = PropertyEvaluation.findType(it)
					if (classifier.type.name == 'string') {
						'''stringRegistry.get(this.«buildPropertyReadAccessorName(it, classifier)»);'''
					}
				].filterNull.join('\n')»
			}
		
			/**
			 * {@inheritDoc}
			 */
			@Override
			public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
				«allDataProperties.map[property | createPropertyBinarySerialization(property)].join('\n')»
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public Class<?>[] getValueTypes() {
				return TYPES; // NOPMD
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public int getSize() {
				return SIZE;
			}
		«ENDIF»
			/**
			 * {@inheritDoc}
			 * 
			 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.
			 */
			@Override
			@Deprecated
			public void initFromArray(final Object[] values) {
				throw new UnsupportedOperationException();
			}
		
			/**
			 * {@inheritDoc}
			 * 
			 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.
			 */
			@Override
			@Deprecated
			public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
				throw new UnsupportedOperationException();
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public boolean equals(final Object obj) {
				if (obj == null) return false;
				if (obj == this) return true;
				if (obj.getClass() != this.getClass()) return false;
				
				final «type.name» castedRecord = («type.name») obj;
				if (this.getLoggingTimestamp() != castedRecord.getLoggingTimestamp()) return false;
				«allDataProperties.map[
					val classifier = PropertyEvaluation::findType(it)
					val getterName = buildPropertyReadAccessorName(it, classifier)
					val typeName = classifier.type.name
					switch (typeName) {
						case 'string': 
							'''if (!this.«getterName».equals(castedRecord.«getterName»)) return false;'''
						case 'float': 
							'''if (isNotEqual(this.«getterName», castedRecord.«getterName»)) return false;'''
						case 'double': 
							'''if (isNotEqual(this.«getterName», castedRecord.«getterName»)) return false;'''
						default: 
							'''if (this.«getterName» != castedRecord.«getterName») return false;'''
					}
				].join('\n')»
				return true;
			}
		
			«type.collectAllGetterDeclarationProperties.map[property | createPropertyGetter(property)].join»
		}
		'''
	}

	/**
	 * Determine the size of one type.
	 * 
	 * @param property
	 * 		property which serialization size is determined.
	 * 
	 * @returns
	 * 		the serialization size of the property
	 */
	private def createSizeConstant(Property property, RecordType type) {
		switch (PropertyEvaluation::findType(property).type.name) {
			case 'string' : 'TYPE_SIZE_STRING'
			case 'byte' : 'TYPE_SIZE_BYTE'
			case 'short' : 'TYPE_SIZE_SHORT'
			case 'int' : 'TYPE_SIZE_INT'
			case 'long' : 'TYPE_SIZE_LONG'
			case 'float' : 'TYPE_SIZE_FLOAT'
			case 'double' : 'TYPE_SIZE_DOUBLE'
			case 'char' : 'TYPE_SIZE_CHARACTER'
			case 'boolean' : 'TYPE_SIZE_BOOLEAN'
			default: throw new InternalErrorException(PropertyEvaluation::findType(property).type.name + 'is not a valid type name')
		} + ''' // «property.computeFullQualifiedPropertyName(type)»'''
	}
	
	/**
	 * Determine the name of the parent class.
	 */
	private def CharSequence createParent(RecordType type) {
		if (type.parent!=null) type.parent.name else 'AbstractMonitoringRecord'
	}
		
	/**
	 * Create the sequence of implements of the class and render the implements char sequence.
	 */
	private def CharSequence createImplements(RecordType type) {
		val List<CharSequence> interfaces = new ArrayList() 
		if (type.parent == null) { // only add these interfaces for classes directly inheriting AbstractMonitoringRecord
			interfaces.add('IMonitoringRecord.Factory')
			interfaces.add('IMonitoringRecord.BinaryFactory')
		}
		if (type.parents != null && type.parents.size > 0) {
			interfaces.addAll(type.parents.map[iface | iface.name]);
		}

		if (interfaces.size > 0)
			return ''' implements «interfaces.join(', ')»'''
		else
			return ' '
	} 
			
	/**
	 * Create a list of imports for the given type.
	 */	
	private def createInterfaceImport(TemplateType type) '''import «(type.eContainer as Model).name».«type.name»;
	'''
	
	/**
	 * Create import for the parent structure.
	 */
	private def createParentImport(RecordType type) '''import «(type.parent.eContainer as Model).name».«type.parent.name»;
		'''

	/**
	 * Determine the correct deserialization code for a property by type.
	 * 
	 * @param property
	 * 		the property to deserialize
	 * 
	 * @returns
	 * 		code to deserialize the given property 
	 */
	private def createPropertyBinaryDeserialization(Property property) {
		if (PropertyEvaluation::findType(property).sizes.size > 0) {
			val sizes = PropertyEvaluation::findType(property).sizes
			'''
				// load array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.name»_size«sizes.indexOf(size)» = buffer.getInt();
					«ENDIF»
				«ENDFOR»
				this.«property.name.protectKeywords» = new «PropertyEvaluation::findType(property).createTypeInstantiationName(property.name)»;
				«createForLoopForDeserialization(sizes,0,property)»
			'''
		} else
			'''this.«property.name.protectKeywords» = «PropertyEvaluation::findType(property).type.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	/**
	 * Determine the name and additional array sizes for an array deserialization.
	 * For example property[2][_property_size1][6] or just property for simple fields
	 */
	private def CharSequence createTypeInstantiationName(Classifier classifier, String name) {
		if (classifier.sizes.size>0)
			classifier.type.createPrimitiveTypeName + 
			classifier.sizes.map[size | size.createArraySize(name,classifier.sizes.indexOf(size)) ].join
		else
			classifier.type.createPrimitiveTypeName
	}
	
	/**
	 * Creates code for fixed and runtime array sizes according to the record model.
	 */
	private def createArraySize(ArraySize size, String name, int index) {
		if (size.size > 0)
			'''[«size.size»]'''
		else
			'''[_«name»_size«index»]'''
	}
	
	/**
	 * Create for loops for the deserialization of array data.
	 */
	private def CharSequence createForLoopForDeserialization(EList<ArraySize> sizes, int depth, Property property) '''
		for (int i«depth»=0;i«depth»<«if (sizes.get(depth).size > 0) sizes.get(depth).size else 
			'_' + property.name + '_size' + depth»;i«depth»++)
			«if (sizes.size-1 > depth)
				createForLoopForDeserialization(sizes,depth+1,property)
			else
				createValueAssignmentForDeserialization(sizes,property)»
	'''
	
	/**
	 * Assignment for a primitive value
	 */
	private def createValueAssignmentForDeserialization(EList<ArraySize> sizes, Property property) {
		return '''this.«property.name»«sizes.determineArrayAccessCode» = «PropertyEvaluation::findType(property).type.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	/**
	 * Used in serialization and deserialization to compose a sequence of [iX] for every 
	 * dimension of an array containing the counter variable. If the variable is primitive
	 * the function returns an empty string. 
	 */
	private def CharSequence determineArrayAccessCode(EList<ArraySize> sizes) {
		var String result = ''
		for (i : 0 ..< sizes.size) 
			result = '''«result»[i«i»]'''
		return result
	}
	
	/**
	 * Create code to get values from the input buffer.
	 */
	private def createPropertyPrimitiveTypeDeserialization(BaseType classifier) {
		switch (classifier.name) {
			case 'string' : '''stringRegistry.get(buffer.getInt())'''
			case 'byte' : '''buffer.get()'''
			case 'short' : '''buffer.getShort()'''
			case 'int' : '''buffer.getInt()'''
			case 'long' : '''buffer.getLong()'''
			case 'float' : '''buffer.getFloat()'''
			case 'double' : '''buffer.getDouble()'''
			case 'char' : '''buffer.getChar()'''
			case 'boolean' : '''buffer.get()==1?true:false'''
			
		}
	}
		
	/**
	 * Determine the correct serialization for a property by type.
	 * 
	 * @param property
	 * 		the property to serialize
	 * 
	 * @returns
	 * 		code to serialize the given property
	 */
	private def createPropertyBinarySerialization(Property property) {
		val sizes = PropertyEvaluation::findType(property).sizes
		if (sizes.size > 0) {
			'''
				// store array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.name»_size«sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(sizes.indexOf(size))».length;
						buffer.putInt(_«property.name»_size«sizes.indexOf(size)»);
					«ENDIF»
				«ENDFOR»
				«createForLoopForSerialization(sizes,0,property)»
			'''
		} else {
			createValueStoreForSerialization(property)
		}
	}
	
	/**
	 * This produces a sequence of [0] assuming that arrays follow a matrix layout.
	 */
	private def createCodeToDetermineArraySize(int count) {
		var String result = ''
		var i = 0
		while (i < count) {
			result = result + '[0]'
			i=i+1	
		}
		return result
	}

	private def CharSequence createForLoopForSerialization(EList<ArraySize> sizes, int depth, Property property) {
		'''
			for (int i«depth»=0;i«depth»<«if (sizes.get(depth).size > 0) sizes.get(depth).size else 
				'_' + property.name + '_size' + depth»;i«depth»++)
				«if (sizes.size-1 > depth)
					createForLoopForSerialization(sizes,depth+1,property)
				else
					createValueStoreForSerialization(property)»
		'''
	}
	
	private def createValueStoreForSerialization(Property property) {
		val classifier = PropertyEvaluation::findType(property)
		val getterName = "this." + buildPropertyReadAccessorName(property, classifier)
		switch (classifier.type.name) {
			case 'string' : '''buffer.putInt(stringRegistry.get(«getterName»));'''
			case 'byte' : '''buffer.put((byte)«getterName»);'''
			case 'short' : '''buffer.putShort(«getterName»);'''
			case 'int' : '''buffer.putInt(«getterName»);'''
			case 'long' : '''buffer.putLong(«getterName»);'''
			case 'float' : '''buffer.putFloat(«getterName»);'''
			case 'double' : '''buffer.putDouble(«getterName»);'''
			case 'char' : '''buffer.putChar(«getterName»);'''
			case 'boolean' : '''buffer.put((byte)(«getterName»?1:0));'''
		}
	}
	
	/**
	 * @return get/is + "capitalized property name" + "()" + "array access code"
	 */
	private def buildPropertyReadAccessorName(Property property, Classifier classifier) {
		val sizes = classifier.sizes
		'''«property.createGetterName»()«sizes.determineArrayAccessCode»'''
	}
	
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	private def createPropertyGetter(Property property) '''
		public final «PropertyEvaluation::findType(property).createTypeName» «property.createGetterName»() {
			return this.«property.resolveName»;
		}
		
	'''
		
	/**
	 * Returns the name of a property for the object array composition
	 * 
	 * @param property
	 * 		 a property of the record type
	 * 
	 * @returns the resulting array entry
	 */
	private def createPropertyArrayEntry(Property property) '''this.«property.createGetterName»()'''
	
	/**
	 * Returns the correct name for a getter following Java conventions.
	 * 
	 * @param property
	 * 		a property of a record type
	 * 
	 * @returns the name of the getter of the property
	 */
	private def CharSequence createGetterName(Property property) {
		if (PropertyEvaluation::findType(property).type.name.equals('boolean')) 
			'''is«property.name.toFirstUpper»'''
		else
			'''get«property.name.toFirstUpper»'''
	}
	
	/**
	 * Determine the implementation property name of a property by following the alias graph.
	 * 
	 * @param property
	 * 		The property to resolve
	 * 
	 * @returns the implementation name of the property
	 */
	private def CharSequence resolveName(Property property) {
		if (property.referTo != null)
			return '''«property.referTo.createGetterName»()'''
		else
			return property.name.protectKeywords
	}
	
	/**
	 * Create all assignments for the generic constructor based on property name and an array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param offset
	 * 		the array offset
	 * 
	 * @returns all assignments for the given property list
	 */
	private def createPropertyGenericAssignments(Iterable<Property> list, int offset) {
		val EList<CharSequence> r = new BasicEList<CharSequence>()
		list.forEach[property, index| r.add(property.createPropertyGenericAssignment(index+offset))]
		return r.join
	}
	
	/**
	 * Create an assignment with a property as assignment target and an array value as source.
	 * Used in the generic constructor.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param index
	 * 		the array index
	 * 
	 * @returns one assignment
	 */
	private def String createPropertyGenericAssignment(Property property, int index) '''this.«property.name.protectKeywords» = («PropertyEvaluation::findType(property).createObjectTypeName») values[«index»];
	'''
	
	/**
	 * Create an assignment with a property as assignment target and an array value as source.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param index
	 * 		the array index
	 * 
	 * @returns one assignment
	 */
	private def createPropertyAssignment(Property property) {
		if ('string'.equals(PropertyEvaluation::findType(property).type.name)) { // guarantee initialization is always not null
			'''this.«property.name.protectKeywords» = «property.name.protectKeywords» == null?«if (property.value != null) property.value.createConstantReference(property) else '""'»:«property.name.protectKeywords»;
			'''
		} else
			'''this.«property.name.protectKeywords» = «property.name.protectKeywords»;
			'''
	}
	
	private def createConstantReference(Literal literal, Property property) {
		switch (literal) {
			StringLiteral : property.name.createConstantName.protectKeywords
			ConstantLiteral : literal.value.name
			BuiltInValueLiteral : property.name.createConstantName.protectKeywords
			default : throw new InternalErrorException("constant reference requested for " + literal.class + " which is not defined.")
		}
	}
	
	/**
	 * Create one entry for the constructor parameter sequence.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one parameter for the given property
	 */
	private def createPropertyParameter(Property property) '''final «PropertyEvaluation::findType(property).createTypeName» «property.name.protectKeywords»'''
	
	/**
	 * Create an arbitrary comment for a property of a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one comment
	 */
	private def createPropertyComment(Property property)
	'''
	* @param «property.name.protectKeywords»
	*            «property.name.protectKeywords»
	'''
	
	/**
	 * Create a property declaration for a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns  one property declaration
	 */
	private def createPropertyDeclaration(Property property) '''private final «PropertyEvaluation::findType(property).createTypeName» «property.name.protectKeywords»;
	'''
	
	/**
	 * Check whether a given name is identical to a keyword of the target language and prepends an _. 
	 */
	private def protectKeywords(String name) {
		val keywords = #[ 'interface', 'class', 'private', 'protected', 'public', 'return', 'final', 'volatile', 'if', 'else', 'for', 'foreach' ]
		if (keywords.exists[it.equals(name)])
			'_' + name
		else
			name
	}
	
	/**
	 * Create one entry of the property type array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one type entry 
	 */
	private def createPropertyType(Property property, RecordType type) '''«PropertyEvaluation::findType(property).createTypeName».class, // «property.computeFullQualifiedPropertyName(type)»
	'''
	
	/**
	 * Compute the full qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	private def CharSequence computeFullQualifiedPropertyName(Property property, RecordType type) {
		if (type.properties.contains(property)) { 
			return type.name + '.' + property.name
		} else {
			if (type.parent!=null) {
				val result = property.computeFullQualifiedPropertyName(type.parent)
				if (result != null)
					return result
			}
			
			if (type.parents != null) {
				for (ComplexType t : type.parents) {
					val result = property.computeFullQualifiedPropertyName(t)
					if (result != null)
						return result
				}
			}
			return null
		}
	}
	
	/**
	 * Compute the full qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	private def CharSequence computeFullQualifiedPropertyName(Property property, ComplexType type) {
		if (type.properties.contains(property))
			return type.name + '.' + property.name
		else if (type.parents != null) {
			for (ComplexType t : type.parents) {
				val result2 = property.computeFullQualifiedPropertyName(t)
				if (result2 != null)
					return result2
			}
		}
		return null
	}
	
	/**
	 * create a constant name from a standard name camel case name.
	 */
	private def createConstantName(String name) {
		// CaMeL -> CA_ME_L
		return name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase
	}
	
	/**
	 * Create a property constant based on the language constant expression.
	 * 
	 * @param constant
	 * 		a default constant object
	 * 
	 * @returns a constant declaration
	 */
	private def createDefaultConstant(Constant constant) '''
		public static final «constant.type.createTypeName» «constant.name.protectKeywords» = «constant.value.createLiteral»;
	'''
	
	/**
	 * Create a property constant based on the language property expression.
	 * 
	 * @param property
	 * 		a default constant object
	 * 
	 * @returns a constant declaration
	 */
	private def createDefaultConstant(Property property) '''
		public static final «property.type.createTypeName» «property.name.createConstantName.protectKeywords» = «if (property.value==null) '""' else property.value.createLiteral»;
	'''
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	private def createTypeName(Classifier classifier) {
		if (classifier.sizes.size > 0)
			classifier.createArrayTypeName
		else
			classifier.type.createPrimitiveTypeName
	}
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	private def createObjectTypeName(Classifier classifier) {
		if (classifier.sizes.size > 0)
			classifier.createArrayTypeName
		else
			classifier.type.createPrimitiveWrapperTypeName
	}
	
	/**
	 * Determine the right Java string for a given system array type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	private def createArrayTypeName(Classifier classifier) {
		val primitiveTypeName = classifier.type.createPrimitiveTypeName
		val arrayBrackets = classifier.sizes.map[size | '''[]''' ].join
		primitiveTypeName + arrayBrackets
	}
	
	/**
	 * Collect recursively a list of all properties which are defined in an template and
	 * not inherited from predecessors.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require getters
	 */
	private def List<Property> collectAllGetterDeclarationProperties(RecordType type) {
		var List<Property> result = PropertyEvaluation::collectAllProperties(type)
		if (type.parent != null)
			return result.removeAlreadyImplementedProperties(type.parent)
		else
			return result
	}
	
	
	/**
	 * Collect all properties which must be declared for this type. In total that are:
	 * - properties declared by the type, which are not an alias.
	 * - properties declared by any imported interface, which are not implemented in a parent type
	 *   and which are not an alias.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require declaration
	 */
	private def List<Property> collectAllDeclarationProperties(RecordType type) {
		var List<Property> properties = new ArrayList<Property>() 
		properties.addAll(PropertyEvaluation::collectAllTemplateProperties(type))
		properties.addAll(type.properties)
		
		val List<Property> declarationProperties = new ArrayList<Property>()
		properties.forEach[property | if (property.referTo == null) declarationProperties.add(property)]
				
		if (type.parent != null)
			return declarationProperties.removeAlreadyImplementedProperties(type.parent)
		else
			return declarationProperties
	}
	
	/**
	 * Find properties implemented in a type and remove them from the list of properties.
	 * 
	 * @param type
	 * 		the parent type of the type where the property list belongs to
	 * 
	 * @returns
	 * 		the remaining list of properties
	 */
	private def List<Property> removeAlreadyImplementedProperties(List<Property> list, RecordType parentType) {
		val List<Property> allParentProperties = PropertyEvaluation::collectAllProperties(parentType)
		var result = list // necessary for the loop below. very ugly 
		for (Property parentProperty : allParentProperties) {
			val property = result.findFirst[it.name.equals(parentProperty.name)]
			result.remove(property)
		}
				
		return result
	}
			
	/**
	 * Literal mapping
	 */
	private def CharSequence createLiteral(Literal literal) {
		switch (literal) {
			IntLiteral: '''«literal.value»«if (literal.getRequiredType.name.equals('long')) 'L'»'''
			FloatLiteral: '''«literal.value»«if (literal.getRequiredType.name.equals('float')) 'f'»'''
			BooleanLiteral: '''«if (literal.value) 'true' else 'false'»'''
			ConstantLiteral: '''«literal.value.name»'''
			BuiltInValueLiteral case "KIEKER_VERSION".equals(literal.value): '''kieker.common.util.Version.getVERSION()'''
			StringLiteral case literal.getRequiredType.name.equals('string'): '''"«literal.value»"'''
			StringLiteral case literal.getRequiredType.name.equals('char'): '\'' + literal.value + '\''
			ArrayLiteral: '''{ «literal.literals.map[element | element.createLiteral].join(if (literal.literals.get(0) instanceof ArrayLiteral) ",\n" else ", ")» }'''
			default: 'ERROR ' + literal.class.name
		}	
	}
		
	/**
	 * Resolve the primitive type for the given literal.
	 */
	private def BaseType getRequiredType(Literal literal) {
		switch (literal.eContainer) {
			Constant : (literal.eContainer as Constant).type.type
			Property : (literal.eContainer as Property).type.type
			Literal : (literal.eContainer as Literal).getRequiredType
		}
	}
}
