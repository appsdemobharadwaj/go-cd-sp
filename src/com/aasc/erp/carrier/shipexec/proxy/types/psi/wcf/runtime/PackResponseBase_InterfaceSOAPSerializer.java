// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.common.encoding.literal.DetailFragmentDeserializer;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class PackResponseBase_InterfaceSOAPSerializer extends InterfaceSerializerBase implements Initializable {
    private static final QName ns1_PackRateResponse_TYPE_QNAME = new QName("http://PSI.Wcf", "PackRateResponse");
    private CombinedSerializer myns1_PackRateResponse__PackRateResponse_LiteralSerializer;
    private static final QName ns1_PackResponse_TYPE_QNAME = new QName("http://PSI.Wcf", "PackResponse");
    private CombinedSerializer myns1_PackResponse__PackResponse_LiteralSerializer;
    private CombinedSerializer myns1_PackResponseBase__PackResponseBase_LiteralSerializer;
    
    public PackResponseBase_InterfaceSOAPSerializer(QName type, boolean encodeType, boolean isNullable, SOAPVersion soapVersion) {
        super(type, encodeType, isNullable, soapVersion);
    }
    public PackResponseBase_InterfaceSOAPSerializer(QName type, boolean encodeType) {
        super(type, encodeType, true, null);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_PackRateResponse__PackRateResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRateResponse.class, ns1_PackRateResponse_TYPE_QNAME);
        myns1_PackRateResponse__PackRateResponse_LiteralSerializer = myns1_PackRateResponse__PackRateResponse_LiteralSerializer.getInnermostSerializer();
        myns1_PackResponse__PackResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackResponse.class, ns1_PackResponse_TYPE_QNAME);
        myns1_PackResponse__PackResponse_LiteralSerializer = myns1_PackResponse__PackResponse_LiteralSerializer.getInnermostSerializer();
        QName type = new QName("http://PSI.Wcf", "PackResponseBase");
        CombinedSerializer interfaceSerializer = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.runtime.PackResponseBase_LiteralSerializer(type, ENCODE_TYPE);
        myns1_PackResponseBase__PackResponseBase_LiteralSerializer = interfaceSerializer.getInnermostSerializer();
        if (myns1_PackResponseBase__PackResponseBase_LiteralSerializer instanceof Initializable) {
            ((Initializable)myns1_PackResponseBase__PackResponseBase_LiteralSerializer).initialize(registry);
        }
    }
    
    public java.lang.Object doDeserialize(QName name, XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        QName elementType = getType(reader);
        if (elementType != null && elementType.equals(myns1_PackRateResponse__PackRateResponse_LiteralSerializer.getXmlType())) {
            return myns1_PackRateResponse__PackRateResponse_LiteralSerializer.deserialize(name, reader, context);
        } else if (elementType != null && elementType.equals(myns1_PackResponse__PackResponse_LiteralSerializer.getXmlType())) {
            return myns1_PackResponse__PackResponse_LiteralSerializer.deserialize(name, reader, context);
        } else if (elementType == null || elementType.equals(myns1_PackResponseBase__PackResponseBase_LiteralSerializer.getXmlType())) {
            java.lang.Object obj = myns1_PackResponseBase__PackResponseBase_LiteralSerializer.deserialize(name, reader, context);
            return obj;
        }
        throw new DeserializationException("soap.unexpectedElementType", new java.lang.Object[] {"", elementType.toString()},DeserializationException.FAULT_CODE_CLIENT);
    }
    
    public void doSerializeInstance(java.lang.Object obj, QName name, SerializerCallback callback,
        XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackResponseBase instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackResponseBase)obj;
        
        if (obj instanceof com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRateResponse) {
            myns1_PackRateResponse__PackRateResponse_LiteralSerializer.serialize(obj, name, callback, writer, context);
        } else if (obj instanceof com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackResponse) {
            myns1_PackResponse__PackResponse_LiteralSerializer.serialize(obj, name, callback, writer, context);
        } else {
            myns1_PackResponseBase__PackResponseBase_LiteralSerializer.serialize(obj, name, callback, writer, context);
        }
    }
}
