$(document).ready(function(){

	var myObjServices1 = {
			'ser1':{
				'idSer': '001',
				'nombre': 'Servicio 001',
				'descripcion': 'Descripcion de Servicio 001',
				'estatus': 'Activo',
				'costo': '50'
			},
			'ser2':{
				'idSer': '002',
				'nombre': 'Servicio 002',
				'descripcion': 'Descripcion de Servicio 002',
				'estatus': 'Activo',
				'costo': '100'
			},
			'ser3':{
				'idSer': '003',
				'nombre': 'Servicio 003',
				'descripcion': 'Descripcion de Servicio 003',
				'estatus': 'Activo',
				'costo': '150'
			},
			'ser4':{
				'idSer': '004',
				'nombre': 'Servicio 004',
				'descripcion': 'Descripcion de Servicio 004',
				'estatus': 'Activo',
				'costo': '50'
			},
			'ser5':{
				'idSer': '005',
				'nombre': 'Servicio 005',
				'descripcion': 'Descripcion de Servicio 005',
				'estatus': 'Inactivo',
				'costo': '100'
			},
			'ser6':{
				'idSer': '006',
				'nombre': 'Servicio 006',
				'descripcion': 'Descripcion de Servicio 006',
				'estatus': 'Inactivo',
				'costo': '150'
			},
			'ser7':{
				'idSer': '007',
				'nombre': 'Servicio 007',
				'descripcion': 'Descripcion de Servicio 007',
				'estatus': 'Inactivo',
				'costo': '100'
			},
			'ser8':{
				'idSer': '008',
				'nombre': 'Servicio 008',
				'descripcion': 'Descripcion de Servicio 008',
				'estatus': 'Inactivo',
				'costo': '150'
			}
	}
	
	$.ajax({
		url: 'InteractiveAdmPlanController/actionGetAllPlansComer',
		beforeSend: function(xhr){
			xhr.setRequestHeader('Accept', 'text/html; charset=utf-8');
		},
		dataType: 'json',
		type: 'get'
	}).done(function(data){
		var containsVal = data.hasOwnProperty('planes');
		if (containsVal) {
			$.each(data.planes, function(index, value){
				$('#listOfServices').append('<option value="'+value.idPlan+'">'+value.plan+'</option>');
			});
		} else {
			console.log("data2::Propiedad PLANES no existe.");
		}
	}).fail(function(e){
		console.log("e2::"+e.status);
	});
	
	$.each(myObjServices1, function(index, value){
		if(value.estatus == "Activo"){
			$('#emSelected').append('<a href="#" class="colorOver list-group-item" data-stts="'+value.estatus+'" id="'+value.idSer+'">'+value.nombre+'</a>');
		} else if (value.estatus == "Inactivo") {
			$('#emDefault').append('<a href="#" class="colorOver list-group-item" data-stts="'+value.estatus+'" id="'+value.idSer+'">'+value.nombre+'</a>');
		}
	});
	
	 $(document).on('click', '#emDefault a', function(e) {
		e.preventDefault();
		var emDefaultAtr = $(this).attr('id');
		var emDefaultTxt = $('#'+emDefaultAtr).text();
		$('#emDefault #'+emDefaultAtr).remove();
		$('#emSelected').append('<a href="#" class="colorOver list-group-item" data-stts="Activo" id="'+emDefaultAtr+'">'+emDefaultTxt+'</a>');
	});

	$(document).on('click', '#emSelected a', function(e) {
		e.preventDefault();
		var emDefaultAtr = $(this).attr('id');
		var emDefaultTxt = $('#'+emDefaultAtr).text();
		$('#emSelected #'+emDefaultAtr).remove();
		$('#emDefault').append('<a href="#" class="colorOver list-group-item" data-stts="Inactivo" id="'+emDefaultAtr+'">'+emDefaultTxt+'</a>');
	});
	
	$('#saveSelSer3').click(function(e){
		e.preventDefault();
		
		$('#emSelected a').each(function(){
			var estatus = $(this).attr('data-stts');
			var idSer = $(this).attr('id');
			var idNom = $(this).text();
			console.log('Sel::'+estatus+'::'+idSer+'::'+idNom);
		});
		$('#emDefault a').each(function(){
			var estatus = $(this).attr('data-stts');
			var idSer = $(this).attr('id');
			var idNom = $(this).text();
			console.log('Def::'+estatus+'::'+idSer+'::'+idNom);
		});
		
	});
	
});