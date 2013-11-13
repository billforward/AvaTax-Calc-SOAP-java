
package com.avalara.avatax.services.avacert;
/**
 * CommunicationMode.java
 * CommunicationMode indicates the mode to use for communicating with the customer.
 */

public class CommunicationMode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

   /**
     * Initializes a new instance of the class with Mode Value
     * of {@link String} objects.
     * @param value
     */
    protected CommunicationMode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

   /**
    * Email address
    */
    public static final String _Email = "Email";
   /**
    * Mail address
    */
    public static final String _Mail = "Mail";
    /**
    * Fax No.
    */
    public static final String _Fax = "Fax";
    /**
    * Email address
    */
    public static final CommunicationMode Email = new CommunicationMode(_Email);
     /**
    * Mail address
    */
    public static final CommunicationMode Mail = new CommunicationMode(_Mail);
     /**
    * Fax No.
    */
    public static final CommunicationMode Fax = new CommunicationMode(_Fax);

    /**
     * This method returns value of communication mode
     * @return String _value_
     */
    public String getValue() { return _value_;}


    public static CommunicationMode fromValue(String value)
          throws IllegalArgumentException {
        CommunicationMode enumeration = (CommunicationMode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CommunicationMode fromString(String value)
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
     * @return  hash code for this CommunicationMode object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

     /**
     * Returns a string representation of the object.
     * @return  String _value
     */
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}

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
        new org.apache.axis.description.TypeDesc(CommunicationMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
    }
   /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
