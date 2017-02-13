// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.common.encoding.literal.*;
import oracle.j2ee.ws.common.encoding.literal.DetailFragmentDeserializer;
import oracle.j2ee.ws.common.encoding.simpletype.*;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPEnvelopeConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.wsdl.document.schema.SchemaConstants;
import oracle.j2ee.ws.common.util.xml.UUID;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.AttachmentPart;

public class Sku_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_Id_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Id");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_Quantity_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Quantity");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__java_lang_Integer_Int_Serializer;
    private static final QName ns1_SkuSubTotal_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "SkuSubTotal");
    private static final QName ns2_decimal_TYPE_QNAME = SchemaConstants.QNAME_TYPE_DECIMAL;
    private CombinedSerializer myns2_decimal__java_math_BigDecimal_Decimal_Serializer;
    
    public Sku_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public Sku_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns2__int__java_lang_Integer_Int_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Integer.class, ns2_int_TYPE_QNAME);
        myns2_decimal__java_math_BigDecimal_Decimal_Serializer = (CombinedSerializer)registry.getSerializer("", java.math.BigDecimal.class, ns2_decimal_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.Sku instance = new com.aasc.erp.carrier.stampsws.proxy.Sku();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("Id");
        for (int memberIndex = 0; memberIndex <3; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Id_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Id_QNAME, reader, context);
                requiredElements.remove("Id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setId((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Quantity_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_Quantity_QNAME, reader, context);
                requiredElements.remove("Quantity");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setQuantity((java.lang.Integer)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_SkuSubTotal_QNAME))) {
                myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
                member = myns2_decimal__java_math_BigDecimal_Decimal_Serializer.deserialize(ns1_SkuSubTotal_QNAME, reader, context);
                requiredElements.remove("SkuSubTotal");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setSkuSubTotal((java.math.BigDecimal)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
        }
        if (!requiredElements.isEmpty()) {
            throw new DeserializationException( "literal.expectedElementName" , requiredElements.iterator().next().toString(), DeserializationException.FAULT_CODE_CLIENT );
        }
        
        if( reader.getState() != XMLReader.END)
        {
            reader.skipElement();
        }
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.Sku instance = (com.aasc.erp.carrier.stampsws.proxy.Sku)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.Sku instance = (com.aasc.erp.carrier.stampsws.proxy.Sku)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.Sku instance = (com.aasc.erp.carrier.stampsws.proxy.Sku)obj;
        
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getId(), ns1_Id_QNAME, null, writer, context);
        if (instance.getQuantity() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getQuantity(), ns1_Quantity_QNAME, null, writer, context);
        }
        if (instance.getSkuSubTotal() != null) {
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.serialize(instance.getSkuSubTotal(), ns1_SkuSubTotal_QNAME, null, writer, context);
        }
    }
}
