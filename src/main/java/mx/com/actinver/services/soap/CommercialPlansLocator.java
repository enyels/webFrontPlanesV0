/**
 * CommercialPlansLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public class CommercialPlansLocator extends org.apache.axis.client.Service implements mx.com.actinver.services.soap.CommercialPlans {

    public CommercialPlansLocator() {
    }


    public CommercialPlansLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommercialPlansLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommercialPlansServicePort
    private java.lang.String CommercialPlansServicePort_address = "http://10.10.115.7:9080/eActinver_Admin/CommercialPlans";

    public java.lang.String getCommercialPlansServicePortAddress() {
        return CommercialPlansServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommercialPlansServicePortWSDDServiceName = "CommercialPlansServicePort";

    public java.lang.String getCommercialPlansServicePortWSDDServiceName() {
        return CommercialPlansServicePortWSDDServiceName;
    }

    public void setCommercialPlansServicePortWSDDServiceName(java.lang.String name) {
        CommercialPlansServicePortWSDDServiceName = name;
    }

    public mx.com.actinver.services.soap.CommercialPlansBoDelegate getCommercialPlansServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommercialPlansServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommercialPlansServicePort(endpoint);
    }

    public mx.com.actinver.services.soap.CommercialPlansBoDelegate getCommercialPlansServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.actinver.services.soap.CommercialPlansServicePortBindingStub _stub = new mx.com.actinver.services.soap.CommercialPlansServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCommercialPlansServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommercialPlansServicePortEndpointAddress(java.lang.String address) {
        CommercialPlansServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.actinver.services.soap.CommercialPlansBoDelegate.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.actinver.services.soap.CommercialPlansServicePortBindingStub _stub = new mx.com.actinver.services.soap.CommercialPlansServicePortBindingStub(new java.net.URL(CommercialPlansServicePort_address), this);
                _stub.setPortName(getCommercialPlansServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommercialPlansServicePort".equals(inputPortName)) {
            return getCommercialPlansServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "CommercialPlans");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "CommercialPlansServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommercialPlansServicePort".equals(portName)) {
            setCommercialPlansServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
