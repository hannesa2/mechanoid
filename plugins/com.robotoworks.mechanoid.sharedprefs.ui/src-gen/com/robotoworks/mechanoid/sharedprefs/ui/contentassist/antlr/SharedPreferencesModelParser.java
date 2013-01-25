/*
* generated by Xtext
*/
package com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.robotoworks.mechanoid.sharedprefs.services.SharedPreferencesModelGrammarAccess;

public class SharedPreferencesModelParser extends AbstractContentAssistParser {
	
	@Inject
	private SharedPreferencesModelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr.internal.InternalSharedPreferencesModelParser createParser() {
		com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr.internal.InternalSharedPreferencesModelParser result = new com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr.internal.InternalSharedPreferencesModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getPreferenceTypeAccess().getAlternatives(), "rule__PreferenceType__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPreferencesBlockAccess().getGroup(), "rule__PreferencesBlock__Group__0");
					put(grammarAccess.getPreferenceAccess().getGroup(), "rule__Preference__Group__0");
					put(grammarAccess.getPreferenceAccess().getGroup_3(), "rule__Preference__Group_3__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getLiteralAccess().getGroup_1(), "rule__Literal__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_2(), "rule__Literal__Group_2__0");
					put(grammarAccess.getSignedNumberAccess().getGroup(), "rule__SignedNumber__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getModelAccess().getPackageNameAssignment_1(), "rule__Model__PackageNameAssignment_1");
					put(grammarAccess.getModelAccess().getPreferencesBlockAssignment_2(), "rule__Model__PreferencesBlockAssignment_2");
					put(grammarAccess.getPreferencesBlockAccess().getNameAssignment_1(), "rule__PreferencesBlock__NameAssignment_1");
					put(grammarAccess.getPreferencesBlockAccess().getPrefsAssignment_3(), "rule__PreferencesBlock__PrefsAssignment_3");
					put(grammarAccess.getPreferenceAccess().getNameAssignment_0(), "rule__Preference__NameAssignment_0");
					put(grammarAccess.getPreferenceAccess().getTypeAssignment_2(), "rule__Preference__TypeAssignment_2");
					put(grammarAccess.getPreferenceAccess().getDefaultValueAssignment_3_1(), "rule__Preference__DefaultValueAssignment_3_1");
					put(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1(), "rule__Literal__LiteralAssignment_0_1");
					put(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1(), "rule__Literal__LiteralAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1(), "rule__Literal__LiteralAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr.internal.InternalSharedPreferencesModelParser typedParser = (com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr.internal.InternalSharedPreferencesModelParser) parser;
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
	
	public SharedPreferencesModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SharedPreferencesModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
