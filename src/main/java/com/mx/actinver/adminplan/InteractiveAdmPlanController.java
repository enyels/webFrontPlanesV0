package com.mx.actinver.adminplan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.axis.types.Language;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.mx.actinver.adminplan.operation.ConsumeWsCatalogo;
import com.mx.actinver.adminplan.operation.ConsumeWsPlanesComer;
import com.mx.actinver.adminplan.vo.GruposVo;
import com.mx.actinver.adminplan.vo.SubGruposVo;

import mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ResultadosConsultaProductoTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ResultadoConsultaAgrupadorTO;
import mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO;
import mx.com.actinver.services.soap.LangType;
import mx.com.actinver.services.soap.PlanDetDtoRq;
import mx.com.actinver.services.soap.PlanDtoRs;
import mx.com.actinver.services.soap.PlanesDtoRs;
import mx.com.actinver.services.soap.PlansDesactiveDtoRq;
import mx.com.actinver.services.soap.PlansUpdateDtoRq;

@Controller
@RequestMapping("/InteractiveAdmPlanController")
public class InteractiveAdmPlanController {
	
	private static final Logger logger = LoggerFactory.getLogger(InteractiveAdmPlanController.class);

	@RequestMapping(value="/actionCheckExist", method=RequestMethod.GET)
	public String appCheckExist (HttpServletRequest request) throws IOException{
		logger.info("[Controller]	::	appCheckExist	-	[Method]");
		String viewPage  = "";
		HttpSession session = request.getSession(true);
		if(request.getParameter("valLgnUsr").equals("111111111") && request.getParameter("valLgnPwd").equals("111111111")){
			session.setAttribute("nameUsr", "111111111");
			session.setAttribute("nameDes", "Descripcion de 111111111.");
			viewPage = "/adminPlan/welAdmPlan";
		} else if(request.getParameter("valLgnUsr").equals("222222222") && request.getParameter("valLgnPwd").equals("222222222")){
			session.setAttribute("nameUsr", "222222222");
			session.setAttribute("nameDes", "Descripcion de 222222222.");
			viewPage = "/adminPlan/welAdmPlan";
		} else {
			viewPage = "";
		}
		return viewPage;
	}

	@RequestMapping(value="/actionObtainOpc1", method=RequestMethod.GET)
	public String appObtainOpc1 (HttpServletRequest request, HttpServletResponse response) throws IOException{
		logger.info("[Controller]	::	appObtainOpc1	-	[Method]");
		String viewPage  = "";
		viewPage = "/adminPlan/opcUno";
		return viewPage;
	}
	
	@RequestMapping(value="/actionObtainOpc2", method=RequestMethod.GET)
	public String appObtainOpc2 (HttpServletRequest request, HttpServletResponse response) throws IOException{
		logger.info("[Controller]	::	appObtainOpc2	-	[Method]");
		String viewPage  = "";
		viewPage = "/adminPlan/opcDos";
		return viewPage;
	}

	@RequestMapping(value="/actionObtainOpc3", method=RequestMethod.GET)
	public String appObtainOpc3 (HttpServletRequest request, HttpServletResponse response) throws IOException{
		logger.info("[Controller]	::	appObtainOpc3	-	[Method]");
		String viewPage  = "";
		viewPage = "/adminPlan/opcTres";
		return viewPage;
	}

	@RequestMapping(value="/actionObtainOpc4", method=RequestMethod.GET)
	public String appObtainOpc4 (HttpServletRequest request, HttpServletResponse response) throws IOException{
		logger.info("[Controller]	::	appObtainOpc4	-	[Method]");
		String viewPage  = "";
		viewPage = "/adminPlan/opcCuatro";
		return viewPage;
	}
	
	//===== Ini:: Consume Ws =====//
	
