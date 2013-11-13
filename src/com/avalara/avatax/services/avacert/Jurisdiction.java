
package com.avalara.avatax.services.avacert;

import javax.xml.namespace.*;
/**
 * Jurisdiction.java
 * Contains jurisdiction data.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *     Calendar fromdate = Calendar.getInstance();
 *     Date dd = new Date();
 *     fromdate.set(2010,11,24);
 *     System.out.println("FromDate:"+fromdate.getTime() );
 *     GetExemptionCertificatesRequest getExemptionCertificatesRequest = new GetExemptionCertificatesRequest();
 *     getExemptionCertificatesRequest.setCompanyCode("Default") ;
 *     getExemptionCertificatesRequest.setFromDate(fromdate);
 *     getExemptionCertificatesRequest.setToDate(java.util.Calendar.getInstance());
 *     GetExemptionCertificatesResult getExemptionCertificatesResult = port.getExemptionCertificates(getExemptionCertificatesRequest);
 *     ArrayOfExemptionCertificate arroe = getExemptionCertificatesResult.getExemptionCertificates();
 *         if(arroe != null && arroe.getExemptionCertificate().length>0)
 *         {
 *                      int count =0;
 *                      ExemptionCertificate eCert=arroe.getExemptionCertificate(count);
 *                      ArrayOfJurisdiction arroj = eCert.getJurisdictions();
 *
 *                      for (int i = 0; arroj != null && i < arroj.getJurisdiction().length; i++)
 *                       {
 *                  <b>      Jurisdiction jurisdiction=arroj.getJurisdiction(i); </b>
 *                        System.out.println(jurisdiction.getJurisdictionCode());// Prints Associated Jurisdiction Code
 *                      }
 *         }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class Jurisdiction  implements java.io.Serializable {

    /**
     * Jurisdiction code for the Jurisdiction record.
     */
    private String jurisdictionCode;
    /**
     *  Country code for the Jurisdiction record (ISO-3166-1-alpha-2 Country Code).
     */
    private String country;
    /**
     * Expiration date for the Jurisdiction record.
     */
    private java.util.Calendar expiryDate;
     /**
     * Whether the Jurisdiction can expire; a Boolean flag
     */
    private Boolean doesNotExpire;
     /**
     * The exempt customer permit number(s) for the Jurisdiction record
     */
    private ArrayOfString permitNumbers;


   /* Constructor :
    * Initializes a new instance of the Jurisdiction class.
    */
    public Jurisdiction() {
    }

   /* Constructor :
    * Initializes a new instance of the Jurisdiction class.
    * @param jurisdictionCode
    * @param country
    * @param expiryDate
    * @param doesNotExpire
    * @param permitNumbers
    */
    public Jurisdiction(
           String jurisdictionCode,
           String country,
           java.util.Calendar expiryDate,
           Boolean doesNotExpire,
          ArrayOfString permitNumbers) {
           this.jurisdictionCode = jurisdictionCode;
           this.country = country;
           this.expiryDate = expiryDate;
           this.doesNotExpire = doesNotExpire;
           this.permitNumbers = permitNumbers;
    }


    /**
     * Gets the jurisdictionCode value for this Jurisdiction.
     * 
     * @return jurisdictionCode
     */
    public String getJurisdictionCode() {
        return jurisdictionCode;
    }


    /**
     * Sets the jurisdictionCode value for this Jurisdiction.
     * 
     * @param jurisdictionCode - 
     */
    public void setJurisdictionCode(String jurisdictionCode) {
        this.jurisdictionCode = jurisdictionCode;
    }


    /**
     * Gets the country value for this Jurisdiction.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Jurisdiction.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the expiryDate value for this Jurisdiction.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this Jurisdiction.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the doesNotExpire value for this Jurisdiction.
     * 
     * @return doesNotExpire
     */
    public Boolean getDoesNotExpire() {
        return doesNotExpire;
    }


    /**
     * Sets the doesNotExpire value for this Jurisdiction.
     * 
     * @param doesNotExpire
     */
    public void setDoesNotExpire(Boolean doesNotExpire) {
        this.doesNotExpire = doesNotExpire;
    }


    /**
     * Gets the permitNumbers value for this Jurisdiction.
     * 
     * @return permitNumbers
     */
    public ArrayOfString getPermitNumbers() {
        return permitNumbers;
    }


    /**
     * Sets the permitNumbers value for this Jurisdiction.
     * 
     * @param permitNumbers
     */
    public void setPermitNumbers(ArrayOfString permitNumbers) {
        this.permitNumbers = permitNumbers;
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
        if (!(obj instanceof Jurisdiction)) return false;
        Jurisdiction other = (Jurisdiction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisdictionCode==null && other.getJurisdictionCode()==null) || 
             (this.jurisdictionCode!=null &&
              this.jurisdictionCode.equals(other.getJurisdictionCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.doesNotExpire==null && other.getDoesNotExpire()==null) || 
             (this.doesNotExpire!=null &&
              this.doesNotExpire.equals(other.getDoesNotExpire()))) &&
            ((this.permitNumbers==null && other.getPermitNumbers()==null) || 
             (this.permitNumbers!=null &&
              this.permitNumbers.equals(other.getPermitNumbers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this Jurisdiction object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getJurisdictionCode() != null) {
            _hashCode += getJurisdictionCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getDoesNotExpire() != null) {
            _hashCode += getDoesNotExpire().hashCode();
        }
        if (getPermitNumbers() != null) {
            _hashCode += getPermitNumbers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jurisdiction.class, true);

    static {
        typeDesc.setXmlType(new QName("http://avatax.avalara.com/services", "Jurisdiction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdictionCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "JurisdictionCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "ExpiryDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doesNotExpire");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "DoesNotExpire"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permitNumbers");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "PermitNumbers"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "ArrayOfString"));
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
