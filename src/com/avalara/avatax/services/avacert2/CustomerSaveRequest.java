
package com.avalara.avatax.services.avacert2;
/**
 * CustomerSaveRequest.java
 * Input for CustomerSave.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *           Customer customer=getCustomer();
 *      <b>   CustomerSaveRequest customerSaveRequest = new CustomerSaveRequest();</b>
 *           customerSaveRequest.setCompanyCode("Default");
 *           CustomerSaveResult customerSaveResult = new CustomerSaveResult();
 *           customerSaveRequest.setCustomer( customer);
 *           customerSaveResult = port.customerSave(customerSaveRequest);
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */



public class CustomerSaveRequest implements java.io.Serializable {

    /**
     * Company Code
     */
    private java.lang.String companyCode;
    /**
     * Customer Object
     */
    private Customer customer;

   /**
     * Method to initialize the Object of CustomerSaveRequest Class with default values
     */
    public CustomerSaveRequest() {
    }

    /**
     * Method to initialize the Object of CustomerSaveRequest Class with parametrised values
     * @param companyCode
     * @param customer
     */
    public CustomerSaveRequest(
           java.lang.String companyCode,
           Customer customer) {
           this.companyCode = companyCode;
           this.customer = customer;
    }


    /**
     * Gets the companyCode value for this CustomerSaveRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CustomerSaveRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the customer value for this CustomerSaveRequest.
     * 
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CustomerSaveRequest.
     * 
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
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
        if (!(obj instanceof CustomerSaveRequest)) return false;
        CustomerSaveRequest other = (CustomerSaveRequest) obj;
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
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
   /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this CustomerSaveRequest object
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSaveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer"));
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
