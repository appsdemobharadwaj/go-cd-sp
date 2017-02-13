// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class Container implements java.io.Serializable {
    protected int container_id;
    protected java.lang.Double container_volume;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight dim_weight;
    protected java.lang.String name;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Dimensions dimensions;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight maximum_weight;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight weight;
    protected java.lang.Double cost_factor;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ContainerType container_type;
    protected java.lang.Object additional_information;
    
    public Container() {
    }
    
    public int getContainer_id() {
        return container_id;
    }
    
    public void setContainer_id(int container_id) {
        this.container_id = container_id;
    }
    
    public java.lang.Double getContainer_volume() {
        return container_volume;
    }
    
    public void setContainer_volume(java.lang.Double container_volume) {
        this.container_volume = container_volume;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight getDim_weight() {
        return dim_weight;
    }
    
    public void setDim_weight(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight dim_weight) {
        this.dim_weight = dim_weight;
    }
    
    public java.lang.String getName() {
        return name;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Dimensions getDimensions() {
        return dimensions;
    }
    
    public void setDimensions(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight getMaximum_weight() {
        return maximum_weight;
    }
    
    public void setMaximum_weight(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight maximum_weight) {
        this.maximum_weight = maximum_weight;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight getWeight() {
        return weight;
    }
    
    public void setWeight(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Weight weight) {
        this.weight = weight;
    }
    
    public java.lang.Double getCost_factor() {
        return cost_factor;
    }
    
    public void setCost_factor(java.lang.Double cost_factor) {
        this.cost_factor = cost_factor;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ContainerType getContainer_type() {
        return container_type;
    }
    
    public void setContainer_type(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ContainerType container_type) {
        this.container_type = container_type;
    }
    
    public java.lang.Object getAdditional_information() {
        return additional_information;
    }
    
    public void setAdditional_information(java.lang.Object additional_information) {
        this.additional_information = additional_information;
    }
}
