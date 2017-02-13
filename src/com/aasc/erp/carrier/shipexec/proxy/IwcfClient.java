// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy;

public interface IwcfClient extends java.rmi.Remote {
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ClientSettings getSettings(java.lang.String user_id, java.lang.String machineName) throws 
         java.rmi.RemoteException;
    public void logUserTransaction(java.lang.String user_id, short trans_id, java.lang.String shipper, java.lang.String carrier, long msn_shipfile_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddressRecord[] getAddressBook() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn updateAddressRecord(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddressRecord addressRecord) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn insertAddressRecordbyUser(java.lang.String user_id, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddressRecord addressRecord) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn insertAddressRecord(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddressRecord addressRecord) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn deleteAddressRecord(int address_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn deleteAddressRecordbyUser(java.lang.String user_id, int address_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddressRecord[] searchAddressBook(int category_id, java.lang.String search_1_value, java.lang.String search_1_value_field, java.lang.String search_1_sort_by, java.lang.String search_2_value, java.lang.String search_2_value_field, java.lang.String search_2_sort_by) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddressRecord getAddressRecord(int address_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getAddressCategories() throws 
         java.rmi.RemoteException;
    public int addAddressCategory(java.lang.String name) throws 
         java.rmi.RemoteException;
    public boolean deleteAddressCategory(int category_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CommodityContent[] getCommodityContents() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn updateCommondityContent(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CommodityContent commodityContent) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn insertCommondityContent(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CommodityContent commodityContent) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn insertCommondityContentbyUser(java.lang.String user_id, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CommodityContent commodityContent) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn deleteCommodityContent(int address_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn deleteCommodityContentbyUser(java.lang.String user_id, int address_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.UserProfile getUserProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public boolean updateUserProfile(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.UserProfile userProfile) throws 
         java.rmi.RemoteException;
    public boolean deleteUserProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getUserProfiles() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddUserProfileResponse addUserProfile(java.lang.String profileName, int profile_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddMachineProfileResponse addMachineProfile(java.lang.String machineProfileName, int profile_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.MachineProfile getMachineProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public boolean updateMachineProfile(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.MachineProfile machineProfile) throws 
         java.rmi.RemoteException;
    public boolean deleteMachineProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getMachineProfiles() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.AddMachineResponse addMachine(java.lang.String machineName, int profile_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.MachineProfile getMachine(java.lang.String machineName) throws 
         java.rmi.RemoteException;
    public boolean updateMachine(java.lang.String machineName, int machine_profile_id) throws 
         java.rmi.RemoteException;
    public boolean deleteMachine(java.lang.String machineName) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getMachines() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.UserProfile getUser(java.lang.String user_id) throws 
         java.rmi.RemoteException;
    public boolean updateUser(java.lang.String user_id, int profile_id) throws 
         java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String user_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getUsers() throws 
         java.rmi.RemoteException;
    public boolean addUser(java.lang.String user_id, java.lang.String userName) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getCarriersByUserAndShipper(java.lang.String user_id, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings getApplicationSettings() throws 
         java.rmi.RemoteException;
    public boolean updateApplicationSettings(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ApplicationSettings applicationSettings) throws 
         java.rmi.RemoteException;
}
