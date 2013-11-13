

package com.avalara.avatax.services.avacert;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
/**
 * CertificateUsage.java
 * CertificateUsage indicates the usage type for the Certificate record.
 */
public class CertificateUsage implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();

    /**
     * Initializes a new instance of the class with Usage Value
     * of {@link String} objects.
     * @param value
     */
    protected CertificateUsage(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

   /**
    * The certificate may be used multiple times. 
    */
    public static final String _BLANKET = "BLANKET";
    /**
    * The certificate may only be used for a single transaction. 
    */
    public static final String _SINGLE = "SINGLE";
   /**
    * The value has not been set.
    */
    public static final String _NULL = "NULL";

       /**
    * The certificate may be used multiple times.
    */
    public static final CertificateUsage BLANKET = new CertificateUsage(_BLANKET);
      /**
    * The certificate may only be used for a single transaction.
    */
    public static final CertificateUsage SINGLE = new CertificateUsage(_SINGLE);
     /**
    * The value has not been set.
    */
    public static final CertificateUsage NULL = new CertificateUsage(_NULL);
    public String getValue() { return _value_;}

    /**
     * Returns Certificate Usage Value
     * of {@link String} objects.
     * @param value
     * @return  value
     * @throws IllegalArgumentException
     */
    public static CertificateUsage fromValue(String value)
          throws IllegalArgumentException {
        CertificateUsage enumeration = (CertificateUsage)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }

    /**
     * Returns Certificate Usage Value
     * of {@link String} objects.
     * @param value
     * @return value
     * @throws IllegalArgumentException
     */
    public static CertificateUsage fromString(String value)
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
     * @return  hash code for this CertificateUsage object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}
    /**
     * Returns a string representation of the object.
     * @return  String _value
     */
    public String toString() { return _value_;}

    /**
     *
     * @return Object
     * @throws ObjectStreamException
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
        new org.apache.axis.description.TypeDesc(CertificateUsage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateUsage"));
    }
     /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
