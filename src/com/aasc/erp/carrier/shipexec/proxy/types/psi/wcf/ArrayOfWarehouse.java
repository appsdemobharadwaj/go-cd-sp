// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class ArrayOfWarehouse implements java.io.Serializable {
    private com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Warehouse[] warehouse;
    
    public ArrayOfWarehouse() {
    }
    
    public ArrayOfWarehouse(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Warehouse[] sourceArray) {
        warehouse = sourceArray;
    }
    
    public void fromArray(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Warehouse[] sourceArray) {
        this.warehouse = sourceArray;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Warehouse[] toArray() {
        return warehouse;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Warehouse[] getWarehouse() {
        return warehouse;
    }
    
    public void setWarehouse(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Warehouse[] warehouse) {
        this.warehouse = warehouse;
    }
}
