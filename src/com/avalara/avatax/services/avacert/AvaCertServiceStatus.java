package com.avalara.avatax.services.avacert;
/**
 * AvaCertServiceStatus.java
 * AvaCert Web Service Status
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class AvaCertServiceStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AvaCertServiceStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     * This Variable contains AvaCert WebService Status value as "Disabled"
     */
    public static final java.lang.String _Disabled = "Disabled";
     /**
     * This Variable contains AvaCert WebService Status value as "Onboarding"
     */
    public static final java.lang.String _Onboarding = "Onboarding";
     /**
     * This Variable contains AvaCert WebService Status value as "Enabled"
     */
    public static final java.lang.String _Enabled = "Enabled";
     /**
     * This Variable contains AvaCert WebService Status value as "Disabled"
     */
    public static final AvaCertServiceStatus Disabled = new AvaCertServiceStatus(_Disabled);
     /**
     * This Variable contains AvaCert WebService Status value as "Onboarding"
     */
    public static final AvaCertServiceStatus Onboarding = new AvaCertServiceStatus(_Onboarding);
     /**
     * This Variable contains AvaCert WebService Status value as "Enabled"
     */
    public static final AvaCertServiceStatus Enabled = new AvaCertServiceStatus(_Enabled);

    /**
     * This method retrieves avacert webservice status value
     * @return String _value
     */
    public java.lang.String getValue() { return _value_;}
     /**
     * This method retrieves object of AvaCertServiceStatus based on parameter values
     * @param value
     * @return AvaCertServiceStatus
     */
    public static AvaCertServiceStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AvaCertServiceStatus enumeration = (AvaCertServiceStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    /**
      * This method retrieves object of AvaCertServiceStatus based on parameter string
      * @param value
      * @return AvaCertServiceStatus
      */

    public static AvaCertServiceStatus fromString(java.lang.String value)
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
     * @return  hash code for this AvaCertServiceStatus object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

    /**
     * Returns a string representation of the object.
     * @return _value : String
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
        new org.apache.axis.description.TypeDesc(AvaCertServiceStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertServiceStatus"));
    }
    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
