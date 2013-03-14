
package com.avalara.avatax.services.avacert2;
/**
 * CertificateRequestStage.java
 * CertificateRequestStage indicates the current stage of the Request.
 * This file was auto-generated from WSDL
 *
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */



public class CertificateRequestStage implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    /**
     * Initializes the CertificateRequestStage instance
     * @param value
     */
    protected CertificateRequestStage(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     *  REQUEST INIT stage
     */
     public static final java.lang.String _REQUESTINITIATED = "REQUESTINITIATED";
    /**
     * CUSTOMERRESPONDED stage of Request
     */
     public static final java.lang.String _CUSTOMERRESPONDED = "CUSTOMERRESPONDED";
    /**
     * CERTIFICATERECEIVED stage of Request
     */
     public static final java.lang.String _CERTIFICATERECEIVED = "CERTIFICATERECEIVED";

   /**
     *  REQUEST INIT stage
     */
     public static final CertificateRequestStage REQUESTINITIATED = new CertificateRequestStage(_REQUESTINITIATED);
    /**
     * CUSTOMERRESPONDED stage of Request
     */
   public static final CertificateRequestStage CUSTOMERRESPONDED = new CertificateRequestStage(_CUSTOMERRESPONDED);
   /**
     * CERTIFICATERECEIVED stage of Request
     */
    public static final CertificateRequestStage CERTIFICATERECEIVED = new CertificateRequestStage(_CERTIFICATERECEIVED);


    public java.lang.String getValue() { return _value_;}



    public static CertificateRequestStage fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CertificateRequestStage enumeration = (CertificateRequestStage)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    /**
     * Returns String Representation of Object
     * @param value
     * @return
     * @throws java.lang.IllegalArgumentException
     */
    public static CertificateRequestStage fromString(java.lang.String value)
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
     * @return  hash code for this CertificateRequestStage object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

    /**
     * Returns String Representation of Object
     * @return String
     */
    public java.lang.String toString() { return _value_;}

    /**
     * 
     * @return
     * @throws java.io.ObjectStreamException
     */
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
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
        new org.apache.axis.description.TypeDesc(CertificateRequestStage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStage"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
