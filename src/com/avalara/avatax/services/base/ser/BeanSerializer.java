package com.avalara.avatax.services.base.ser;

import org.apache.axis.Constants;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


import com.avalara.avatax.services.tax.RequestList;
import com.avalara.avatax.services.tax.BaseRequest;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: Swetal.Desai
 * Date: May 31, 2009
 * Time: 11:58:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class BeanSerializer implements Serializer{


    QName xmlType;
    Class javaType;
    org.apache.axis.description.TypeDesc typeDesc;

    public BeanSerializer(Class javaType,QName xmlType,org.apache.axis.description.TypeDesc typeDesc)
    {
        this.xmlType=xmlType;
        this.javaType=javaType;
        this.typeDesc=typeDesc;

    }

    /** SERIALIZER STUFF
     */
    /**
     * Serialize an element named name, with the indicated attributes
     * and value.
     * @param name is the element name
     * @param attributes are the attributes...serialize is free to add more.
     * @param value is the value
     * @param context is the SerializationContext
     */
    public void serialize(QName name, Attributes attributes,
                          Object value, SerializationContext context)
        throws IOException
    {
                       
        //Writes (using the Writer) the start tag for element QName along with the indicated attributes and namespace mappings.
        context.startElement(name, attributes);

        //Get all field descriptions for the class
        FieldDesc[] fieldDesc=  typeDesc.getFields();

        org.apache.axis.encoding.ser.BeanSerializer ser;
        

        //Iterate through each element
        ElementDesc elementDesc;
        for(int i=0;i<fieldDesc.length;i++) {
            if(fieldDesc[i].isElement()) {
                elementDesc=(ElementDesc)fieldDesc[i];                

                //Get Method that will return the field value
                String methodName= "get"+elementDesc.getXmlName().getLocalPart();

                Object fieldValue=null;
                try {
                    Method method=value.getClass().getMethod(methodName,null);
                                        

                    //Get the value of the field by invoking method
                    fieldValue= method.invoke(value,null);
                }
                catch(Exception ex) {
                    ex.printStackTrace();                  
                }


                if(fieldValue == null)
                        continue;

                //If field is an Array then iterate through array and serialize each elemtent
                if(elementDesc.isMaxOccursUnbounded()) {
                    Object[] arrayFieldValue=(Object[])fieldValue;
                    for(int j=0;j<arrayFieldValue.length;j++) {
                        
                        serialize(context,arrayFieldValue[j].getClass().getSimpleName(),arrayFieldValue[j]);
                    }
                }
                else{
                    serialize(context,fieldValue.getClass().getSimpleName(),fieldValue);
                }
            }

        }
        context.endElement();
    }
    private void serialize(SerializationContext context,String xmlName,Object value) throws IOException
    {
        context.serialize(new QName("http://avatax.avalara.com/services", xmlName), null,value);
    }
    public String getMechanismType() { return Constants.AXIS_SAX; }

    public Element writeSchema(Class javaType, Types types) throws Exception {
        return null;
    }


}
