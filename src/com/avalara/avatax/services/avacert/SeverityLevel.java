/**
 * SeverityLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.avacert;

public class SeverityLevel implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SeverityLevel(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Success = "Success";
    public static final String _Warning = "Warning";
    public static final String _Error = "Error";
    public static final String _Exception = "Exception";
    public static final SeverityLevel Success = new SeverityLevel(_Success);
    public static final SeverityLevel Warning = new SeverityLevel(_Warning);
    public static final SeverityLevel Error = new SeverityLevel(_Error);
    public static final SeverityLevel Exception = new SeverityLevel(_Exception);
    public String getValue() { return _value_;}
    public static SeverityLevel fromValue(String value)
          throws IllegalArgumentException {
        SeverityLevel enumeration = (SeverityLevel)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SeverityLevel fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeverityLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