	@RequestMapping(value="/actionGetGrpAndSub", method=RequestMethod.GET)
	@ResponseBody
	public String appGetGrpAndSub(HttpServletRequest request) throws JSONException{
		logger.info("[Controller]	::	appGetGrpAndSub	-	[Method]");
		ResultadoConsultaAgrupadorTO resConsultaAgrupador = new ResultadoConsultaAgrupadorTO();
		resConsultaAgrupador = ConsumeWsCatalogo.consultarAgrupadoresMap();
		List<GruposVo> listGrps = new ArrayList<GruposVo>();
		for (AgrupadorTO agrupadorGrp : resConsultaAgrupador.getAgrupadoresTO()) {
			GruposVo gruposVo = new GruposVo();
			gruposVo.setGrpId(agrupadorGrp.getId().toString());
			gruposVo.setGrpName(agrupadorGrp.getNombre());
			AgrupadorTO agrupadorSubGrp = new AgrupadorTO();
			agrupadorSubGrp = ConsumeWsCatalogo.consultarDetalleAgrupadorMap(agrupadorGrp.getId());
			List<SubGruposVo> listSubs = new ArrayList<SubGruposVo>();
			for (SubGrupoTO subGrpMap : agrupadorSubGrp.getSubGrupos()) {
				SubGruposVo subGrupoV0 = new SubGruposVo();
				subGrupoV0.setSubGrpId(subGrpMap.getId().toString());
				subGrupoV0.setSubGrpName(subGrpMap.getNombre());
				listSubs.add(subGrupoV0);
			}
			gruposVo.setListSubGrupos(listSubs);
			listGrps.add(gruposVo);
		}
		Gson gson = new Gson();
		String myObjJsn = gson.toJson(listGrps);
		return myObjJsn;
	}
	
	@RequestMapping(value="/actionSubDetalle", method=RequestMethod.GET)
	@ResponseBody
	public String appSubDetalle(HttpServletRequest request){
		logger.info("[Controller]	::	appSubDetalle	-	[Method]");
		String idSub = request.getParameter("idSub");
		ResultadosConsultaProductoTO resConsultaProductoTo = new ResultadosConsultaProductoTO();
		resConsultaProductoTo = ConsumeWsCatalogo.consultarProductoPorCriteriosMap(Long.valueOf(idSub));
		Gson gson = new Gson();
		String myObjGson = gson.toJson(resConsultaProductoTo);
		return myObjGson;
	}

	@RequestMapping(value="/actionTerminator", method=RequestMethod.GET)
	@ResponseBody
	public String appTerminator (HttpServletRequest request) throws IOException{
		logger.info("[Controller]	::	appTerminator	-	[Method]");
		String viewPage  = "";
		HttpSession session = request.getSession(true);
		if(session != null) {
			session.invalidate();
			viewPage = "closed";
		} else {
			viewPage = "La sesion ya estaba invalida.";
		}
		Gson gson = new Gson();
		String myObjGson = gson.toJson(viewPage);
		return myObjGson;
	}

	@RequestMapping(value="/actionSendToSaveConf", method=RequestMethod.GET)
	@ResponseBody
	public String appSendToSaveConf (HttpServletRequest request) throws IOException{
		logger.info("[Controller]	::	appSendToSaveConf	-	[Method]");
		@SuppressWarnings("unchecked")
		Enumeration<String> obtainAllVars = request.getParameterNames();
		while (obtainAllVars.hasMoreElements()) {
			String paramkey = (String) obtainAllVars.nextElement();
			String[] paramValueS = request.getParameterValues(paramkey);
			for (int i = 0; i < paramValueS.length; i++) {
				String paramValue = paramValueS[i];
				System.out.println(paramkey);
				System.out.println(paramValue);
			}
		}
		String viewPage = "";
		viewPage = "true";
		Gson gson = new Gson();
		String myObjGson = gson.toJson(viewPage);
		return myObjGson;		
	}
	
	@RequestMapping(value="/actionGetAllPlansComer", method=RequestMethod.GET)
	@ResponseBody
	public String appGetAllPlansComer (HttpServletRequest request){
		logger.info("[Controller]	::	appGetAllPlansComer	-	[Method]");
		PlanesDtoRs planesDtoRs = new PlanesDtoRs();
		planesDtoRs = ConsumeWsPlanesComer.getAllPlansMap();
		Gson gson = new Gson();
		String myObjGson = gson.toJson(planesDtoRs);
		return myObjGson;
	}

