/*
 * @(#)AascUpsVoidInfo.java       18/01/2015
 * Copyright (c) 2014-2015 Apps Associates Pvt. Ltd.
 * All rights reserved.
 */
package com.aasc.erp.carrier;

import com.aasc.erp.util.AascLogger;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.xml.parser.v2.DOMParser;
import oracle.xml.parser.v2.XMLDocument;
import oracle.xml.parser.v2.XMLElement;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;


/**
 * AascUpsVoidInfo Class is used to parse the response  of void Request.
 * @author 	Sunanda Kondapalli
 * @version 2
 * History
 * 23/03/2015   Sunanda K   Changed the old Date in class level documentation for code review fix
 */
public class


AascUpsVoidInfo {
    String dispMsg = null; // String containing status of response
    String csError = ""; // String containing error message  
    StringReader reader = 
        null; // String reader object which takes String as input and converts it into character stream 
    InputSource input = 
        null; // This object is used to encapsulate character stream into single object
    DOMParser parser = null; // This object is used to parse xml document 
    XMLDocument doc = null; // This encapsulates xml document
    XMLElement root = null; // This encapsulates xml element 
    Node node = null; // It represents single node in dom tree
    static Logger logger = 
        AascLogger.getLogger("AascVoidShipmentInfo"); // creates the logger object
    String responseStatus = null; //
    protected AascXmlParser aascXmlParser1 = null;

    public AascUpsVoidInfo() {
    }

    /** parseResponse method is used to parse the xml void response and 
     * returns 130 if void responce is sucess else return 131 for error
     **@param shipmentResponse of type String containing shipment Response which needs to be parsed
     **@return String which contains response status
     */
    String parseResponse(String shipmentResponse) {
        logger.info("Entered parseResponse() ");
        try {
            parser = new DOMParser();
            // create InputSource from string containing xml response
            reader = new StringReader(shipmentResponse);
            input = new InputSource(reader);
            // Set various parser options: validation off, warnings shown
            parser.showWarnings(true);
            // Parse the document.
            parser.parse(input);
            // Obtain the document.
            doc = parser.getDocument();
            // Print or extract document fields
            root = (XMLElement)doc.getDocumentElement();
            responseStatus = 
                    AascXmlParser.getValue(root, "ResponseStatusDescription");

            logger.info("--responseStatus--" + responseStatus);
            if (!responseStatus.equalsIgnoreCase("Success")) {
                logger.info("responseStatus is not success");

                /* responseStatus= AascXmlParser.getValue(root,
                 "RESPONSESTATUSDESCRIPTION");*/
                String errorSeverity = 
                    AascXmlParser.getValue(root, "ErrorSeverity");
                String errorCode = AascXmlParser.getValue(root, "ErrorCode");
                String errorLocationElementName = 
                    AascXmlParser.getValue(root, "ErrorLocationElementName");
                String errorDescription = 
                    AascXmlParser.getValue(root, "ErrorDescription");

                responseStatus = 
                        errorDescription + " " + errorCode + " " + errorSeverity + 
                        " " + errorLocationElementName;
            }

            /* if (!responseStatus.equalsIgnoreCase("Success")) {
             logger.info("");
             node = root.selectSingleNode(
             "/VOIDRESPONSE/RESPONSE/RESPONSEERROR/ERRORDESCRIPTION/text()");
             responseStatus = node.getNodeValue();
             logger.info(responseStatus);
             }*/
        } catch (Exception e) {
            logger.log(Level.SEVERE, "In the VOID Response parsing", e);
            responseStatus = "Exception in void";
        }
        logger.info("Exit from parseResponse() ");
        return responseStatus;
    }
}
