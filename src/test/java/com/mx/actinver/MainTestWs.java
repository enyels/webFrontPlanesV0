package com.mx.actinver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.google.gson.Gson;

import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloPubIntWS_PortType;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloPubIntWS_ServiceLocator;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosPerfilTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosProductoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Exception;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadoConsultaPerfilTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoOperacionTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_PortType;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoWS_ServiceLocator;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CriteriosAgrupadorTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO;

public class MainTestWs {
	
	/*
	 * Consultar perfiles :: carterasModelo
	 */
	public static void consultarPerfiles() throws Exception, RemoteException, MalformedURLException, ServiceException{
		URL url = new URL("http://10.10.115.12:9083/pventasservicios/ws/carterasModeloPubIntWS");
		CarterasModeloPubIntWS_ServiceLocator locator = new CarterasModeloPubIntWS_ServiceLocator();
		CarterasModeloPubIntWS_PortType porType = locator.getCarterasModeloPubIntWSPort(url);
		PerfilTO perfilTo = new PerfilTO();
		CriteriosPerfilTO criterioPerfilTo = new CriteriosPerfilTO();
		criterioPerfilTo.setPerfilTO(perfilTo);
		ResultadoConsultaPerfilTO resConPerfilTo = new ResultadoConsultaPerfilTO();
		resConPerfilTo = porType.consultarPerfiles(criterioPerfilTo);
		for (PerfilTO perfil: resConPerfilTo.getPerfilTO()) {
			System.out.println(perfil.getId());
			System.out.println(perfil.getNombre());
			System.out.println(perfil.getDescripcion());
			System.out.println(perfil.getEstadoTO().getId());
			System.out.println(perfil.getEstadoTO().getNombre());
			System.out.println(perfil.getEstadoTO().getDescripcion());
			System.out.println("----------*----------*----------");
		}		
	}
	
	/*
	 * Consultar Detalle Subgrupo
	 * Ws :: carterasModelo
	 * Method :: consultarProductoPorCriterios
	 */
	public static ResultadosConsultaProductoTO consultarProductoPorCriteriosMap (Long idSub){
		ResultadosConsultaProductoTO resConsultaProductoTo = new ResultadosConsultaProductoTO();
		try {
			URL url = new URL("http://10.10.115.12:9083/pventasservicios/ws/carterasModeloPubIntWS");
			CarterasModeloPubIntWS_ServiceLocator locator = new CarterasModeloPubIntWS_ServiceLocator();
			CarterasModeloPubIntWS_PortType porType = locator.getCarterasModeloPubIntWSPort(url);
			CriteriosProductoTO criteriosProducto = new CriteriosProductoTO();
			SubGrupoTO subGrupoTo = new SubGrupoTO();
			subGrupoTo.setId(idSub);
			criteriosProducto.setSubGrupoTO(subGrupoTo);
			resConsultaProductoTo = porType.consultarProductoPorCriterios(criteriosProducto);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
		}
		return resConsultaProductoTo;
	}

	/*
	 * Ws :: catalogos
	 * Consultar Grupos :: consultarAgrupadores
	 */ /*
	public static ResultadoConsultaAgrupadorTO consultarAgrupadoresMap(){
		CriteriosAgrupadorTO criteriosAgrupador = new CriteriosAgrupadorTO();
		ResultadoConsultaAgrupadorTO resConsultaAgrupador = new ResultadoConsultaAgrupadorTO();
		try {
			URL url = new URL("http://10.10.115.12:9083/pventasservicios/ws/catalogos");
			CatalogoWS_ServiceLocator locator = new CatalogoWS_ServiceLocator();
			CatalogoWS_PortType porType = locator.getCatalogoWSPort(url);
			resConsultaAgrupador = porType.consultarAgrupadores(criteriosAgrupador);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		} catch (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception e) {
			System.out.println(e.getMessage());
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
		}
		return resConsultaAgrupador;
	} */
	
	/*
	 * Ws :: catalogos
	 * Consultar Subgrupos de Grupo :: consultarDetalleAgrupador
	 */ /*
	public static AgrupadorTO consultarDetalleAgrupadorMap(Long idGroup){
		AgrupadorTO agrupadorTo = new AgrupadorTO();
		try {
			URL url = new URL("http://10.10.115.12:9083/pventasservicios/ws/catalogos");
			CatalogoWS_ServiceLocator locator = new CatalogoWS_ServiceLocator();
			CatalogoWS_PortType porType = locator.getCatalogoWSPort(url);
			agrupadorTo.setId(Long.valueOf(idGroup));
			agrupadorTo = porType.consultarDetalleAgrupador(agrupadorTo);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		} catch (mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Exception e) {
			System.out.println(e.getMessage());
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
		}
		return agrupadorTo;
	} */
	
	public static void main(String[] args) throws ServiceException, MalformedURLException, Exception, RemoteException {
		
		Long idSub =(long) 986;
		ResultadosConsultaProductoTO resConsultaProductoTo = new ResultadosConsultaProductoTO();
		resConsultaProductoTo = MainTestWs.consultarProductoPorCriteriosMap(idSub);
		Gson gson = new Gson();
		String myObjGson = gson.toJson(resConsultaProductoTo);
		System.out.println(myObjGson);
		
//		ResultadoConsultaAgrupadorTO resConsultaAgrupador = new ResultadoConsultaAgrupadorTO();
//		resConsultaAgrupador = MainTestWs.consultarAgrupadoresMap();
//		List<GruposVo> listGrps = new ArrayList<GruposVo>();
//		for (AgrupadorTO agrupadorGrp : resConsultaAgrupador.getAgrupadoresTO()) {
//			GruposVo gruposVo = new GruposVo();
//			gruposVo.setGrpId(agrupadorGrp.getId().toString());
//			gruposVo.setGrpName(agrupadorGrp.getNombre());
//			AgrupadorTO agrupadorSubGrp = new AgrupadorTO();
//			agrupadorSubGrp = MainTestWs.consultarDetalleAgrupadorMap(agrupadorGrp.getId());
//			List<SubGruposVo> listSubs = new ArrayList<SubGruposVo>();
//			for (SubGrupoTO subGrpMap : agrupadorSubGrp.getSubGrupos()) {
//				SubGruposVo subGrupoV0 = new SubGruposVo();
//				subGrupoV0.setSubGrpId(subGrpMap.getId().toString());
//				subGrupoV0.setSubGrpName(subGrpMap.getNombre());
//				listSubs.add(subGrupoV0);
//			}
//			gruposVo.setListSubGrupos(listSubs);
//			listGrps.add(gruposVo);
//		}
		
	}

}
