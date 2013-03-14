
package com.avalara.avatax.services.avacert2;
/**
 * BaseResult.java
 * All classes used to retrive data from web service method call must implement this base class.
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class BaseResult  implements java.io.Serializable {
    private java.lang.String transactionId;
    private SeverityLevel resultCode;

    /**
     * Array of zero or more {@link Message} objects
     */
    private ArrayOfMessage messages;

    /**
      * Initializes a new instance of the class
      */
    public BaseResult() {
    }

     /**
     * Initializes a new instance of the class
     * @param transactionId
     * @param resultCode
     * @param messages
     */
    public BaseResult(
           java.lang.String transactionId,
           SeverityLevel resultCode,
           ArrayOfMessage messages) {
           this.transactionId = transactionId;
           this.resultCode = resultCode;
           this.messages = messages;
    }


    /**
     * Gets the transactionId value for this BaseResult.
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BaseResult.
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the resultCode value for this BaseResult.
     * @return resultCode
     */
    public SeverityLevel getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BaseResult.
     * @param resultCode
     */
    public void setResultCode(SeverityLevel resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the messages value for this BaseResult.
     * @return messages
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this BaseResult.
     * @param messages
     */
    public void setMessages(ArrayOfMessage messages) {
        this.messages = messages;
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

    /**
       *  Serves as a hash function for a particular type,
       * suitable for use in hashing algorithms and data
       * structures like a hash table.
       * @return  hash code for this BaseResult object
       * @see java.lang.Object#hashCode
       */
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
    * Return Axis type metadata object; this method is used internally by the adapter
    * and not intended to be used by external implementation code.
    */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
   * Get Axis Custom Serializer; this method is used internally by the adapter
   * and not intended to be used by external implementation code.
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
    * Get Axis Custom Deserializer; this method is used internally by the adapter
    * and not intended to be used by external implementation code.
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
