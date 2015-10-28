package com.mx.actinver.adminplan.operation;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloPubIntWS_PortType;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloPubIntWS_ServiceLocator;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosProductoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_PortType;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_ServiceLocator;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosAgrupadorTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO;

public class ConsumeWsCatalogo {

	private static final Logger logger = LoggerFactory.getLogger(ConsumeWsCatalogo.class);
	
	/*
	 * Ws :: catalogos
	 * Consultar Grupos :: consultarAgrupadores
	 */
	public static ResultadoConsultaAgrupadorTO consultarAgrupadoresMap(){
		CriteriosAgrupadorTO criteriosAgrupador = new CriteriosAgrupadorTO();
		ResultadoConsultaAgrupadorTO resConsultaAgrupador = new ResultadoConsultaAgrupadorTO();
		ResourceBundle rb = ResourceBundle.getBundle("configprop");
		try {
			URL url = new URL(rb.getString("URLWS_CTLGS_LOC"));
			CatalogoWS_ServiceLocator locator = new CatalogoWS_ServiceLocator();
			CatalogoWS_PortType porType = locator.getCatalogoWSPort(url);
			resConsultaAgrupador = porType.consultarAgrupadores(criteriosAgrupador);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	consultarAgrupadoresMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	consultarAgrupadoresMap	-	[Method] - "+e.getMessage());
		} catch (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception e) {
			logger.info("[Controller]	::	consultarAgrupadoresMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	consultarAgrupadoresMap	-	[Method] - "+e.getMessage());
		}
		return resConsultaAgrupador;
	}
	
	/*
	 * Ws :: catalogos
	 * Consultar Subgrupos de Grupo :: consultarDetalleAgrupador
	 */
	public static AgrupadorTO consultarDetalleAgrupadorMap(Long idGroup){
		AgrupadorTO agrupadorTo = new AgrupadorTO();
		ResourceBundle rb = ResourceBundle.getBundle("configprop");
		try {
			URL url = new URL(rb.getString("URLWS_CTLGS_LOC"));
			CatalogoWS_ServiceLocator locator = new CatalogoWS_ServiceLocator();
			CatalogoWS_PortType porType = locator.getCatalogoWSPort(url);
			agrupadorTo.setId(Long.valueOf(idGroup));
			agrupadorTo = porType.consultarDetalleAgrupador(agrupadorTo);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	consultarDetalleAgrupadorMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	consultarDetalleAgrupadorMap	-	[Method] - "+e.getMessage());
		} catch (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception e) {
			logger.info("[Controller]	::	consultarDetalleAgrupadorMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	consultarDetalleAgrupadorMap	-	[Method] - "+e.getMessage());
		}
		return agrupadorTo;
	}
	
	/*
	 * Consultar Detalle Subgrupo
	 * Ws :: carterasModelo
	 * Method :: consultarProductoPorCriterios
	 */
	public static ResultadosConsultaProductoTO consultarProductoPorCriteriosMap (Long idSub){
		ResultadosConsultaProductoTO resConsultaProductoTo = new ResultadosConsultaProductoTO();
		ResourceBundle rb = ResourceBundle.getBundle("configprop");
		try {
			URL url = new URL(rb.getString("URLWS_CRTRSMDL_BUS"));
			CarterasModeloPubIntWS_ServiceLocator locator = new CarterasModeloPubIntWS_ServiceLocator();
			CarterasModeloPubIntWS_PortType porType = locator.getCarterasModeloPubIntWSPort(url);
			CriteriosProductoTO criteriosProducto = new CriteriosProductoTO();
			SubGrupoTO subGrupoTo = new SubGrupoTO();
			subGrupoTo.setId(idSub);
			criteriosProducto.setSubGrupoTO(subGrupoTo);
			resConsultaProductoTo = porType.consultarProductoPorCriterios(criteriosProducto);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	consultarProductoPorCriteriosMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	consultarProductoPorCriteriosMap	-	[Method] - "+e.getMessage());
		} catch (Exception e) {
			logger.info("[Controller]	::	consultarProductoPorCriteriosMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	consultarProductoPorCriteriosMap	-	[Method] - "+e.getMessage());
		}
		return resConsultaProductoTo;
	}
	
}
