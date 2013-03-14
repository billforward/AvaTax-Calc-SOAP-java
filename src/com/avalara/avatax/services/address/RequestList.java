/**
 * RequestList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.address;

public class RequestList  implements java.io.Serializable {
    private com.avalara.avatax.services.address.ValidateRequest[] validateRequest;

    public RequestList() {
    }

    public RequestList(
           com.avalara.avatax.services.address.ValidateRequest[] validateRequest) {
           this.validateRequest = validateRequest;
    }


    /**
     * Gets the validateRequest value for this RequestList.
     *
     * @return validateRequest
     */
    public com.avalara.avatax.services.address.ValidateRequest[] getValidateRequest() {
        return validateRequest;
    }


    /**
     * Sets the validateRequest value for this RequestList.
     *
     * @param validateRequest
     */
    public void setValidateRequest(com.avalara.avatax.services.address.ValidateRequest[] validateRequest) {
        this.validateRequest = validateRequest;
    }

    public com.avalara.avatax.services.address.ValidateRequest getValidateRequest(int i) {
        return this.validateRequest[i];
    }

    public void setValidateRequest(int i, com.avalara.avatax.services.address.ValidateRequest _value) {
        this.validateRequest[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestList)) return false;
        RequestList other = (RequestList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.validateRequest==null && other.getValidateRequest()==null) ||
             (this.validateRequest!=null &&
              java.util.Arrays.equals(this.validateRequest, other.getValidateRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getValidateRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidateRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidateRequest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ValidateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ValidateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
