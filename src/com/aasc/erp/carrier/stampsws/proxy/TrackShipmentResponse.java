// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class TrackShipmentResponse implements java.io.Serializable {
    protected java.lang.String authenticator;
    protected com.aasc.erp.carrier.stampsws.proxy.TrackingEvent[] trackingEvents;
    
    public TrackShipmentResponse() {
    }
    
    public java.lang.String getAuthenticator() {
        return authenticator;
    }
    
    public void setAuthenticator(java.lang.String authenticator) {
        this.authenticator = authenticator;
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.TrackingEvent[] getTrackingEvents() {
        return trackingEvents;
    }
    
    public void setTrackingEvents(com.aasc.erp.carrier.stampsws.proxy.TrackingEvent[] trackingEvents) {
        this.trackingEvents = trackingEvents;
    }
}
