
$(document).ready(function() {

     $('.jqueryDataTable').dataTable( {
        'bProcessing': false,
        'bServerSide': false,
        'sAjaxSource': 'listPersons',
        'bJQueryUI': true,
        'aoColumns': [
            { 'mData': 'name' },
            { 'mData': 'country' }
            
        ]
    } ); 
     
    $("#circuitType").change(function() {
    	    var value = $(this).val();
    	    $("div.center").empty();
    	    $.getJSON("conditions?circuitType="+$(this).val(),
    	            function(data){
    	      $.each(data, function(key,value){
    	    	  $("div.center").append('<input type="checkbox" value="'+value+'" id=""'+value+' /> <label for="cb1">'+key+'</label><br>');
    	      });
    	    });
   	}); 
     
} );//document Ready


