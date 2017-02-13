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

public class ArrayOfPlan_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_Plan_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Plan");
    private static final QName ns1_Plan_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Plan");
    private CombinedSerializer myns1_Plan__Plan_LiteralSerializer;
    
    public ArrayOfPlan_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public ArrayOfPlan_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_Plan__Plan_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.Plan.class, ns1_Plan_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan instance = new com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Plan_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Plan_QNAME))) {
                    myns1_Plan__Plan_LiteralSerializer.setNullable( true );
                    value = myns1_Plan__Plan_LiteralSerializer.deserialize(ns1_Plan_QNAME, reader, context);
                    requiredElements.remove("Plan");
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.aasc.erp.carrier.stampsws.proxy.Plan[values.size()];
            member = values.toArray((java.lang.Object[]) member);
            instance.setPlan((com.aasc.erp.carrier.stampsws.proxy.Plan[])member);
        }
        else {
            if (instance.getPlan() == null)
            instance.setPlan(new com.aasc.erp.carrier.stampsws.proxy.Plan[0]);
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
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan instance = (com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan instance = (com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan instance = (com.aasc.erp.carrier.stampsws.proxy.ArrayOfPlan)obj;
        
        if (instance.getPlan() != null) {
            for (int i = 0; i < instance.getPlan().length; ++i) {
                myns1_Plan__Plan_LiteralSerializer.setNullable( true );
                myns1_Plan__Plan_LiteralSerializer.serialize(instance.getPlan()[i], ns1_Plan_QNAME, null, writer, context);
            }
        }
    }
}
