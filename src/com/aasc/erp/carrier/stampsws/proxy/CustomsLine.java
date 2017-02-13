// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class CustomsLine implements java.io.Serializable {
    protected java.lang.String description;
    protected double quantity;
    protected java.math.BigDecimal value;
    protected java.lang.Double weightLb;
    protected java.lang.Double weightOz;
    protected java.lang.String HSTariffNumber;
    protected java.lang.String countryOfOrigin;
    
    public CustomsLine() {
    }
    
    public java.lang.String getDescription() {
        return description;
    }
    
    public void setDescription(java.lang.String description) {
        this.description = description;
    }
    
    public double getQuantity() {
        return quantity;
    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    public java.math.BigDecimal getValue() {
        return value;
    }
    
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }
    
    public java.lang.Double getWeightLb() {
        return weightLb;
    }
    
    public void setWeightLb(java.lang.Double weightLb) {
        this.weightLb = weightLb;
    }
    
    public java.lang.Double getWeightOz() {
        return weightOz;
    }
    
    public void setWeightOz(java.lang.Double weightOz) {
        this.weightOz = weightOz;
    }
    
    public java.lang.String getHSTariffNumber() {
        return HSTariffNumber;
    }
    
    public void setHSTariffNumber(java.lang.String HSTariffNumber) {
        this.HSTariffNumber = HSTariffNumber;
    }
    
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
