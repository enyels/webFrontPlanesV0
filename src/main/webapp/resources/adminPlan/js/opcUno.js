$(document).ready(function() {

	$('input, textarea').placeholder();

	$('.txtAndNumDos').bind('keypress', function (event) {		
		var regex = new RegExp("^[a-zA-Z0-9]+$");
		var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
		if (!regex.test(key)) {   						
			event.preventDefault();						
			return false;						
		}		
	});
	
	$('.txtAndNumSpac').bind('keypress', function (event) {		
		var regex = new RegExp("^[a-zA-Z0-9 ]+$");
		var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
		if (!regex.test(key)) {   						
			event.preventDefault();						
			return false;						
		}		
	});
	
	$('.onlyNum').bind('keypress', function (event) {						
	    var regex = new RegExp("^[0-9]+$");						
	    var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);						
	    if (!regex.test(key) && event.charCode!=0 ) {   						
	       event.preventDefault();						
	       return false;						
	    }						
	});
	
	$('#tbodyOpc1').empty();
	var theId = "";
	
	$.ajax({
		url: 'InteractiveAdmPlanController/actionGetAllPlansComer',
		beforeSend : function(xhr) {
            xhr.setRequestHeader('Accept', 'text/html; charset=utf-8');
        },
		dataType: 'json',
		type: 'get'
	}).done(function(data){
		var containsVal = data.hasOwnProperty('planes');
		if (containsVal) {
			
			$.each(data.planes, function(index, value){
				if(value.estatus == 1){
					$('#tbodyOpc1').prepend('<tr>'+
												'<td id="nm-'+(value.idPlan)+'">'+value.plan+'</td>'+
												'<td id="ds-'+(value.idPlan)+'">'+value.descripcion+'</td>'+
												'<td id="st-'+(value.idPlan)+'">'+"Activo"+'</td>'+
												'<td id="cs-'+(value.idPlan)+'">'+value.costo+'</td>'+
												'<td>'+
													'<a id="ed-'+(value.idPlan)+'" class="allmods1" style="color: #fcc82f;" href="#">'+
														'<i class="fa fa-pencil fa-lg"></i>'+
													'</a>'+
												'</td>'+
												'<td>'+
													'<a id="ad-'+(value.idPlan)+'" data-toggle="tooltip" title="" class="allmods2" href="#">'+
														'<i class="fa fa-check fa-lg colorAct"></i>'+
													'</a>'+
												'</td>'+
											'</tr>');
				} else if(value.estatus == 0) {                                                                                                                                                                                                                                                                                                                                                                                   
					$('#tbodyOpc1').prepend('<tr>'+
												'<td id="nm-'+(value.idPlan)+'">'+value.plan+'</td>'+
												'<td id="ds-'+(value.idPlan)+'">'+value.descripcion+'</td>'+
												'<td id="st-'+(value.idPlan)+'">'+"Inactivo"+'</td>'+
												'<td id="cs-'+(value.idPlan)+'">'+value.costo+'</td>'+
												'<td>'+
													'<a id="ed-'+(value.idPlan)+'" class="allmods1" style="color: #fcc82f;" href="#">'+
														'<i class="fa fa-pencil fa-lg"></i>'+
													'</a>'+
												'</td>'+
												'<td>'+
													'<a id="ad-'+(value.idPlan)+'" data-toggle="tooltip" title="" class="allmods2" href="#">'+
														'<i class="fa fa-times fa-lg colorDesact"></i>'+
													'</a>'+
												'</td>'+
											'</tr>');
				}
			});
			$('.allmods2').on('click', function(e) {
				e.preventDefault();
				var idToActDes = $(this).attr('id');
				fnAllMods2(idToActDes);
			});
			
			$('.allmods1').on('click', function(e) {
				e.preventDefault();
				var idToEdit = $(this).attr('id');
				fnAllMods1(idToEdit);	
			});
			
		} else {
			console.log("Propiedad PLANES no existe.");
		}
	}).fail(function(e){
		console.log("e::"+e.status);
	});

	$('#lnkAddPlan').click(function(e) {
		e.preventDefault();
		$('#nombrePl1').val('');
		$('#descPl1').val('');
		$('#costoPl1').val('');
		$("#modOpc1").modal('show');
	});
	
	$('#savePl1').click(function(e){
		e.preventDefault();
		var ex1 = true, ex2 = true, ex3 = true;
		var nombrePl1 = $('#nombrePl1').val().trim();
		var descPl1 = $('#descPl1').val().trim();
		var costoPl1 = $('#costoPl1').val().trim();
		
		var valEmpresa1 = $("#idEmpresa1 option:selected").val();
		var valPeriod1 = $("#idPeriod1 option:selected").val();
		var valAsigna1 = $("#idAsigna1 option:selected").val();
		var valCobro1 = $("#idCobro1 option:selected").val();
		
		if (nombrePl1.length == 0) {
			ex1 = false;
			$('.msgErr1').show();
		} else {
			$('.msgErr1').hide();
		}
		
		if (descPl1.length == 0) {
			ex2 = false;
			$('.msgErr2').show();
		} else {
			$('.msgErr2').hide();
		}

		if (costoPl1.length == 0) {
			ex3 = false;
			$('.msgErr3').show();
		} else {
			$('.msgErr3').hide();
		}
		
		if (ex1) {
			if (ex2) {
				if (ex3) {
					var objNvoPlan = {
						'plan': nombrePl1,
						'idEmpresa': valEmpresa1,
						'costo': costoPl1,
						'idperiodicidad': valPeriod1,
						'idAsigna': valAsigna1,
						'idCobro': valCobro1,
						'usuario': sessionStorage.getItem('userNameCr'),
						'descripcion': descPl1
					};
					$.ajax({
						url: 'InteractiveAdmPlanController/actionNewPlan',
						beforeSend: function(xhr){
							xhr.setRequestHeader('Accept', 'text/html; charset=utf-8');
						},
						data: objNvoPlan,
						dataType: 'json',
						type: 'get'
					}).done(function(data){
						
						$('#tbodyOpc1').prepend('<tr>'+
								'<td id="nm-'+data.idPlan+'">'+data.plan+'</td>'+
								'<td id="ds-'+data.idPlan+'">'+data.descripcion+'</td>'+
								'<td id="st-'+data.idPlan+'">Activo</td>'+
								'<td id="cs-'+data.idPlan+'">'+data.costo+'</td>'+
								'<td>'+
									'<a id="ed-'+data.idPlan+'" class="allmods11" style="color: #fcc82f;" href="#">'+
										'<i class="fa fa-pencil fa-lg"></i>'+
									'</a>'+
								'</td>'+
								'<td>'+
									'<a id="ad-'+data.idPlan+'" data-toggle="tooltip" title="" class="allmods22" href="#">'+
										'<i class="fa fa-check fa-lg colorAct"></i>'+
									'</a>'+
								'</td>'+
							'</tr>');
						var idAtach1 = "ed-"+data.idPlan;
						$('#'+idAtach1).click(function(e) {
							e.preventDefault();
							var idToEdit = $(this).attr('id');
							fnAllMods1(idToEdit);
						});
						var idAtach2 = "ad-"+data.idPlan;
						$('#'+idAtach2).click(function(e) {
							e.preventDefault();
							var idToActDes = $(this).attr('id');
							fnAllMods2(idToActDes);
						});
						$("#modOpc1").modal('hide');
						
					}).fail(function(e) {
						console.log("No fue posible crear el nuevo plan");
					});
				} //ex3
			} //ex2
		} //ex1
		
	});
	
	$('#saveEdit2').click(function(e) {
		e.preventDefault();
		var ex1 = true, ex2 = true, ex3 = true;
		var idPl2 = $('#namePlanHd').attr('data-idplanmod');
		var nombrePl2 = $('#nombrePl2').val().trim();
		var descPl2 = $('#descPl2').val().trim();
		var costoPl2 = $('#costoPl2').val().trim();
		
		if (nombrePl2.length == 0) {
			ex1 = false;
			$('.msgErr4').show();
		} else {
			$('.msgErr4').hide();
		}
		
		if (descPl2.length == 0) {
			ex2 = false;
			$('.msgErr5').show();
		} else {
			$('.msgErr5').hide();
		}

		if (costoPl2.length == 0) {
			ex3 = false;
			$('.msgErr6').show();
		} else {
			$('.msgErr6').hide();
		}
		
		if (ex1) {
			if (ex2) {
				if (ex3) {
					var objPlanById = {
							'idPl2': idPl2
					};
					$.ajax({
						url: 'InteractiveAdmPlanController/actionGetPlanById',
						beforeSend : function(xhr) {
				            xhr.setRequestHeader('Accept', "text/html; charset=utf-8");
				        },
						data: objPlanById,
						dataType: 'json',
						type: 'get'
					}).done(function(data){
						var objAttrCrr = {
								'idPlan': data.idPlan,
								'plan': data.plan,
								'idEmpresa': data.idEmpresa,
								'costo': data.costo,
								'idperiodicidad': data.idperiodicidad,
								'idAsigna': data.idAsigna,
								'idCobro': data.idCobro,
								'usuario': data.usuario,
								'estatus': data.estatus
						};
						var objAttrMixUp = {
								'idPlan': idPl2,
								'plan': nombrePl2,
								'idEmpresa': objAttrCrr.idEmpresa, //Crr
								'costo': costoPl2,
								'idperiodicidad': objAttrCrr.idperiodicidad, //Crr
								'asigna': objAttrCrr.idAsigna, //Crr
								'idCobro': objAttrCrr.idCobro, //Crr
								'usuario': sessionStorage.getItem('userNameCr'),
								'descripcion': descPl2,
						};
						$.each(objAttrMixUp, function (index, value) {
							console.log(index+"::EACH::"+value);
						});
						$.ajax({
							url: 'InteractiveAdmPlanController/actionUpdatePlan',
							beforeSend : function(xhr) {
					            xhr.setRequestHeader('Accept', "text/html; charset=utf-8");
					        },
							data: objAttrMixUp,
							dataType: 'json',
							type: 'get'
						}).done(function(data){
							$('#nm-'+theId).attr('id', 'nm-'+data.idPlan).text(nombrePl2);
							$('#ds-'+theId).attr('id', 'ds-'+data.idPlan).text(descPl2);
							$('#st-'+theId).attr('id', 'st-'+data.idPlan);
							$('#cs-'+theId).attr('id', 'cs-'+data.idPlan).text(costoPl2);
							$('#ed-'+theId).attr('id', 'ed-'+data.idPlan);
							$('#ad-'+theId).attr('id', 'ad-'+data.idPlan);
							$('#modOpc1_1').modal('hide');
						}).fail(function(e){
							console.log("No fue posible guardar la modificacion actionUpdatePlan.");
						});
					}).fail(function(e){
						console.log("No fue posible obtener getPlanById.");
					});
				} //end::ex3
			} //end::ex2
		} //end::ex1
		
	});
	
	function fnAllMods1(idToEdit) {
		var idPlanToMod = idToEdit.split('-');
		$('#namePlanHd').text('');
			$('#namePlanHd').attr('data-idPlanMod', '');
		$('#nombrePl2').val('');
		$('#descPl2').val('');
		$('#costoPl2').val('');
		var theIdArr = idToEdit.split('-');
		theId = theIdArr[theIdArr.length-1];
		var namePlan = $('#nm-'+theId).text(); 
		var descPlan = $('#ds-'+theId).text(); 
		var cstoPlan = $('#cs-'+theId).text();
		$('#modOpc1_1').modal('show');
		$('#namePlanHd').text(namePlan);
			$('#namePlanHd').attr('data-idPlanMod', idPlanToMod[idPlanToMod.length-1]);
		$('#nombrePl2').val(namePlan);
		$('#descPl2').val(descPlan);
		$('#costoPl2').val(cstoPlan);	
	}
	
	function fnAllMods2(idToActDes) {
		var idRowArr = idToActDes.split('-');
		var myObj = {
			'idPlan': idRowArr[idRowArr.length-1]
		};
		$.ajax({
			url: 'InteractiveAdmPlanController/actionActDesact',
			data: myObj,
			dataType: 'json',
			type: 'get'
		}).done(function(data){
			var dtDes = '';
			var dtStts = '';
			$.each(data.messages, function (index, value) {
				dtDes = value.description;
			});
			dtStts = data.estatus;
			console.log('dataRs::'+dtDes);
			console.log('dataRs::'+dtStts);
			if(dtDes == 'Success'){
				if ($('#' + idToActDes + ' > i').hasClass('fa-check')) {
					$('#' + idToActDes + ' > i').removeClass('fa-check colorAct');
					$('#' + idToActDes + ' > i').addClass('fa-times colorDesact');
					$('#st-'+idRowArr[idRowArr.length-1]).text('Inactivo');
				} else {
					$('#' + idToActDes + ' > i').addClass('fa-check colorAct');
					$('#' + idToActDes + ' > i').removeClass('fa-times colorDesact');
					$('#st-'+idRowArr[idRowArr.length-1]).text('Activo');
				}
			} else {
				$('#'+idToActDes).attr('title', dtDes);
				$('#'+idToActDes).tooltip('show');
				setTimeout(function(){
					$('#'+idToActDes).tooltip('destroy');
				}, 4000);
			}
		}).fail(function(e){
			console.log("No fue posible Activar o Desactivar");
		});
	}
	
});