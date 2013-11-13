

package com.avalara.avatax.services.avacert;
import javax.xml.namespace.*;
import java.util.Calendar;

/**
 * GetExemptionCertificatesRequest.java
 * The class contains Input for GetExemptionCertificates.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 * Calendar fromdate = Calendar.getInstance();
 * Date dd = new Date();
 * fromdate.set(2010,11,24);
 * System.out.println("FromDate:"+fromdate.getTime() );
 * <b> GetExemptionCertificatesRequest getExemptionCertificatesRequest = new GetExemptionCertificatesRequest(); </b>
 * getExemptionCertificatesRequest.setCompanyCode("Default") ;
 * getExemptionCertificatesRequest.setFromDate(fromdate);
 * getExemptionCertificatesRequest.setToDate(java.util.Calendar.getInstance());
 * GetExemptionCertificatesResult getExemptionCertificatesResult = port.getExemptionCertificates(getExemptionCertificatesRequest);
 * ArrayOfExemptionCertificate arroe = getExemptionCertificatesResult.getExemptionCertificates();
 * for (int i = 0; arroe != null && i < arroe.getExemptionCertificate().length; i++)
 * {
 *   ExemptionCertificate eCert=arroe.getExemptionCertificate(i);
 *   System.out.println(eCert.getAvaCertId());// Prints Associated AvaCert ID
 * }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class GetExemptionCertificatesRequest  implements java.io.Serializable {
    /**
     * The customer code associated with a certificate record.
     */
    private String customerCode;        //
    /**
     * The date from which the certificates needs to be fetched
     */
    private Calendar fromDate;          //
     /**
     * The date to which the certificates needs to be fetched.
     */
    private Calendar toDate;            //
     /**
     * The region associated with a certificate record.
     */
    private String region;              //
     /**
     * The company code associated with a certificate record
     */
    private String companyCode;         //


   /* Constructor :
    * Initializes a new instance of the GetExemptionCertificatesRequest class.
    */

    public GetExemptionCertificatesRequest() {

        Calendar fromDate = Calendar.getInstance();
        Calendar toDate = Calendar.getInstance();
        fromDate.set(0001,01,01);
        toDate.set(0001,01,01);

        this.fromDate=fromDate;
        this.toDate=toDate;

    }

    /* Constructor :
    * Initializes a new instance of the GetExemptionCertificatesRequest class.
    */
    public GetExemptionCertificatesRequest(
           String customerCode,
           Calendar fromDate,
           Calendar toDate,
           String region,
           String companyCode) {
           this.customerCode = customerCode;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.region = region;
           this.companyCode = companyCode;
    }


    /**
     * Gets the customerCode value for this GetExemptionCertificatesRequest.
     * 
     * @return customerCode
     */
    public String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this GetExemptionCertificatesRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the fromDate value for this GetExemptionCertificatesRequest.
     * 
     * @return fromDate
     */
    public Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this GetExemptionCertificatesRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this GetExemptionCertificatesRequest.
     * 
     * @return toDate
     */
    public Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this GetExemptionCertificatesRequest.
     * 
     * @param toDate
     */
    public void setToDate(Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the region value for this GetExemptionCertificatesRequest.
     * 
     * @return region
     */
    public String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this GetExemptionCertificatesRequest.
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * Gets the companyCode value for this GetExemptionCertificatesRequest.
     * 
     * @return companyCode
     */
    public String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this GetExemptionCertificatesRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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
        if (!(obj instanceof GetExemptionCertificatesRequest)) return false;
        GetExemptionCertificatesRequest other = (GetExemptionCertificatesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this GetExemptionCertificatesRequest object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExemptionCertificatesRequest.class, true);

    static {
        typeDesc.setXmlType(new QName("http://avatax.avalara.com/services", "GetExemptionCertificatesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CustomerCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "FromDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "ToDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Region"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CompanyCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
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
           QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
