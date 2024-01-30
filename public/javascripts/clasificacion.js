function llamadaAjaxDescripcionCriterio(num, id){
    var d = $.Deferred();
    $.ajax({
			  method: "POST",
              url: "/descripcionCriterio",
              data: JSON.stringify( { "criterio": num, "id": id}),
	          contentType: "application/json; charset=utf-8",
	          dataType: "json"
			})
		  .success(function( data ) {
            
		  	if ( (data == "") || (data.length == 0) ){					  		
		  	} else {
		  		$("#divDescripC"+num).html(data);
		  		$("#divDescripC"+num).show();
              }
            d.resolve(data);
		  })					
		  .error(function(data){
                            
              console.log(data)
              alert("error en ajax");
              d.reject;
          });
          return d.promise(); 	
}


function llamadaAjaxRestricciones(c1, c2, c3){
        var d = $.Deferred();
			  $.ajax({
				  method: "POST",
				  url: "/clasificacionRestricciones",
                    data: JSON.stringify( { "c1": c1, "c2": c2, "c3": c3 }),
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
				  beforeSend: function() {
						$("#divMensajes1, #divMensajes2").hide();
					},
				})
				  .success(function(data){
                      d.resolve(data);
                  })
                  .error(function(data){
                      d.reject;
                        alert("error en ajax 001");                      
                  });
                  return d.promise();	    
                }



