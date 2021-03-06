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

public class ApplicationSettings_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_integratedLogin_QNAME = new QName("http://PSI.Wcf", "integratedLogin");
    private static final QName ns2_boolean_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BOOLEAN;
    private CombinedSerializer myns2__boolean__java_lang_Boolean_Boolean_Serializer;
    private static final QName ns1_transactionLogging_QNAME = new QName("http://PSI.Wcf", "transactionLogging");
    private static final QName ns1_autoLogoff_QNAME = new QName("http://PSI.Wcf", "autoLogoff");
    private static final QName ns1_autoLogoffTime_QNAME = new QName("http://PSI.Wcf", "autoLogoffTime");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__java_lang_Integer_Int_Serializer;
    
    public ApplicationSettings_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public ApplicationSettings_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2__boolean__java_lang_Boolean_Boolean_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Boolean.class, ns2_boolean_TYPE_QNAME);
        myns2__int__java_lang_Integer_Int_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Integer.class, ns2_int_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        for (int memberIndex = 0; memberIndex <4; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_integratedLogin_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_integratedLogin_QNAME, reader, context);
                requiredElements.remove("integratedLogin");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setIntegratedLogin((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_transactionLogging_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_transactionLogging_QNAME, reader, context);
                requiredElements.remove("transactionLogging");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setTransactionLogging((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_autoLogoff_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_autoLogoff_QNAME, reader, context);
                requiredElements.remove("autoLogoff");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAutoLogoff((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_autoLogoffTime_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_autoLogoffTime_QNAME, reader, context);
                requiredElements.remove("autoLogoffTime");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAutoLogoffTime((java.lang.Integer)member);
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings)obj;
        
        if (instance.getIntegratedLogin() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getIntegratedLogin(), ns1_integratedLogin_QNAME, null, writer, context);
        }
        if (instance.getTransactionLogging() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getTransactionLogging(), ns1_transactionLogging_QNAME, null, writer, context);
        }
        if (instance.getAutoLogoff() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getAutoLogoff(), ns1_autoLogoff_QNAME, null, writer, context);
        }
        if (instance.getAutoLogoffTime() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getAutoLogoffTime(), ns1_autoLogoffTime_QNAME, null, writer, context);
        }
    }
}
