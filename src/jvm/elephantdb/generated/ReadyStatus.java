/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadyStatus implements org.apache.thrift.TBase<ReadyStatus, ReadyStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReadyStatus");

  private static final org.apache.thrift.protocol.TField UPDATE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("update_status", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReadyStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReadyStatusTupleSchemeFactory());
  }

  private LoadingStatus update_status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATE_STATUS((short)1, "update_status");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UPDATE_STATUS
          return UPDATE_STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.UPDATE_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UPDATE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("update_status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LoadingStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReadyStatus.class, metaDataMap);
  }

  public ReadyStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReadyStatus(ReadyStatus other) {
    if (other.is_set_update_status()) {
      this.update_status = new LoadingStatus(other.update_status);
    }
  }

  public ReadyStatus deepCopy() {
    return new ReadyStatus(this);
  }

  @Override
  public void clear() {
    this.update_status = null;
  }

  public LoadingStatus get_update_status() {
    return this.update_status;
  }

  public void set_update_status(LoadingStatus update_status) {
    this.update_status = update_status;
  }

  public void unset_update_status() {
    this.update_status = null;
  }

  /** Returns true if field update_status is set (has been assigned a value) and false otherwise */
  public boolean is_set_update_status() {
    return this.update_status != null;
  }

  public void set_update_status_isSet(boolean value) {
    if (!value) {
      this.update_status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UPDATE_STATUS:
      if (value == null) {
        unset_update_status();
      } else {
        set_update_status((LoadingStatus)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATE_STATUS:
      return get_update_status();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UPDATE_STATUS:
      return is_set_update_status();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReadyStatus)
      return this.equals((ReadyStatus)that);
    return false;
  }

  public boolean equals(ReadyStatus that) {
    if (that == null)
      return false;

    boolean this_present_update_status = true && this.is_set_update_status();
    boolean that_present_update_status = true && that.is_set_update_status();
    if (this_present_update_status || that_present_update_status) {
      if (!(this_present_update_status && that_present_update_status))
        return false;
      if (!this.update_status.equals(that.update_status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_update_status = true && (is_set_update_status());
    builder.append(present_update_status);
    if (present_update_status)
      builder.append(update_status);

    return builder.toHashCode();
  }

  public int compareTo(ReadyStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ReadyStatus typedOther = (ReadyStatus)other;

    lastComparison = Boolean.valueOf(is_set_update_status()).compareTo(typedOther.is_set_update_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_update_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update_status, typedOther.update_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ReadyStatus(");
    boolean first = true;

    if (is_set_update_status()) {
      sb.append("update_status:");
      if (this.update_status == null) {
        sb.append("null");
      } else {
        sb.append(this.update_status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReadyStatusStandardSchemeFactory implements SchemeFactory {
    public ReadyStatusStandardScheme getScheme() {
      return new ReadyStatusStandardScheme();
    }
  }

  private static class ReadyStatusStandardScheme extends StandardScheme<ReadyStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReadyStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UPDATE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.update_status = new LoadingStatus();
              struct.update_status.read(iprot);
              struct.set_update_status_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReadyStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.update_status != null) {
        if (struct.is_set_update_status()) {
          oprot.writeFieldBegin(UPDATE_STATUS_FIELD_DESC);
          struct.update_status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReadyStatusTupleSchemeFactory implements SchemeFactory {
    public ReadyStatusTupleScheme getScheme() {
      return new ReadyStatusTupleScheme();
    }
  }

  private static class ReadyStatusTupleScheme extends TupleScheme<ReadyStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReadyStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_update_status()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_update_status()) {
        struct.update_status.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReadyStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.update_status = new LoadingStatus();
        struct.update_status.read(iprot);
        struct.set_update_status_isSet(true);
      }
    }
  }

}

