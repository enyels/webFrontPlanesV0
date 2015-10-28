<div class="col-md-12">
	<br>
	<br>
	 	<div class="col-md-12">
		<h5 style="font-weight: bold;"><i class="fa fa-users"></i>&nbsp;&nbsp; Asignar plan a contratos</h5>
	</div>
	<hr class="stlsTtlOpc1">
	<div class="container">
		<div class="col-xs-12 col-sm-6 col-md-6">
			<br>
			<br>
			<form role="form-vertical">
				<div class="form-group">
					<label class="control-label">Seleccione el plan:</label>
					<br>
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-file-text"></i></span>
						<select class="form-control" id="listOfPlns4">
							<option selected value="none">Planes disponibles</option>
						</select>
					</div>
					<span style="display: none;" class="stlPwdUsr msgErr4_1">*Campo requerido.</span>
				</div>
				<br>
				<br>
				<div class="form-group">
					<label class="control-label">Añadir contrato:</label>
					<br>
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-pencil-square"></i></span>
						<input type="text" class="form-control onlyNum" id="numberContract" maxlength="25" placeholder="Ingresa contrato...">
					</div>
					<span style="display: none;" class="stlPwdUsr msgErr4_2">*Campo requerido.</span>
				</div>
				<br>
				<br>
				<div class="areaBtnSav3">
					<button id="btnAdd4" type="button" class="btn btn-primary-map" data-loading-text="Añadiendo..." autocomplete="off">
						<i class="fa fa-paper-plane"></i>&nbsp; Añadir
					</button>
					<br>
					<br>
				</div>				
			</form>
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6">
			<br>
			<br>
			<div class="jumbotron">
			  <div class="container">
					<table class="attrTabOpc1 table table-hover">
						<colgroup>
							<col style="width: 50%;">
							<col style="width: 50%;">
						</colgroup>
						<thead colspan="3">
							<tr>
								<th colspan="3" style="border-bottom: 2px solid #115EAC !important;">Asignaci&oacute;n de contratos</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th style="border-bottom: 2px solid #115EAC !important;">Contrato</th>
								<th style="border-bottom: 2px solid #115EAC !important;">Plan Comercial</th>
							</tr>
						</thead>
						<tfoot colspan="3">
							<tr>
								<th colspan="3"></th>
							</tr>
							<tr>
								<th colspan="3" style="text-align: left; border-top: 0 solid #ddd;"><span id="numOfCntrts4"></span> Contrato(s) añadidos</th>
							</tr>
						</tfoot>
						<tbody id="cntrtAdd4" style="border-bottom: 2px solid #115EAC !important;">
						</tbody>
					</table>
				</div>
			</div>
		</div> 
	</div>
</div>
<script src="resources/adminPlan/js/opcCuatro.js"></script>