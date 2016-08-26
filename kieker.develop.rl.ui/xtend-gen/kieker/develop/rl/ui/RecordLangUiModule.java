/**
 * generated by Xtext 2.10.0
 */
package kieker.develop.rl.ui;

import kieker.develop.rl.ui.AbstractRecordLangUiModule;
import kieker.develop.rl.ui.TypesHighlightingCalculator;
import kieker.develop.rl.ui.TypesHighlightingConfiguration;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class RecordLangUiModule extends AbstractRecordLangUiModule {
  /**
   * Add highlighting calculator for types.
   * 
   * @return return the highlighter
   */
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return TypesHighlightingCalculator.class;
  }
  
  /**
   * Add highlighting configuration for types.
   * 
   * @return return the configuration
   */
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return TypesHighlightingConfiguration.class;
  }
  
  public RecordLangUiModule(final AbstractUIPlugin arg0) {
    super(arg0);
  }
}
