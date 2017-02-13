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

public class GetDocumentFormatsResponse_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_GetDocumentFormatsResult_QNAME = new QName("http://PSI.Wcf", "GetDocumentFormatsResult");
    private static final QName ns1_ArrayOfSoxDoc_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfSoxDoc");
    private CombinedSerializer myns1_ArrayOfSoxDoc__ArrayOfSoxDoc_LiteralSerializer;
    
    public GetDocumentFormatsResponse_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public GetDocumentFormatsResponse_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_ArrayOfSoxDoc__ArrayOfSoxDoc_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxDoc.class, ns1_ArrayOfSoxDoc_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_GetDocumentFormatsResult_QNAME))) {
            myns1_ArrayOfSoxDoc__ArrayOfSoxDoc_LiteralSerializer.setNullable( false );
            member = myns1_ArrayOfSoxDoc__ArrayOfSoxDoc_LiteralSerializer.deserialize(ns1_GetDocumentFormatsResult_QNAME, reader, context);
            requiredElements.remove("GetDocumentFormatsResult");
            if (member == null) {
                throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
            }
            instance.setGetDocumentFormatsResult((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxDoc)member).toArray());
            context.setXmlFragmentWrapperName( null );
            reader.nextElementContent();
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetDocumentFormatsResponse)obj;
        
        if (instance.getGetDocumentFormatsResult() != null) {
            myns1_ArrayOfSoxDoc__ArrayOfSoxDoc_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxDoc instanceGetGetDocumentFormatsResult_arrayWrapper = (instance.getGetDocumentFormatsResult() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxDoc(instance.getGetDocumentFormatsResult());
            myns1_ArrayOfSoxDoc__ArrayOfSoxDoc_LiteralSerializer.serialize(instanceGetGetDocumentFormatsResult_arrayWrapper, ns1_GetDocumentFormatsResult_QNAME, null, writer, context);
        }
    }
}
