package com.avalara.avatax.services.avacert2;
/**
 * CertificateRequestStatus.java
 * CertificateStatus indicates the current status of the Request associated with a Request record to include in the response.
 * OPEN - Request has been initiated and is currently open.
 * CLOSED - Request has been closed, either manually or automatically
 * ALL -Request of any status.
 */
public class CertificateRequestStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

     /**
     * Initializes a new instance of the class with Request STATUS Value
     * of {@link String} objects.
     * @param value
     */
    protected CertificateRequestStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     * All Certificate Requests
     */
     public static final java.lang.String _ALL = "ALL";
    /**
     * Certificate Request is Open -Request has been initiated and is currently open.
     */
    public static final java.lang.String _OPEN = "OPEN";
    /**
     * Certificate Request is closed -Request has been closed, either manually or automatically
     */
    public static final java.lang.String _CLOSED = "CLOSED";
   /**
     * All Certificate Requests
     */
     public static final CertificateRequestStatus ALL = new CertificateRequestStatus(_ALL);
     /**
     * Certificate Request is Open   -Request has been initiated and is currently open.
     */
    public static final CertificateRequestStatus OPEN = new CertificateRequestStatus(_OPEN);
     /**
     * Certificate Request is closed -Request has been closed, either manually or automatically
     */
    public static final CertificateRequestStatus CLOSED = new CertificateRequestStatus(_CLOSED);

    /**
     * Returns the Certificate Request Status  Value
     * @return  String
     */
    public java.lang.String getValue() { return _value_;}

    /**
     * Certificate Request Status from Value
     * @param value
     * @return
     * @throws java.lang.IllegalArgumentException
     */
    public static CertificateRequestStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CertificateRequestStatus enumeration = (CertificateRequestStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

    /**
     * Certificate Request Status from Value
     * @param value
     * @return
     * @throws java.lang.IllegalArgumentException
     */
    public static CertificateRequestStatus fromString(java.lang.String value)
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
     * @return  hash code for this CertificateRequestStatus object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}



    /**
     * Returns String Representation of Object
     * @return String
     */
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}

     /**
     * Get Custom Serializer
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
     * Get Custom Deserializer
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
        new org.apache.axis.description.TypeDesc(CertificateRequestStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
