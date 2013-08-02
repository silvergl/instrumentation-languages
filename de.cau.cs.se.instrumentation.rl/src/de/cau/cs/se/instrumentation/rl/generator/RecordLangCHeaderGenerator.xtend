package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model

class RecordLangCHeaderGenerator extends RecordLangCGenerator {
	
	override def createContent(RecordType type) '''
	/***************************************************************************
	 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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
	#include <stdlib.h>
	#include <kieker.h>
	
	«type.createStructure»
	
	«type.createSerializerDeclaration»
	'''
	
	def createStructure(RecordType type) '''
		typedef struct {
			«type.compileProperties.map[createPropertyDeclaration].join»
		} «type.packageName»_«type.name»;
	'''
	
	def createPropertyDeclaration(Property property) '''
		«property.type.createTypeName» «property.name»;
	'''
		
	/**
	 * Generate the serializer for the given record type.
	 */
	def createSerializerDeclaration(RecordType type) '''
		/*
		 * Serialize an «type.name» and return the size of the written structure.
		 *
		 * buffer = the buffer to send the data
		 * id = id to identify the record type
		 * offset = store data to buffer at offset
		 * value = the value to be stored
		 *
		 * returns size of written structure
		 */
		int «type.packageName»_«type.name»_serialize(char *buffer, const int id, const int offset, const «type.packageName»_«type.name» value);
	'''
	
}