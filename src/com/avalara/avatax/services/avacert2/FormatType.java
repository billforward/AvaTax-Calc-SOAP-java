
package com.avalara.avatax.services.avacert2;
/**
 * FormatType.java
 * FormatType is the format in which the image needs to be exported.
 * This file was auto-generated from WSDL
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class FormatType implements java.io.Serializable {

    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();
    /**
     * Initializes a new instance of the class with Format Value
     * of {@link String} objects.
     * @param value
     */
    protected FormatType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

     /**
     * Null value
     */
    public static final java.lang.String _NULL = "NULL";
    /**
     * PNG image format value
     */
    public static final java.lang.String _PNG = "PNG";
    /**
     * PDF image format value
     */
    public static final java.lang.String _PDF = "PDF";
     /**
     * NULL value
     */
    public static final FormatType NULL = new FormatType(_NULL);
    /**
     * PNG image format value
     */
    public static final FormatType PNG = new FormatType(_PNG);
    /**
     * PDF image format value
     */
    public static final FormatType PDF = new FormatType(_PDF);

    public java.lang.String getValue() { return _value_;}

    /**
     * FormatType from value
     * @param value
     * @return FormatType
     * @throws IllegalArgumentException
     */
    public static FormatType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FormatType enumeration = (FormatType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    /**
     * FormatType from String
     * @param value
     * @return FormatType
     * @throws IllegalArgumentException
     */
    public static FormatType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }

     /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public boolean equals(java.lang.Object obj) {return (obj == this);}

     /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this FormatType object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

     /**
     * Returns a string representation of the object.
     * @return  String _value
     */
    public java.lang.String toString() { return _value_;}

    /**
     *
     * @return
     * @throws java.io.ObjectStreamException
     */
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}

    /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     * @param mechType
     * @param _javaType
     * @param _xmlType
     * @return
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }

    /**
     * Get Axis Custom Deserializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     * @param mechType
     * @param _javaType
     * @param _xmlType
     * @return
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormatType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormatType"));
    }
    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
