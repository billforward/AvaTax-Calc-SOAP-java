package com.avalara.avatax.services.avacert2;

import java.util.Calendar;
import java.util.Date;

/**
 * CertificateRequestGetRequest.java
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *  Calendar modFromDate = Calendar.getInstance();
 *       fromdate.set(2010,12,01);
 *        AvaCert2SvcSoap svc=null;
 *       Calendar modToDate = Calendar.getInstance();
 *           try {
 *               svc = new AvaCert2SvcSoapStub();
 *           } catch (AxisFault axisFault) {
 *               axisFault.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
 *           }
 *
 *     <b>  CertificateRequestGetRequest request = new CertificateRequestGetRequest();</b>
 *                 request.setCompanyCode("Default");
 *                 request.setCustomerCode("CustomerCode");
 *                 request.setModFromDate(fromdate);
 *                 request.setModToDate(todate);
 *       CertificateRequestGetResult result = null;
 *           try {
 *               result = svc.certificateRequestGet(request);
 *           } catch (RemoteException e) {
 *               e.printStackTrace();
 *           }
 *       System.out.println(result.getResultCode());
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */



public class CertificateRequestGetRequest  implements java.io.Serializable {


    /**
     * Company Code
     */
    private java.lang.String companyCode;

    /**
     * Customer Code
     */
    private java.lang.String customerCode;
    /**
     * Request Status
     */
    private CertificateRequestStatus requestStatus;
    /**
     * From Date
     */
    private java.util.Calendar modFromDate;

    /**
     * To Date
     */
    private java.util.Calendar modToDate;


     /**
     * Method to initialize the Object of CertificateRequestGetRequest Class with default values
     */
    public CertificateRequestGetRequest() {


        requestStatus= CertificateRequestStatus.ALL;
        Calendar fromDate = Calendar.getInstance();
        Calendar toDate = Calendar.getInstance();
        fromDate.set(1,0,1,0,0,0);
        toDate.set(9999,11,31,23,59,59);
        this.modFromDate=fromDate;
        this.modToDate=toDate;
       
    }

    /**
     *  Method to initialize the Object of CertificateRequestGetRequest Class with parametrised values
     * @param companyCode
     * @param customerCode
     * @param requestStatus
     * @param modFromDate
     * @param modToDate
     */
    public CertificateRequestGetRequest(
           java.lang.String companyCode,
           java.lang.String customerCode,
           CertificateRequestStatus requestStatus,
           java.util.Calendar modFromDate,
           java.util.Calendar modToDate) {
           this.companyCode = companyCode;
           this.customerCode = customerCode;
           this.requestStatus = requestStatus;
           this.modFromDate = modFromDate;
           this.modToDate = modToDate;
    }


    /**
     * Gets the companyCode value for this CertificateRequestGetRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CertificateRequestGetRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the customerCode value for this CertificateRequestGetRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CertificateRequestGetRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the requestStatus value for this CertificateRequestGetRequest.
     * 
     * @return requestStatus
     */
    public CertificateRequestStatus getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this CertificateRequestGetRequest.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(CertificateRequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the modFromDate value for this CertificateRequestGetRequest.
     * 
     * @return modFromDate
     */
    public java.util.Calendar getModFromDate() {
        return modFromDate;
    }


    /**
     * Sets the modFromDate value for this CertificateRequestGetRequest.
     * 
     * @param modFromDate
     */
    public void setModFromDate(java.util.Calendar modFromDate) {
        this.modFromDate = modFromDate;
    }


    /**
     * Gets the modToDate value for this CertificateRequestGetRequest.
     * 
     * @return modToDate
     */
    public java.util.Calendar getModToDate() {
        return modToDate;
    }


    /**
     * Sets the modToDate value for this CertificateRequestGetRequest.
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
        if (!(obj instanceof CertificateRequestGetRequest)) return false;
        CertificateRequestGetRequest other = (CertificateRequestGetRequest) obj;
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
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
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
        * @return  hash code for this CertificateRequestGetRequest object
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
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(CertificateRequestGetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetRequest"));
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
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ModToDate"));
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
