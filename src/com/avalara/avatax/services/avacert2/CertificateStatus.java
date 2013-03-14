package com.avalara.avatax.services.avacert2;
/**
 * CertificateStatus.java
 * CertificateStatus indicates the status for the Certificate record.
 *  ACTIVE     -  The certificate is active with images received.
 *  VOID       -  The certificate has been voided from active use.
 *  INCOMPLETE -  The certificate does not yet have all of its images received.
 */



public class CertificateStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    /**
     * Initializes a new instance of the class with STATUS Value
     * of {@link String} objects.
     * @param value
     */
    protected CertificateStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }
    /**
     *  ACTIVE     -  The certificate is active with images received.
     */
    public static final java.lang.String _ACTIVE = "ACTIVE";
    /**
     * VOID       -  The certificate has been voided from active use.
     */
    public static final java.lang.String _VOID = "VOID";
    /**
     * INCOMPLETE -  The certificate does not yet have all of its images received.
     */
    public static final java.lang.String _INCOMPLETE = "INCOMPLETE";
    /**
     *  ACTIVE     -  The certificate is active with images received.
     */
    public static final CertificateStatus ACTIVE = new CertificateStatus(_ACTIVE);
    /**
     * VOID       -  The certificate has been voided from active use.
     */
    public static final CertificateStatus VOID = new CertificateStatus(_VOID);
    /**
     * INCOMPLETE -  The certificate does not yet have all of its images received.
     */
    public static final CertificateStatus INCOMPLETE = new CertificateStatus(_INCOMPLETE);

    /**
     * Returns Certificate Status Value
     * of {@link String} objects.
     * @return _value_
     */
    public java.lang.String getValue() { return _value_;}

   /**
     * Returns Certificate Status from value
     * @param value
     * @return CertificateStatus
     * @throws IllegalArgumentException
     */
    public static CertificateStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CertificateStatus enumeration = (CertificateStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    /**
     * Returns Certificate Status from string
     * @param value
     * @return CertificateStatus
     * @throws IllegalArgumentException
     */
    public static CertificateStatus fromString(java.lang.String value)
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
     * @return  hash code for this CertificateStatus object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

     /**
     * Returns a string representation of the object.
     * @return  String _value
     */
    public java.lang.String toString() { return _value_;}

     /**
     * @return Object
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
        new org.apache.axis.description.TypeDesc(CertificateStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateStatus"));
    }
    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
