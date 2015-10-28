$(document).ready(function () {

	sessionStorage.removeItem('userNameCr');
	
	$('input, textarea').placeholder();
	
	$('#valLgnUsr').focus();
	
	$(".txtAndNumDos").bind('keypress', function (event) {		
		var regex = new RegExp("^[a-zA-Z0-9]+$");
		var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
		if (!regex.test(key)) {   						
			event.preventDefault();						
			return false;						
		}		
	});
	
	$('#valLgnPwd').keyup(function(e){
		e.preventDefault();
		var codeKey = e.which;
		if (codeKey == 13) {
			var $btnLgn = $('#btnLgn').button('loading');
			singInMap($btnLgn);	
		}
	});
	
	$('#btnLgn').click(function(e) {
		e.preventDefault();
		var $btnLgn = $(this).button('loading');
		singInMap($btnLgn);
	});
	
	$('#btnUno, #btnUno1').click(function (e) {
		e.preventDefault();
		$.ajax({
			url: 'InteractiveAdmPlanController/actionObtainOpc1',
			dataType: 'HTML'
		}).done(function(data) {
			$('#idWrapBody').empty();
			$('#idWrapBody').html(data);
		}).fail(function(e) {
			console.log(e.status);
		});
	});

	$('#btnDos, #btnDos2').click(function (e) {
		e.preventDefault();
		$.ajax({
			url: 'InteractiveAdmPlanController/actionObtainOpc2',
			dataType: 'HTML'
		}).done(function(data) {
			$('#idWrapBody').empty();
			$('#idWrapBody').html(data);
		}).fail(function(e) {
			console.log(e.status);
		});
	});

	$('#btnTres, #btnTres3').click(function (e) {
		e.preventDefault();
		$.ajax({
			url: 'InteractiveAdmPlanController/actionObtainOpc3',
			dataType: 'HTML'
		}).done(function(data) {
			$('#idWrapBody').empty();
			$('#idWrapBody').html(data);
		}).fail(function(e) {
			console.log(e.status);
		});
	});

	$('#btnCuatro, #btnCuatro4').click(function (e) {
		e.preventDefault();
		$.ajax({
			url: 'InteractiveAdmPlanController/actionObtainOpc4',
			dataType: 'HTML'
		}).done(function(data) {
			$('#idWrapBody').empty();
			$('#idWrapBody').html(data);
		}).fail(function(e) {
			console.log(e.status);
		});
	});
	
	$('#wrapCloseSes').click(function(e){
		e.preventDefault();
		$('#modLogout1').modal('show');
		$.ajax({
			url: 'InteractiveAdmPlanController/actionTerminator',
			dataType: 'json'	
		}).done(function(data) {
			console.log("data::"+data);
			if (data == "closed") {
				location.reload();
			}
			$('#modLogout1').modal('hide');
		}).fail(function(e) {
			console.log("wrapCloseSes::"+e.status);
			$('#modLogout1').modal('hide');
		});
	});
	
	function singInMap($btnLgn) {
		var valLgnUsr = $('#valLgnUsr').val();
		var valLgnPwd = $('#valLgnPwd').val();
		if(valLgnUsr.length !== 0 && valLgnPwd.length !== 0){
			var myObjJs = {
					'valLgnUsr': valLgnUsr,
					'valLgnPwd': valLgnPwd
			};
			$.ajax({
				url: 'InteractiveAdmPlanController/actionCheckExist',
				data: myObjJs,
				dataType: 'HTML',
				type: 'GET'
			}).done(function(data) {
				$btnLgn.button('reset');
				$('#valLgnUsr').val('');
				$('#valLgnPwd').val('');
				$('#wrapCloseSes').show();
				$('#wrapOpcSes').show();
				$('#wrapSubSes').show();
				$('#idWrapBody').empty();
				$('#idWrapBody').html(data);
			}).fail(function(e) {
				if (e.status == 404) {
					$('#valLgnUsr').val('');
					$('#valLgnPwd').val('');
					$('.stlPwdUsr').text('Cuenta incorrecta, intente nuevamente.');
					$btnLgn.button('reset');
					setTimeout(function() {
						$('.stlPwdUsr').text('');
					}, 2000);
				}
			});
		} else {
			$('.stlPwdUsr').text('(*) Todos los campos son requeridos.');
			$btnLgn.button('reset');
			setTimeout(function() {
				$('.stlPwdUsr').text('');
			}, 2000);
		}
	} //endFn :: singIn()
	
});