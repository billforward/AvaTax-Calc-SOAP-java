/**
 * ApplyPaymentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.tax;


/**
 * Data to pass to {@link TaxSvcSoap#applyPayment}.
 * <p>
 * The request must specify all of {@link ApplyPaymentRequest#getCompanyCode},
 * {@link ApplyPaymentRequest#getDocCode}, and
 * {@link ApplyPaymentRequest#getDocType} in order to uniquely identify the document
 * </p>
 * @see ApplyPaymentResult
 *
 * @author swetald
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class ApplyPaymentRequest extends BaseRequest implements java.io.Serializable {
    
    private java.lang.String companyCode;
    private com.avalara.avatax.services.tax.DocumentType docType;
	private java.lang.String docId;
    private java.lang.String docCode;
    private java.util.Calendar paymentDate;

    public ApplyPaymentRequest() {
    }

    public ApplyPaymentRequest(           
           java.lang.String companyCode,
           com.avalara.avatax.services.tax.DocumentType docType,
           java.lang.String docCode,
		   java.lang.String docId,
           java.util.Calendar paymentDate) {

           this.companyCode = companyCode;
           this.docType = docType;
		   this.docId = docId;
           this.docCode = docCode;
           this.paymentDate = paymentDate;
    }


    


    /**
     * Gets the companyCode value for this ApplyPaymentRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this ApplyPaymentRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the docType value for this ApplyPaymentRequest.
     * 
     * @return docType
     */
    public com.avalara.avatax.services.tax.DocumentType getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this ApplyPaymentRequest.
     * 
     * @param docType
     */
    public void setDocType(com.avalara.avatax.services.tax.DocumentType docType) {
        this.docType = docType;
    }
	
	/**
     * Gets the docId value for this ApplyPaymentRequest.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docCode value for this ApplyPaymentRequest.
     * 
     * @param docCode
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the docCode value for this ApplyPaymentRequest.
     * 
     * @return docCode
     */
    public java.lang.String getDocCode() {
        return docCode;
    }


    /**
     * Sets the docCode value for this ApplyPaymentRequest.
     * 
     * @param docCode
     */
    public void setDocCode(java.lang.String docCode) {
        this.docCode = docCode;
    }


    /**
     * Gets the paymentDate value for this ApplyPaymentRequest.
     * 
     * @return paymentDate
     */
    public java.util.Calendar getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this ApplyPaymentRequest.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.util.Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyPaymentRequest)) return false;
        ApplyPaymentRequest other = (ApplyPaymentRequest) obj;
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
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
			((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.docCode==null && other.getDocCode()==null) || 
             (this.docCode!=null &&
              this.docCode.equals(other.getDocCode()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate())));
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
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
		if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getDocCode() != null) {
            _hashCode += getDocCode().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyPaymentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ApplyPaymentRequest"));        
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
