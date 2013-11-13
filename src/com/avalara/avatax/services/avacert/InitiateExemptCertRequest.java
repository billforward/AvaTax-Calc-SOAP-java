package com.avalara.avatax.services.avacert;
/**
 * InitiateExemptCertRequest.java
 * The class contains Inputs for InitiateExemptCert
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *        Customer customer = getCustomer();
 *        String customerCodeValue="avatax4j"+new Date().getTime() ;
 *        customer.setCustomerCode(customerCodeValue);
 *        <b>InitiateExemptCertRequest initiateExemptCertRequest=new InitiateExemptCertRequest();</b>
 *        initiateExemptCertRequest.setCustomer(customer);
 *        initiateExemptCertRequest.setCommunicationMode(CommunicationMode.Email);
 *        initiateExemptCertRequest.setCustomMessage("Testing");
 *        InitiateExemptCertResult initiateExemptCertResult= port.initiateExemptCert(initiateExemptCertRequest);
 *        Assert.assertEquals(SeverityLevel.Success,initiateExemptCertResult.getResultCode());
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */



public class InitiateExemptCertRequest  extends BaseRequest  implements java.io.Serializable {


    /**
     * The customer to add.
     */
    private Customer customer;

    /**
     * LocationCode is the Source LocationCode for the request.
     * If provided; the code must be one that exists for the Company.
     */
    private String locationCode;


    /**
     *  Custom message to be used for the request.
     */
    private String customMessage;

    /**
     * CommunicationMode indicates the mode to use for communicating with the customer like Email, Mail, or Fax.
     */
    private CommunicationMode communicationMode;

    /**
     * Type indicates the type of the request to be initiated.
     */
    private RequestType type;
    


   /* Constructor :
    * Initializes a new instance of the InitiateExemptCertRequest class.
    */
    public InitiateExemptCertRequest() {
        communicationMode = CommunicationMode.Email;
              type = RequestType.STANDARD;

    }

   /* Constructor :
    * Initializes a new instance of the InitiateExemptCertRequest class.
    * @param customer   - The customer to add.
    * @param locationCode  -LocationCode is the Source LocationCode for the request
    * @param customMessage -Custom message to be used for the request.
    * @param communicationMode  -the mode to use for communicating with the customer
    * @param type -the type of the request to be initiated.
    */
    private InitiateExemptCertRequest(
           Customer customer,
           String locationCode,
           String customMessage,
           CommunicationMode communicationMode ,RequestType type) {
           this.customer = customer;
           this.locationCode = locationCode;
           this.customMessage = customMessage;
           this.communicationMode = communicationMode;
           this.type = type;
    }


    /**
     * Gets the customer value for this InitiateExemptCertRequest.
     * 
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this InitiateExemptCertRequest.
     * 
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the locationCode value for this InitiateExemptCertRequest.
     * 
     * @return locationCode
     */
    public String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this InitiateExemptCertRequest.
     * 
     * @param locationCode
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the customMessage value for this InitiateExemptCertRequest.
     * 
     * @return customMessage
     */
    public String getCustomMessage() {
        return customMessage;
    }


    /**
     * Sets the customMessage value for this InitiateExemptCertRequest.
     * 
     * @param customMessage
     */
    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }


    /**
     * Gets the communicationMode value for this InitiateExemptCertRequest.
     * 
     * @return communicationMode
     */
    public CommunicationMode getCommunicationMode() {
        return communicationMode;
    }


    /**
     * Sets the communicationMode value for this InitiateExemptCertRequest.
     * 
     * @param communicationMode
     */
    public void setCommunicationMode(CommunicationMode communicationMode) {
        this.communicationMode = communicationMode;
    }


    /**
     * Gets the type value for this InitiateExemptCertRequest.
     * 
     * @return type
     */
           public RequestType getType() {
        return type;
    }


    /**
     * Sets the type value for this InitiateExemptCertRequest.
     * 
     * @param type
     */
    public void setType(RequestType type) {
        this.type = type;
    }
    private Object __equalsCalc = null;

    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InitiateExemptCertRequest)) return false;
        InitiateExemptCertRequest other = (InitiateExemptCertRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.customMessage==null && other.getCustomMessage()==null) || 
             (this.customMessage!=null &&
              this.customMessage.equals(other.getCustomMessage()))) &&
            ((this.communicationMode==null && other.getCommunicationMode()==null) || 
             (this.communicationMode!=null &&
              this.communicationMode.equals(other.getCommunicationMode())))&&
            ((this.type==null && other.getType()==null) ||
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this InitiateExemptionCertificatesRequest object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getCustomMessage() != null) {
            _hashCode += getCustomMessage().hashCode();
        }
        if (getCommunicationMode() != null) {
            _hashCode += getCommunicationMode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateExemptCertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);        
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestType"));
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
           String mechType,
           Class _javaType,
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
