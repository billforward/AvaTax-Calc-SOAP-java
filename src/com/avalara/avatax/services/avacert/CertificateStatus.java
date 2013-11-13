package com.avalara.avatax.services.avacert;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

/**
 * CertificateStatus.java
 * CertificateStatus indicates the status for the Certificate record.
 * ACTIVE - The certificate is active with images received.
 * VOID - The certificate has been voided from active use.
 * INCOMPLETE - The certificate does not yet have all of its images received
 */
public class CertificateStatus implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();

   /**
     * Initializes a new instance of the class with STATUS Value
     * of {@link String} objects.
     * @param value
     */
    protected CertificateStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }
    /**
    * The certificate is active with images received.
    */
    public static final String _ACTIVE = "ACTIVE";
    /**
    *  The certificate has been voided from active use.
    */
    public static final String _VOID = "VOID";

    /**
    * The certificate does not yet have all of its images received.
    */
    public static final String _INCOMPLETE = "INCOMPLETE";

   /**
    * The certificate is active with images received.
    */
    public static final CertificateStatus ACTIVE = new CertificateStatus(_ACTIVE);
   /**
    *  The certificate has been voided from active use.
    */
    public static final CertificateStatus VOID = new CertificateStatus(_VOID);

   /**
    * The certificate does not yet have all of its images received.
    */
    public static final CertificateStatus INCOMPLETE = new CertificateStatus(_INCOMPLETE);

    /**
     * Returns Certificate Status Value
     * of {@link String} objects.
     * @return _value_
     */
    public String getValue() { return _value_;}

    /**
     * Returns Certificate Status from value
     * @param value
     * @return CertificateStatus
     * @throws IllegalArgumentException
     */
    public static CertificateStatus fromValue(String value)
          throws IllegalArgumentException {
        CertificateStatus enumeration = (CertificateStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }

    /**
     * Returns Certificate Status from string
     * @param value
     * @return CertificateStatus
     * @throws IllegalArgumentException
     */
    public static CertificateStatus fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }


   /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public boolean equals(Object obj) {return (obj == this);}

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
    public String toString() { return _value_;}

    /**
     * @return Object
     * @throws java.io.ObjectStreamException
     */
    public Object readResolve() throws ObjectStreamException { return fromValue(_value_);}

     /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
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
           String mechType,
           Class _javaType,
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
