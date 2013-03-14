package com.avalara.avatax.services.avacert2;

import java.util.Calendar;

/**
 * CertificateRequest.java
 * Class Contains Attributes and Behaviour of Certificate Request
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *                 CertificateRequestGetRequest certificaterequestgetrequest = new CertificateRequestGetRequest();
 *                 CertificateRequestGetResult certificaterequestgetresult= port.certificateRequestGet(certificaterequestgetrequest);
 *                 ArrayOfCertificateRequest arrocr = certificaterequestgetresult.getCertificateRequests();
 *
 *                 if(arrocr != null && arrocr.getCertificateRequest().length>0)
 *                  {
 *                      int count =0;
 *               <b>       CertificateRequest eCert=arrocr.getCertificateRequest(count); </b>
 *                      //fetch the properties of CertificateRequest
 *                  }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */



public class CertificateRequest  implements java.io.Serializable {
    /**
     * Request ID
     */
    private java.lang.String requestId;

    /**
     * Tracking Code
     */
    private java.lang.String trackingCode;

    /**
     * Location Code
     */
    private java.lang.String sourceLocationCode;
    /**
     * Request Date
     */
    private java.util.Calendar requestDate;
    /**
     * Customer Code
     */
    private java.lang.String customerCode;

    /**
     * Creator Name
     */
    private java.lang.String creatorName;

    /**
     * Date of modification
     */
    private java.util.Calendar lastModifyDate;

    /**
     * Request Status
     */
    private CertificateRequestStatus requestStatus;

    /**
     * Request Stage
     */
    private CertificateRequestStage requestStage;

    /**
     * Communication Mode
     */
    private CommunicationMode communicationMode;


    /**
     * Method to initialize the Object of CertificateRequest Class with default values
     */
    public CertificateRequest() {

       requestStatus =  CertificateRequestStatus.ALL;
        requestStage=  CertificateRequestStage.REQUESTINITIATED;
        communicationMode= CommunicationMode.NULL;
    }

    /**
     * Method to initialize the Object of CertificateRequest Class with parametrised values
     * @param requestId
     * @param trackingCode
     * @param sourceLocationCode
     * @param requestDate
     * @param customerCode
     * @param creatorName
     * @param lastModifyDate
     * @param requestStatus
     * @param requestStage
     * @param communicationMode
     */
    public CertificateRequest(
           java.lang.String requestId,
           java.lang.String trackingCode,
           java.lang.String sourceLocationCode,
           java.util.Calendar requestDate,
           java.lang.String customerCode,
           java.lang.String creatorName,
           java.util.Calendar lastModifyDate,
           CertificateRequestStatus requestStatus,
           CertificateRequestStage requestStage,
           CommunicationMode communicationMode) {
           this.requestId = requestId;
           this.trackingCode = trackingCode;
           this.sourceLocationCode = sourceLocationCode;
           this.requestDate = requestDate;
           this.customerCode = customerCode;
           this.creatorName = creatorName;
           this.lastModifyDate = lastModifyDate;
           this.requestStatus = requestStatus;
           this.requestStage = requestStage;
           this.communicationMode = communicationMode;
    }


    /**
     * Gets the requestId value for this CertificateRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this CertificateRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the trackingCode value for this CertificateRequest.
     * 
     * @return trackingCode
     */
    public java.lang.String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this CertificateRequest.
     * 
     * @param trackingCode
     */
    public void setTrackingCode(java.lang.String trackingCode) {
        this.trackingCode = trackingCode;
    }


    /**
     * Gets the sourceLocationCode value for this CertificateRequest.
     * 
     * @return sourceLocationCode
     */
    public java.lang.String getSourceLocationCode() {
        return sourceLocationCode;
    }


    /**
     * Sets the sourceLocationCode value for this CertificateRequest.
     * 
     * @param sourceLocationCode
     */
    public void setSourceLocationCode(java.lang.String sourceLocationCode) {
        this.sourceLocationCode = sourceLocationCode;
    }


