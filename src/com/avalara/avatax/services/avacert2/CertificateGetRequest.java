
package com.avalara.avatax.services.avacert2;

import java.util.Calendar;
/**
 * CertificateGetRequest.java
 * The class contains Input for certificateGet
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 * Calendar fromdate = Calendar.getInstance();
 * fromdate.set(2010,01,01);
 * System.out.println("FromDate:"+fromdate.getTime() );
 * <b>CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();</b>
 * getExemptionCertificatesRequest.setCompanyCode("DEFAULT") ;
 * getExemptionCertificatesRequest.setCustomerCode("");
 * getExemptionCertificatesRequest.setModFromDate(fromdate);
 * getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
 * CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class CertificateGetRequest  implements java.io.Serializable {
    /**
     * The company code associated with a certificate record
     */
    private java.lang.String companyCode;
    /**
     * The customer code associated with a certificate record.
     */
    private java.lang.String customerCode;
    /**
     * The date from which the certificates needs to be fetched
     */
    private java.util.Calendar modFromDate;
     /**
     * The date to which the certificates needs to be fetched.
     */
    private java.util.Calendar modToDate;

    /**
     *  Initializes a new instance of the CertificateGetRequest class
     */
    public CertificateGetRequest() {


       Calendar fromDate = Calendar.getInstance();
        Calendar toDate = Calendar.getInstance();
        fromDate.set(1,0,1);
        toDate.set(1,0,1);

        this.modFromDate=fromDate;
        this.modToDate=toDate;
    }

    /**
     * Initializes a new instance of the CertificateGetRequest class
     * @param companyCode
     * @param customerCode
     * @param modFromDate
     * @param modToDate
     */
    public CertificateGetRequest(
           java.lang.String companyCode,
           java.lang.String customerCode,
           java.util.Calendar modFromDate,
           java.util.Calendar modToDate) {
           this.companyCode = companyCode;
           this.customerCode = customerCode;
           this.modFromDate = modFromDate;
           this.modToDate = modToDate;
    }


    /**
     * Gets the companyCode value for this CertificateGetRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CertificateGetRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the customerCode value for this CertificateGetRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CertificateGetRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the modFromDate value for this CertificateGetRequest.
     * 
     * @return modFromDate
     */
    public java.util.Calendar getModFromDate() {
        return modFromDate;
    }


    /**
     * Sets the modFromDate value for this CertificateGetRequest.
     * 
     * @param modFromDate
     */
    public void setModFromDate(java.util.Calendar modFromDate) {
        this.modFromDate = modFromDate;
    }


    /**
     * Gets the modToDate value for this CertificateGetRequest.
     * 
     * @return modToDate
     */
    public java.util.Calendar getModToDate() {
        return modToDate;
    }


    /**
     * Sets the modToDate value for this CertificateGetRequest.
     * 
     * @param modToDate
     */
    public void setModToDate(java.util.Calendar modToDate) {
        this.modToDate = modToDate;
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
        if (!(obj instanceof CertificateGetRequest)) return false;
        CertificateGetRequest other = (CertificateGetRequest) obj;
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
            ((this.modFromDate==null && other.getModFromDate()==null) || 
             (this.modFromDate!=null &&
              this.modFromDate.equals(other.getModFromDate()))) &&
            ((this.modToDate==null && other.getModToDate()==null) || 
             (this.modToDate!=null &&
              this.modToDate.equals(other.getModToDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

      /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this CertificateGetRequest object
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
        if (getModFromDate() != null) {
            _hashCode += getModFromDate().hashCode();
        }
        if (getModToDate() != null) {
            _hashCode += getModToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateGetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetRequest"));
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
        elemField.setFieldName("modFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
