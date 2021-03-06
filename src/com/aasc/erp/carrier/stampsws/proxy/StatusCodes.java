// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class StatusCodes implements java.io.Serializable {
    protected int returnCode;
    protected com.aasc.erp.carrier.stampsws.proxy.Footnote[] footnotes;
    protected com.aasc.erp.carrier.stampsws.proxy.DpvFootnote[] dpvFootnotes;
    protected int[] sdcFootnotes;
    
    public StatusCodes() {
    }
    
    public int getReturnCode() {
        return returnCode;
    }
    
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.Footnote[] getFootnotes() {
        return footnotes;
    }
    
    public void setFootnotes(com.aasc.erp.carrier.stampsws.proxy.Footnote[] footnotes) {
        this.footnotes = footnotes;
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.DpvFootnote[] getDpvFootnotes() {
        return dpvFootnotes;
    }
    
    public void setDpvFootnotes(com.aasc.erp.carrier.stampsws.proxy.DpvFootnote[] dpvFootnotes) {
        this.dpvFootnotes = dpvFootnotes;
    }
    
    public int[] getSdcFootnotes() {
        return sdcFootnotes;
    }
    
    public void setSdcFootnotes(int[] sdcFootnotes) {
        this.sdcFootnotes = sdcFootnotes;
    }
}
