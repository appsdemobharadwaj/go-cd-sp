// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class ArrayOfCloseOutItem implements java.io.Serializable {
    private com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] closeOutItem;
    
    public ArrayOfCloseOutItem() {
    }
    
    public ArrayOfCloseOutItem(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] sourceArray) {
        closeOutItem = sourceArray;
    }
    
    public void fromArray(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] sourceArray) {
        this.closeOutItem = sourceArray;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] toArray() {
        return closeOutItem;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] getCloseOutItem() {
        return closeOutItem;
    }
    
    public void setCloseOutItem(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] closeOutItem) {
        this.closeOutItem = closeOutItem;
    }
}
