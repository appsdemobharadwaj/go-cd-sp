// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class CreateIndiciumModeV1 implements java.io.Serializable {
    private java.lang.String value;
    private static final String _NormalString = "Normal";
    private static final String _SampleString = "Sample";
    private static final String _NoPostageString = "NoPostage";
    private static final String _PreviewString = "Preview";
    
    public static final java.lang.String _Normal = new java.lang.String(_NormalString);
    public static final java.lang.String _Sample = new java.lang.String(_SampleString);
    public static final java.lang.String _NoPostage = new java.lang.String(_NoPostageString);
    public static final java.lang.String _Preview = new java.lang.String(_PreviewString);
    
    public static final CreateIndiciumModeV1 Normal = new CreateIndiciumModeV1(_Normal);
    public static final CreateIndiciumModeV1 Sample = new CreateIndiciumModeV1(_Sample);
    public static final CreateIndiciumModeV1 NoPostage = new CreateIndiciumModeV1(_NoPostage);
    public static final CreateIndiciumModeV1 Preview = new CreateIndiciumModeV1(_Preview);
    
    protected CreateIndiciumModeV1(java.lang.String value) {
        this.value = value;
    }
    
    public java.lang.String getValue() {
        return value;
    }
    
    public static CreateIndiciumModeV1 fromValue(java.lang.String value)
        throws java.lang.IllegalStateException {
        if (Normal.value.equals(value)) {
            return Normal;
        }if (Sample.value.equals(value)) {
            return Sample;
        }if (NoPostage.value.equals(value)) {
            return NoPostage;
        }if (Preview.value.equals(value)) {
            return Preview;
        }
        throw new IllegalArgumentException();
    }
    
    public static CreateIndiciumModeV1 fromString(String value)
        throws java.lang.IllegalStateException {
        if (value.equals(_NormalString)) {
            return Normal;
        }if (value.equals(_SampleString)) {
            return Sample;
        }if (value.equals(_NoPostageString)) {
            return NoPostage;
        }if (value.equals(_PreviewString)) {
            return Preview;
        }
        throw new IllegalArgumentException();
    }
    
    public String toString() {
        return value.toString();
    }
    
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateIndiciumModeV1)) {
            return false;
        }
        return ((CreateIndiciumModeV1)obj).value.equals(value);
    }
    
    public int hashCode() {
        return value.hashCode();
    }
}
