/**
 * ResultList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.address;

public class ResultList  implements java.io.Serializable {
    private com.avalara.avatax.services.address.ValidateResult[] validateResult;

        public ResultList() {
        }

        public ResultList(
               com.avalara.avatax.services.address.ValidateResult[] validateResult) {
               this.validateResult = validateResult;
        }


        /**
         * Gets the validateResult value for this ResultList.
         *
         * @return validateResult
         */
        public com.avalara.avatax.services.address.ValidateResult[] getValidateResult() {
            return validateResult;
        }


        /**
         * Sets the validateResult value for this ResultList.
         *
         * @param validateResult
         */
        public void setValidateResult(com.avalara.avatax.services.address.ValidateResult[] validateResult) {
            this.validateResult = validateResult;
        }

        public com.avalara.avatax.services.address.ValidateResult getValidateResult(int i) {
            return this.validateResult[i];
        }

        public void setValidateResult(int i, com.avalara.avatax.services.address.ValidateResult _value) {
            this.validateResult[i] = _value;
        }

        private java.lang.Object __equalsCalc = null;
        public synchronized boolean equals(java.lang.Object obj) {
            if (!(obj instanceof ResultList)) return false;
            ResultList other = (ResultList) obj;
            if (obj == null) return false;
            if (this == obj) return true;
            if (__equalsCalc != null) {
                return (__equalsCalc == obj);
            }
            __equalsCalc = obj;
            boolean _equals;
            _equals = true &&
                ((this.validateResult==null && other.getValidateResult()==null) ||
                 (this.validateResult!=null &&
                  java.util.Arrays.equals(this.validateResult, other.getValidateResult())));
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
            if (getValidateResult() != null) {
                for (int i=0;
                     i<java.lang.reflect.Array.getLength(getValidateResult());
                     i++) {
                    java.lang.Object obj = java.lang.reflect.Array.get(getValidateResult(), i);
                    if (obj != null &&
                        !obj.getClass().isArray()) {
                        _hashCode += obj.hashCode();
                    }
                }
            }
            __hashCodeCalc = false;
            return _hashCode;
        }

        // Type metadata
        private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ResultList.class, true);

        static {
            typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ResultList"));
            org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
            elemField.setFieldName("validateResult");
            elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ValidateResult"));
            elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ValidateResult"));
            elemField.setMinOccurs(0);
            elemField.setNillable(true);
            elemField.setMaxOccursUnbounded(true);
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
              new  com.avalara.avatax.services.base.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
        }

}
