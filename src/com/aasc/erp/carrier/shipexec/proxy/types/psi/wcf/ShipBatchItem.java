// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class ShipBatchItem implements java.io.Serializable {
    protected java.lang.String batchReference;
    protected java.lang.String batchItemReference;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params;
    
    public ShipBatchItem() {
    }
    
    public java.lang.String getBatchReference() {
        return batchReference;
    }
    
    public void setBatchReference(java.lang.String batchReference) {
        this.batchReference = batchReference;
    }
    
    public java.lang.String getBatchItemReference() {
        return batchItemReference;
    }
    
    public void setBatchItemReference(java.lang.String batchItemReference) {
        this.batchItemReference = batchItemReference;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getParams() {
        return params;
    }
    
    public void setParams(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) {
        this.params = params;
    }
}
