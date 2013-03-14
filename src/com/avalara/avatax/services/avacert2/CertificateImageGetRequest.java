package com.avalara.avatax.services.avacert2;
/**
 * CertificateImageGetRequest.java
 * The class contains Input for certificateImageGet
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *  <b>            CertificateImageGetRequest certificateImageGetRequest = new CertificateImageGetRequest();</b>
 *
 *                  certificateImageGetRequest.setAvaCertId ("CBT3");
 *                  certificateImageGetRequest.setCompanyCode ("Default");
 *                  certificateImageGetRequest.setFormat(FormatType.PNG);
 *                  certificateImageGetRequest.setPageNumber(1);
 *                  CertificateImageGetResult certificateImageGetResult = null;
 *                try {
 *                         certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);
 *                    }       catch (RemoteException e) {
 *                            e.printStackTrace();
 *                    }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */


public class CertificateImageGetRequest  implements java.io.Serializable {
    /**
     * Field Contains Company Code value
     */
    private java.lang.String companyCode;

    /**
     * Fields Contains AvaCertId
     */
    private java.lang.String avaCertId;

    /**
     * Format
     */
    private FormatType format;

    /**
     * Field comntains page number
     */
    private int pageNumber;


    /**
     * Initializes the onject of CertificateImageGetRequest class with default values
     */
    public CertificateImageGetRequest() {

       this.format=FormatType.NULL;
    }

    /**
     * * Initializes the onject of CertificateImageGetRequest class with parameterised values
     * @param companyCode
     * @param avaCertId
     * @param format
     * @param pageNumber
     */
    public CertificateImageGetRequest(
           java.lang.String companyCode,
           java.lang.String avaCertId,
           FormatType format,
           int pageNumber) {
           this.companyCode = companyCode;
           this.avaCertId = avaCertId;
           this.format = format;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the companyCode value for this CertificateImageGetRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CertificateImageGetRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the avaCertId value for this CertificateImageGetRequest.
     * 
     * @return avaCertId
     */
    public java.lang.String getAvaCertId() {
        return avaCertId;
    }


    /**
     * Sets the avaCertId value for this CertificateImageGetRequest.
     * 
     * @param avaCertId
     */
    public void setAvaCertId(java.lang.String avaCertId) {
        this.avaCertId = avaCertId;
    }


    /**
     * Gets the format value for this CertificateImageGetRequest.
     * 
     * @return format
     */
    public FormatType getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CertificateImageGetRequest.
     * 
     * @param format
     */
    public void setFormat(FormatType format) {
        this.format = format;
    }


    /**
     * Gets the pageNumber value for this CertificateImageGetRequest.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this CertificateImageGetRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
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
        if (!(obj instanceof CertificateImageGetRequest)) return false;
        CertificateImageGetRequest other = (CertificateImageGetRequest) obj;
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
            ((this.avaCertId==null && other.getAvaCertId()==null) || 
             (this.avaCertId!=null &&
              this.avaCertId.equals(other.getAvaCertId()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.pageNumber == other.getPageNumber();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
         *  Serves as a hash function for a particular type,
         * suitable for use in hashing algorithms and data
         * structures like a hash table.
         * @return  hash code for this CertificateImageGetRequest object
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
        if (getAvaCertId() != null) {
            _hashCode += getAvaCertId().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        _hashCode += getPageNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateImageGetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
