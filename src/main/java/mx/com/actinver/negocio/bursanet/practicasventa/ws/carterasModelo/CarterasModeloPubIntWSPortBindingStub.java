/**
 * CarterasModeloPubIntWSPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CarterasModeloPubIntWSPortBindingStub extends org.apache.axis.client.Stub implements mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloPubIntWS_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTipoCartera");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoCarteraTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosTipoCarteraTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoCarteraTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPerfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosPerfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaPerfilTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarEstrategiasInversionXcriterios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosEstrategiasInversionTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosEstrategiasInversionTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaEstrategiasInversionTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPerfilXContrato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosPerfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaPerfilTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCarterasModeloXCriterio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosCarterasModeloTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaCarteraModeloTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDetalleCarteraModelo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "carterasModeloTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaCarteraModeloTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarEstrategiaInversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estrategiaInversionTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoOperacionServicioTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarAgrupadoresLimitesPerfil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperacionTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOperacionTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaAgrupadorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarProductoPorCriterios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosProductoTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosProductoTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadosConsultaProductoTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDetalleEstrategiaInversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estrategiaInversionTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaEstrategiasInversionTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception",
                      new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[9] = oper;

    }

    public CarterasModeloPubIntWSPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CarterasModeloPubIntWSPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CarterasModeloPubIntWSPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "archivoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "carterasModeloTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "catalogoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CatalogoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ClienteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteUnicoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ClienteUnicoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "comisionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ComisionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "correoElectronicoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CorreoElectronicoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosCarterasModeloTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosEstrategiasInversionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosEstrategiasInversionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosPerfilTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosProductoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosProductoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoCarteraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosTipoCarteraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "destinatarioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "emisoraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EmisoraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoEstrategiaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estatusEnrolamientoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstatusEnrolamientoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estrategiaInversionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "facultadTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.FacultadTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "idiomaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.IdiomaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ivaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.IvaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteGlobalTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteProductoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteProductoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Messages");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "moduloTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ModuloTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "nacionalidadTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.NacionalidadTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "personaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PersonaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posiblesValoresTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PosiblesValoresTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posicionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PosicionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "remitenteTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.RemitenteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaAgrupadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaCarteraModeloTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaEstrategiasInversionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaPerfilTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoCarteraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoOperacionServicioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadosConsultaProductoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "rolTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.RolTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "serieTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SerieTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "telefonoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TelefonoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCaracteristicaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCaracteristicaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCarteraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoMercadoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoMercadoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperacionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOperacionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOperadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOrigenTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOrigenTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoPersonaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoPersonaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoRegistroTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoRegistroTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoServicioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoTelefonoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoTelefonoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "unidadTiempoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "valorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ValorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO consultarTipoCartera(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosTipoCarteraTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTipoCartera"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO consultarPerfiles(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarPerfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO consultarEstrategiasInversionXcriterios(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosEstrategiasInversionTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarEstrategiasInversionXcriterios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO consultarPerfilXContrato(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarPerfilXContrato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO consultarCarterasModeloXCriterio(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarCarterasModeloXCriterio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO consultarDetalleCarteraModelo(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarDetalleCarteraModelo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO registrarEstrategiaInversion(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarEstrategiaInversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO consultarAgrupadoresLimitesPerfil(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO arg0, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOperacionTO arg1) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarAgrupadoresLimitesPerfil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO consultarProductoPorCriterios(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosProductoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarProductoPorCriterios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO consultarDetalleEstrategiaInversion(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarDetalleEstrategiaInversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
