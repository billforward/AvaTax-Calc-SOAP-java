package com.avalara.avatax.services.avacert2;

/**
 *  ReviewStatus indicates the review status for the Certificate record
 *  PENDING  - The certificate has not yet been reviewed.
 *  ACCEPTED - The certificate was accepted during review.
 *  REJECTED - The certificate was rejected during review.
 */
public class ReviewStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

   /**
     * Initializes a new instance of the class with Review STATUS Value
     * of {@link String} objects.
     * @param value
     */
    protected ReviewStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     * PENDING - The certificate has not yet been reviewed.  
     */
    public static final java.lang.String _PENDING = "PENDING";
    /**
     * ACCEPTED  - The certificate was accepted during review
     */
    public static final java.lang.String _ACCEPTED = "ACCEPTED";
    /**
     * REJECTED - The certificate was rejected during review. 
     */
    public static final java.lang.String _REJECTED = "REJECTED";
    /**
     * PENDING - The certificate has not yet been reviewed.
     */
    public static final ReviewStatus PENDING = new ReviewStatus(_PENDING);
    /**
     *  ACCEPTED  - The certificate was accepted during review
     */
    public static final ReviewStatus ACCEPTED = new ReviewStatus(_ACCEPTED);
    /**
     * REJECTED - The certificate was rejected during review.
     */
    public static final ReviewStatus REJECTED = new ReviewStatus(_REJECTED);

    /**
     * Returns the Certificate Review Status  Value
     * @return  String
     */
    public java.lang.String getValue() { return _value_;}

     /**
     * Certificate Review Status from Value
     * @param value
     * @return CertificateReviewStatus
     * @throws java.lang.IllegalArgumentException
     */
    public static ReviewStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReviewStatus enumeration = (ReviewStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }

     /**
     * Certificate Request Status from String
     * @param value
     * @return CertificateReviewStatus
     * @throws java.lang.IllegalArgumentException
     */
    public static ReviewStatus fromString(java.lang.String value)
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
     * @return  hash code for this CertificateReviewStatus object
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
        new org.apache.axis.description.TypeDesc(ReviewStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReviewStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
