/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class ReadyStatus implements TBase<ReadyStatus, ReadyStatus._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ReadyStatus");

  private static final TField UPDATE_STATUS_FIELD_DESC = new TField("update_status", TType.STRUCT, (short)1);

  private LoadingStatus update_status;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UPDATE_STATUS, new FieldMetaData("update_status", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, LoadingStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ReadyStatus.class, metaDataMap);
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

  /** Returns true if field update_status is set (has been asigned a value) and false otherwise */
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

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
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
      lastComparison = TBaseHelper.compareTo(this.update_status, typedOther.update_status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // UPDATE_STATUS
          if (field.type == TType.STRUCT) {
            this.update_status = new LoadingStatus();
            this.update_status.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.update_status != null) {
      if (is_set_update_status()) {
        oprot.writeFieldBegin(UPDATE_STATUS_FIELD_DESC);
        this.update_status.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
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

  public void validate() throws TException {
    // check for required fields
  }

}

