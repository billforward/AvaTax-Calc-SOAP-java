package com.avalara.avatax.services.avacert2;
/**
 * CertificateRequestInitiateRequest.java
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
 *  <b>     CertificateRequestInitiateRequest initiateExemptCertRequest=new CertificateRequestInitiateRequest();</b>
 *       initiateExemptCertRequest.setCompanyCode("Default");
 *       initiateExemptCertRequest.setCommunicationMode(CommunicationMode.Email);
 *       initiateExemptCertRequest.setCustomMessage("Testing");
 *       initiateExemptCertRequest.setCustomerCode(customerCodeValue);
 *       CertificateRequestInitiateResult initiateExemptCertResult= port.certificateRequestInitiate(initiateExemptCertRequest);
 * </pre>
  * @author Nitin Shirsat
  * Copyright (c) 2011, Avalara.  All rights reserved.
  */




public class CertificateRequestInitiateRequest implements java.io.Serializable {

    /**
     * Company Code
     */
    private java.lang.String companyCode;

    /**
     * Customer Code
     */
    private java.lang.String customerCode;

    /**
     *  CommunicationMode indicates the mode to use for communicating with the customer like Email, Mail, or Fax.
     */
    private CommunicationMode communicationMode;

    /**
     * Source Location Code
     */
    private java.lang.String sourceLocationCode;

     /**
     * Type indicates the type of the request to be initiated.
     */
    private RequestType type;

    /**
     * Custom Message
     */
    private java.lang.String customMessage;

    /**
      Letter Template
     */
    private java.lang.String letterTemplate;

    /**
     *Include Cover Page
     */
    private java.lang.String includeCoverPage;

    /**
     * Reason to Close the  request
     */
    private java.lang.String closeReason;

    /**
     * Corresponding Request ID
     */
    private java.lang.String requestId;

    /**
     *  Initializes a new instance of the CertificateRequestInitiateRequest class
     */
    public CertificateRequestInitiateRequest() {

         communicationMode = CommunicationMode.EMAIL;
         type = RequestType.STANDARD;
    }

    /**
     * Initializes a new instance of the CertificateRequestInitiateRequest class
     * @param companyCode
     * @param customerCode
     * @param communicationMode
     * @param sourceLocationCode
     * @param type
     * @param customMessage
     * @param letterTemplate
     * @param includeCoverPage
     * @param closeReason
     * @param requestId
     */

    public CertificateRequestInitiateRequest(
           java.lang.String companyCode,
           java.lang.String customerCode,
           CommunicationMode communicationMode,
           java.lang.String sourceLocationCode,
           RequestType type,
           java.lang.String customMessage,
           java.lang.String letterTemplate,
           java.lang.String includeCoverPage,
           java.lang.String closeReason,
           java.lang.String requestId) {
           this.companyCode = companyCode;
           this.customerCode = customerCode;
           this.communicationMode = communicationMode;
           this.sourceLocationCode = sourceLocationCode;
           this.type = type;
           this.customMessage = customMessage;
           this.letterTemplate = letterTemplate;
           this.includeCoverPage = includeCoverPage;
           this.closeReason = closeReason;
           this.requestId = requestId;
    }


    /**
     * Gets the companyCode value for this CertificateRequestInitiateRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CertificateRequestInitiateRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the customerCode value for this CertificateRequestInitiateRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CertificateRequestInitiateRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the communicationMode value for this CertificateRequestInitiateRequest.
     * 
     * @return communicationMode
     */
    public CommunicationMode getCommunicationMode() {
        return communicationMode;
    }


    /**
     * Sets the communicationMode value for this CertificateRequestInitiateRequest.
     * 
     * @param communicationMode
     */
    public void setCommunicationMode(CommunicationMode communicationMode) {
        this.communicationMode = communicationMode;
    }


    /**
     * Gets the sourceLocationCode value for this CertificateRequestInitiateRequest.
     * 
     * @return sourceLocationCode
     */
    public java.lang.String getSourceLocationCode() {
        return sourceLocationCode;
    }


    /**
     * Sets the sourceLocationCode value for this CertificateRequestInitiateRequest.
     * 
     * @param sourceLocationCode
     */
    public void setSourceLocationCode(java.lang.String sourceLocationCode) {
        this.sourceLocationCode = sourceLocationCode;
    }


