<div class="col-md-12">
	<br>
	<br>
	<div class="col-md-12">
		<h5 style="font-weight: bold;"><i class="fa fa-users"></i>&nbsp;&nbsp; Asignar productos a plan comercial</h5>
	</div>
	<hr class="stlsTtlOpc1">
	<form class="form-horizontal">
		<div class="form-group">
			<label class="control-label col-md-3">Plan a relacionar con productos:</label>
			<div class="col-md-4">
				<div class="input-group">
					<span class="input-group-addon"><i class="fa fa-list"></i></span>
					<select class="form-control" id="listOfPlns2">
						<option value="none">Seleccione un plan</option>
					</select>
				</div>
			</div>
		</div>
	</form>
	<nav id="navOptSec2" class="navbar navbar-default stlMainNav" role="navigation" style="display: none;">		
		<div class="navbar-header">
	    	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigationbar1">
			    <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar" style="background-color: #115EAC"></span>
		        <span class="icon-bar" style="background-color: #115EAC"></span>
		        <span class="icon-bar" style="background-color: #115EAC"></span>
		        <span class="icon-bar" style="background-color: #115EAC"></span>
	     	</button>
	    </div>
		<div class="collapse navbar-collapse col-md-12" id="navigationbar1">
			<ul class="nav nav-pills nav-justified">
			  <li role="presentation">
			  	<a href="#" id="planOpc1">
			  		<i class="fa fa-line-chart fa-3x"></i>
			  		<br> FONDOS DE INVERSI&Oacute;N
			  		<hr class="stlHrBtn2">
                   	<span class="stlSubTtl">Invierta su dinero en nuestra amplia gama de Fondos.</span>
			  	</a>
			  </li>
			  <li role="presentation">
			  	<a href="#" id="planOpc2">
			  		<i class="fa fa-bar-chart fa-3x"></i>
			  		<br> MERCADO DE CAPITALES
			  		<hr class="stlHrBtn2">
                   	<span class="stlSubTtl">Invierta directamente en acciones a trav&eacute;s de la bolsa Mexicana de valores.</span>
			  	</a>
			  </li>
			  <li role="presentation">
			  	<a href="#" id="planOpc3">
			  		<i class="fa fa-money fa-3x"></i>
			  		<br> MERCADO DE DINERO
			  		<hr class="stlHrBtn2">
                   	<span class="stlSubTtl">Invierta su dinero a plazo fijo con una atractiva tasa de interes.</span>
			  	</a>
			  </li>
			  <li role="presentation">
			  	<a href="#" id="planOpc4">
			  		<i class="fa fa-cc-mastercard fa-3x"></i>
			  		<br> SERVICIOS BANCARIOS
			  		<hr class="stlHrBtn2">
                   	<span class="stlSubTtl">Haga cualquier transacci&oacute;n desde su portal.</span>
			  	</a>
			  </li>
			  <li role="presentation">
			  	<a href="#" id="planOpc5">
			  		<i class="fa fa-plus-square fa-3x"></i>
			  		<br> PLUS DE INVERSI&Oacute;N
			  		<hr class="stlHrBtn2">
                  	<span class="stlSubTtl">Haga cualquier transacci&oacute;n desde su portal.</span>
				</a>
			  </li>
			</ul>
		</div>
	</nav>
	<div class="col-md-12">
		<h5 class="col-xs-7 col-sm-8 col-md-10" style="font-weight: bold;" id="subTitleOpc2"></h5>
		<button id="btnSvCnfGen" class="btn btn-warning-map" type="button" data-loading-text="Guardando..." autocomplete="off" style="display: none; margin-bottom: 8px;">
			<i class="fa fa-floppy-o"></i>&nbsp; Guardar Configuraci&oacute;n
		</button>
	</div>
	<hr class="stlsTtlOpc1">
	<div id="wrapOfOpc" class="col-md-12" style="overflow: auto;">
		<table id="tblOpc1" class="attrTabOpc1 table table-hover" style="display: none;">
			<colgroup>
				<col style="width: 15%;">
				<col style="width: 60%;">
				<col style="width: 25%;">
			</colgroup>
			<thead>
				<tr>
					<th>Grupo</th>
					<th>Sub-grupo</th>
					<th>Agregar</th>
				</tr>
			</thead>
			<tbody id="bodyTableOpc1">
				<!-- Here Content Dinamy -->
			</tbody>
		</table> <!-- end::tblOpc1 -->
		
		<table id="tblOpc2" class="attrTabOpc1 table table-hover" style="display: none;">
			<colgroup>
				<col style="width: 15%;">
				<col style="width: 60%;">
				<col style="width: 25%;">
			</colgroup>
			<thead>
				<tr>
					<th>Grupo</th>
					<th>Sub-grupo</th>
					<th>Agregar</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="stlSecHeadTab">Deuda</td>
					<td class="stlSecHeadTab"></td>
					<td class="stlSecHeadTab">
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="radio" value=""> Agregar Todas
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Seleccionar 
								</label>
							</div>
						</div>
					</td>
				</tr>					
				<tr>
					<td></td>
					<td>Fondos de inversion Deuda</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>Fondos de inversion Deuda Gubernamental</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
			</tbody>
		</table><!-- end::tblOpc2 -->
		<table id="tblOpc3" class="attrTabOpc1 table table-hover" style="display: none;">
			<colgroup>
				<col style="width: 15%;">
				<col style="width: 60%;">
				<col style="width: 25%;">
			</colgroup>
			<thead>
				<tr>
					<th>Grupo</th>
					<th>Sub-grupo</th>
					<th>Agregar</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="stlSecHeadTab">Fibras</td>
					<td class="stlSecHeadTab"></td>
					<td class="stlSecHeadTab">
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="radio" value=""> Agregar Todas
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Seleccionar 
								</label>
							</div>
						</div>
					</td>
				</tr>					
				<tr>
					<td></td>
					<td>Fondos de inversion</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
			</tbody>
		</table> <!-- end::tblOpc3 -->
		<table id="tblOpc4" class="attrTabOpc1 table table-hover" style="display: none;">
			<colgroup>
				<col style="width: 15%;">
				<col style="width: 60%;">
				<col style="width: 25%;">
			</colgroup>
			<thead>
				<tr>
					<th>Grupo</th>
					<th>Sub-grupo</th>
					<th>Agregar</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="stlSecHeadTab">Riesgo Cambiario</td>
					<td class="stlSecHeadTab"></td>
					<td class="stlSecHeadTab">
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="radio" value=""> Agregar Todas
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Seleccionar 
								</label>
							</div>
						</div>
					</td>
				</tr>					
				<tr>
					<td></td>
					<td>Fondos de inversion deuda corto plazo</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>Fondos de inversion deuda largo plazo</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>Fondos de inversion deuda mediano plazo</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>Fondos de inversion renta variable</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>
			</tbody>
		</table> <!-- end::tblOpc4 -->
		<table id="tblOpc5" class="attrTabOpc1 table table-hover" style="display: none;">
			<colgroup>
				<col style="width: 15%;">
				<col style="width: 60%;">
				<col style="width: 25%;">
			</colgroup>
			<thead>
				<tr>
					<th>Grupo</th>
					<th>Sub-grupo</th>
					<th>Agregar</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="stlSecHeadTab">Fondo de Fondos</td>
					<td class="stlSecHeadTab"></td>
					<td class="stlSecHeadTab">
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="radio" value=""> Agregar Todas
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Seleccionar 
								</label>
							</div>
						</div>
					</td>
				</tr>					
				<tr>
					<td></td>
					<td>ACTIVCO</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>	
				<tr>
					<td></td>
					<td>ACTIVCR</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>	
				<tr>
					<td></td>
					<td>ACTIVPA</td>
					<td>
						<div style="text-align: center;">
							<div class="checkbox stlCheckRadio">
								<label> 
									<input type="checkbox" value=""> Agregar Todos
								</label>
							</div>
							<div class="radio stlCheckRadio">
								<label> 
									<input type="radio" name="opciones" value="opcion_1">Escoger detalle 
								</label>
							</div>
						</div>
					</td>
				</tr>	
			</tbody>
		</table> <!-- end::tblOpc5 -->
		
<!-- 		<div id="contentOpc1_1" style="display: none;"> -->
<!-- 			<h3>Aqui que va opcion 1.1</h3> -->
<!-- 		</div> -->
<!-- 		<div id="contentOpc2" style="display: none;"> -->
<!-- 			<h3>Aqui que va opcion 2</h3> -->
<!-- 		</div> -->
<!-- 		<div id="contentOpc3" style="display: none;"> -->
<!-- 			<h3>Aqui que va opcion 3</h3> -->
<!-- 		</div> -->
<!-- 		<div id="contentOpc4" style="display: none;"> -->
<!-- 			<h3>Aqui que va opcion 4</h3> -->
<!-- 		</div> -->
<!-- 		<div id="contentOpc5" style="display: none;"> -->
<!-- 			<h3>Aqui que va opcion 5</h3> -->
<!-- 		</div> -->
<!-- 		<br> -->
<!-- 		<br> -->
	</div>
</div>

<script src="resources/adminPlan/js/opcDos.js"></script>