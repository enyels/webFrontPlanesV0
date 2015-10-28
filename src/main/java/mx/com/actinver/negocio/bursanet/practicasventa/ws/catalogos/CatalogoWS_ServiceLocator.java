/**
 * CatalogoWS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CatalogoWS_ServiceLocator extends org.apache.axis.client.Service implements mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_Service {

    public CatalogoWS_ServiceLocator() {
    }


    public CatalogoWS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatalogoWS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CatalogoWSPort
    private java.lang.String CatalogoWSPort_address = "http://10.10.115.12:9083/pventasservicios/ws/catalogos";

    public java.lang.String getCatalogoWSPortAddress() {
        return CatalogoWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CatalogoWSPortWSDDServiceName = "CatalogoWSPort";

    public java.lang.String getCatalogoWSPortWSDDServiceName() {
        return CatalogoWSPortWSDDServiceName;
    }

    public void setCatalogoWSPortWSDDServiceName(java.lang.String name) {
        CatalogoWSPortWSDDServiceName = name;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_PortType getCatalogoWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CatalogoWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCatalogoWSPort(endpoint);
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_PortType getCatalogoWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWSPortBindingStub _stub = new mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWSPortBindingStub(portAddress, this);
            _stub.setPortName(getCatalogoWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCatalogoWSPortEndpointAddress(java.lang.String address) {
        CatalogoWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWSPortBindingStub _stub = new mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWSPortBindingStub(new java.net.URL(CatalogoWSPort_address), this);
                _stub.setPortName(getCatalogoWSPortWSDDServiceName());
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
        if ("CatalogoWSPort".equals(inputPortName)) {
            return getCatalogoWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CatalogoWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CatalogoWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CatalogoWSPort".equals(portName)) {
            setCatalogoWSPortEndpointAddress(address);
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
