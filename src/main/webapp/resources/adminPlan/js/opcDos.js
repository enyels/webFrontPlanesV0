$(document).ready(function() {
	
	$.ajax({
		url : 'InteractiveAdmPlanController/actionGetAllPlansComer',
		beforeSend : function (xhr){
			xhr.setRequestHeader('Accept', 'text/html; charset=utf-8');
		},
		dataType: 'json',
		type: 'get'
	}).done(function(data){
		var containsVal = data.hasOwnProperty('planes');
		if (containsVal) {
			$.each(data.planes, function(index, value){
				$('#listOfPlns2').append('<option value="'+value.idPlan+'">'+value.plan+'</option>');
			});
		} else {
			console.log("data1::Propiedad PLANES no existe.");
		}
	}).fail(function(e){
		console.log("e1::"+e.status);
	});
	
	$('#listOfPlns2').change(function(){
		var planSelVal = $(this).val();
		var planSelTxt = $("#listOfPlns2 option:selected").text();
		if(planSelVal != "none"){
			$('#navOptSec2').show();
		} else {
			$('#navOptSec2').hide();
			$('#subTitleOpc2').empty();
			$('#wrapOfOpc').hide();
			$('#btnSvCnfGen').hide();
		}
	});
	
	$('#planOpc1, #planOpc2, #planOpc3').click(function(e){
		e.preventDefault();
		$('#subTitleOpc2').empty();
		$('#subTitleOpc2').append('<i class="fa fa-line-chart"></i>&nbsp;&nbsp; Productos de fondos de inversi&oacute;n');
		$('#btnSvCnfGen').show();
		
		$('#wrapOfOpc').show();
		$('#tblOpc1').show();
		$('#tblOpc2').hide();
		$('#tblOpc3').hide();
		$('#tblOpc4').hide();
		$('#tblOpc5').hide();
		$.ajax({
			url:'InteractiveAdmPlanController/actionGetGrpAndSub',
			beforeSend : function(xhr) {
	            xhr.setRequestHeader('Accept', "text/html; charset=utf-8");
	        },
			dataType:'JSON',
			type:'GET'			
		}).done(function(data) {
			$('#bodyTableOpc1').empty();
			$.each(data, function(index, value) {
				var grpIdx = index;
				var grpIdM1 = value.grpId;
				var grpNomM1 = value.grpName;
				$('#bodyTableOpc1').append(
						'<tr id="grp-'+grpIdM1+'">'+
							'<td class="stlSecHeadTab">'+grpNomM1+'</td>'+
							'<td class="stlSecHeadTab"></td>'+
							'<td class="stlSecHeadTab">'+
								'<div style="text-align: center;">'+
									'<div class="checkbox stlCheckRadioDtll">'+
										'<label>'+
											'<input type="checkbox" class="allOrSelGrp" name="chkGrpAS-'+grpIdM1+'-'+grpIdx+'"> Agregar Todas'+
										'</label>'+
									'</div>'+
								'</div>'+
							'</td>'+
						'</tr>'
				);
				$.each(value.listSubGrupos, function(index, value){
					$('#grp-'+grpIdM1).after(
							'<tr id="sub'+grpIdM1+'-'+value.subGrpId+'">'+
								'<td></td>'+
								'<td>'+value.subGrpName+'</td>'+
								'<td>'+
									'<div style="text-align: center;">'+
										'<div class="checkbox stlCheckRadio">'+
											'<label>'+
												'<input type="checkbox" class="allSub1" name="chkSubAll-'+grpIdM1+'-'+value.subGrpId+'" id="all-'+grpIdM1+'-'+value.subGrpId+'"> Agregar'+
											'</label>'+
										'</div>'+
										'<div class="checkbox stlCheckRadio">'+
											'<label>'+
												'<input type="checkbox" class="selectSub1" name="chkSubSel-'+grpIdM1+'-'+value.subGrpId+'" id="sel-'+grpIdM1+'-'+value.subGrpId+'"> Escoger detalle'+
											'</label>'+										
										'</div>'+
									'</div>'+
								'</td>'+
							'</tr>'
					);
				});
			}) //end::foreach
			
			$('.allOrSelGrp').change(function(){ //ini::add all
				var nameChkGrp = $(this).attr('name');
				var splitName = nameChkGrp.split('-');
				var idSubTrAll = 'all-'+splitName[splitName.length-2]+'-' ;
				var idSubTrSel = 'sel-'+splitName[splitName.length-2]+'-' ;
				var isChkdGrp = $('input[name='+nameChkGrp+']').is(':checked');
				if(isChkdGrp){
					$('input:checkbox[id^='+idSubTrAll+']').prop('checked', false).prop('disabled', true);
					$('input:checkbox[id^='+idSubTrSel+']').prop('checked', false).prop('disabled', true);

					$('[id^=sub'+splitName[splitName.length-2]+'-]').addClass('backSelectAll');
					$('[class^=dtll-'+splitName[splitName.length-2]+'-]').remove();
				} else {
					$('input:checkbox[id^='+idSubTrAll+']').prop('checked', false).prop('disabled', false);
					$('input:checkbox[id^='+idSubTrSel+']').prop('checked', false).prop('disabled', false);
					
					$('[id^=sub'+splitName[splitName.length-2]+'-]').removeClass('backSelectAll');
				}
			}); //end::add all
			
			$('.allSub1').change(function(e){
				e.preventDefault();
				var nameOfSub = $(this).attr('name');
				var isInCheck = $('input[name='+nameOfSub+']').is(':checked');
				var idOfSub = $(this).attr('id');
				var arrId = idOfSub.split('-');
				if (isInCheck) {
					var idForSel = 'sel-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1];
					$('#'+idForSel).prop('checked', false);
					$('.dtll-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1]).remove();
				} else {
//					console.log("NO CHECK For Dtll::");
				}
			});
			
			$('.selectSub1').change(function(e){ //ini::sec-detalle
				e.preventDefault();
				var nameOfSub = $(this).attr('name');
				var isInCheck = $('input[name='+nameOfSub+']').is(':checked');
				var idOfSub = $(this).attr('id');
				var arrId = idOfSub.split('-');
				var aloneId = arrId[arrId.length-1];
				var myObjDtll = {
						idSub: aloneId
				}
				var idSubGrpTr = 'sub'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1];
				$('.dtll-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1]).remove();
				if (isInCheck) {
					$.ajax({
						url:'InteractiveAdmPlanController/actionSubDetalle',
						beforeSend : function(xhr) {
				            xhr.setRequestHeader('Accept', "text/html; charset=utf-8");
				        },
						dataType:'JSON',
						data: myObjDtll,
						type:'GET'			
					}).done(function(data){
						var containsVal = data.hasOwnProperty('listaProductos');
						if(containsVal){
							var idForAll = 'all-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1];
							$('#'+idForAll).prop('checked', false);
							$.each(data.listaProductos, function(index, value){
								$('#'+idSubGrpTr).after(
								'<tr class="dtll-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1]+'">'+
									'<td style="background-color: #dff0d8;"></td>'+
									'<td class="stlsRowDtll">'+value.nombre+'</td>'+
									'<td style="background-color: #dff0d8;">'+
										'<div style="text-align: right;">'+
											'<div class="checkbox stlCheckRadioDtll">'+
												'<label>'+
													'<input type="checkbox" name="chkDtll-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1]+'-'+index+'" class="childSub1"> Seleccionar'+
												'</label>'+
											'</div>'+
										'</div>'+
									'</td>'+
								'</tr>'		
								);
							});
						} else {
							$('#'+idOfSub).prop('checked', false);
							alert("NO existen mas detalles para este Sub-Grupo.");
						}
					}).fail(function(e){
						console.info('actionSubDetalle::'+e.status);		
					});
				} else {
					$('.dtll-'+arrId[arrId.length-2]+'-'+arrId[arrId.length-1]).remove();
				}
			});	//end::sec-detalle
			
		}).fail(function(e){
			console.info('actionGetGrpAndSub::'+e.status);
		});
	}); //end:clickFn
	
//	$('#planOpc2').click(function(e){
//		e.preventDefault();
//		$('#subTitleOpc2').empty();
//		$('#subTitleOpc2').append('<i class="fa fa-bar-chart"></i>&nbsp;&nbsp; Productos de mercado de capitales');
//		$('#btnSvCnfGen').show();
//		
//		$('#wrapOfOpc').show();
//		$('#tblOpc1').show();
//		$('#tblOpc2').hide();
//		$('#tblOpc3').hide();
//		$('#tblOpc4').hide();
//		$('#tblOpc5').hide();
//	});
//	
//	$('#planOpc3').click(function(e){
//		e.preventDefault();
//		$('#subTitleOpc2').empty();
//		$('#subTitleOpc2').append('<i class="fa fa-money"></i>&nbsp;&nbsp; Productos de mercado de dinero');
//		$('#btnSvCnfGen').show();
//		
//		$('#wrapOfOpc').show();
//		$('#tblOpc1').show();
//		$('#tblOpc2').hide();
//		$('#tblOpc3').hide();
//		$('#tblOpc4').hide();
//		$('#tblOpc5').hide();
//	});
	
	$('#planOpc4').click(function(e){
		e.preventDefault();
		$('#wrapOfOpc').show();
		$('#tblOpc1').hide();
		$('#tblOpc2').hide();
		$('#tblOpc3').hide();
		$('#tblOpc4').show();
		$('#tblOpc5').hide();
		
		$('#subTitleOpc2').empty();
		$('#subTitleOpc2').append('<i class="fa fa-cc-mastercard"></i>&nbsp;&nbsp; Productos de servicios bancarios');
		$('#btnSvCnfGen').show();
	});
	
	$('#planOpc5').click(function(e){
		e.preventDefault();
		$('#wrapOfOpc').show();
		$('#tblOpc1').hide();
		$('#tblOpc2').hide();
		$('#tblOpc3').hide();
		$('#tblOpc4').hide();
		$('#tblOpc5').show();
		
		$('#subTitleOpc2').empty();
		$('#subTitleOpc2').append('<i class="fa fa-plus-square"></i>&nbsp;&nbsp; Productos de plus de inversion');
		$('#btnSvCnfGen').show();
	});
	
	$('#btnSvCnfGen').click(function(e){
		e.preventDefault();
		if($('#bodyTableOpc1 input:checked').length != 0){
			
			var myPlnsSlctd = {};
			$('#bodyTableOpc1 input:checked').each(function(index, value) {
				var nameChkdTmp = $(this).attr('name');
				var chkdNameArr =  nameChkdTmp.split('-');
				if(chkdNameArr[0] == 'chkGrpAS'){
					console.log(index+"::Seleccionaste todo el GRUPO::"+chkdNameArr[1]);
					myPlnsSlctd['grp'+index+':'] = chkdNameArr[1];
				} else if (chkdNameArr[0] == 'chkSubAll'){
					console.log(index+"::Seleccionaste del GRUPO::"+chkdNameArr[1]+'::el SUBGRUPO::'+chkdNameArr[2]);
					myPlnsSlctd['sub'+index+':'+chkdNameArr[1]] = chkdNameArr[2];
				} else if (chkdNameArr[0] == 'chkDtll'){
					console.log(index+"::Seleccionaste del GRUPO::"+chkdNameArr[1]+'::del SUBGRUPO::'+chkdNameArr[2]+'::el DETALLE::'+chkdNameArr[3]);
					myPlnsSlctd['dtl'+index+':'+chkdNameArr[1]+':'+chkdNameArr[2]] = chkdNameArr[3];
				}
			});
			
			for(var key in myPlnsSlctd){
				var val = myPlnsSlctd[key];
				console.log("Key: "+key+" value:"+val);
			}
			
			$.ajax({
				url: 'InteractiveAdmPlanController/actionSendToSaveConf',
				data: myPlnsSlctd,
				dataType: 'JSON'
			}).done(function(data){
				console.log('date of date:'+data);
			}).fail(function(e){
				console.log('Fail call ajax::'+e.status);
			});
			
		} else {
			alert('Seleccione al menos un Grupo, Sub-Grupo o Detalle');
		}
	});
	
});