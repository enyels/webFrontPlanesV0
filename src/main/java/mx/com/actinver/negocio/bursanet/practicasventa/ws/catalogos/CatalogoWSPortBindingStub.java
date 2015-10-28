/**
 * CatalogoWSPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CatalogoWSPortBindingStub extends org.apache.axis.client.Stub implements mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[40];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarPerfil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actualizarPerfil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarPerfil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPerfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosPerfilTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosPerfilTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaPerfilTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaPerfilTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarServiciosBanco");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoServicioTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoServicioTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoServicio"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "listTipoServicioTO"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarTipoServicio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actualizarTipoServicio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarTipoServicio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actualizarTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoValorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoValorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoValorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoValorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTotalTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoValorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoValorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarCaracterisitica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actualizarCaracteristica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarCaracteristica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCaracteristicas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCaracteristicaTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "caracteristicaTO"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarAgrupador");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarAgrupador");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarAgrupadores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosAgrupadorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosAgrupadorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaAgrupadorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDetalleAgrupador");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTipoCartera");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoCarteraTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoCarteraTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoCarteraTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoCarteraTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTiposCaracteristica");
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTiposPersona");
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTiposOperacion");
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarUnidadesTiempo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "unidadTiempoTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTiposOperador");
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarEstados");
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actualizarAgrupador");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminarSubGrupo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actualizarSubGrupo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarParametroSistema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "parametroSistemaTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ParametroSistemaTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarContrato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarUsuario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarRecordatorio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "recordatorioTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RecordatorioTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarSubgruposPorTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosSubGrupoTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosSubGrupoTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaSubGrupoTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "subGrupos"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarModulo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "moduloTO"), mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "moduloTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTipoMercados");
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadosConsultaTipoMercadoTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "listaTipoMercadoTO"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existenciaTipoValor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaXIdTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        oper.setReturnClass(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"),
                      "mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception",
                      new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception"), 
                      true
                     ));
        _operations[39] = oper;

    }

    public CatalogoWSPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CatalogoWSPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CatalogoWSPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "archivoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ArchivoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "catalogoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteUnicoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteUnicoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "comisionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ComisionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "correoElectronicoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CorreoElectronicoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosAgrupadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosAgrupadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosPerfilTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosPerfilTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosSubGrupoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosSubGrupoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoCarteraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoCarteraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoServicioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoServicioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoValorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoValorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "destinatarioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.DestinatarioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "emisoraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EmisoraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estatusEnrolamientoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstatusEnrolamientoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Exception");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "facultadTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "idiomaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.IdiomaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ivaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.IvaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteGlobalTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteGlobalTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteProductoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Messages");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Messages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "moduloTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "nacionalidadTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.NacionalidadTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "parametroSistemaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ParametroSistemaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "personaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PersonaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posiblesValoresTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posicionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ProductoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "recordatorioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RecordatorioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "remitenteTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RemitenteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaAgrupadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCaracteristicaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO");
            qName2 = new javax.xml.namespace.QName("", "caracteristicaTO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaPerfilTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaPerfilTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaSubGrupoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO");
            qName2 = new javax.xml.namespace.QName("", "subGrupos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoCarteraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoCarteraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoServicio");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO");
            qName2 = new javax.xml.namespace.QName("", "listTipoServicioTO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoValorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoValorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadosConsultaTipoMercadoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoMercadoTO");
            qName2 = new javax.xml.namespace.QName("", "listaTipoMercadoTO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "rolTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "serieTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SerieTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "telefonoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCaracteristicaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCarteraTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCarteraTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoMercadoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperacionTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperadorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOrigenTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoPersonaTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoRecordatorioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRecordatorioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoRegistroTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRegistroTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoTelefonoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoTelefonoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "unidadTiempoTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "valorTO");
            cachedSerQNames.add(qName);
            cls = mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO.class;
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

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO registrarPerfil(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarPerfil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void actualizarPerfil(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "actualizarPerfil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void eliminarPerfil(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "eliminarPerfil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaPerfilTO consultarPerfiles(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosPerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarPerfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaPerfilTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaPerfilTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaPerfilTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] consultarServiciosBanco(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoServicioTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarServiciosBanco"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO registrarTipoServicio(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarTipoServicio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void actualizarTipoServicio(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "actualizarTipoServicio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void eliminarTipoServicio(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "eliminarTipoServicio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO registrarTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void actualizarTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "actualizarTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void eliminarTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "eliminarTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoValorTO consultarTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoValorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoValorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoValorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoValorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO consultarTotalTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoValorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTotalTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO registrarCaracterisitica(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarCaracterisitica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO actualizarCaracteristica(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "actualizarCaracteristica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO eliminarCaracteristica(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "eliminarCaracteristica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO[] consultarCaracteristicas(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarCaracteristicas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CaracteristicaTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO registrarAgrupador(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarAgrupador"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO eliminarAgrupador(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "eliminarAgrupador"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO consultarAgrupadores(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosAgrupadorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarAgrupadores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO consultarDetalleAgrupador(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarDetalleAgrupador"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoCarteraTO consultarTipoCartera(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosTipoCarteraTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTipoCartera"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoCarteraTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoCarteraTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaTipoCarteraTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO consultarTiposCaracteristica() throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTiposCaracteristica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO consultarTiposPersona() throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTiposPersona"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO consultarTiposOperacion() throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTiposOperacion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO consultarUnidadesTiempo(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarUnidadesTiempo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO consultarTiposOperador() throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTiposOperador"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO consultarEstados() throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarEstados"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaCatalogosTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO actualizarAgrupador(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "actualizarAgrupador"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void eliminarSubGrupo(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "eliminarSubGrupo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO actualizarSubGrupo(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "actualizarSubGrupo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void registrarParametroSistema(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ParametroSistemaTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarParametroSistema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void registrarContrato(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarContrato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO registrarUsuario(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarUsuario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void registrarRecordatorio(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RecordatorioTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarRecordatorio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[] consultarSubgruposPorTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosSubGrupoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarSubgruposPorTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO registrarModulo(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "registrarModulo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO[] consultarTipoMercados() throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultarTipoMercados"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoMercadoTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean existenciaTipoValor(java.lang.String arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "existenciaTipoValor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO consultaXIdTV(java.lang.String arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "consultaXIdTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO) org.apache.axis.utils.JavaUtils.convert(_resp, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) {
              throw (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
