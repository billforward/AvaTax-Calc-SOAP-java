package com.avalara.avatax.services.avacert2;
/**
 * SeverityLevel.java
 * Severity of the result Message.
 * Success - Operation succeeded.
 * Warning - Warnings occured, operation succeeded.
 * Error   - Errors occured, operation failed.
 * Exception - Unexpected exceptions occurred, operation failed.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *           PingResult pingResult = port.ping("");
 *    <B>    Assert.assertEquals(SeverityLevel.Success, pingResult.getResultCode()); </B>
 * </pre>
 * This file was auto-generated from WSDL
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class SeverityLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    /**
     * Initializes the instance of SeverityLevel
     * @param value
     */
    protected SeverityLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     * Success - Operation succeeded.
     */
    public static final java.lang.String _Success = "Success";
    /**
     * Warning - Warnings occured, operation succeeded.
     */
    public static final java.lang.String _Warning = "Warning";
    /**
     * Error   - Errors occured, operation failed.
     */
    public static final java.lang.String _Error = "Error";
    /**
     * Exception - Unexpected exceptions occurred, operation failed.
     */
    public static final java.lang.String _Exception = "Exception";
    /**
     * Success - Operation succeeded.
     */
    public static final SeverityLevel Success = new SeverityLevel(_Success);
     /**
     * Warning - Warnings occured, operation succeeded.
     */
    public static final SeverityLevel Warning = new SeverityLevel(_Warning);
     /**
     * Error   - Errors occured, operation failed.
     */
    public static final SeverityLevel Error = new SeverityLevel(_Error);
     /**
     * Exception - Unexpected exceptions occurred, operation failed.
     */
    public static final SeverityLevel Exception = new SeverityLevel(_Exception);

    public java.lang.String getValue() { return _value_;}

    /**
     * Returns  SeverityLevel
     * @param value
     * @return
     * @throws java.lang.IllegalArgumentException
     */
    public static SeverityLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SeverityLevel enumeration = (SeverityLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    /**
     * Returns  SeverityLevel
     * @param value
     * @return
     * @throws java.lang.IllegalArgumentException
     */
    public static SeverityLevel fromString(java.lang.String value)
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
     * @return  hash code for this SeverityLevel object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

     /**
     * Returns a string representation of the object.
     * @return  String _value
     */
    public java.lang.String toString() { return _value_;}

    /**
     * readResolve
     * @return
     * @throws java.io.ObjectStreamException
     */
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}

      /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
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
        new org.apache.axis.description.TypeDesc(SeverityLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel"));
    }
    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