    /**
     * Gets the requestDate value for this CertificateRequest.
     * 
     * @return requestDate
     */
    public java.util.Calendar getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this CertificateRequest.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.util.Calendar requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the customerCode value for this CertificateRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CertificateRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the creatorName value for this CertificateRequest.
     * 
     * @return creatorName
     */
    public java.lang.String getCreatorName() {
        return creatorName;
    }


    /**
     * Sets the creatorName value for this CertificateRequest.
     * 
     * @param creatorName
     */
    public void setCreatorName(java.lang.String creatorName) {
        this.creatorName = creatorName;
    }


    /**
     * Gets the lastModifyDate value for this CertificateRequest.
     * 
     * @return lastModifyDate
     */
    public java.util.Calendar getLastModifyDate() {
        return lastModifyDate;
    }


    /**
     * Sets the lastModifyDate value for this CertificateRequest.
     * 
     * @param lastModifyDate
     */
    public void setLastModifyDate(java.util.Calendar lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }


    /**
     * Gets the requestStatus value for this CertificateRequest.
     * 
     * @return requestStatus
     */
    public CertificateRequestStatus getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this CertificateRequest.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(CertificateRequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the requestStage value for this CertificateRequest.
     * 
     * @return requestStage
     */
    public CertificateRequestStage getRequestStage() {
        return requestStage;
    }


    /**
     * Sets the requestStage value for this CertificateRequest.
     * 
     * @param requestStage
     */
    public void setRequestStage(CertificateRequestStage requestStage) {
        this.requestStage = requestStage;
    }


    /**
     * Gets the communicationMode value for this CertificateRequest.
     * 
     * @return communicationMode
     */
    public CommunicationMode getCommunicationMode() {
        return communicationMode;
    }


    /**
     * Sets the communicationMode value for this CertificateRequest.
     * 
     * @param communicationMode
     */
    public void setCommunicationMode(CommunicationMode communicationMode) {
        this.communicationMode = communicationMode;
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
        if (!(obj instanceof CertificateRequest)) return false;
        CertificateRequest other = (CertificateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.trackingCode==null && other.getTrackingCode()==null) || 
             (this.trackingCode!=null &&
              this.trackingCode.equals(other.getTrackingCode()))) &&
            ((this.sourceLocationCode==null && other.getSourceLocationCode()==null) ||
             (this.sourceLocationCode!=null &&
              this.sourceLocationCode.equals(other.getSourceLocationCode()))) &&
            ((this.requestDate==null && other.getRequestDate()==null) || 
             (this.requestDate!=null &&
              this.requestDate.equals(other.getRequestDate()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.creatorName==null && other.getCreatorName()==null) || 
             (this.creatorName!=null &&
              this.creatorName.equals(other.getCreatorName()))) &&
            ((this.lastModifyDate==null && other.getLastModifyDate()==null) ||
             (this.lastModifyDate!=null &&
              this.lastModifyDate.equals(other.getLastModifyDate()))) &&
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.requestStage==null && other.getRequestStage()==null) || 
             (this.requestStage!=null &&
              this.requestStage.equals(other.getRequestStage()))) &&
            ((this.communicationMode==null && other.getCommunicationMode()==null) || 
             (this.communicationMode!=null &&
              this.communicationMode.equals(other.getCommunicationMode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this CertificateRequest object
        * @see java.lang.Object#hashCode
        */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getTrackingCode() != null) {
            _hashCode += getTrackingCode().hashCode();
        }
        if (getSourceLocationCode() != null) {
            _hashCode += getSourceLocationCode().hashCode();
        }
        if (getRequestDate() != null) {
            _hashCode += getRequestDate().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getCreatorName() != null) {
            _hashCode += getCreatorName().hashCode();
        }
        if (getLastModifyDate() != null) {
            _hashCode += getLastModifyDate().hashCode();
        }
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getRequestStage() != null) {
            _hashCode += getRequestStage().hashCode();
        }
        if (getCommunicationMode() != null) {
            _hashCode += getCommunicationMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TrackingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("requestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("creatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LastModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode"));
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
