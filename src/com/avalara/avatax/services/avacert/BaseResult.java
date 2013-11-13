/**
 * BaseResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.avacert;

public class BaseResult  implements java.io.Serializable {
    private String transactionId;
    private com.avalara.avatax.services.avacert.SeverityLevel resultCode;
    private ArrayOfMessage messages;

    public BaseResult() {
    }

    public BaseResult(
           String transactionId,
           com.avalara.avatax.services.avacert.SeverityLevel resultCode,
           ArrayOfMessage messages) {
           this.transactionId = transactionId;
           this.resultCode = resultCode;
           this.messages = messages;
    }


    /**
     * Gets the transactionId value for this BaseResult.
     * 
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BaseResult.
     * 
     * @param transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the resultCode value for this BaseResult.
     * 
     * @return resultCode
     */
    public com.avalara.avatax.services.avacert.SeverityLevel getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BaseResult.
     * 
     * @param resultCode
     */
    public void setResultCode(com.avalara.avatax.services.avacert.SeverityLevel resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the messages value for this BaseResult.
     * 
     * @return messages
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this BaseResult.
     * 
     * @param messages
     */
    public void setMessages(ArrayOfMessage messages) {
        this.messages = messages;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BaseResult)) return false;
        BaseResult other = (BaseResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              this.messages.equals(other.getMessages())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfMessage"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
