
package com.avalara.avatax.services.avacert;
import javax.xml.namespace.*;
/**
 * InitiateExemptCertResult.java
 * Contains a TrackingCode returned by InitiateExemptCert
 * <br><b>Example:</b>
  * <pre>
  * [Java]
  *        Customer customer = getCustomer();
  *        String customerCodeValue="avatax4j"+new Date().getTime() ;
  *        customer.setCustomerCode(customerCodeValue);
  *        InitiateExemptCertRequest initiateExemptCertRequest=new InitiateExemptCertRequest();
  *        initiateExemptCertRequest.setCustomer(customer);
  *        initiateExemptCertRequest.setCommunicationMode(CommunicationMode.Email);
  *        initiateExemptCertRequest.setCustomMessage("Testing");
  *        <b>InitiateExemptCertResult initiateExemptCertResult= port.initiateExemptCert(initiateExemptCertRequest); </b>
  *        Assert.assertEquals(SeverityLevel.Success,initiateExemptCertResult.getResultCode());
  * </pre>
  * @author Nitin Shirsat
  * Copyright (c) 2011, Avalara.  All rights reserved.
  */

public class InitiateExemptCertResult  extends BaseResult  implements java.io.Serializable {

    /**
     *  TrackingCode indicates the unique Tracking Code of the Request.
     */
    private String trackingCode;

    /**
     *  the unique tracking Url for the Request, that is used to launch the wizard.
     */
    private String wizardLaunchUrl;

    /* Constructor :
    * Initializes a new instance of the InitiateExemptCertResult class.
    */
    public InitiateExemptCertResult() {
    }


   /* Constructor :
    * Initializes a new instance of the InitiateExemptCertResult class.
    */
    private InitiateExemptCertResult(
           String trackingCode,
           String wizardLaunchUrl) {
           this.trackingCode = trackingCode;
           this.wizardLaunchUrl = wizardLaunchUrl;
    }


    /**
     * Gets the trackingCode value for this InitiateExemptCertResult.
     * 
     * @return trackingCode
     */
    public String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this InitiateExemptCertResult.
     *
     * @param trackingCode
     */
    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    /**
     * Gets the wizardLaunchUrl value for this InitiateExemptCertResult.
     * 
     * @return wizardLaunchUrl
     */
    public String getWizardLaunchUrl() {
        return wizardLaunchUrl;
    }


    /**
     * Sets the wizardLaunchUrl value for this InitiateExemptCertResult.
     * 
     * @param wizardLaunchUrl
     */
    public void setWizardLaunchUrl(String wizardLaunchUrl) {
        this.wizardLaunchUrl = wizardLaunchUrl;
    }

    private Object __equalsCalc = null;

    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
   @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InitiateExemptCertResult)) return false;
        InitiateExemptCertResult other = (InitiateExemptCertResult) obj;
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
              this.wizardLaunchUrl.equals(other.getWizardLaunchUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this InitiateExemptionCertificatesResult object
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateExemptCertResult.class, true);

    static {
        typeDesc.setXmlType(new QName("http://avatax.avalara.com/services", "InitiateExemptCertResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "TrackingCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wizardLaunchUrl");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "WizardLaunchUrl"));
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
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
