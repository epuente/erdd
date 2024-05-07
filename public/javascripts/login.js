    $("#btnLogin").click(function(){  
        $('#msgLogin').html( "");  
        if($("#usuario").val().length == 0 || $("#password").val().length == 0){
            $('#msgLogin').html( "Debe proporcionar usuario y password" ).addClass("error");
            return false;
        }
    
        $.ajax({
          method: "POST",
          url: "/autentica",
          async: false,
          data: { 
            'usuario': $("#usuario").val(), 
            'password': $("#password").val()
          }
        }).success(function( data ) {
            if ( (data == null) || (data.length == 0))
                $('#msgLogin').html( "Usuario y/o clave de acceso incorrectos" ).addClass("error");
            else {        
                $('#msgLogin').html(  "Correcto, ingresando... ").removeClass("error");
                $('form')[0].method="GET";
                    if( data == "1 "){                  
                        $('form')[0].action = "/admin";
                    }
                    if(data == "2 "){                   
                        $('form')[0].action = "/ev";
                    }
                    if(data == "3 "){    
                        $('form')[0].action = "/coord";
                    } 
                    if(data == "4 "){
                        $('form')[0].action = "/polimedia";
                    }
                $('form')[0].submit();
            }           

          })
          .error(function(data){
            $('#msgLogin').html( "Error" );
          })
    });
