package com.avalara.avatax.services.avacert2;
/**
 * CertificateRequestInitiateResult.java
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *   //Add customer
 *           Customer customer = getCustomer();
 *           String customerCodeValue="avatax4j"+new Date().getTime() ;
 *           customer.setCustomerCode(customerCodeValue);
 *           CustomerSaveRequest addcustReq = new CustomerSaveRequest();
 *           CustomerSaveResult addcustRes = new CustomerSaveResult();
 *           addcustReq.setCompanyCode("Default");
 *           addcustReq.setCustomer(customer);
 *           addcustRes = port.customerSave(addcustReq);
 *
 *
 *       //Success
 *       CertificateRequestInitiateRequest initiateExemptCertRequest=new CertificateRequestInitiateRequest();</b>
 *       initiateExemptCertRequest.setCompanyCode("Default");
 *       initiateExemptCertRequest.setCommunicationMode(CommunicationMode.Email);
 *       initiateExemptCertRequest.setCustomMessage("Testing");
 *       initiateExemptCertRequest.setCustomerCode(customerCodeValue);
 *  <b>     CertificateRequestInitiateResult initiateExemptCertResult= port.certificateRequestInitiate(initiateExemptCertRequest);</b>
 * </pre>
  * @author Nitin Shirsat
  * Copyright (c) 2011, Avalara.  All rights reserved.
  */



public class CertificateRequestInitiateResult  extends BaseResult  implements java.io.Serializable {
    /**
     * Request Tracking Code
     */
    private java.lang.String trackingCode;

    /**
     * URL to launch wizard for DIRECT communication mode
     */
    private java.lang.String wizardLaunchUrl;

    /**
     * Corresponding REquest ID
     */
    private java.lang.String requestId;

    /**
     * Customer Code
     */
    private java.lang.String customerCode;

     /**
     *  Initializes a new instance of the CertificateRequestInitiateResult class
     */
    public CertificateRequestInitiateResult() {
    }

    /**
     * Initializes a new instance of the CertificateRequestInitiateResult class
     * @param trackingCode
     * @param wizardLaunchUrl
     * @param requestId
     * @param customerCode
     */
    public CertificateRequestInitiateResult(
           java.lang.String trackingCode,
           java.lang.String wizardLaunchUrl,
           java.lang.String requestId,
           java.lang.String customerCode) {
           this.trackingCode = trackingCode;
           this.wizardLaunchUrl = wizardLaunchUrl;
           this.requestId = requestId;
           this.customerCode = customerCode;
    }


    /**
     * Gets the trackingCode value for this CertificateRequestInitiateResult.
     * 
     * @return trackingCode
     */
    public java.lang.String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this CertificateRequestInitiateResult.
     *
     * @param trackingCode
     */
    public void setTrackingCode(java.lang.String trackingCode) {
        this.trackingCode = trackingCode;
    }


    /**
     * Gets the wizardLaunchUrl value for this CertificateRequestInitiateResult.
     * 
     * @return wizardLaunchUrl
     */
    public java.lang.String getWizardLaunchUrl() {
        return wizardLaunchUrl;
    }


    /**
     * Sets the wizardLaunchUrl value for this CertificateRequestInitiateResult.
     *
     * @param wizardLaunchUrl
     */
    public void setWizardLaunchUrl(java.lang.String wizardLaunchUrl) {
        this.wizardLaunchUrl = wizardLaunchUrl;
    }


    /**
     * Gets the requestId value for this CertificateRequestInitiateResult.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this CertificateRequestInitiateResult.
     *
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the customerCode value for this CertificateRequestInitiateResult.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CertificateRequestInitiateResult.
     *
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
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
        if (!(obj instanceof CertificateRequestInitiateResult)) return false;
        CertificateRequestInitiateResult other = (CertificateRequestInitiateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trackingCode==null && other.getTrackingCode()==null) || 
             (this.trackingCode!=null &&
              this.trackingCode.equals(other.getTrackingCode()))) &&
            ((this.wizardLaunchUrl==null && other.getWizardLaunchUrl()==null) || 
             (this.wizardLaunchUrl!=null &&
              this.wizardLaunchUrl.equals(other.getWizardLaunchUrl()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
       /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this CertificateRequestInitiateResult object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTrackingCode() != null) {
            _hashCode += getTrackingCode().hashCode();
        }
        if (getWizardLaunchUrl() != null) {
            _hashCode += getWizardLaunchUrl().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateRequestInitiateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TrackingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wizardLaunchUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "WizardLaunchUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerCode"));
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
