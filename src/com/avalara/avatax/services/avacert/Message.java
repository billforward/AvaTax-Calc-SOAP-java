/**
 * Message.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.avacert;

public class Message  implements java.io.Serializable {
    private String summary;
    private String details;
    private String helpLink;
    private String refersTo;
    private com.avalara.avatax.services.avacert.SeverityLevel severity;
    private String source;
    private String name;  // attribute

    public Message() {
    }

    public Message(
           String summary,
           String details,
           String helpLink,
           String refersTo,
           com.avalara.avatax.services.avacert.SeverityLevel severity,
           String source,
           String name) {
           this.summary = summary;
           this.details = details;
           this.helpLink = helpLink;
           this.refersTo = refersTo;
           this.severity = severity;
           this.source = source;
           this.name = name;
    }


    /**
     * Gets the summary value for this Message.
     * 
     * @return summary
     */
    public String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Message.
     * 
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }


    /**
     * Gets the details value for this Message.
     * 
     * @return details
     */
    public String getDetails() {
        return details;
    }


    /**
     * Sets the details value for this Message.
     * 
     * @param details
     */
    public void setDetails(String details) {
        this.details = details;
    }


    /**
     * Gets the helpLink value for this Message.
     * 
     * @return helpLink
     */
    public String getHelpLink() {
        return helpLink;
    }


    /**
     * Sets the helpLink value for this Message.
     * 
     * @param helpLink
     */
    public void setHelpLink(String helpLink) {
        this.helpLink = helpLink;
    }


    /**
     * Gets the refersTo value for this Message.
     * 
     * @return refersTo
     */
    public String getRefersTo() {
        return refersTo;
    }


    /**
     * Sets the refersTo value for this Message.
     * 
     * @param refersTo
     */
    public void setRefersTo(String refersTo) {
        this.refersTo = refersTo;
    }


    /**
     * Gets the severity value for this Message.
     * 
     * @return severity
     */
    public com.avalara.avatax.services.avacert.SeverityLevel getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Message.
     * 
     * @param severity
     */
    public void setSeverity(com.avalara.avatax.services.avacert.SeverityLevel severity) {
        this.severity = severity;
    }


    /**
     * Gets the source value for this Message.
     * 
     * @return source
     */
    public String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Message.
     * 
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }


    /**
     * Gets the name value for this Message.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this Message.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Message)) return false;
        Message other = (Message) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.helpLink==null && other.getHelpLink()==null) || 
             (this.helpLink!=null &&
              this.helpLink.equals(other.getHelpLink()))) &&
            ((this.refersTo==null && other.getRefersTo()==null) || 
             (this.refersTo!=null &&
              this.refersTo.equals(other.getRefersTo()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getHelpLink() != null) {
            _hashCode += getHelpLink().hashCode();
        }
        if (getRefersTo() != null) {
            _hashCode += getRefersTo().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Message.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "HelpLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refersTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RefersTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Source"));
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
