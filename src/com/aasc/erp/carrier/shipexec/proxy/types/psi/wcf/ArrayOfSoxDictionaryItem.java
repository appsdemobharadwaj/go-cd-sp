// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class ArrayOfSoxDictionaryItem implements java.io.Serializable {
    private com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] soxDictionaryItem;
    
    public ArrayOfSoxDictionaryItem() {
    }
    
    public ArrayOfSoxDictionaryItem(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] sourceArray) {
        soxDictionaryItem = sourceArray;
    }
    
    public void fromArray(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] sourceArray) {
        this.soxDictionaryItem = sourceArray;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] toArray() {
        return soxDictionaryItem;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getSoxDictionaryItem() {
        return soxDictionaryItem;
    }
    
    public void setSoxDictionaryItem(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] soxDictionaryItem) {
        this.soxDictionaryItem = soxDictionaryItem;
    }
}
