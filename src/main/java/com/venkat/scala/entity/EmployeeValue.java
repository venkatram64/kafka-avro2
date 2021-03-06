/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.venkat.scala.entity;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** EmployeeValue object */
@org.apache.avro.specific.AvroGenerated
public class EmployeeValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8796856733623813708L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmployeeValue\",\"namespace\":\"com.venkat.scala.entity\",\"doc\":\"EmployeeValue object\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"firstName\"},{\"name\":\"email\",\"type\":\"string\",\"doc\":\"email\"}],\"globalId\":\"1234\",\"root\":\"true\",\"version\":\"0\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** firstName */
  @Deprecated public java.lang.CharSequence firstName;
  /** email */
  @Deprecated public java.lang.CharSequence email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EmployeeValue() {}

  /**
   * All-args constructor.
   * @param firstName firstName
   * @param email email
   */
  public EmployeeValue(java.lang.CharSequence firstName, java.lang.CharSequence email) {
    this.firstName = firstName;
    this.email = email;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: email = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return firstName
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * firstName
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return email
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * email
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Creates a new EmployeeValue RecordBuilder.
   * @return A new EmployeeValue RecordBuilder
   */
  public static com.venkat.scala.entity.EmployeeValue.Builder newBuilder() {
    return new com.venkat.scala.entity.EmployeeValue.Builder();
  }

  /**
   * Creates a new EmployeeValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EmployeeValue RecordBuilder
   */
  public static com.venkat.scala.entity.EmployeeValue.Builder newBuilder(com.venkat.scala.entity.EmployeeValue.Builder other) {
    return new com.venkat.scala.entity.EmployeeValue.Builder(other);
  }

  /**
   * Creates a new EmployeeValue RecordBuilder by copying an existing EmployeeValue instance.
   * @param other The existing instance to copy.
   * @return A new EmployeeValue RecordBuilder
   */
  public static com.venkat.scala.entity.EmployeeValue.Builder newBuilder(com.venkat.scala.entity.EmployeeValue other) {
    return new com.venkat.scala.entity.EmployeeValue.Builder(other);
  }

  /**
   * RecordBuilder for EmployeeValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmployeeValue>
    implements org.apache.avro.data.RecordBuilder<EmployeeValue> {

    /** firstName */
    private java.lang.CharSequence firstName;
    /** email */
    private java.lang.CharSequence email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.venkat.scala.entity.EmployeeValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EmployeeValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.venkat.scala.entity.EmployeeValue other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * firstName
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * firstName
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.venkat.scala.entity.EmployeeValue.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * firstName
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * firstName
      * @return This builder.
      */
    public com.venkat.scala.entity.EmployeeValue.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * email
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * email
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.venkat.scala.entity.EmployeeValue.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.email = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * email
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'email' field.
      * email
      * @return This builder.
      */
    public com.venkat.scala.entity.EmployeeValue.Builder clearEmail() {
      email = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public EmployeeValue build() {
      try {
        EmployeeValue record = new EmployeeValue();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.email = fieldSetFlags()[1] ? this.email : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
