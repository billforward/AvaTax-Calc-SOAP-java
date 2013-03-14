  package com.avalara.avatax.services.avacert2;
  /**
    * CertificateJurisdiction.java
    * Contains jurisdiction data.
    * <br><b>Example:</b>
    * <pre>
    * [Java]
    *       Calendar modFromDate = Calendar.getInstance();
    *     Date dd = new Date();
    *     fromdate.set(2010,11,24);
    *     System.out.println("FromDate:"+fromdate.getTime() );
    *     CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();
    *     getExemptionCertificatesRequest.setCompanyCode("Default") ;
    *     getExemptionCertificatesRequest.setModFromDate(fromdate);
    *     getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
    *     CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);
    *     ArrayOfCertificate arroe = getExemptionCertificatesResult.getCertificates();
    *         if(arroe != null && arroe.getCertificate().length>0  )
    *         {
    *                      int count =0;
    *                      Certificate eCert=arroe.getCertificate(count);
    *                      ArrayOfCertificateJurisdiction arroj = eCert.getCertificateJurisdictions();
    *
    *                      for (int i = 0; arroj != null && i < arroj.getCertificateJurisdiction().length; i++)
    *                      {
    *                   <b>    CertificateJurisdiction jurisdiction=arroj.getCertificateJurisdiction(i); </b>
    *                        System.out.println(jurisdiction.getJurisdiction());// Prints Associated Jurisdiction Code
    *                      }
    *         }
    *  </pre>
    * @author Nitin Shirsat
    * Copyright (c) 2011, Avalara.  All rights reserved.
    */
 


public class CertificateJurisdiction  implements java.io.Serializable {

   /**
     * Jurisdiction code for the Jurisdiction record.
     */
    private java.lang.String jurisdiction;

    /**
     *  Country  for the Jurisdiction record
     */

    private java.lang.String country;
    /**
         * Expiration date for the Jurisdiction record.
         */

    private java.util.Calendar expiryDate;
    /**
    * Whether the Jurisdiction can expire; a Boolean flag
    */

    private java.lang.Boolean doesNotExpire;
    /**
    * The exempt customer permit number(s) for the Jurisdiction record
    */

    private ArrayOfString permitNumbers;

    /**
     * Initializes a new instance of the Jurisdiction class.
     */

    public CertificateJurisdiction() {

    }

    /**
     * Initializes a new instance of the Jurisdiction class.
     * @param jurisdiction
     * @param country
     * @param expiryDate
     * @param doesNotExpire
     * @param permitNumbers
     */
    public CertificateJurisdiction(
           java.lang.String jurisdiction,
           java.lang.String country,
           java.util.Calendar expiryDate,
           java.lang.Boolean doesNotExpire,
           ArrayOfString permitNumbers) {
           this.jurisdiction = jurisdiction;
           this.country = country;
           this.expiryDate = expiryDate;
           this.doesNotExpire = doesNotExpire;
           this.permitNumbers = permitNumbers;
    }


    /**
     * Gets the jurisdiction value for this CertificateJurisdiction.
     * 
     * @return jurisdiction
     */
    public String getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this CertificateJurisdiction.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the country value for this CertificateJurisdiction.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CertificateJurisdiction.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the expiryDate value for this CertificateJurisdiction.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this CertificateJurisdiction.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the doesNotExpire value for this CertificateJurisdiction.
     * 
     * @return doesNotExpire
     */
    public java.lang.Boolean getDoesNotExpire() {
        return doesNotExpire;
    }


    /**
     * Sets the doesNotExpire value for this CertificateJurisdiction.
     * 
     * @param doesNotExpire
     */
    public void setDoesNotExpire(java.lang.Boolean doesNotExpire) {
        this.doesNotExpire = doesNotExpire;
    }


    /**
     * Gets the permitNumbers value for this CertificateJurisdiction.
     * 
     * @return permitNumbers
     */
    public ArrayOfString getPermitNumbers() {
        return permitNumbers;
    }


    /**
     * Sets the permitNumbers value for this CertificateJurisdiction.
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
        if (!(obj instanceof CertificateJurisdiction)) return false;
        CertificateJurisdiction other = (CertificateJurisdiction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisdiction==null && other.getJurisdiction()==null) ||
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction()))) &&
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
     * @return  hash code for this CertificateJurisdiction object
     * @see java.lang.Object#hashCode
     */


    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getJurisdiction() != null) {
            _hashCode += getJurisdiction().hashCode();
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
        new org.apache.axis.description.TypeDesc(CertificateJurisdiction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateJurisdiction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Jurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doesNotExpire");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DoesNotExpire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permitNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PermitNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfString"));
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
