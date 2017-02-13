/*
 * @(#)AascCarrierShipmentInfo.java        05/01/2006
 * Copyright (c) 2005-2006 Apps Associates Pvt. Ltd.
 * All rights reserved.
 */
package com.aasc.erp.carrier;

import com.aasc.erp.bean.AascShipmentHeaderInfo;
import com.aasc.erp.bean.AascShipmentOrderInfo;
import com.aasc.erp.bean.AascShipmentPackageInfo;
import com.aasc.erp.bean.AascProfileOptionsBean;
import com.aasc.erp.carrier.AascXmlParser;
import com.aasc.erp.util.AascLogger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringReader;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Logger;

import oracle.xml.parser.v2.DOMParser;
import oracle.xml.parser.v2.XMLDocument;
import oracle.xml.parser.v2.XMLElement;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;


/**
 * AascCarrierShipmentInfo Class is used to parse the response and
 * set the parsed data to header bean and package bean.
 * @author 	Vandana Gangisetty
 * @version - 2
 * @since 
 *       -22/03/2006 Vandana Gangisetty added code to parse label and writing it into file
 *       -18/04/2006 Vandana Gangisetty added escape method to truncate commas in shipment cost before
 *                                      converting it into double value.
 *       -07/05/2007 Vandana Gangisetty added code to set total shipment cost to freight cost field 
 *                                       of header bean.
 */
public class

