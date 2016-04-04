/*
 * generated by Xtext
 */
package de.cau.cs.se.instrumentation.rl.serializer;

import com.google.inject.Inject;
import de.cau.cs.se.instrumentation.rl.recordLang.ArrayLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.BaseType;
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.BuiltInValueLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Constant;
import de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.ForeignKey;
import de.cau.cs.se.instrumentation.rl.recordLang.Import;
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;
import de.cau.cs.se.instrumentation.rl.services.RecordLangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RecordLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RecordLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RecordLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RecordLangPackage.ARRAY_LITERAL:
				sequence_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
				return; 
			case RecordLangPackage.ARRAY_SIZE:
				sequence_ArraySize(context, (ArraySize) semanticObject); 
				return; 
			case RecordLangPackage.BASE_TYPE:
				sequence_BaseType(context, (BaseType) semanticObject); 
				return; 
			case RecordLangPackage.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case RecordLangPackage.BUILT_IN_VALUE_LITERAL:
				sequence_BuiltInValueLiteral(context, (BuiltInValueLiteral) semanticObject); 
				return; 
			case RecordLangPackage.CLASSIFIER:
				sequence_Classifier(context, (Classifier) semanticObject); 
				return; 
			case RecordLangPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case RecordLangPackage.CONSTANT_LITERAL:
				sequence_ConstantLiteral(context, (ConstantLiteral) semanticObject); 
				return; 
			case RecordLangPackage.FLOAT_LITERAL:
				sequence_FloatLiteral(context, (FloatLiteral) semanticObject); 
				return; 
			case RecordLangPackage.FOREIGN_KEY:
				sequence_ForeignKey(context, (ForeignKey) semanticObject); 
				return; 
			case RecordLangPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case RecordLangPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case RecordLangPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RecordLangPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case RecordLangPackage.RECORD_TYPE:
				sequence_RecordType(context, (RecordType) semanticObject); 
				return; 
			case RecordLangPackage.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			case RecordLangPackage.TEMPLATE_TYPE:
				sequence_TemplateType(context, (TemplateType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Literal returns ArrayLiteral
	 *     ArrayLiteral returns ArrayLiteral
	 *
	 * Constraint:
	 *     (literals+=Literal literals+=Literal*)
	 */
	protected void sequence_ArrayLiteral(ISerializationContext context, ArrayLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArraySize returns ArraySize
	 *
	 * Constraint:
	 *     size=INT?
	 */
	protected void sequence_ArraySize(ISerializationContext context, ArraySize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns BaseType
	 *     BaseType returns BaseType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BaseType(ISerializationContext context, BaseType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns BooleanLiteral
	 *     BooleanLiteral returns BooleanLiteral
	 *
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(ISerializationContext context, BooleanLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns BuiltInValueLiteral
	 *     BuiltInValueLiteral returns BuiltInValueLiteral
	 *
	 * Constraint:
	 *     value='KIEKER_VERSION'
	 */
	protected void sequence_BuiltInValueLiteral(ISerializationContext context, BuiltInValueLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.BUILT_IN_VALUE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.BUILT_IN_VALUE_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Classifier
	 *
	 * Constraint:
	 *     (type=[BaseType|ID] sizes+=ArraySize*)
	 */
	protected void sequence_Classifier(ISerializationContext context, Classifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ConstantLiteral
	 *     ConstantLiteral returns ConstantLiteral
	 *
	 * Constraint:
	 *     value=[Constant|ID]
	 */
	protected void sequence_ConstantLiteral(ISerializationContext context, ConstantLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     (type=Classifier name=ID value=Literal)
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT__TYPE));
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT__NAME));
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns FloatLiteral
	 *     FloatLiteral returns FloatLiteral
	 *
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatLiteral(ISerializationContext context, FloatLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.FLOAT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.FLOAT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ForeignKey returns ForeignKey
	 *
	 * Constraint:
	 *     (recordType=[RecordType|ID] propertyRef=[Property|ID])
	 */
	protected void sequence_ForeignKey(ISerializationContext context, ForeignKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.FOREIGN_KEY__RECORD_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.FOREIGN_KEY__RECORD_TYPE));
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.FOREIGN_KEY__PROPERTY_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.FOREIGN_KEY__PROPERTY_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeIDTerminalRuleCall_2_0_1(), semanticObject.getRecordType());
		feeder.accept(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyIDTerminalRuleCall_4_0_1(), semanticObject.getPropertyRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns IntLiteral
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.INT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* types+=ComplexType*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (modifiers+=PropertyModifier* foreignKey=ForeignKey? (type=Classifier | referTo=[Property|ID]) name=ID value=Literal?)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns RecordType
	 *     ComplexType returns RecordType
	 *     RecordType returns RecordType
	 *
	 * Constraint:
	 *     (
	 *         author=STRING? 
	 *         since=STRING? 
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         parent=[RecordType|QualifiedName]? 
	 *         (parents+=[TemplateType|QualifiedName] parents+=[TemplateType|QualifiedName]*)? 
	 *         (properties+=Property | constants+=Constant)*
	 *     )
	 */
	protected void sequence_RecordType(ISerializationContext context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns StringLiteral
	 *     StringLiteral returns StringLiteral
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns TemplateType
	 *     ComplexType returns TemplateType
	 *     TemplateType returns TemplateType
	 *
	 * Constraint:
	 *     (
	 *         author=STRING? 
	 *         since=STRING? 
	 *         name=ID 
	 *         (parents+=[TemplateType|QualifiedName] parents+=[TemplateType|QualifiedName]*)? 
	 *         (properties+=Property | constants+=Constant)*
	 *     )
	 */
	protected void sequence_TemplateType(ISerializationContext context, TemplateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
