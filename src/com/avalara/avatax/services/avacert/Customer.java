/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.avacert;

public class Customer  implements java.io.Serializable {
    private String companyCode;
    private String customerCode;
    private String newCustomerCode;
    private String customerType;
    private String customerName;
    private String attn;
    private String address1;
    private String address2;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
    private String email;
    private String parentCustomerCode;

    public Customer() {
    }

    private Customer(
           String companyCode,
           String customerCode,
           String newCustomerCode,
           String customerType,
           String customerName,
           String attn,
           String address1,
           String address2,
           String city,
           String region,
           String postalCode,
           String country,
           String phone,
           String fax,
           String email,
           String parentCustomerCode) {
           this.companyCode = companyCode;
           this.customerCode = customerCode;
           this.newCustomerCode = newCustomerCode;
           this.customerType = customerType;
           this.customerName = customerName;
           this.attn = attn;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.region = region;
           this.postalCode = postalCode;
           this.country = country;
           this.phone = phone;
           this.fax = fax;
           this.email = email;
           this.parentCustomerCode = parentCustomerCode;
    }


    /**
     * Gets the companyCode value for this Customer.
     * 
     * @return companyCode
     */
    public String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this Customer.
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the customerCode value for this Customer.
     * 
     * @return customerCode
     */
    public String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this Customer.
     * 
     * @param customerCode
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the newCustomerCode value for this Customer.
     * 
     * @return newCustomerCode
     */
    public String getNewCustomerCode() {
        return newCustomerCode;
    }


    /**
     * Sets the newCustomerCode value for this Customer.
     * 
     * @param newCustomerCode
     */
    public void setNewCustomerCode(String newCustomerCode) {
        this.newCustomerCode = newCustomerCode;
    }


    /**
     * Gets the customerType value for this Customer.
     * 
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this Customer.
     * 
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the customerName value for this Customer.
     * 
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this Customer.
     * 
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the attn value for this Customer.
     * 
     * @return attn
     */
    public String getAttn() {
        return attn;
    }


    /**
     * Sets the attn value for this Customer.
     * 
     * @param attn
     */
    public void setAttn(String attn) {
        this.attn = attn;
    }


    /**
     * Gets the address1 value for this Customer.
     * 
     * @return address1
     */
    public String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this Customer.
     * 
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this Customer.
     * 
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Customer.
     * 
     * @param address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this Customer.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Customer.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this Customer.
     * 
     * @return region
     */
    public String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Customer.
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * Gets the postalCode value for this Customer.
     * 
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Customer.
     * 
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this Customer.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Customer.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the phone value for this Customer.
     * 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Customer.
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Customer.
     * 
     * @return fax
     */
    public String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Customer.
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Customer.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Customer.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the parentCustomerCode value for this Customer.
     * 
     * @return parentCustomerCode
     */
    public String getParentCustomerCode() {
        return parentCustomerCode;
    }


    /**
     * Sets the parentCustomerCode value for this Customer.
     * 
     * @param parentCustomerCode
     */
    public void setParentCustomerCode(String parentCustomerCode) {
        this.parentCustomerCode = parentCustomerCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
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
            ((this.newCustomerCode==null && other.getNewCustomerCode()==null) || 
             (this.newCustomerCode!=null &&
              this.newCustomerCode.equals(other.getNewCustomerCode()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.attn==null && other.getAttn()==null) || 
             (this.attn!=null &&
              this.attn.equals(other.getAttn()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.parentCustomerCode==null && other.getParentCustomerCode()==null) || 
             (this.parentCustomerCode!=null &&
              this.parentCustomerCode.equals(other.getParentCustomerCode())));
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
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getNewCustomerCode() != null) {
            _hashCode += getNewCustomerCode().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getAttn() != null) {
            _hashCode += getAttn().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getParentCustomerCode() != null) {
            _hashCode += getParentCustomerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer"));
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
        elemField.setFieldName("newCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "NewCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Attn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PostalCode"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParentCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
