/*
 * generated by Xtext
 */
package de.cau.cs.se.instrumentation.al.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.cau.cs.se.instrumentation.al.services.AspectLangGrammarAccess;

public class AspectLangParser extends AbstractContentAssistParser {
	
	@Inject
	private AspectLangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalAspectLangParser createParser() {
		de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalAspectLangParser result = new de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalAspectLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAspectModelAccess().getAlternatives_4(), "rule__AspectModel__Alternatives_4");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getLocationQueryAccess().getAlternatives_1(), "rule__LocationQuery__Alternatives_1");
					put(grammarAccess.getOperationQueryAccess().getAlternatives_3(), "rule__OperationQuery__Alternatives_3");
					put(grammarAccess.getParameterQueryAccess().getAlternatives_2(), "rule__ParameterQuery__Alternatives_2");
					put(grammarAccess.getNodeAccess().getAlternatives_0(), "rule__Node__Alternatives_0");
					put(grammarAccess.getConstraintElementAccess().getAlternatives(), "rule__ConstraintElement__Alternatives");
					put(grammarAccess.getLocalQueryAccess().getAlternatives_1(), "rule__LocalQuery__Alternatives_1");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getInsertionPointAccess().getAlternatives(), "rule__InsertionPoint__Alternatives");
					put(grammarAccess.getInternalFunctionAccess().getAlternatives(), "rule__InternalFunction__Alternatives");
					put(grammarAccess.getReflectionFunctionAccess().getAlternatives(), "rule__ReflectionFunction__Alternatives");
					put(grammarAccess.getQueryModifierAccess().getAlternatives(), "rule__QueryModifier__Alternatives");
					put(grammarAccess.getLogicOperatorAccess().getAlternatives(), "rule__LogicOperator__Alternatives");
					put(grammarAccess.getCompareOperatorAccess().getAlternatives(), "rule__CompareOperator__Alternatives");
					put(grammarAccess.getAspectModelAccess().getGroup(), "rule__AspectModel__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getApplicationModelAccess().getGroup(), "rule__ApplicationModel__Group__0");
					put(grammarAccess.getAspectAccess().getGroup(), "rule__Aspect__Group__0");
					put(grammarAccess.getAspectAccess().getGroup_4(), "rule__Aspect__Group_4__0");
					put(grammarAccess.getUtilizeAdviceAccess().getGroup(), "rule__UtilizeAdvice__Group__0");
					put(grammarAccess.getUtilizeAdviceAccess().getGroup_1(), "rule__UtilizeAdvice__Group_1__0");
					put(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1(), "rule__UtilizeAdvice__Group_1_1__0");
					put(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1_1(), "rule__UtilizeAdvice__Group_1_1_1__0");
					put(grammarAccess.getAdviceAccess().getGroup(), "rule__Advice__Group__0");
					put(grammarAccess.getAdviceAccess().getGroup_2(), "rule__Advice__Group_2__0");
					put(grammarAccess.getAdviceAccess().getGroup_2_1(), "rule__Advice__Group_2_1__0");
					put(grammarAccess.getAdviceAccess().getGroup_2_1_1(), "rule__Advice__Group_2_1_1__0");
					put(grammarAccess.getAdviceParameterDeclarationAccess().getGroup(), "rule__AdviceParameterDeclaration__Group__0");
					put(grammarAccess.getCollectorAccess().getGroup(), "rule__Collector__Group__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEventAccess().getGroup_2(), "rule__Event__Group_2__0");
					put(grammarAccess.getEventAccess().getGroup_2_1(), "rule__Event__Group_2_1__0");
					put(grammarAccess.getReferenceValueAccess().getGroup(), "rule__ReferenceValue__Group__0");
					put(grammarAccess.getReflectionPropertyAccess().getGroup(), "rule__ReflectionProperty__Group__0");
					put(grammarAccess.getRuntimePropertyAccess().getGroup(), "rule__RuntimeProperty__Group__0");
					put(grammarAccess.getAdviceParameterAccess().getGroup(), "rule__AdviceParameter__Group__0");
					put(grammarAccess.getAdviceParameterAccess().getGroup_1(), "rule__AdviceParameter__Group_1__0");
					put(grammarAccess.getPointcutAccess().getGroup(), "rule__Pointcut__Group__0");
					put(grammarAccess.getPointcutAccess().getGroup_7(), "rule__Pointcut__Group_7__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getLocationQueryAccess().getGroup(), "rule__LocationQuery__Group__0");
					put(grammarAccess.getLocationQueryAccess().getGroup_1_0(), "rule__LocationQuery__Group_1_0__0");
					put(grammarAccess.getCompositionQueryAccess().getGroup(), "rule__CompositionQuery__Group__0");
					put(grammarAccess.getOperationQueryAccess().getGroup(), "rule__OperationQuery__Group__0");
					put(grammarAccess.getOperationQueryAccess().getGroup_3_0(), "rule__OperationQuery__Group_3_0__0");
					put(grammarAccess.getOperationQueryAccess().getGroup_3_0_1(), "rule__OperationQuery__Group_3_0_1__0");
					put(grammarAccess.getOperationQueryAccess().getGroup_3_0_1_2(), "rule__OperationQuery__Group_3_0_1_2__0");
					put(grammarAccess.getParameterQueryAccess().getGroup(), "rule__ParameterQuery__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_1(), "rule__Node__Group_1__0");
					put(grammarAccess.getWildcardNodeAccess().getGroup(), "rule__WildcardNode__Group__0");
					put(grammarAccess.getSubPathNodeAccess().getGroup(), "rule__SubPathNode__Group__0");
					put(grammarAccess.getParentNodeAccess().getGroup(), "rule__ParentNode__Group__0");
					put(grammarAccess.getPropertyConstraintAccess().getGroup(), "rule__PropertyConstraint__Group__0");
					put(grammarAccess.getPropertyConstraintAccess().getGroup_1(), "rule__PropertyConstraint__Group_1__0");
					put(grammarAccess.getPropertyConstraintCompareAccess().getGroup(), "rule__PropertyConstraintCompare__Group__0");
					put(grammarAccess.getPropertyConstraintCompareAccess().getGroup_1(), "rule__PropertyConstraintCompare__Group_1__0");
					put(grammarAccess.getLocalQueryAccess().getGroup(), "rule__LocalQuery__Group__0");
					put(grammarAccess.getModelPropertyAccess().getGroup(), "rule__ModelProperty__Group__0");
					put(grammarAccess.getTypeofAccess().getGroup(), "rule__Typeof__Group__0");
					put(grammarAccess.getTypeReferenceAccess().getGroup(), "rule__TypeReference__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1(), "rule__QualifiedNameWithWildcard__Group_1__0");
					put(grammarAccess.getAspectModelAccess().getNameAssignment_1(), "rule__AspectModel__NameAssignment_1");
					put(grammarAccess.getAspectModelAccess().getImportsAssignment_2(), "rule__AspectModel__ImportsAssignment_2");
					put(grammarAccess.getAspectModelAccess().getSourcesAssignment_3(), "rule__AspectModel__SourcesAssignment_3");
					put(grammarAccess.getAspectModelAccess().getAdvicesAssignment_4_0(), "rule__AspectModel__AdvicesAssignment_4_0");
					put(grammarAccess.getAspectModelAccess().getPointcutsAssignment_4_1(), "rule__AspectModel__PointcutsAssignment_4_1");
					put(grammarAccess.getAspectModelAccess().getAspectsAssignment_4_2(), "rule__AspectModel__AspectsAssignment_4_2");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getApplicationModelAccess().getHandlerAssignment_1(), "rule__ApplicationModel__HandlerAssignment_1");
					put(grammarAccess.getApplicationModelAccess().getNameAssignment_3(), "rule__ApplicationModel__NameAssignment_3");
					put(grammarAccess.getApplicationModelAccess().getModelAssignment_4(), "rule__ApplicationModel__ModelAssignment_4");
					put(grammarAccess.getAspectAccess().getPointcutAssignment_1(), "rule__Aspect__PointcutAssignment_1");
					put(grammarAccess.getAspectAccess().getAdvicesAssignment_3(), "rule__Aspect__AdvicesAssignment_3");
					put(grammarAccess.getAspectAccess().getAdvicesAssignment_4_1(), "rule__Aspect__AdvicesAssignment_4_1");
					put(grammarAccess.getUtilizeAdviceAccess().getAdviceAssignment_0(), "rule__UtilizeAdvice__AdviceAssignment_0");
					put(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_0(), "rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0");
					put(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_1_1(), "rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1");
					put(grammarAccess.getAdviceAccess().getNameAssignment_1(), "rule__Advice__NameAssignment_1");
					put(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_0(), "rule__Advice__ParameterDeclarationsAssignment_2_1_0");
					put(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_1_1(), "rule__Advice__ParameterDeclarationsAssignment_2_1_1_1");
					put(grammarAccess.getAdviceAccess().getCollectorsAssignment_4(), "rule__Advice__CollectorsAssignment_4");
					put(grammarAccess.getAdviceParameterDeclarationAccess().getTypeAssignment_0(), "rule__AdviceParameterDeclaration__TypeAssignment_0");
					put(grammarAccess.getAdviceParameterDeclarationAccess().getNameAssignment_1(), "rule__AdviceParameterDeclaration__NameAssignment_1");
					put(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0(), "rule__Collector__InsertionPointAssignment_0");
					put(grammarAccess.getCollectorAccess().getEventsAssignment_1(), "rule__Collector__EventsAssignment_1");
					put(grammarAccess.getEventAccess().getTypeAssignment_0(), "rule__Event__TypeAssignment_0");
					put(grammarAccess.getEventAccess().getInitializationsAssignment_2_0(), "rule__Event__InitializationsAssignment_2_0");
					put(grammarAccess.getEventAccess().getInitializationsAssignment_2_1_1(), "rule__Event__InitializationsAssignment_2_1_1");
					put(grammarAccess.getReferenceValueAccess().getQueryAssignment_0(), "rule__ReferenceValue__QueryAssignment_0");
					put(grammarAccess.getReferenceValueAccess().getPropertyAssignment_1(), "rule__ReferenceValue__PropertyAssignment_1");
					put(grammarAccess.getInternalFunctionPropertyAccess().getFunctionAssignment(), "rule__InternalFunctionProperty__FunctionAssignment");
					put(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1(), "rule__ReflectionProperty__FunctionAssignment_1");
					put(grammarAccess.getAdviceParameterAccess().getDeclarationAssignment_0(), "rule__AdviceParameter__DeclarationAssignment_0");
					put(grammarAccess.getAdviceParameterAccess().getCollectionAssignment_1_1(), "rule__AdviceParameter__CollectionAssignment_1_1");
					put(grammarAccess.getPointcutAccess().getAnnotationAssignment_0(), "rule__Pointcut__AnnotationAssignment_0");
					put(grammarAccess.getPointcutAccess().getNameAssignment_2(), "rule__Pointcut__NameAssignment_2");
					put(grammarAccess.getPointcutAccess().getModelAssignment_4(), "rule__Pointcut__ModelAssignment_4");
					put(grammarAccess.getPointcutAccess().getLocationAssignment_6(), "rule__Pointcut__LocationAssignment_6");
					put(grammarAccess.getPointcutAccess().getOperationAssignment_7_1(), "rule__Pointcut__OperationAssignment_7_1");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getValueAssignment_2(), "rule__Annotation__ValueAssignment_2");
					put(grammarAccess.getLocationQueryAccess().getNodeAssignment_0(), "rule__LocationQuery__NodeAssignment_0");
					put(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_0_1(), "rule__LocationQuery__SpecializationAssignment_1_0_1");
					put(grammarAccess.getLocationQueryAccess().getCompositionAssignment_1_1(), "rule__LocationQuery__CompositionAssignment_1_1");
					put(grammarAccess.getCompositionQueryAccess().getModifierAssignment_1(), "rule__CompositionQuery__ModifierAssignment_1");
					put(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_3(), "rule__CompositionQuery__SubQueriesAssignment_3");
					put(grammarAccess.getOperationQueryAccess().getModifierAssignment_1(), "rule__OperationQuery__ModifierAssignment_1");
					put(grammarAccess.getOperationQueryAccess().getReturnTypeAssignment_2(), "rule__OperationQuery__ReturnTypeAssignment_2");
					put(grammarAccess.getOperationQueryAccess().getOperationReferenceAssignment_3_0_0(), "rule__OperationQuery__OperationReferenceAssignment_3_0_0");
					put(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_1(), "rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1");
					put(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_2_1(), "rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1");
					put(grammarAccess.getParameterQueryAccess().getModifierAssignment_1(), "rule__ParameterQuery__ModifierAssignment_1");
					put(grammarAccess.getParameterQueryAccess().getTypeAssignment_2_0(), "rule__ParameterQuery__TypeAssignment_2_0");
					put(grammarAccess.getParameterQueryAccess().getParameterAssignment_3(), "rule__ParameterQuery__ParameterAssignment_3");
					put(grammarAccess.getNodeAccess().getConstraintAssignment_1_1(), "rule__Node__ConstraintAssignment_1_1");
					put(grammarAccess.getContainerNodeAccess().getContainerAssignment(), "rule__ContainerNode__ContainerAssignment");
					put(grammarAccess.getPropertyConstraintAccess().getLogicAssignment_1_1(), "rule__PropertyConstraint__LogicAssignment_1_1");
					put(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_2(), "rule__PropertyConstraint__RightAssignment_1_2");
					put(grammarAccess.getPropertyConstraintCompareAccess().getCompareAssignment_1_1(), "rule__PropertyConstraintCompare__CompareAssignment_1_1");
					put(grammarAccess.getPropertyConstraintCompareAccess().getRightAssignment_1_2(), "rule__PropertyConstraintCompare__RightAssignment_1_2");
					put(grammarAccess.getLocalQueryAccess().getLocationQueryAssignment_0(), "rule__LocalQuery__LocationQueryAssignment_0");
					put(grammarAccess.getLocalQueryAccess().getPropertyAssignment_1_0(), "rule__LocalQuery__PropertyAssignment_1_0");
					put(grammarAccess.getLocalQueryAccess().getTypeofAssignment_1_1(), "rule__LocalQuery__TypeofAssignment_1_1");
					put(grammarAccess.getModelPropertyAccess().getReferenceAssignment_1(), "rule__ModelProperty__ReferenceAssignment_1");
					put(grammarAccess.getTypeofAccess().getReferenceAssignment_2(), "rule__Typeof__ReferenceAssignment_2");
					put(grammarAccess.getFloatLiteralAccess().getValueAssignment(), "rule__FloatLiteral__ValueAssignment");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment(), "rule__IntLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getTypeReferenceAccess().getContextAssignment_0(), "rule__TypeReference__ContextAssignment_0");
					put(grammarAccess.getTypeReferenceAccess().getReferenceAssignment_2(), "rule__TypeReference__ReferenceAssignment_2");
					put(grammarAccess.getTypeReferenceAccess().getCollectionAssignment_3(), "rule__TypeReference__CollectionAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalAspectLangParser typedParser = (de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalAspectLangParser) parser;
			typedParser.entryRuleAspectModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AspectLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AspectLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
