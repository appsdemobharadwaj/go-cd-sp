// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.runtime;


import com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ContainerType;
import oracle.j2ee.ws.common.encoding.simpletype.*;
import javax.xml.namespace.QName;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPEnvelopeConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;

public class ContainerType_Encoder extends SimpleTypeEncoderBase {
    
    private static final SimpleTypeEncoder encoder = XSDStringEncoder.getInstance();
    private static final ContainerType_Encoder instance = new ContainerType_Encoder();
    
    private ContainerType_Encoder() {
    }
    
    public static SimpleTypeEncoder getInstance() {
        return instance;
    }
    
    public String objectToString(Object obj, XMLWriter writer) throws Exception {
        java.lang.String value = ((ContainerType)obj).getValue();
        return encoder.objectToString(value, writer);
    }
    
    public Object stringToObject(String str, XMLReader reader) throws Exception {
        return ContainerType.fromValue((java.lang.String)encoder.stringToObject(str, reader));
    }
    
    
}
