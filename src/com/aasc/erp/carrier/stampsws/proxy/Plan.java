// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class Plan implements java.io.Serializable {
    protected int planId;
    protected java.lang.String planName;
    protected java.math.BigDecimal monthlyBaseFee;
    
    public Plan() {
    }
    
    public int getPlanId() {
        return planId;
    }
    
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    
    public java.lang.String getPlanName() {
        return planName;
    }
    
    public void setPlanName(java.lang.String planName) {
        this.planName = planName;
    }
    
    public java.math.BigDecimal getMonthlyBaseFee() {
        return monthlyBaseFee;
    }
    
    public void setMonthlyBaseFee(java.math.BigDecimal monthlyBaseFee) {
        this.monthlyBaseFee = monthlyBaseFee;
    }
}
