package com.avalara.avatax.services.avacert2;
/**
 * CommunicationMode.java
 * CommunicationMode indicates the mode to use for communicating with the customer.
 */

public class CommunicationMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

   /**
     * Initializes a new instance of the class with Mode Value
     * of {@link String} objects.
     * @param value
     */
    protected CommunicationMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     * Null Value
     */
    public static final java.lang.String _NULL = "NULL";

   /**
    * Email address
    */
    public static final String _EMAIL = "EMAIL";
   /**
    * Mail address
    */
    public static final String _MAIL = "MAIL";
    /**
    * Fax No.
    */
    public static final String _FAX = "FAX";
    /**
     * Null Value
     */
    public static final CommunicationMode NULL = new CommunicationMode(_NULL);
    /**
    * Email address
    */
    public static final CommunicationMode EMAIL = new CommunicationMode(_EMAIL);
     /**
    * Mail address
    */
    public static final CommunicationMode MAIL = new CommunicationMode(_MAIL);
     /**
    * Fax No.
    */
    public static final CommunicationMode FAX = new CommunicationMode(_FAX);
    /**
     * This method returns value of communication mode
     * @return String _value_
     */
    public String getValue() { return _value_;}
    public static CommunicationMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CommunicationMode enumeration = (CommunicationMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CommunicationMode fromString(java.lang.String value)
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
     * @return  hash code for this CommunicationMode object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}
     /**
     * Returns a string representation of the object.
     * @return  String _value
     */
    public java.lang.String toString() { return _value_;}
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
