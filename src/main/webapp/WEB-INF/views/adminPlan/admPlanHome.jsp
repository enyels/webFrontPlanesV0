<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="es">
	<head>
		<title>.:Administrar Planes Comerciales:.</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge" /> <!-- WARN::Bridge Bootstrap and IE -->
		<meta charset="utf-8" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="pragma" content="no-cache" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link href="resources/adminPlan/css/bootstrap.css" rel="stylesheet" type="text/css"/>
		<link href="resources/adminPlan/css/SourceSansPro.css" rel="stylesheet" type="text/css" />
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet" />
		<link href="resources/adminPlan/css/estiloAdmPlan.css" rel="stylesheet" type="text/css" />
		<link href="resources/adminPlan/images/favicon.ico" rel="shortcut icon" />
	</head>
	<body>
		<header style="height: 20%;">
			<section class="attrh1" style="height: 10%;">
				<div class="attrSess stlSess">
					<a id="wrapCloseSes" class="stlLink1" style="display: none;"><i class="fa fa-power-off"></i>&nbsp;&nbsp;&nbsp; CERRAR SESIÓN</a>
				</div>
			</section>
			<section class="attrh1 stlBackImg" style="height: 85%; border-bottom: 1px solid #FFF;">
				<div class="attrImgNav1 stlImgNav1">
					<img src="resources/adminPlan/images/logo-actinver.png">
				</div>
						
				<div id="wrapOpcSes" class="attrImgNav2 stlImgNav2" style="display: none;">
					<div class="btn-group btn-group-center attrWrpNav" role="group" aria-label="...">				
						<nav class="navbar navbar-default quitBorderNav" role="navigation">
						   <div class="dropdown" style="color: #FFFFFF !important;">
						      <button type="button" class="navbar-toggle" data-toggle="dropdown" id="admcomer-navbar-collapse" aria-haspopup="true" aria-expanded="true">
						         OPCIONES&nbsp;&nbsp;&nbsp; 
						         <span class="caret"></span>
						      </button>
								<ul class="dropdown-menu" aria-labelledby="admcomer-navbar-collapse">
								    <li><a id="btnUno1" href="#">PLANES</a></li>
								    <li><a id="btnDos2" href="#">PRODUCTOS</a></li>
								    <li><a id="btnTres3" href="#">SERVICIOS</a></li>
								    <li><a id="btnCuatro4" href="#">CUSTOMIZAR</a></li>
								</ul>
						   </div>
						   <div class="collapse navbar-collapse" id="admcomer-navbar-collapse">
						      <ul class="nav navbar-nav">
						         <li>
						         	<a href="#" id="btnUno" class="stlBrdOpc">
						         		PLANES
						         		<br>
									  	<span class="stlSubsOpc">Comerciales</span>
						         	</a>
						         </li>
						         <li>
						         	<a href="#" id="btnDos" class="stlBrdOpc">
						         		PRODUCTOS
						         		<br>
						  				<span class="stlSubsOpc">Ver y Asignar</span>	
						         	</a>
						         </li>
						         <li>
						         	<a href="#" id="btnTres" class="stlBrdOpc">
						         		SERVICIOS
   								  	<br>
									<span class="stlSubsOpc">Ver y Asignar</span>
						         	</a>
						         </li>
						         <li>
						         	<a href="#" id="btnCuatro" class="stlBrdOpc">
						         		CUSTOMIZAR
							  		<br>
								  	<span class="stlSubsOpc">Planes Comerciales</span>
						         	</a>
						         </li>
						      </ul>
						   </div>
						</nav>					
					</div>
				</div>
			</section>
			<section class="attrh1" style="height: 5%;">
				<div id="wrapSubSes" class="attrSubsH1 stlSubsH1" style="display: none; border-bottom: 1px solid #FFFFFF;">
					<label class="attrSubsTxt1" style="color: #FFFFFF">Administración / Planes comerciales</label>
				</div>
			</section>
		</header>

		<section class="wrapMainBody" style="height: 60%;"> 
			<section id="idWrapBody" class="attrWrpIn"> <!-- here dinamy content -->
			
				<div class="col-xs-12 col-sm-6 col-md-8">
					<div class="attrTtl1-1">
						<label class="stlTxtTtl">
						Administración de
					 	<br>
					 	Planes comerciales
					 	</label>
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4">
					<div class="jumbotron attrWrpLog stlWrpLog col-xs-8 col-sm-12">
						<form>
							<label>Inicio de sesi&oacute;n</label>
							<br>
							<br>
							<div class="input-group">
								<span class="input-group-addon" id="basic-addon1"><i class="fa fa-user"></i></span>
								<label for="valLgnUsr"></label>
							  	<input id="valLgnUsr" type="text" class="form-control txtAndNumDos" placeholder="Usuario..." aria-describedby="basic-addon1" maxlength="15">
							</div>
							<br>
							<div class="input-group">
								<span class="input-group-addon" id="basic-addon2"><i class="fa fa-key"></i></span>
								<label for="valLgnPwd"></label>
							  	<input id="valLgnPwd" type="password" class="form-control txtAndNumDos" placeholder="Contraseña..." aria-describedby="basic-addon2" maxlength="15">
							</div>
							<br>
						    <span class="stlPwdUsr"></span>
							<br>
							<br>
							<div class="form-group">
								<button id="btnLgn" type="button" class="btn btn-warning-map" data-loading-text="Ingresando..." autocomplete="off">
									<i class="fa fa-sign-in"></i>&nbsp; Ingresar
								</button>
							</div>
						</form>
					</div>
				</div>

			</section>
		</section>
		
		<footer class="attrMainFot" style="position: fixed; background: #FFFFFF;">
			<section class="attrFot">
				<div class="attrFotLine stlFotLine">
				</div>
				<div class="attrFotC1 stlF1">
					<ul>
                    	<p>
                    		© 2014 Corporación Actinver S.A.B. de C.V.&nbsp; Guillermo González Camarena 1200 Centro de Cd. Santa Fe C.P. 01210 México, D.F. 1103 6699 y del interior de la República 01 800 705 5555.&nbsp;<br>
							<a href="/cs/Actinver/Espanol/Home/docs/TérminosyCondiciones.pdf" target="_blank" style="color:#115EAC">Términos, Condiciones de uso y Privacidad</a>&nbsp;
	                        Síguenos:&nbsp; 
	                        <a href="http://www.facebook.com/Actinver" target="_blank"><i class="fa fa-facebook" style="color: #1b1c1d"></i>&nbsp;</a>
	                        <a href="http://mx.linkedin.com/company/actinver" target="_blank"><i class="fa fa-linkedin" style="color: #1b1c1d"></i>&nbsp;</a>
	                        <a href="http://www.twitter.com/ActinverMx" target="_blank"><i class="fa fa-twitter" style="color: #1b1c1d"></i>&nbsp;</a>
							<a href="http://www.youtube.com/user/actinvermx" target="_blank"><i class="fa fa-youtube-play" style="color: #1b1c1d"></i>&nbsp;</a>
                        </p>  
                    </ul>
			    </div>
			</section>
		</footer>
		
		<!-- Ini :: modal Logout -->
		<div id="modLogout1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="modLgtLabel" data-backdrop="static" data-keyboard="false">
	        <div class="modal-dialog modal-sm">
	            <div class="modal-content">
	                <div class="modal-body">
	                	<div class="jumbotron" style="text-align: center; color: #115eac; background: #FFFFFF; padding: 0; margin: 0;">
	                    	<label class="text-info">Cerrando sesi&oacute;n</label>
							<br>
							<br>
							<i class="fa fa-spinner fa-pulse fa-4x"></i>
						</div>
	                </div>
	            </div>
	        </div>
	    </div>
		<!-- End :: modal Logout -->
		
		<script src="resources/adminPlan/jquery/jquery.min.js"></script>
		<script src="resources/adminPlan/jquery/bootstrap.min.js"></script>
			<script src="resources/adminPlan/jquery/JqueryUiBlocks/jquery-ui-drop.min.js"></script>
		<script src="resources/adminPlan/jquery/jquery.currency.js"></script>
		<script src="resources/adminPlan/jquery/placeholder.js"></script>
		<script src="resources/adminPlan/js/admPlanHome.js"></script>
	</body>
</html>
