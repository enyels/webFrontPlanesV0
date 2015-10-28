<div class="col-md-12">
	<br>
	<br>
	<div class="col-md-12">
		<h5 style="font-weight: bold;"><i class="fa fa-suitcase"></i>&nbsp;&nbsp; Definici&oacute;n de planes comerciales &nbsp;&nbsp;<a id="lnkAddPlan" href="#"><i class="fa fa-plus-circle"></i></a> </h5>
	</div>
	<hr class="stlsTtlOpc1">
	
	<div class="col-md-12" style="overflow: auto; display: block;">
		<table class="attrTabOpc1 table table-hover">
			<colgroup>
				<col style="width: 20%;">
				<col style="width: 25%;">
				<col style="width: 20%;">
				<col style="width: 10%;">
				<col style="width: 10%;">
				<col style="width: 15%;">
			</colgroup>
			<thead>
				<tr>
					<th>Plan Comercial</th>
					<th>Descripci&oacute;n</th>
					<th>Estatus</th>
					<th>Costo</th>
					<th>Editar</th>
					<th>Activar / Desactivar</th>
				</tr>
			</thead>
			<tbody id="tbodyOpc1">
				<!-- Diname Content -->
			</tbody>
		</table>
	</div>
	<br>
	<br>
	<br>
</div>

<div class="modal fade" id="modOpc1" tabindex="-1" role="dialog" aria-labelledby="modOpc1Label" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="modOpc1Label"><i class="fa fa-suitcase"></i>&nbsp;&nbsp; Agregar Plan</h4>
			</div>
			<div class="modal-body">
				<form>
					<div class="form-group">
						<label class="control-label">Nombre:</label>
						<input type="text" id="nombrePl1" class="form-control txtAndNumSpac" maxlength="15" placeholder="Nombre del plan..."></input>
						<span style="display: none;" class="stlPwdUsr msgErr1">*Campo requerido.</span>
					</div>
					<div class="form-group">
						<label class="control-label">Descripcion:</label>
						<input type="text" id="descPl1" class="form-control txtAndNumSpac" maxlength="50" placeholder="Descripción del plan..."></input>
						<span style="display: none;" class="stlPwdUsr msgErr2">*Campo requerido.</span>
					</div>
					<div class="form-group">
						<label class="control-label">Costo:</label>
						<input type="text" id="costoPl1" class="form-control onlyNum" maxlength="15" placeholder="Costo del plan..."></input>
						<span style="display: none;" class="stlPwdUsr msgErr3">*Campo requerido.</span>
					</div>
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label class="control-label">Empresa:</label> 
										<select class="form-control" id="idEmpresa1">
											<option value="none">Empresa...</option>
											<option value="1">Empresa 1</option>
										</select>
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label class="control-label">Periodicidad:</label> 
										<select class="form-control" id="idPeriod1">
											<option value="none">Periodicidad...</option>
											<option value="me">Mensual</option>
										</select>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label class="control-label">Asignaci&oacute;n:</label>
										<select class="form-control" id="idAsigna1">
											<option value="none">Asignado a...</option>
											<option value="107">Asignado 107</option>
										</select>
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label class="control-label">Cobro:</label>
										<select class="form-control" id="idCobro1">
											<option value="none">Cobro...</option>
											<option value="12">Cobro 12</option>
										</select>
									</div>
								</div>
							</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
				<button type="button" id="savePl1" class="btn btn-primary">Guardar</button>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="modOpc1_1" tabindex="-1" role="dialog" aria-labelledby="modOpc1_1Label" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="modOpc1_1Label">
					<i class="fa fa-pencil-square"></i>&nbsp;&nbsp; Editar Plan: <strong id="namePlanHd" data-idplanmod=""></strong>
				</h4>
			</div>
			<div class="modal-body">
				<form>
					<div class="form-group">
						<label class="control-label">Nombre:</label>
						<input id="nombrePl2" type="text" class="form-control txtAndNumSpac" maxlength="30"></input>
						<span style="display: none;" class="stlPwdUsr msgErr4">*Campo requerido.</span>
					</div>
					<div class="form-group">
						<label class="control-label">Descripcion:</label>
						<input id="descPl2" type="text" class="form-control txtAndNumSpac" maxlength="50"></input>
						<span style="display: none;" class="stlPwdUsr msgErr5">*Campo requerido.</span>
					</div>
					<div class="form-group">
						<label class="control-label">Costo:</label>
						<input id="costoPl2" type="text" class="form-control onlyNum" maxlength="15"></input>
						<span style="display: none;" class="stlPwdUsr msgErr6">*Campo requerido.</span>
					</div>
<!-- 						<div class="row"> -->
<!-- 							<div class="col-xs-6 col-sm-6 col-md-6">					 -->
<!-- 								<div class="form-group"> -->
<!-- 									<label class="control-label">Empresa:</label> -->
<!-- 									<select class="form-control" id="idEmpresa"> -->
<!-- 										<option value="none">Empresa...</option> -->
<!-- 										<option value="1">Empresa 1</option> -->
<!-- 									</select> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="col-xs-6 col-sm-6 col-md-6"> -->
<!-- 								<div class="form-group"> -->
<!-- 									<label class="control-label">Periodicidad:</label> -->
<!-- 									<select class="form-control" id="idPeriod"> -->
<!-- 										<option value="none">Periodicidad...</option> -->
<!-- 										<option value="me">Mensual</option> -->
<!-- 									</select> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 						</div> -->
<!-- 						<div class="row"> -->
<!-- 							<div class="col-xs-6 col-sm-6 col-md-6">					 -->
<!-- 								<div class="form-group"> -->
<!-- 									<label class="control-label">Asignaci&oacute;n:</label> -->
<!-- 									<select class="form-control" id="idAsigna"> -->
<!-- 										<option value="none">Asignado a...</option> -->
<!-- 										<option value="107">Asignado 107</option> -->
<!-- 									</select> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="col-xs-6 col-sm-6 col-md-6"> -->
<!-- 								<div class="form-group"> -->
<!-- 									<label class="control-label">Cobro:</label> -->
<!-- 									<select class="form-control" id="idCobro"> -->
<!-- 										<option value="none">Cobro...</option> -->
<!-- 										<option value="12">Cobro 12</option> -->
<!-- 									</select> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 						</div> -->
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
				<button id="saveEdit2" type="button" class="btn btn-primary">Guardar</button>
			</div>
		</div>
	</div>
</div>

<script src="resources/adminPlan/js/opcUno.js"></script>