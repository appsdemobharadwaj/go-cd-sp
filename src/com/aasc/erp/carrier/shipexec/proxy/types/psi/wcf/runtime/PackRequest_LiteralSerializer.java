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

public class PackRequest_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_order_reference_QNAME = new QName("http://PSI.Wcf", "order_reference");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_order_lines_QNAME = new QName("http://PSI.Wcf", "order_lines");
    private static final QName ns1_ArrayOfPackOrderLine_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfPackOrderLine");
    private CombinedSerializer myns1_ArrayOfPackOrderLine__ArrayOfPackOrderLine_LiteralSerializer;
    private static final QName ns1_ship_together_QNAME = new QName("http://PSI.Wcf", "ship_together");
    private static final QName ns2_boolean_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BOOLEAN;
    private CombinedSerializer myns2__boolean__java_lang_Boolean_Boolean_Serializer;
    private static final QName ns1_max_cube_utilization_QNAME = new QName("http://PSI.Wcf", "max_cube_utilization");
    private static final QName ns2_double_TYPE_QNAME = SchemaConstants.QNAME_TYPE_DOUBLE;
    private CombinedSerializer myns2__double__java_lang_Double_Double_Serializer;
    private static final QName ns1_dim_weight_optimization_QNAME = new QName("http://PSI.Wcf", "dim_weight_optimization");
    private static final QName ns1_dim_factor_QNAME = new QName("http://PSI.Wcf", "dim_factor");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__java_lang_Integer_Int_Serializer;
    private static final QName ns1_dim_volume_QNAME = new QName("http://PSI.Wcf", "dim_volume");
    private static final QName ns1_dim_to_weight_ratio_QNAME = new QName("http://PSI.Wcf", "dim_to_weight_ratio");
    private static final QName ns1_auto_box_QNAME = new QName("http://PSI.Wcf", "auto_box");
    private static final QName ns1_cold_packs_QNAME = new QName("http://PSI.Wcf", "cold_packs");
    private static final QName ns1_ArrayOfColdPack_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfColdPack");
    private CombinedSerializer myns1_ArrayOfColdPack__ArrayOfColdPack_LiteralSerializer;
    private static final QName ns1_additional_information_QNAME = new QName("http://PSI.Wcf", "additional_information");
    private static final QName ns2_anyType_TYPE_QNAME = SchemaConstants.QNAME_TYPE_URTYPE;
    private CombinedSerializer ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer;
    private static final QName ns1_warehouses_QNAME = new QName("http://PSI.Wcf", "warehouses");
    private static final QName ns1_ArrayOfWarehouse_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfWarehouse");
    private CombinedSerializer myns1_ArrayOfWarehouse__ArrayOfWarehouse_LiteralSerializer;
    
    public PackRequest_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public PackRequest_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns1_ArrayOfPackOrderLine__ArrayOfPackOrderLine_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfPackOrderLine.class, ns1_ArrayOfPackOrderLine_TYPE_QNAME);
        myns2__boolean__java_lang_Boolean_Boolean_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Boolean.class, ns2_boolean_TYPE_QNAME);
        myns2__double__java_lang_Double_Double_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Double.class, ns2_double_TYPE_QNAME);
        myns2__int__java_lang_Integer_Int_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Integer.class, ns2_int_TYPE_QNAME);
        myns1_ArrayOfColdPack__ArrayOfColdPack_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfColdPack.class, ns1_ArrayOfColdPack_TYPE_QNAME);
        ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Object.class, ns2_anyType_TYPE_QNAME);
        myns1_ArrayOfWarehouse__ArrayOfWarehouse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfWarehouse.class, ns1_ArrayOfWarehouse_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        for (int memberIndex = 0; memberIndex <12; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_order_reference_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_order_reference_QNAME, reader, context);
                requiredElements.remove("order_reference");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setOrder_reference((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_order_lines_QNAME))) {
                myns1_ArrayOfPackOrderLine__ArrayOfPackOrderLine_LiteralSerializer.setNullable( false );
                member = myns1_ArrayOfPackOrderLine__ArrayOfPackOrderLine_LiteralSerializer.deserialize(ns1_order_lines_QNAME, reader, context);
                requiredElements.remove("order_lines");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setOrder_lines((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfPackOrderLine)member).toArray());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_ship_together_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_ship_together_QNAME, reader, context);
                requiredElements.remove("ship_together");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setShip_together((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_max_cube_utilization_QNAME))) {
                myns2__double__java_lang_Double_Double_Serializer.setNullable( false );
                member = myns2__double__java_lang_Double_Double_Serializer.deserialize(ns1_max_cube_utilization_QNAME, reader, context);
                requiredElements.remove("max_cube_utilization");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setMax_cube_utilization((java.lang.Double)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_dim_weight_optimization_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_dim_weight_optimization_QNAME, reader, context);
                requiredElements.remove("dim_weight_optimization");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDim_weight_optimization((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_dim_factor_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_dim_factor_QNAME, reader, context);
                requiredElements.remove("dim_factor");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDim_factor((java.lang.Integer)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_dim_volume_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_dim_volume_QNAME, reader, context);
                requiredElements.remove("dim_volume");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDim_volume((java.lang.Integer)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_dim_to_weight_ratio_QNAME))) {
                myns2__double__java_lang_Double_Double_Serializer.setNullable( false );
                member = myns2__double__java_lang_Double_Double_Serializer.deserialize(ns1_dim_to_weight_ratio_QNAME, reader, context);
                requiredElements.remove("dim_to_weight_ratio");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDim_to_weight_ratio((java.lang.Double)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_auto_box_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_auto_box_QNAME, reader, context);
                requiredElements.remove("auto_box");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAuto_box((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_cold_packs_QNAME))) {
                myns1_ArrayOfColdPack__ArrayOfColdPack_LiteralSerializer.setNullable( false );
                member = myns1_ArrayOfColdPack__ArrayOfColdPack_LiteralSerializer.deserialize(ns1_cold_packs_QNAME, reader, context);
                requiredElements.remove("cold_packs");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCold_packs((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfColdPack)member).toArray());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_additional_information_QNAME))) {
                ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.setNullable( false );
                member = ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.deserialize(ns1_additional_information_QNAME, reader, context);
                requiredElements.remove("additional_information");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAdditional_information((java.lang.Object)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_warehouses_QNAME))) {
                myns1_ArrayOfWarehouse__ArrayOfWarehouse_LiteralSerializer.setNullable( false );
                member = myns1_ArrayOfWarehouse__ArrayOfWarehouse_LiteralSerializer.deserialize(ns1_warehouses_QNAME, reader, context);
                requiredElements.remove("warehouses");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setWarehouses((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfWarehouse)member).toArray());
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackRequest)obj;
        
        if (instance.getOrder_reference() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getOrder_reference(), ns1_order_reference_QNAME, null, writer, context);
        }
        if (instance.getOrder_lines() != null) {
            myns1_ArrayOfPackOrderLine__ArrayOfPackOrderLine_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfPackOrderLine instanceGetOrder_lines_arrayWrapper = (instance.getOrder_lines() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfPackOrderLine(instance.getOrder_lines());
            myns1_ArrayOfPackOrderLine__ArrayOfPackOrderLine_LiteralSerializer.serialize(instanceGetOrder_lines_arrayWrapper, ns1_order_lines_QNAME, null, writer, context);
        }
        if (instance.getShip_together() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getShip_together(), ns1_ship_together_QNAME, null, writer, context);
        }
        if (instance.getMax_cube_utilization() != null) {
            myns2__double__java_lang_Double_Double_Serializer.setNullable( false );
            myns2__double__java_lang_Double_Double_Serializer.serialize(instance.getMax_cube_utilization(), ns1_max_cube_utilization_QNAME, null, writer, context);
        }
        if (instance.getDim_weight_optimization() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getDim_weight_optimization(), ns1_dim_weight_optimization_QNAME, null, writer, context);
        }
        if (instance.getDim_factor() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getDim_factor(), ns1_dim_factor_QNAME, null, writer, context);
        }
        if (instance.getDim_volume() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getDim_volume(), ns1_dim_volume_QNAME, null, writer, context);
        }
        if (instance.getDim_to_weight_ratio() != null) {
            myns2__double__java_lang_Double_Double_Serializer.setNullable( false );
            myns2__double__java_lang_Double_Double_Serializer.serialize(instance.getDim_to_weight_ratio(), ns1_dim_to_weight_ratio_QNAME, null, writer, context);
        }
        if (instance.getAuto_box() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getAuto_box(), ns1_auto_box_QNAME, null, writer, context);
        }
        if (instance.getCold_packs() != null) {
            myns1_ArrayOfColdPack__ArrayOfColdPack_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfColdPack instanceGetCold_packs_arrayWrapper = (instance.getCold_packs() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfColdPack(instance.getCold_packs());
            myns1_ArrayOfColdPack__ArrayOfColdPack_LiteralSerializer.serialize(instanceGetCold_packs_arrayWrapper, ns1_cold_packs_QNAME, null, writer, context);
        }
        if (instance.getAdditional_information() != null) {
            ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.setNullable( false );
            ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.serialize(instance.getAdditional_information(), ns1_additional_information_QNAME, null, writer, context);
        }
        if (instance.getWarehouses() != null) {
            myns1_ArrayOfWarehouse__ArrayOfWarehouse_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfWarehouse instanceGetWarehouses_arrayWrapper = (instance.getWarehouses() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfWarehouse(instance.getWarehouses());
            myns1_ArrayOfWarehouse__ArrayOfWarehouse_LiteralSerializer.serialize(instanceGetWarehouses_arrayWrapper, ns1_warehouses_QNAME, null, writer, context);
        }
    }
}
