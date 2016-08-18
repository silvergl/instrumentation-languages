package kieker.develop.rl.generator.perl;

import java.util.Collection;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("perl");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Perl record generator");
    return _builder.toString();
  }
  
  /**
   * No perl structures for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * Compute the directory name for a record type.
   */
  @Override
  public CharSequence getDirectoryName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplace cannot be resolved");
  }
  
  /**
   * Return the extension used for the file type generated by this generator.
   */
  @Override
  public String getFileName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDirectoryName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("perl");
    return _builder.toString();
  }
  
  /**
   * Create a perl based record for kieker
   */
  @Override
  public CharSequence generate(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nauthor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\nsince cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsince cannot be resolved"
      + "\nrecordName cannot be resolved"
      + "\nrecordName cannot be resolved"
      + "\nrecordName cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\ncreateParameterCall cannot be resolved"
      + "\nrecordName cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\ncreateParameterCall cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\ncreateParameterCall cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  /**
   * Create perl type names.
   * Most likely this routine is never used, as perl sucks in typing.
   */
  public String createTypeName(final /* Classifier */Object classifier) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create one property for the type declaration.
   */
  public CharSequence createProperty(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method or field name is undefined for the type Property");
  }
  
  /**
   * Compute the absolute Perl package name, which is a FQN name of the record.
   */
  public CharSequence recordName(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplace cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public String createParameterCall(final Collection<Property> list) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined");
  }
}