    /**
     * Gets the type value for this CertificateRequestInitiateRequest.
     * 
     * @return type
     */
    public RequestType getType() {
        return type;
    }


    /**
     * Sets the type value for this CertificateRequestInitiateRequest.
     * 
     * @param type
     */
    public void setType(RequestType type) {
        this.type = type;
    }


    /**
     * Gets the customMessage value for this CertificateRequestInitiateRequest.
     * 
     * @return customMessage
     */
    public java.lang.String getCustomMessage() {
        return customMessage;
    }


    /**
     * Sets the customMessage value for this CertificateRequestInitiateRequest.
     * 
     * @param customMessage
     */
    public void setCustomMessage(java.lang.String customMessage) {
        this.customMessage = customMessage;
    }


    /**
     * Gets the letterTemplate value for this CertificateRequestInitiateRequest.
     * 
     * @return letterTemplate
     */
    public java.lang.String getLetterTemplate() {
        return letterTemplate;
    }


    /**
     * Sets the letterTemplate value for this CertificateRequestInitiateRequest.
     * 
     * @param letterTemplate
     */
    public void setLetterTemplate(java.lang.String letterTemplate) {
        this.letterTemplate = letterTemplate;
    }


    /**
     * Gets the includeCoverPage value for this CertificateRequestInitiateRequest.
     * 
     * @return includeCoverPage
     */
    public java.lang.String getIncludeCoverPage() {
        return includeCoverPage;
    }


    /**
     * Sets the includeCoverPage value for this CertificateRequestInitiateRequest.
     * 
     * @param includeCoverPage
     */
    public void setIncludeCoverPage(java.lang.String includeCoverPage) {
        this.includeCoverPage = includeCoverPage;
    }


    /**
     * Gets the closeReason value for this CertificateRequestInitiateRequest.
     * 
     * @return closeReason
     */
    public java.lang.String getCloseReason() {
        return closeReason;
    }


    /**
     * Sets the closeReason value for this CertificateRequestInitiateRequest.
     * 
     * @param closeReason
     */
    public void setCloseReason(java.lang.String closeReason) {
        this.closeReason = closeReason;
    }


    /**
     * Gets the requestId value for this CertificateRequestInitiateRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this CertificateRequestInitiateRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
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
        if (!(obj instanceof CertificateRequestInitiateRequest)) return false;
        CertificateRequestInitiateRequest other = (CertificateRequestInitiateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.communicationMode==null && other.getCommunicationMode()==null) || 
             (this.communicationMode!=null &&
              this.communicationMode.equals(other.getCommunicationMode()))) &&
            ((this.sourceLocationCode==null && other.getSourceLocationCode()==null) || 
             (this.sourceLocationCode!=null &&
              this.sourceLocationCode.equals(other.getSourceLocationCode()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.customMessage==null && other.getCustomMessage()==null) || 
             (this.customMessage!=null &&
              this.customMessage.equals(other.getCustomMessage()))) &&
            ((this.letterTemplate==null && other.getLetterTemplate()==null) || 
             (this.letterTemplate!=null &&
              this.letterTemplate.equals(other.getLetterTemplate()))) &&
            ((this.includeCoverPage==null && other.getIncludeCoverPage()==null) || 
             (this.includeCoverPage!=null &&
              this.includeCoverPage.equals(other.getIncludeCoverPage()))) &&
            ((this.closeReason==null && other.getCloseReason()==null) || 
             (this.closeReason!=null &&
              this.closeReason.equals(other.getCloseReason()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this CertificateRequestInitiateRequest object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getCommunicationMode() != null) {
            _hashCode += getCommunicationMode().hashCode();
        }
        if (getSourceLocationCode() != null) {
            _hashCode += getSourceLocationCode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCustomMessage() != null) {
            _hashCode += getCustomMessage().hashCode();
        }
        if (getLetterTemplate() != null) {
            _hashCode += getLetterTemplate().hashCode();
        }
        if (getIncludeCoverPage() != null) {
            _hashCode += getIncludeCoverPage().hashCode();
        }
        if (getCloseReason() != null) {
            _hashCode += getCloseReason().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateRequestInitiateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyCode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SourceLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestType"));
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
        elemField.setFieldName("letterTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LetterTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCoverPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IncludeCoverPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CloseReason"));
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
