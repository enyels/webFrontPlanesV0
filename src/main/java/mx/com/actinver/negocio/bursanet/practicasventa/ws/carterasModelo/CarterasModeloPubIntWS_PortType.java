/**
 * CarterasModeloPubIntWS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public interface CarterasModeloPubIntWS_PortType extends java.rmi.Remote {
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaTipoCarteraTO consultarTipoCartera(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosTipoCarteraTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO consultarPerfiles(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO consultarEstrategiasInversionXcriterios(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosEstrategiasInversionTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO consultarPerfilXContrato(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO consultarCarterasModeloXCriterio(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaCarteraModeloTO consultarDetalleCarteraModelo(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoOperacionServicioTO registrarEstrategiaInversion(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaAgrupadorTO consultarAgrupadoresLimitesPerfil(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO arg0, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOperacionTO arg1) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO consultarProductoPorCriterios(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosProductoTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaEstrategiasInversionTO consultarDetalleEstrategiaInversion(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO arg0) throws java.rmi.RemoteException, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
}
