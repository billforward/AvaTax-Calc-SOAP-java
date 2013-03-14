package com.avalara.avatax.services.avacert2;
/**
 * ArrayOfMessage.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link Message} objects
 * for SOAP transmission via the Web returned as part of a method call's result object.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *                  Calendar fromdate = Calendar.getInstance();
 *                  fromdate.set(2010,01,01);
 *                  System.out.println("FromDate:"+fromdate.getTime() );
 *                  CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();
 *                  getExemptionCertificatesRequest.setCompanyCode("DEFAULT") ;
 *                  getExemptionCertificatesRequest.setCustomerCode("");
 *                  getExemptionCertificatesRequest.setModFromDate(fromdate);
 *                  getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
 *                  CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);
 *         <b>      ArrayOfMessage aom =  getExemptionCertificatesResult.getMessages() ; </b>
 *                  if(aom != null && aom.getMessage().length>0)
 *                  {
 *                     int count =0;
 *                     Message mes=aom.getMessage(count);
 *                     String arros = mes.getDetails();
 *                  }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */



public class ArrayOfMessage  implements java.io.Serializable {

    /**
     *  an array of zero or more {@link Message} objects
     */
    private Message[] message;

    /**
      * Initializes a new instance of the class with an empty array
      * of {@link Message} objects.
      */
    public ArrayOfMessage() {
    }

    /**
     * Initializes a new instance of the class and its internal array
     * of {@link Message} objects.
     * @param message
     */
    public ArrayOfMessage(
           Message[] message) {
           this.message = message;
    }


    /**
     * Retrieves the raw array of {@link Message} objects encapsulated in
     * this object.
     * @return Message
     */
    public Message[] getMessage() {
        return message;
    }


    /**
     * Allows one to programatically set the raw array of {@link Message} objects
     * encapsulated by this object.
     * @param message
     */
    public void setMessage(Message[] message) {
        this.message = message;
    }

     /**
     * Retrieves the ith {@link Message} object (counting from 0) from the array
     * of Message encapsulated in this object. Should only be used if its known
     * that {@link #getMessage} returns a non-null value and that i < number of Message
     * actually in that array.
     * @param i integer from 0 to (number of Message -1)
     * @return Message
     */
    public Message getMessage(int i) {
        return this.message[i];
    }

     /**
     * Allows one to replace the ith {@link Message} object (counting from 0) within the array
     * of Message encapsulated in this object. Should only be used if its known
     * that {@link #getMessage} returns a non-null value and that i < number of Message
     * actually in that array.
     * @param i integer from 0 to (number of Message -1)
     * @param  _value Message object to place in the indicated position of the
     * Message array
     */
    public void setMessage(int i, Message _value) {
        this.message[i] = _value;
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
        if (!(obj instanceof ArrayOfMessage)) return false;
        ArrayOfMessage other = (ArrayOfMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
       /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this ArrayOfMessage object
        * @see java.lang.Object#hashCode
        */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
