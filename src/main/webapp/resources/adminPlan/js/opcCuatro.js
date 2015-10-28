$(document).ready(function(){

	$('input, textarea').placeholder();
	
	$(".onlyNum").bind('keypress', function (event) {						
	    var regex = new RegExp("^[0-9]+$");						
	    var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);						
	    if (!regex.test(key) && event.charCode!=0 ) {   						
	       event.preventDefault();						
	       return false;						
	    }						
	});
	
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
				$('#listOfPlns4').append('<option value="'+value.idPlan+'">'+value.plan+'</option>');
			});
		} else {
			console.log("data4::Propiedad PLANES no existe.");
		}
	}).fail(function(e){
		console.log("e4::"+e.status);
	});
	
	$('#btnAdd4').click(function(e){
		e.preventDefault();
		var optPlanVal4 = $('#listOfPlns4 option:selected').attr('value');
		var optPlanTxt4 = $('#listOfPlns4 option:selected').text();
		var numberContract = $('#numberContract').val();
		var ex1 = true, ex2 = true;

		if (optPlanVal4 == "none") {
			ex1 = false;
			$('.msgErr4_1').show();
		} else {
			$('.msgErr4_1').hide();
		}

		if (numberContract.length == 0) {
			ex2 = false;
			$('.msgErr4_2').show();
		} else {
			$('.msgErr4_2').hide();
		}
		
		if (ex1) {
			if (ex2) {
				$('#cntrtAdd4').prepend('<tr><td>'+numberContract+'</td><td>'+optPlanTxt4+'</td>');
				var numOfRows = $('#cntrtAdd4 tr').length;
				$('#numOfCntrts4').text(numOfRows);
				$('#listOfPlns4').removeAttr('selected').find('option:first').attr('selected', 'selected');
				$('#numberContract').val('');
			}
		}
		
	});
	
});