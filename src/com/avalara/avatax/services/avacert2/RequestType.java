package com.avalara.avatax.services.avacert2;
/**
 * RequestType.java
 * RequestType indicates the type of the request to be initiated.
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

public class RequestType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    /*
     * Constructor :
     * Initializes a new instance of the RequestType .
     */
    protected RequestType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

   /**
     *  Standard sends correspondences and follow ups related to the Request to the associated Customer
     */
    public static final java.lang.String _STANDARD = "STANDARD";
     /**
     * Direct does not send any correspondence or follow ups related to the Request to the associated Customer.
     */
    public static final java.lang.String _DIRECT = "DIRECT";

     /**
     *  Standard sends correspondences and follow ups related to the Request to the associated Customer
     */
    public static final RequestType STANDARD = new RequestType(_STANDARD);

     /**
     * Direct does not send any correspondence or follow ups related to the Request to the associated Customer.
     */
    public static final RequestType DIRECT = new RequestType(_DIRECT);
    public java.lang.String getValue() { return _value_;}
    public static RequestType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RequestType enumeration = (RequestType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RequestType fromString(java.lang.String value)
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
     * @return  hash code for this RequestType object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}
     /**
     * Returns a string representation of the object.
     * @return String _value_
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
        new org.apache.axis.description.TypeDesc(RequestType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestType"));
    }
   /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