AascCarrierShipmentInfo {
    private static Logger logger = 
        AascLogger.getLogger("AascCarrierShipmentInfo"); // Logger object for issuing logging requests
    private String displayMessage = ""; // String containing status of response
    private String errorDescription = ""; // String containing error message  
    private StringReader reader = 
        null; // String reader object which takes String as input and converts it into character stream 
    private InputSource input = 
        null; // This object is used to encapsulate character stream into single object
    private DOMParser parser = 
        null; // This object is used to parse xml document 
    private XMLDocument xmlDocument = null; // This encapsulates xml document
    private XMLElement root = null; // This encapsulates xml element 
    private Node node = null; // It represents single node in dom tree
    private NodeList nodeList = 
        null; // It represents ordered collection of tracking nodes
    private NodeList msnNodeList = 
        null; // It represents ordered collection of msn nodes

    /*private AascHeaderInfo aascHeaderInfo =  null; // Delivery header info bean object
    private AascPackageInfo aascPackageInfo = null; */ // Delivery  package info bean object
    private LinkedList packageList = null; // Linked list containing package bean objects
    private ListIterator packageListIterator = null;
    private int packageSize = 0; // Indicates  number of packages in the delivery
    private AascShipmentHeaderInfo aascShipmentHeaderInfo = null; // Delivery header info bean object
    private AascShipmentPackageInfo aascShipmentPackageInfo = null;
    private String labelPath = ""; // holds the path where the label file needs to be placed
    private String responseStatus = ""; // holds the status of the response
    private String unescapedTotalShipmentCharges = ""; // indicates shipment cost with any special characters like comma
    private String totalShipmentCharges = ""; // indicates total shipment charges
    private String totalShipmentChargesCurrCode = ""; // holds the currency code of the shipment charges
    private String wayBillNumber = ""; // contains parsed wayBillNumber of the delivery
    private int msn = 0; // sequence number generated by connectship      
    private AascProfileOptionsBean aascProfileOptionsInfo = null; // instantiating aascProfileOptionsInfo bean object      
    private String label = ""; // labelstring that holds label from parsed response

    /** default constructor.*/
    public AascCarrierShipmentInfo() {
    }

    /** This method can replace the null values with nullString.
     * @return String that is ""
     * @param obj Object of type Object
     */
    String nullStrToSpc(Object obj) {
        String spcStr = "";

        if (obj == null) {
            return spcStr;
        } else {
            return obj.toString();
        }
    }

    /** method used to covert the request string to contain require format.
     * @param  str as input 
     * @return returns String with required format
     * */
    private String escape(String str) {
        String result = null; // replace(str, "&", "&amp;");

        while (str.indexOf("&") != -1) {
            str = replace(str, "&", "&amp;");
        }
        result = str;
        while (result.indexOf("-") != -1) {
            result = replace(result, "-", "");
        }
        while (result.indexOf(",") != -1) {
            result = replace(result, ",", "");
        }
        return result;
    }

    /** method used to replace a substring of a string with another substring.
     * @param str String which has to be replaced a part of its content
     * @param from String containing from substring which is replaced by to substring
     * @param to String containing to substring which replaces the from substring
     * @return returns String with replaced values
     * */
    private String replace(String str, String from, String to) {
        int index = str.indexOf(from);

        if (index == -1) {
            return str;
        } else {
            int endIndex = index + from.length();

            return str.substring(0, index) + to + str.substring(endIndex);
        }
    }

    /**
     * For writing a string to specified file.
     * @param str java.lang.String
     * @param file java.lang.String
     */
    private void writeOutputFile(String str, String file) throws Exception {
        FileOutputStream fout = new FileOutputStream(file);

        fout.write(str.getBytes());
        fout.close();
    }

    /**
     * parseResponse method is used to parse the xml response and 
     * set the parsed data to corresponding headers and package bean.
     * @param shipmentResponse String containing shipmentResponse which needs to be parsed
     * @param aascShipmentOrderInfo AascShipmentOrderInfo bean object to retreive header and package bean 
     * to which parsed data is set
     * @return displayMessage String which contains response status*/
    // this method is added by swapna soni
    String parseResponse(String shipmentResponse, 
                         AascShipmentOrderInfo aascShipmentOrderInfo,String cloudLabelPath) {
        logger.info("parsing the response");
        aascProfileOptionsInfo = 
                new AascProfileOptionsBean(); // instantiating aascProfileOptionsInfo bean object      
      //  labelPath = 
            //    nullStrToSpc(aascProfileOptionsInfo.getLabelPath()); // retreiving label path
        
        //Gururaj added code to get the label path from session, set in customer creation page
        labelPath=cloudLabelPath;
        logger.info("label file path:" + labelPath);

        try {
            aascShipmentHeaderInfo = aascShipmentOrderInfo.getShipmentHeaderInfo();
            packageList = aascShipmentOrderInfo.getShipmentPackageInfo();
            packageSize = packageList.size();

            // Get an instance of the parser
            parser = new DOMParser();

            // create InputSource from string containing xml response
            reader = new StringReader(shipmentResponse);

            input = new InputSource(reader);

            // Set various parser options: validation off, warnings shown
            parser.setValidationMode(false);
            parser.showWarnings(true);

            // Parse the document.
            logger.info("before passing the xml document to the parser");
            parser.parse(input);
            logger.info("after passing the xml document to the parser");

            // Obtain the document.
            xmlDocument = parser.getDocument();

            // Print or extract document fields
            root = (XMLElement)xmlDocument.getDocumentElement();

            // extract info and save to AASC schema.
            responseStatus = 
                    (AascXmlParser.getValue(root, "RESPONSESTATUSDESCRIPTION")).toLowerCase();

            logger.info("parsed xml responseStatus:" + responseStatus);
            errorDescription = 
                    AascXmlParser.getValue(root, "ERRORDESCRIPTION");

            if (responseStatus != null && 
                (responseStatus.equalsIgnoreCase("success") || 
                 responseStatus.equalsIgnoreCase("partial success"))) {

                label = AascXmlParser.getValue(root, "LABELSTRING");
                logger.info("labelString---------------->:" + label);

                logger.info("inside if(responseStatus != null && responseStatus.equalsIgnoreCase('Success'))");
                // get total freight charges
                node = 
root.selectSingleNode("/SHIPMENTRESPONSE/RATEDSHIPMENT/TOTALCHARGES/MONETARYVALUE/text()");
                unescapedTotalShipmentCharges = node.getNodeValue();

                totalShipmentCharges = escape(unescapedTotalShipmentCharges);

                aascShipmentHeaderInfo.setShipmentCost(Double.parseDouble(totalShipmentCharges));
                logger.info("setting shipment cost from parsed response to header bean" + 
                            Double.parseDouble(totalShipmentCharges));

                node = 
root.selectSingleNode("/SHIPMENTRESPONSE/RATEDSHIPMENT/TOTALCHARGES/CURRENCYCODE/text()");
                totalShipmentChargesCurrCode = node.getNodeValue();

                // get waybill Number  which will be set to the first tracking number.
                nodeList = 
                        root.selectNodes("/SHIPMENTRESPONSE/RATEDSHIPMENT/RATEDPACKAGE/TRACKINGNUMBER/text()");
                wayBillNumber = nodeList.item(0).getNodeValue();

                aascShipmentHeaderInfo.setWayBill(wayBillNumber);

                // get msn numbers   
                msnNodeList = 
                        root.selectNodes("/SHIPMENTRESPONSE/RATEDSHIPMENT/RATEDPACKAGE/LABELREQUESTINFO/MSN/text()");

                msn = Integer.parseInt(msnNodeList.item(0).getNodeValue());

                logger.info("MSN Number " + msn);

                // writing label into a file named with its corresponding tracking number and placing into labelpath retreived from profile options
                try {
                    writeOutputFile(label, labelPath + wayBillNumber + "_1");
                    logger.info("after writing label to file:" + labelPath + 
                                wayBillNumber + "_1");
                } catch (FileNotFoundException fileNotFoundException) {
                    logger.severe("file to which label is to be written is not found" + 
                                  "\n file name:" + labelPath + wayBillNumber + 
                                  "_1");
                }
                logger.info("setting msn from parsed response to header bean" + 
                            msn);

                packageListIterator = packageList.listIterator();

                if (packageListIterator.hasNext()) {
                    aascShipmentPackageInfo = 
                            (AascShipmentPackageInfo)packageListIterator.next();
                }
                aascShipmentPackageInfo.setMsn(msn);
                logger.info("msn value set " + aascShipmentPackageInfo.getMsn());

                logger.info("after getting msn and tracking numbers and setting it to package information bean");

                // set display message
                displayMessage = "success";
            } // if (responseStatus != null && responseStatus.equalsIgnoreCase("Success"))
            else { // ship failed         

                node = 
root.selectSingleNode("/SHIPMENTRESPONSE/RESPONSE/RESPONSEERROR/ERRORDESCRIPTION/text()");

                errorDescription = 
                        AascXmlParser.getValue(root, "ERRORDESCRIPTION");
                displayMessage = errorDescription;

                logger.info("error in parsing xml document--- errorDescription:" + 
                            errorDescription);
            } // else
        } // end of try
        catch (Exception exp) {
            displayMessage = 
                    "Error in parsing or setting the values to bean !";
            logger.severe("Exception::"+exp.getMessage());
        }
        return displayMessage;

    } // end of method

}
