package com.mx.actinver.adminplan.operation;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.com.actinver.services.soap.CommercialPlansBoDelegate;
import mx.com.actinver.services.soap.CommercialPlansLocator;
import mx.com.actinver.services.soap.PlanDetDtoRq;
import mx.com.actinver.services.soap.PlanDtoRs;
import mx.com.actinver.services.soap.PlanesDtoRs;
import mx.com.actinver.services.soap.PlansDesactiveDtoRq;
import mx.com.actinver.services.soap.PlansUpdateDtoRq;

public class ConsumeWsPlanesComer {

	private static final Logger logger = LoggerFactory.getLogger(ConsumeWsPlanesComer.class);
	
	/*
	 * Ws :: CommercialPlans
	 * Consultar Todos Los Planes Comerciales :: getAllPlans
	 */
	public static PlanesDtoRs getAllPlansMap(){
		PlanesDtoRs planesDtoRs = new PlanesDtoRs();
		try {
			ResourceBundle rb = ResourceBundle.getBundle("configprop");
			URL url = new URL(rb.getString("URLWS_PLNSCMR_LOC"));
			CommercialPlansLocator locator = new CommercialPlansLocator();
			CommercialPlansBoDelegate porType = locator.getCommercialPlansServicePort(url);
			planesDtoRs = porType.getAllPlans();
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	getAllPlansMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	getAllPlansMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	getAllPlansMap	-	[Method] - "+e.getMessage());
		}
		return planesDtoRs;
	}

	/*
	 * Ws :: CommercialPlans
	 * Activar o desactivar plan :: desactivePlanById
	 */
	public static PlanDtoRs desactivePlanByIdMap(PlansDesactiveDtoRq actDesactDtoRq){
		PlanDtoRs planDtoRs = new PlanDtoRs();
		try {
			ResourceBundle rb = ResourceBundle.getBundle("configprop");
			URL url = new URL(rb.getString("URLWS_PLNSCMR_LOC"));
			CommercialPlansLocator locator = new CommercialPlansLocator();
			CommercialPlansBoDelegate porType = locator.getCommercialPlansServicePort(url);
			planDtoRs = porType.desactivePlanById(actDesactDtoRq);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	desactivePlanByIdMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	desactivePlanByIdMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	desactivePlanByIdMap	-	[Method] - "+e.getMessage());
		}
		return planDtoRs;
	}

	/*
	 * Ws :: CommercialPlans
	 * Obtener Info plan por ID :: getPlanById
	 */
	public static PlanDtoRs getPlanByIdMap(String idPl2){
		PlanDtoRs planDtoRs = new PlanDtoRs();
		try {
			ResourceBundle rb = ResourceBundle.getBundle("configprop");
			URL url = new URL(rb.getString("URLWS_PLNSCMR_LOC"));
			CommercialPlansLocator locator = new CommercialPlansLocator();
			CommercialPlansBoDelegate porType = locator.getCommercialPlansServicePort(url);
			planDtoRs = porType.getPlanById(idPl2);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	getPlanByIdMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	getPlanByIdMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	getPlanByIdMap	-	[Method] - "+e.getMessage());
		}
		return planDtoRs;
	}

	/*
	 * Ws :: CommercialPlans
	 * Actualizar plan :: updatePlanById
	 */
	public static PlanDtoRs updatePlanByIdMap(PlansUpdateDtoRq plansUpdateRq){
		PlanDtoRs planDtoRs = new PlanDtoRs();
		try {
			ResourceBundle rb = ResourceBundle.getBundle("configprop");
			URL url = new URL(rb.getString("URLWS_PLNSCMR_LOC"));
			CommercialPlansLocator locator = new CommercialPlansLocator();
			CommercialPlansBoDelegate porType = locator.getCommercialPlansServicePort(url);
			planDtoRs = porType.updatePlanById(plansUpdateRq);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	updatePlanByIdMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	updatePlanByIdMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	updatePlanByIdMap	-	[Method] - "+e.getMessage());
		}
		return planDtoRs;
	}

	/*
	 * Ws :: CommercialPlans
	 * Actualizar plan :: updatePlanById
	 */
	public static PlanDtoRs savePlanMap(PlanDetDtoRq planDetDtoRq){
		PlanDtoRs planDtoRs = new PlanDtoRs();
		try {
			ResourceBundle rb = ResourceBundle.getBundle("configprop");
			URL url = new URL(rb.getString("URLWS_PLNSCMR_LOC"));
			CommercialPlansLocator locator = new CommercialPlansLocator();
			CommercialPlansBoDelegate porType = locator.getCommercialPlansServicePort(url);
			planDtoRs = porType.savePlan(planDetDtoRq);
		} catch (MalformedURLException e) {
			logger.info("[Controller]	::	savePlanMap	-	[Method] - "+e.getMessage());
		} catch (ServiceException e) {
			logger.info("[Controller]	::	savePlanMap	-	[Method] - "+e.getMessage());
		} catch (RemoteException e) {
			logger.info("[Controller]	::	savePlanMap	-	[Method] - "+e.getMessage());
		}
		return planDtoRs;
	}
	
}