	@RequestMapping(value="/actionActDesact", method=RequestMethod.GET)
	@ResponseBody
	public String appActDesact (HttpServletRequest request){
		logger.info("[Controller]	::	appActDesact	-	[Method]");
			HttpSession session = request.getSession();
			System.out.println("Current session User::"+session.getAttribute("nameUsr"));
			System.out.println("Current session Desc::"+session.getAttribute("nameDes"));
		PlansDesactiveDtoRq actDesactDtoRq = new PlansDesactiveDtoRq();
		actDesactDtoRq.setIdPlan(request.getParameter("idPlan"));
		actDesactDtoRq.setLanguage(LangType.fromString("SPA"));
		PlanDtoRs planDtoRs = new PlanDtoRs();
		planDtoRs = ConsumeWsPlanesComer.desactivePlanByIdMap(actDesactDtoRq);
		Gson gson = new Gson();
		String myObjGson = gson.toJson(planDtoRs);
		return myObjGson;
	}

	@RequestMapping(value="/actionGetPlanById", method=RequestMethod.GET)
	@ResponseBody
	public String appGetPlanById (HttpServletRequest request){
		logger.info("[Controller]	::	appGetPlanById	-	[Method]");
		PlanDtoRs planDtoRs = new PlanDtoRs();
		planDtoRs = ConsumeWsPlanesComer.getPlanByIdMap(request.getParameter("idPl2"));
		Gson gson = new Gson();
		String myObjGson = gson.toJson(planDtoRs);
		return myObjGson;
	}
	
	@RequestMapping(value="/actionUpdatePlan", method=RequestMethod.GET)
	@ResponseBody
	public String appUpdatePlan (HttpServletRequest request){
		logger.info("[Controller]	::	appUpdatePlan	-	[Method]");
		PlansUpdateDtoRq plansUpdateRq = new PlansUpdateDtoRq();
		plansUpdateRq.setLanguage(LangType.SPA);
		plansUpdateRq.setIdPlan(request.getParameter("idPlan"));
		plansUpdateRq.setPlan(request.getParameter("plan"));
		plansUpdateRq.setIdEmpresa(Long.parseLong(request.getParameter("idEmpresa")));
		plansUpdateRq.setCosto(Double.valueOf(request.getParameter("costo")));
		plansUpdateRq.setIdperiodicidad(request.getParameter("idperiodicidad"));
		plansUpdateRq.setAsigna(request.getParameter("asigna"));
		plansUpdateRq.setIdCobro(request.getParameter("idCobro"));
		plansUpdateRq.setUsuario(Long.parseLong(request.getParameter("usuario")));
		//plansUpdateRq.setDescripcion(request.getParameter("descripcion"));
		PlanDtoRs planDtoRs = new PlanDtoRs();
		planDtoRs = ConsumeWsPlanesComer.updatePlanByIdMap(plansUpdateRq);
		Gson gson = new Gson();
		String myObjGson = gson.toJson(planDtoRs);
		return myObjGson;
	}

	@RequestMapping(value="/actionNewPlan", method=RequestMethod.GET)
	@ResponseBody
	public String appNewPlan (HttpServletRequest request){
		logger.info("[Controller]	::	appNewPlan	-	[Method]");
		PlanDetDtoRq planDetDtoRq = new PlanDetDtoRq();
		planDetDtoRq.setLanguage(LangType.SPA);
		planDetDtoRq.setPlan(request.getParameter("plan"));
		planDetDtoRq.setIdEmpresa(Long.parseLong(request.getParameter("idEmpresa")));
		planDetDtoRq.setCosto(Double.valueOf(request.getParameter("costo")));
		planDetDtoRq.setIdperiodicidad(request.getParameter("idperiodicidad"));
		planDetDtoRq.setIdAsigna(request.getParameter("idAsigna"));
		planDetDtoRq.setIdCobro(request.getParameter("idCobro"));
		planDetDtoRq.setUsuario(Long.parseLong(request.getParameter("usuario")));
		planDetDtoRq.setDescripcion(request.getParameter("descripcion"));
		PlanDtoRs planDtoRs = new PlanDtoRs();
		planDtoRs = ConsumeWsPlanesComer.savePlanMap(planDetDtoRq);
		Gson gson = new Gson();
		String myObjGson = gson.toJson(planDtoRs);
		return myObjGson;
	}
	
}
