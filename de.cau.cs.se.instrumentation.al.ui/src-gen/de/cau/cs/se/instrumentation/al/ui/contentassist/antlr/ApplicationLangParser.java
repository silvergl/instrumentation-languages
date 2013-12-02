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

import de.cau.cs.se.instrumentation.al.services.ApplicationLangGrammarAccess;

public class ApplicationLangParser extends AbstractContentAssistParser {
	
	@Inject
	private ApplicationLangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalApplicationLangParser createParser() {
		de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalApplicationLangParser result = new de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalApplicationLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getQueryAccess().getAlternatives_1_0(), "rule__Query__Alternatives_1_0");
					put(grammarAccess.getQueryAccess().getAlternatives_1_1(), "rule__Query__Alternatives_1_1");
					put(grammarAccess.getNodeAccess().getAlternatives_0(), "rule__Node__Alternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getAnnotationAccess().getAlternatives(), "rule__Annotation__Alternatives");
					put(grammarAccess.getValuedAnnotationAccess().getAlternatives(), "rule__ValuedAnnotation__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getReflectionFunctionAccess().getAlternatives(), "rule__ReflectionFunction__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getInsertionPointAccess().getAlternatives(), "rule__InsertionPoint__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1(), "rule__QualifiedNameWithWildcard__Group_1__0");
					put(grammarAccess.getAspectAccess().getGroup(), "rule__Aspect__Group__0");
					put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
					put(grammarAccess.getQueryAccess().getGroup_1(), "rule__Query__Group_1__0");
					put(grammarAccess.getQueryAccess().getGroup_1_5(), "rule__Query__Group_1_5__0");
					put(grammarAccess.getParameterPatternAccess().getGroup(), "rule__ParameterPattern__Group__0");
					put(grammarAccess.getLocationQueryAccess().getGroup(), "rule__LocationQuery__Group__0");
					put(grammarAccess.getLocationQueryAccess().getGroup_1(), "rule__LocationQuery__Group_1__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getParamQueryAccess().getGroup(), "rule__ParamQuery__Group__0");
					put(grammarAccess.getParamCompareAccess().getGroup(), "rule__ParamCompare__Group__0");
					put(grammarAccess.getParamCompareAccess().getGroup_1(), "rule__ParamCompare__Group_1__0");
					put(grammarAccess.getReferenceValueAccess().getGroup(), "rule__ReferenceValue__Group__0");
					put(grammarAccess.getRuntimePropertyAccess().getGroup(), "rule__RuntimeProperty__Group__0");
					put(grammarAccess.getReflectionPropertyAccess().getGroup(), "rule__ReflectionProperty__Group__0");
					put(grammarAccess.getWildcardNodeAccess().getGroup(), "rule__WildcardNode__Group__0");
					put(grammarAccess.getSubPathNodeAccess().getGroup(), "rule__SubPathNode__Group__0");
					put(grammarAccess.getCollectorAccess().getGroup(), "rule__Collector__Group__0");
					put(grammarAccess.getCollectorAccess().getGroup_3(), "rule__Collector__Group_3__0");
					put(grammarAccess.getCollectorAccess().getGroup_3_1(), "rule__Collector__Group_3_1__0");
					put(grammarAccess.getTagAnnotationAccess().getGroup(), "rule__TagAnnotation__Group__0");
					put(grammarAccess.getTagAnnotationAccess().getGroup_2(), "rule__TagAnnotation__Group_2__0");
					put(grammarAccess.getKeyStringValueAnnotationAccess().getGroup(), "rule__KeyStringValueAnnotation__Group__0");
					put(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3(), "rule__KeyStringValueAnnotation__Group_3__0");
					put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup(), "rule__TypedKeyStringValueAnnotation__Group__0");
					put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6(), "rule__TypedKeyStringValueAnnotation__Group_6__0");
					put(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup(), "rule__KeyBooleanValueAnnotation__Group__0");
					put(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3(), "rule__KeyBooleanValueAnnotation__Group_3__0");
					put(grammarAccess.getKeyIntValueAnnotationAccess().getGroup(), "rule__KeyIntValueAnnotation__Group__0");
					put(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3(), "rule__KeyIntValueAnnotation__Group_3__0");
					put(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup(), "rule__KeyFloatValueAnnotation__Group__0");
					put(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3(), "rule__KeyFloatValueAnnotation__Group_3__0");
					put(grammarAccess.getImportAnnotationAccess().getGroup(), "rule__ImportAnnotation__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup(), "rule__ExtendedID__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup_1(), "rule__ExtendedID__Group_1__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getPackagesAssignment_2(), "rule__Model__PackagesAssignment_2");
					put(grammarAccess.getModelAccess().getImportsAssignment_3(), "rule__Model__ImportsAssignment_3");
					put(grammarAccess.getModelAccess().getAspectsAssignment_4(), "rule__Model__AspectsAssignment_4");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getPackageAccess().getPackageAssignment_2(), "rule__Package__PackageAssignment_2");
					put(grammarAccess.getAspectAccess().getAnnotationAssignment_0(), "rule__Aspect__AnnotationAssignment_0");
					put(grammarAccess.getAspectAccess().getQueryAssignment_2(), "rule__Aspect__QueryAssignment_2");
					put(grammarAccess.getAspectAccess().getCollectorsAssignment_4(), "rule__Aspect__CollectorsAssignment_4");
					put(grammarAccess.getQueryAccess().getLocationAssignment_0(), "rule__Query__LocationAssignment_0");
					put(grammarAccess.getQueryAccess().getModifierAssignment_1_0_0(), "rule__Query__ModifierAssignment_1_0_0");
					put(grammarAccess.getQueryAccess().getReturnTypeAssignment_1_1_0(), "rule__Query__ReturnTypeAssignment_1_1_0");
					put(grammarAccess.getQueryAccess().getMethodAssignment_1_2(), "rule__Query__MethodAssignment_1_2");
					put(grammarAccess.getQueryAccess().getParameterAssignment_1_4(), "rule__Query__ParameterAssignment_1_4");
					put(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1(), "rule__Query__ParameterAssignment_1_5_1");
					put(grammarAccess.getParameterPatternAccess().getModifierAssignment_0(), "rule__ParameterPattern__ModifierAssignment_0");
					put(grammarAccess.getParameterPatternAccess().getTypeAssignment_1(), "rule__ParameterPattern__TypeAssignment_1");
					put(grammarAccess.getParameterPatternAccess().getParameterAssignment_2(), "rule__ParameterPattern__ParameterAssignment_2");
					put(grammarAccess.getLocationQueryAccess().getNodeAssignment_0(), "rule__LocationQuery__NodeAssignment_0");
					put(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1(), "rule__LocationQuery__SpecializationAssignment_1_1");
					put(grammarAccess.getNodeAccess().getParameterAssignment_1(), "rule__Node__ParameterAssignment_1");
					put(grammarAccess.getParamQueryAccess().getQueriesAssignment_1(), "rule__ParamQuery__QueriesAssignment_1");
					put(grammarAccess.getParamCompareAccess().getLeftAssignment_0(), "rule__ParamCompare__LeftAssignment_0");
					put(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0(), "rule__ParamCompare__OperatorAssignment_1_0");
					put(grammarAccess.getParamCompareAccess().getRightAssignment_1_1(), "rule__ParamCompare__RightAssignment_1_1");
					put(grammarAccess.getFloatValueAccess().getValueAssignment(), "rule__FloatValue__ValueAssignment");
					put(grammarAccess.getIntValueAccess().getValueAssignment(), "rule__IntValue__ValueAssignment");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getReferenceValueAccess().getQueryAssignment_0(), "rule__ReferenceValue__QueryAssignment_0");
					put(grammarAccess.getReferenceValueAccess().getParameterAssignment_1(), "rule__ReferenceValue__ParameterAssignment_1");
					put(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1(), "rule__RuntimeProperty__ReferenceAssignment_1");
					put(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1(), "rule__ReflectionProperty__FunctionAssignment_1");
					put(grammarAccess.getContainerNodeAccess().getContainerAssignment(), "rule__ContainerNode__ContainerAssignment");
					put(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0(), "rule__Collector__InsertionPointAssignment_0");
					put(grammarAccess.getCollectorAccess().getTypeAssignment_1(), "rule__Collector__TypeAssignment_1");
					put(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0(), "rule__Collector__InitializationsAssignment_3_0");
					put(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1(), "rule__Collector__InitializationsAssignment_3_1_1");
					put(grammarAccess.getCommentAnnotationAccess().getValueAssignment(), "rule__CommentAnnotation__ValueAssignment");
					put(grammarAccess.getTagAnnotationAccess().getNameAssignment_1(), "rule__TagAnnotation__NameAssignment_1");
					put(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1(), "rule__TagAnnotation__AnnotationsAssignment_2_1");
					put(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__KeyStringValueAnnotation__NameAssignment_1");
					put(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2(), "rule__KeyStringValueAnnotation__ValueAssignment_2");
					put(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1(), "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1");
					put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__TypedKeyStringValueAnnotation__NameAssignment_1");
					put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3(), "rule__TypedKeyStringValueAnnotation__TypeAssignment_3");
					put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5(), "rule__TypedKeyStringValueAnnotation__ValueAssignment_5");
					put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1(), "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1");
					put(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1(), "rule__KeyBooleanValueAnnotation__NameAssignment_1");
					put(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2(), "rule__KeyBooleanValueAnnotation__ValueAssignment_2");
					put(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1(), "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1");
					put(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1(), "rule__KeyIntValueAnnotation__NameAssignment_1");
					put(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2(), "rule__KeyIntValueAnnotation__ValueAssignment_2");
					put(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1(), "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1");
					put(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1(), "rule__KeyFloatValueAnnotation__NameAssignment_1");
					put(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2(), "rule__KeyFloatValueAnnotation__ValueAssignment_2");
					put(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1(), "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1");
					put(grammarAccess.getImportAnnotationAccess().getImportURIAssignment_1(), "rule__ImportAnnotation__ImportURIAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalApplicationLangParser typedParser = (de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal.InternalApplicationLangParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ApplicationLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ApplicationLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
