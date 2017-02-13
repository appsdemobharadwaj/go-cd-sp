// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.runtime;

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

public class ReProcessResponse_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_error_code_QNAME = new QName("http://PSI.Wcf", "error_code");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__int_Int_Serializer;
    private static final QName ns1_error_message_QNAME = new QName("http://PSI.Wcf", "error_message");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_fuel_surcharge_QNAME = new QName("http://PSI.Wcf", "fuel_surcharge");
    private static final QName ns2_decimal_TYPE_QNAME = SchemaConstants.QNAME_TYPE_DECIMAL;
    private CombinedSerializer myns2_decimal__java_math_BigDecimal_Decimal_Serializer;
    private static final QName ns1_fuel_surcharge_unit_QNAME = new QName("http://PSI.Wcf", "fuel_surcharge_unit");
    private static final QName ns1_apportioned_base_QNAME = new QName("http://PSI.Wcf", "apportioned_base");
    private static final QName ns1_apportioned_base_unit_QNAME = new QName("http://PSI.Wcf", "apportioned_base_unit");
    private static final QName ns1_apportioned_discount_QNAME = new QName("http://PSI.Wcf", "apportioned_discount");
    private static final QName ns1_apportioned_discount_unit_QNAME = new QName("http://PSI.Wcf", "apportioned_discount_unit");
    private static final QName ns1_apportioned_special_QNAME = new QName("http://PSI.Wcf", "apportioned_special");
    private static final QName ns1_apportioned_special_unit_QNAME = new QName("http://PSI.Wcf", "apportioned_special_unit");
    private static final QName ns1_apportioned_total_QNAME = new QName("http://PSI.Wcf", "apportioned_total");
    private static final QName ns1_apportioned_total_unit_QNAME = new QName("http://PSI.Wcf", "apportioned_total_unit");
    private static final QName ns1_bundle_id_list_QNAME = new QName("http://PSI.Wcf", "bundle_id_list");
    private static final QName ns1_ArrayOfLong_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfLong");
    private CombinedSerializer myns1_ArrayOfLong__ArrayOfLong_LiteralSerializer;
    
    public ReProcessResponse_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public ReProcessResponse_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns2_decimal__java_math_BigDecimal_Decimal_Serializer = (CombinedSerializer)registry.getSerializer("", java.math.BigDecimal.class, ns2_decimal_TYPE_QNAME);
        myns1_ArrayOfLong__ArrayOfLong_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfLong.class, ns1_ArrayOfLong_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("error_code");
        for (int memberIndex = 0; memberIndex <13; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_error_code_QNAME))) {
                myns2__int__int_Int_Serializer.setNullable( false );
                member = myns2__int__int_Int_Serializer.deserialize(ns1_error_code_QNAME, reader, context);
                requiredElements.remove("error_code");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setError_code(((Integer)member).intValue());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_error_message_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_error_message_QNAME, reader, context);
                requiredElements.remove("error_message");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setError_message((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_fuel_surcharge_QNAME))) {
                myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
                member = myns2_decimal__java_math_BigDecimal_Decimal_Serializer.deserialize(ns1_fuel_surcharge_QNAME, reader, context);
                requiredElements.remove("fuel_surcharge");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setFuel_surcharge((java.math.BigDecimal)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_fuel_surcharge_unit_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_fuel_surcharge_unit_QNAME, reader, context);
                requiredElements.remove("fuel_surcharge_unit");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setFuel_surcharge_unit((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_base_QNAME))) {
                myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
                member = myns2_decimal__java_math_BigDecimal_Decimal_Serializer.deserialize(ns1_apportioned_base_QNAME, reader, context);
                requiredElements.remove("apportioned_base");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_base((java.math.BigDecimal)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_base_unit_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_apportioned_base_unit_QNAME, reader, context);
                requiredElements.remove("apportioned_base_unit");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_base_unit((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_discount_QNAME))) {
                myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
                member = myns2_decimal__java_math_BigDecimal_Decimal_Serializer.deserialize(ns1_apportioned_discount_QNAME, reader, context);
                requiredElements.remove("apportioned_discount");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_discount((java.math.BigDecimal)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_discount_unit_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_apportioned_discount_unit_QNAME, reader, context);
                requiredElements.remove("apportioned_discount_unit");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_discount_unit((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_special_QNAME))) {
                myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
                member = myns2_decimal__java_math_BigDecimal_Decimal_Serializer.deserialize(ns1_apportioned_special_QNAME, reader, context);
                requiredElements.remove("apportioned_special");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_special((java.math.BigDecimal)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_special_unit_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_apportioned_special_unit_QNAME, reader, context);
                requiredElements.remove("apportioned_special_unit");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_special_unit((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_total_QNAME))) {
                myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
                member = myns2_decimal__java_math_BigDecimal_Decimal_Serializer.deserialize(ns1_apportioned_total_QNAME, reader, context);
                requiredElements.remove("apportioned_total");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_total((java.math.BigDecimal)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_apportioned_total_unit_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_apportioned_total_unit_QNAME, reader, context);
                requiredElements.remove("apportioned_total_unit");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setApportioned_total_unit((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_bundle_id_list_QNAME))) {
                myns1_ArrayOfLong__ArrayOfLong_LiteralSerializer.setNullable( false );
                member = myns1_ArrayOfLong__ArrayOfLong_LiteralSerializer.deserialize(ns1_bundle_id_list_QNAME, reader, context);
                requiredElements.remove("bundle_id_list");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setBundle_id_list((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfLong)member).toArray());
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse)obj;
        
        myns2__int__int_Int_Serializer.setNullable( false );
        myns2__int__int_Int_Serializer.serialize(new Integer(instance.getError_code()), ns1_error_code_QNAME, null, writer, context);
        if (instance.getError_message() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getError_message(), ns1_error_message_QNAME, null, writer, context);
        }
        if (instance.getFuel_surcharge() != null) {
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.serialize(instance.getFuel_surcharge(), ns1_fuel_surcharge_QNAME, null, writer, context);
        }
        if (instance.getFuel_surcharge_unit() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getFuel_surcharge_unit(), ns1_fuel_surcharge_unit_QNAME, null, writer, context);
        }
        if (instance.getApportioned_base() != null) {
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.serialize(instance.getApportioned_base(), ns1_apportioned_base_QNAME, null, writer, context);
        }
        if (instance.getApportioned_base_unit() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getApportioned_base_unit(), ns1_apportioned_base_unit_QNAME, null, writer, context);
        }
        if (instance.getApportioned_discount() != null) {
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.serialize(instance.getApportioned_discount(), ns1_apportioned_discount_QNAME, null, writer, context);
        }
        if (instance.getApportioned_discount_unit() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getApportioned_discount_unit(), ns1_apportioned_discount_unit_QNAME, null, writer, context);
        }
        if (instance.getApportioned_special() != null) {
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.serialize(instance.getApportioned_special(), ns1_apportioned_special_QNAME, null, writer, context);
        }
        if (instance.getApportioned_special_unit() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getApportioned_special_unit(), ns1_apportioned_special_unit_QNAME, null, writer, context);
        }
        if (instance.getApportioned_total() != null) {
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.setNullable( false );
            myns2_decimal__java_math_BigDecimal_Decimal_Serializer.serialize(instance.getApportioned_total(), ns1_apportioned_total_QNAME, null, writer, context);
        }
        if (instance.getApportioned_total_unit() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getApportioned_total_unit(), ns1_apportioned_total_unit_QNAME, null, writer, context);
        }
        if (instance.getBundle_id_list() != null) {
            myns1_ArrayOfLong__ArrayOfLong_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfLong instanceGetBundle_id_list_arrayWrapper = (instance.getBundle_id_list() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfLong(instance.getBundle_id_list());
            myns1_ArrayOfLong__ArrayOfLong_LiteralSerializer.serialize(instanceGetBundle_id_list_arrayWrapper, ns1_bundle_id_list_QNAME, null, writer, context);
        }
    }
}
