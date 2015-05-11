package de.cau.cs.se.instrumentation.rl.generator

import org.eclipse.emf.ecore.EClassifier

interface IModelTypeToTargetTypeExtensions {
	/**
	 * Determine the right primitive target type string for a given system type.
	 * 
	 * @param classifier
	 * 		A type name of the record language
	 * @return 
	 * 		the target type name of the given <code>classifier</code>
	 */
	def String createPrimitiveTypeName(EClassifier classifier)
	
	/**
	 * Determine the right target type class string for a given system type.
	 */
	def String createPrimitiveWrapperTypeName(EClassifier classifier)
}