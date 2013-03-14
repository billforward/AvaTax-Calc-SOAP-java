package com.avalara.avatax.services.avacert2;
/**
 * PingResult.java
 * Result information returned from the AvaCert2Svc's Ping method
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *<B>   PingResult pingResult = port.ping(""); </B>
 * </pre>
 * This file was auto-generated from WSDL
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class PingResult  extends BaseResult  implements java.io.Serializable {
    private java.lang.String version;

    /**
     * Initialize the instance of PingResult class
     */
    public PingResult() {
    }

    /**
     *Initialize the instance of PingResult class
     * @param version
     */
    public PingResult(
           java.lang.String version) {
           this.version = version;
    }


    /**
     * Gets the version value for this PingResult.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PingResult.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;

    /**
       * Determines whether the specified Object is equal to the current Object.
       * Note: In current implementation all Java Strings members of the two
       * objects must be exactly alike, including in case, for equal to return true.
       * @param obj
       * @return true or false, indicating if the two objects are equal.
       */

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PingResult)) return false;
        PingResult other = (PingResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
      *  Serves as a hash function for a particular type,
      * suitable for use in hashing algorithms and data
      * structures like a hash table.
      * @return  hash code for this PingResult object
      * @see java.lang.Object#hashCode
      */

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PingResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
