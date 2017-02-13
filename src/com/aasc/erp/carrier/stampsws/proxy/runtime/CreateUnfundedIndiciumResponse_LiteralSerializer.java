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

public class CreateUnfundedIndiciumResponse_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_Authenticator_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Authenticator");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_IntegratorTxID_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "IntegratorTxID");
    private static final QName ns1_TrackingNumber_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "TrackingNumber");
    private static final QName ns1_Rate_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Rate");
    private static final QName ns1_RateV14_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "RateV14");
    private CombinedSerializer myns1_RateV14__RateV14_LiteralSerializer;
    private static final QName ns1_StampsTxID_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "StampsTxID");
    private static final QName ns1_URL_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "URL");
    private static final QName ns1_PostageBalance_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "PostageBalance");
    private static final QName ns1_PostageBalance_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "PostageBalance");
    private CombinedSerializer myns1_PostageBalance__PostageBalance_LiteralSerializer;
    
    public CreateUnfundedIndiciumResponse_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public CreateUnfundedIndiciumResponse_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns1_RateV14__RateV14_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.RateV14.class, ns1_RateV14_TYPE_QNAME);
        myns1_PostageBalance__PostageBalance_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.PostageBalance.class, ns1_PostageBalance_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse instance = new com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("Authenticator");
        requiredElements.add("IntegratorTxID");
        requiredElements.add("Rate");
        requiredElements.add("StampsTxID");
        requiredElements.add("URL");
        requiredElements.add("PostageBalance");
        for (int memberIndex = 0; memberIndex <7; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Authenticator_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Authenticator_QNAME, reader, context);
                requiredElements.remove("Authenticator");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAuthenticator((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_IntegratorTxID_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_IntegratorTxID_QNAME, reader, context);
                requiredElements.remove("IntegratorTxID");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setIntegratorTxID((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_TrackingNumber_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_TrackingNumber_QNAME, reader, context);
                requiredElements.remove("TrackingNumber");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setTrackingNumber((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Rate_QNAME))) {
                myns1_RateV14__RateV14_LiteralSerializer.setNullable( false );
                member = myns1_RateV14__RateV14_LiteralSerializer.deserialize(ns1_Rate_QNAME, reader, context);
                requiredElements.remove("Rate");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setRate((com.aasc.erp.carrier.stampsws.proxy.RateV14)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_StampsTxID_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_StampsTxID_QNAME, reader, context);
                requiredElements.remove("StampsTxID");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setStampsTxID((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_URL_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_URL_QNAME, reader, context);
                requiredElements.remove("URL");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setURL((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_PostageBalance_QNAME))) {
                myns1_PostageBalance__PostageBalance_LiteralSerializer.setNullable( false );
                member = myns1_PostageBalance__PostageBalance_LiteralSerializer.deserialize(ns1_PostageBalance_QNAME, reader, context);
                requiredElements.remove("PostageBalance");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPostageBalance((com.aasc.erp.carrier.stampsws.proxy.PostageBalance)member);
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
        com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse instance = (com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse instance = (com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse instance = (com.aasc.erp.carrier.stampsws.proxy.CreateUnfundedIndiciumResponse)obj;
        
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getAuthenticator(), ns1_Authenticator_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getIntegratorTxID(), ns1_IntegratorTxID_QNAME, null, writer, context);
        if (instance.getTrackingNumber() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getTrackingNumber(), ns1_TrackingNumber_QNAME, null, writer, context);
        }
        myns1_RateV14__RateV14_LiteralSerializer.setNullable( false );
        myns1_RateV14__RateV14_LiteralSerializer.serialize(instance.getRate(), ns1_Rate_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getStampsTxID(), ns1_StampsTxID_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getURL(), ns1_URL_QNAME, null, writer, context);
        myns1_PostageBalance__PostageBalance_LiteralSerializer.setNullable( false );
        myns1_PostageBalance__PostageBalance_LiteralSerializer.serialize(instance.getPostageBalance(), ns1_PostageBalance_QNAME, null, writer, context);
    }
}
