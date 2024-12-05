	var  agregarAutor = function(){		
		renglon = '<div class="row" id="rowAutor'+$("#tableAutor div.row").length+'">';
		renglon += '<div class="col-xs-2 form-group clearfix"> <div class="input input-group" style="min-width:100%"><input type="text" name="'+"autor.nombre"+$("#tableAutor div.row").length+'" value="" size="10" class="form-control validaRegExp" patron="[a-z9àèìòùáéíóúñü ]+" placeholder="Nombre(s)" data-error="Ingrese solo letras y espacios." required="required", maxlength="40" /><div class="help-block with-errors"></div></div> <textarea placeholder="Escriba su observacion..." name="'+"observacion_autor.nombre"+$("#tableAutor div.row").length+'" class="observacion" maxlength="600" style="min-width: 100%"></textarea> <button type="button" name="btnObservacion_autor.nombre'+$("#tableAutor div.row").length+'" class="btn btn-primary btn-xs form-control">Corregir</button>	   	<div class="errorObservacion" style="color:red"></div>	   </div>  ';
		renglon += '<div class="col-xs-2 form-group clearfix"> <div class="input input-group" style="min-width:100%"><input type="text" name="'+"autor.paterno"+$("#tableAutor div.row").length+'" value="" size="10" class="form-control validaRegExp" patron="[a-z9àèìòùáéíóúñü ]+" placeholder="Paterno" data-error="Ingrese solo letras y espacios." required="required", maxlength="35"/><div class="help-block with-errors"></div></div> <textarea placeholder="Escriba su observacion..." name="'+"observacion_autor.paterno"+$("#tableAutor div.row").length+'" class="observacion" maxlength="600" style="min-width: 100%"></textarea>  <button type="button" name="btnObservacion_autor.paterno'+$("#tableAutor div.row").length+'" class="btn btn-primary btn-xs form-control">Corregir</button>    <div class="errorObservacion" style="color:red"></div>       </div> ';
		renglon += '<div class="col-xs-2 form-group clearfix"> <div class="input input-group" style="min-width:100%"><input type="text" name="'+"autor.materno"+$("#tableAutor div.row").length+'" value="" size="10" class="form-control validaRegExp" patron="[a-z9àèìòùáéíóúñü ]+" placeholder="Materno" data-error="Ingrese solo letras y espacios." required="required", maxlength="35"/><div class="help-block with-errors"></div></div> <textarea placeholder="Escriba su observacion..." name="'+"observacion_autor.materno"+$("#tableAutor div.row").length+'" class="observacion" maxlength="600" style="min-width: 100%"></textarea>  <button type="button" name="btnObservacion_autor.materno'+$("#tableAutor div.row").length+'" class="btn btn-primary btn-xs form-control">Corregir</button>    <div class="errorObservacion" style="color:red"></div>       </div>';		
			
		if ( $("#tableAutor div.row").length != 0 ){
			renglon+='<div class="col-xs-4 form-group">	<div class="input input-group clearfix"> <div class="input input-group"><select name="'+"autor.autorfuncion"+$("#tableAutor div.row").length+'" required="required">'+$('#auxiliar').html()+'</select> <span class="help-block with-errors"></span> </div></div>';
			renglon+='<input type="text" name="'+"autor.otroTipoAutoria"+$("#tableAutor div.row").length+'" value="" size="10" class="form-control" pattern="[A-Za-zñÑáéíóúÁÉÍÓÚ ]*" placeholder="Otro tipo de autoría" data-error="Ingrese solo letras y espacios." style="display:none", maxlength="40" />	<div class="help-block with-errors"></div>';
			renglon+='		<textarea placeholder="Escriba su observacion..." name="'+"observacion_autor.autorfuncion"+$("#tableAutor div.row").length+'" class="observacion"></textarea>    <button type="button" name="btnObservacion_autor.autorfuncion'+$("#tableAutor div.row").length+'" class="btn btn-primary btn-xs form-control">Corregir</button>';
			renglon+='      <div class="errorObservacion" style="color:red"></div>';
			renglon+="</div>";
		    renglon+='<div class="col-xs-2"><input type="button" value="Quitar autor" onclick="eliminarAutor2('+$("#tableAutor div.row").length+')" id="btnQuitarAutor"></div>';
		} else{
			renglon+='<div class="col-xs-2">Autor responsable de contenidos<select name="autor.autorfuncion0" required="required" style="display:none"><option value="1" selected="selected">Autor de contenidos que fungirá como responsable</option></select></div>';
			renglon+='<div class="col-xs-2 form-group clearfix"><div class="input input-group"><input type="email" name="autor.correo0" value="" class="form-control" data-error="No es la estructura de un email" required="required"  placeholder="correo electrónico institucional", maxlength="50"/><div id="correo0ClassWithErrors" class="help-block with-errors"></div></div>  <div><textarea placeholder="Escriba su observacion..." name="observacion_autor.correo0" class="observacion"></textarea>	<button type="button" name="btnObservacion_autor.correo0" class="btn btn-primary btn-xs form-control">Corregir</button><div class="errorObservacion" style="color:red"></div></div></div>';
			renglon+='<div class="col-xs-2 form-group clearfix"><div class="input input-group"><input type="tel" name="autor.telefono0" value="" class="form-control" pattern="([0-9]{10})|([0-9]{5})"  minlength="5" maxlength="10"   placeholder="Teléfono o ext. IPN (10 o 5 dígitos)"   data-error="Ingrese extensión IPN (5 dígitos) o un número telefónico (10 dígitos), sin espacios ni guiones." required="required"  /><div id="telefono0ClassWithErrors" class="help-block with-errors"></div></div>';
			renglon+='<textarea placeholder="Escriba su observacion..." name="observacion_autor.telefono0" class="observacion" maxlength="600" style="min-width: 100%" ></textarea>     <button type="button" name="btnObservacion_autor.telefono0" class="btn btn-primary btn-xs form-control" style="display:none5">Corregir</button>    ';
			renglon+='<div class="errorObservacion" style="color:red"></div>';
			
			
			renglon+='</div>';
			renglon+='</div>';
		}
		$("#tableAutor").append(renglon);		
		$("select[name='autor.autorfuncion"+($('#tableAutor div.row').length-1)+"'] option:eq(1)").attr("selected",true);
		$("[name*='btnObservacion_autor']").hide();		
		$(".form-control").css("height","initial");
	}
	
	
	function eliminarAutor(renglon){	
    	var i = renglon.parentNode.parentNode.rowIndex;
    	document.getElementById("tablaAutores").deleteRow(i);
	}

	function eliminarAutor2(renglon){	
		$("#rowAutor"+renglon).remove();
	}

	var  agregarPalabra = function(){
		var renglon = '<td><div class="form-group" style="min-width:100%"><input type="text" name="'+"palabra.descripcion"+$("#tablaPalabras tbody tr").length+'" value="" class="form-control validaRegExp" patron="[a-z0-9àèìòùáéíóúñ_ \'/*-+.,()ü#$%&/!¿?¡{}=<>:;-]+" , maxlength="40" style="min-width:100%"/><div class="help-block with-errors"></div></div><textarea placeholder="Escriba su observacion..." name="'+"observacion_palabra.descripcion"+$("#tablaPalabras tbody tr").length+'" class="observacion"></textarea>    <button type="button" name="btnObservacion_palabra.descripcion'+$("#tablaPalabras tbody tr").length+'" class="btn btn-primary btn-xs form-control">Corregir</button>     </td>';			
		$('#tablaPalabras > tbody:last').append('<tr>'+renglon+'<td><input type="button" value="Quitar palabra" onclick="eliminarPalabra(this)"></td></tr>');		
		$("[name*='btnObservacion_palabra.descripcion"+(($("#tablaPalabras tbody tr").length)-1)+"']").hide();	
		$(".form-control").css("height","initial");
	}
	
	function eliminarPalabra(renglon){		
    	var i = renglon.parentNode.parentNode.rowIndex;
    	document.getElementById("tablaPalabras").deleteRow(i);
	}	

	function eliminarDocumento2(renglon){		
    	var i = renglon;    	
    	var id = $("#docId"+i).html();
    	if ( id != undefined     ){   		
    		$('#documentosBorrar').val(  $('#documentosBorrar').val()+','+ id );
    		$('#observacionesDocumentosBorrar').val(  $('#observacionesDocumentosBorrar').val()+','+ id );
    	}	
    	$("#tableDocumentos div.row:eq("+renglon+")").remove();
    	$("#este").append($('<input type="text" name="aux2">').val("doctoEliminado").hide());
	}		

	
	function eliminarAgregarDocumento2(renglon){		
    	var i = renglon;    	
    	var id = $("#docId"+i).html();
    	if ( id != undefined     ){   		
    		$('#documentosBorrar').val(  $('#documentosBorrar').val()+','+ id );
    		$('#observacionesDocumentosBorrar').val(  $('#observacionesDocumentosBorrar').val()+','+ id );
    	}
	}	
	
	
	var preValidar = function(){
	    alert("Desde recursos.js prevalidar");
		$("#divNumControl").removeClass("error");
		if (  ($('#niveleducativo_id').val()).length == 0  ){	
			$('#campo_niveleducativo').find(".clearfix").addClass("error");
		}
		// Documentos a eliminar
		if ($('#documentosBorrar').val()){
			$('#documentosBorrar').val($('#documentosBorrar').val().substring(1));		
		}
		var ne = requeridos2();
		var x = $(".error");		
		if ( ne.length == 0 && x.length == 0){
			if (tablasRelacionadas().length == 0){					
				$("input[type='radio'], input[type='date'], input[type='text'], input[type='email'], input[type='tel'], input[type='file'], input[type='url'], textarea, select").attr("readonly",false);
				$("input[type='radio'], input[type='date'], input[type='text'], input[type='email'], input[type='tel'], input[type='file'], input[type='url'], textarea, select").prop('disabled', false);
				renombrarCampos();
				return true;
			}
			else
				alert("?");			
		} else{
			
			if (x.length != 0){
				$(".modal-body").html("Algunos campos obligatorios del formulario aparecen en blanco o no han sido completados correctamente.<br><br>Por favor verifique los campos marcados en rojo.<br><br>"+ne);
				$('#myModal').modal('show');
				return false;
			}
		}
	} 
	
	
	function renombrarCampos(){
		$("input[name*='autor.nombre']").each(function(i){
			this.name = 'autor.nombre['+i+']';
		});
		$("input[name*='autor.paterno']").each(function(i){
			this.name = 'autor.paterno['+i+']';
		});
		$("input[name*='autor.materno']").each(function(i){
			this.name = 'autor.materno['+i+']';
		});


		$("select[name*='autor.autorfuncion']").each(function(i){
			this.name = 'autor.autorfuncion['+i+']';
		});
		
		$("input[name*='autor.otroTipoAutoria']").each(function(i){
			this.name = 'autor.otroTipoAutoria['+(i+1)+']';
		});		

		
		
		$("input[name*='palabra.descripcion']").each(function(i){ 
			this.name = 'palabra.descripcion['+i+']';	
		});

		$("input[name^='documento.nombrearchivo']").filter(function() {
		    return $(this).val().length != 0;
		  }).each(function(i){
			var num =  $(this).attr('name').substring("documento.nombrearchivo".length);  
			this.name = 'documento.nombrearchivo['+i+']';
			$("select[name^='documento.tipodocumento"+num+"']").attr('name','documento.tipodocumento['+i+']');
		});
	}
	

    function requeridos2(){
		console.log("entrando en requeridos2...................")
		var errores = 0;
		var valor;
		var mensajesError = "";
		$(".clearfix").removeClass("error");
		$( ".requerido" ).each(function( i, e ) {
			var idcampo = e.id.substring(3);
			var campo = $("#"+idcampo);
			if (campo.prop('class') == 'buttonset'){
				idcampo = idcampo.substring(0, idcampo.length-3 );
				valor = $("input[name='"+idcampo+".id']:checked").val();
			} else
				valor = campo.val();
			if (valor==0 || valor == undefined){
				$(e).find(".clearfix").addClass("error");
				mensajesError+="";
			} else
				$(e).find(".clearfix").removeClass("error");
		});

		// Valida Título
		alert($("#titulo").val())
		alert(!$("#titulo").val())

		mensajesError += !$("#titulo").val()?"Escriba el título del recurso.<br>":"";
		mensajesError += !$("#niveleducativo_id").val()?"Seleccione un nivel educativo.<br>":"";
		mensajesError += !$("#areaconocimiento_id").val()?"Seleccione el área de conocimiento.<br>":"";
		mensajesError += !$("#unidadacademica_id").val()?"Seleccione la unidad académica.<br>":"";
		mensajesError += !$("#programaacad").val()?"Escriba el programa académico / carrera.<br>":"";
		mensajesError += !$("#unidadaprendizaje").val()?"Escriba la unidad de aprendizaje.<br>":"";



		//Valida que se seleccione modalidad
		if ($("input[name='modalidad.id']:checked").length ==0){
			mensajesError += "Debe especificarse la modalidad.<br>";
		} else {
			$("#reqmodalidad_id").find(".clearfix").removeClass("error");
		}


		//A quien va dirigido?
		if( $("input[type='checkbox'][name='dirigidoa.id[]']:checked").length == 0){
			$("#dirigidoa_id_1").closest(".form-group").addClass("error");
			mensajesError+="Indique a quién va dirigido el recurso.<br>";
		}


		// Tablas relacionadas Autores
		if ($('#tableAutor div.row').length < 1 ){
			$('#tableAutor').addClass("clearfix error");
			mensajesError+="Se requiere al menos 1 autor responsable.<br>";
		} else {
			$('#tableAutor').parent().removeClass("error");

			var autorResponsable = 0;
			$("select[name*='autor.autorfuncion']").each(function(){
				//var num =        $(this).attr("name").substring(($(this).attr("name")).indexOf("[")+1, $(this).attr("name").length-1  );
				var num = $(this).attr("name").substring("autor.autorfuncion".length);
				// Si no se eligió el tipo de autoría
				if ($(this).val()==''){
					$("[name='autor.autorfuncion"+num+"']").parent().removeClass("has-success").addClass("has-error");
					$("[name='autor.autorfuncion"+num+"']").parent().addClass("error");
					mensajesError+="Seleccionar el tipo de autoría para el autor.<br>";
					if ( $("[name='autor.nombre"+num+"']").val().length==0  ){
						$("[name='autor.nombre"+num+"']").parent().removeClass("has-success").addClass("has-error");
						$("[name='autor.nombre"+num+"']").attr("readonly",false);
						$("[name='autor.nombre"+num+"']").prop("disabled",false);
						$("[name='autor.nombre"+num+"']").parent().addClass("error");
						mensajesError+="Falta el nombre del autor.<br>";
					} else {
						$("[name='autor.nombre"+num+"']").parent().removeClass("error").removeClass("has-error");
					}
					if ( $("[name='autor.paterno"+num+"']").val().length==0  ){
						$("[name='autor.paterno"+num+"']").parent().removeClass("has-success").addClass("has-error");
						$("[name='autor.paterno"+num+"']").attr("readonly",false);
						$("[name='autor.paterno"+num+"']").prop("disabled",false);
						$("[name='autor.paterno"+num+"']").parent().addClass("error");
						mensajesError+="Falta el apellido paterno del autor.<br>";
					} else {
						$("[name='autor.paterno"+num+"']").parent().removeClass("error").removeClass("has-error");
					}
					if ( $("[name='autor.materno"+num+"']").val().length==0  ){
						$("[name='autor.materno"+num+"']").parent().removeClass("has-success").addClass("has-error");
						$("[name='autor.materno"+num+"']").attr("readonly",false);
						$("[name='autor.materno"+num+"']").prop("disabled",false);
						$("[name='autor.materno"+num+"']").parent().addClass("error");
						mensajesError+="Falta el apellido materno del autor.<br>";
					} else {
						$("[name='autor.materno"+num+"']").parent().removeClass("error").removeClass("has-error");
					}
				} else {
					$("[name='autor.autorfuncion"+num+"']").parent().removeClass("error");
					// Revisa que por lo menos este seleccionado el autor de contenidos responsable
					// y que tenga email y teléfono
					if ($(this).val()==1) {
						autorResponsable++;
						if ( $("[name='autor.nombre"+num+"']").val().length==0  ){
							$("[name='autor.nombre"+num+"']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.nombre"+num+"']").attr("readonly",false);
							$("[name='autor.nombre"+num+"']").prop("disabled",false);
							$("[name='autor.nombre"+num+"']").parent().addClass("error");
							mensajesError+="El autor responsable debe proporcionar su nombre.<br>";
						} else {
							$("[name='autor.nombre"+num+"']").parent().removeClass("error").removeClass("has-error");
						}

						if ( $("[name='autor.paterno"+num+"']").val().length==0  ){
							$("[name='autor.paterno"+num+"']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.paterno"+num+"']").attr("readonly",false);
							$("[name='autor.paterno"+num+"']").prop("disabled",false);
							$("[name='autor.paterno"+num+"']").parent().addClass("error");
							mensajesError+="El autor responsable debe proporcionar su apellido paterno.<br>";
						} else {
							$("[name='autor.paterno"+num+"']").parent().removeClass("error").removeClass("has-error");
						}
						if ( $("[name='autor.materno"+num+"']").val().length==0  ){
							$("[name='autor.materno"+num+"']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.materno"+num+"']").attr("readonly",false);
							$("[name='autor.materno"+num+"']").prop("disabled",false);
							$("[name='autor.materno"+num+"']").parent().addClass("error");
							mensajesError+="El autor responsable debe proporcionar su apellido materno.<br>";
						} else {
							$("[name='autor.materno"+num+"']").parent().removeClass("error").removeClass("has-error")
						}
						if ($("[name='autor.correo0']").val().length==0  ){
							$("[name='autor.correo0']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.correo0']").attr("readonly",false);
							$("[name='autor.correo0']").prop("disabled",false);
							$("[name='autor.correo0']").parent().addClass("error");
							mensajesError+="El autor responsable debe proporcionar su email.<br>";
						} else {
							// Verificar que se cumpla con el formato de email
							if ( $("#correo0ClassWithErrors ul li").html() == undefined ){
								$("[name='autor.correo0']").parent().removeClass("error").removeClass("has-error")
							} else {

								//if ($( "#correo0ClassWithErrors ul li").html().length != 0 ){
									$("[name='autor.correo0']").parent().addClass("error");
									mensajesError+="El correo del autor debe corresponder al formato de email.<br>";
								//}
							}
						}

						if ($("[name='autor.telefono0']").val().length==0  ){
							$("[name='autor.telefono0']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.telefono0']").attr("readonly",false);
							$("[name='autor.telefono0']").prop("disabled",false);
							$("[name='autor.telefono0']").parent().addClass("error");
							mensajesError+="El autor responsable debe proporcionar su teléfono.<br>";
						} else{
							// Verificar que se cumpla con el formato de teléfono
							if ($( "#telefono0ClassWithErrors ul li").html() == undefined ){
								$("[name='autor.telefono0']").parent().removeClass("error").removeClass("has-error")
							} else {
								$("[name='autor.telefono0']").parent().addClass("error");
								mensajesError+="El teléfono del autor debe contener 5 o 10 dígitos.<br>";
							}
						}
					} else {
						if ( $("[name='autor.nombre"+num+"']").val().length==0  ){
							$("[name='autor.nombre"+num+"']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.nombre"+num+"']").attr("readonly",false);
							$("[name='autor.nombre"+num+"']").prop("disabled",false);
							mensajesError+="Falta el nombre del autor.<br>";
						} else {
							$("[name='autor.nombre"+num+"']").parent().removeClass("has-error").removeClass("error");
						}
						if ( $("[name='autor.paterno"+num+"']").val().length==0  ){
							$("[name='autor.paterno"+num+"']").parent().removeClass("has-success").addClass("has-error");
							$("[name='autor.patern["+num+"']").attr("readonly",false);
							$("[name='autor.paterno"+num+"']").prop("disabled",false);
							mensajesError+="Falta el apellido del autor.<br>";
						}
						if ($(this).val() == 9){
							var num =        $(this).attr("name").substring("autor.autorfuncion".length);
							if (  $("[name='autor.otroTipoAutoria"+num+"']").val().length==0 ){
								$("[name='autor.otroTipoAutoria"+num+"']").parent().addClass("error");
								mensajesError+="Falta especificar el otro tipo de autoría.<br>";
							} else
								$("[name='autor.otroTipoAutoria"+num+"']").parent().removeClass("error");
						}
					}
				}
			});
			if (autorResponsable == 0){
				$('#tablaAutores').parent().addClass("error");
				mensajesError+="Debe especificar al autor responsable.<br>";
			} else
				$('#tablaAutores').parent().removeClass("error");
		}

		// Tablas Relacionadas: Documentos

		$("div[id*='na']").each(function(){
			if ( $(this).html().length == 0  ){
				$(this).parent().addClass("error");
				mensajesError+="No ha agregado archivo.<br>";
			} else
				$(this).parent().removeClass("error");
		});

		$("select[name^='documento.tipodocumento']").each(function(){
			if ($(this).val()){
				if ($(this).val().length == 0){
					$(this).parent().addClass("error");
					mensajesError+="Debe especificar el tipo de documento.<br>";
				} else
					$(this).parent().removeClass("error");
			}
		});

		//Se deben incluir tipoarchivo 6, 3, 2, 4, 5

		console.log($("select[name^='documento.tipodocumento'] option:selected").length)
		var tipos = [];

		$("select[name^='documento.tipodocumento'] option:selected").each(function(e){
			//console.log("...", $(this).val() )
			tipos.push($(this).val());
		});

		var tiposObligatorios = ["2","3","4","5","6"];
		//arrayContainsArray busca en 'tipos' que tenga todos los elementos de 'tiposObligatorios'
		var correcto = arrayContainsArray(tipos, tiposObligatorios);

		console.log("correcto: ",correcto)


		if (correcto==false){
			console.log("HAY ERRORES EN LOS DOCUMENTOS")
			mensajesError+="Debe incluir los tipos de documentos obligatorios.<br>";
			$(".row .tablaIndicacionesDoctos2").css("color","blue");
			$('.row .tablaIndicacionesDoctos2').addClass("error");
		} else {
			console.log("DOCUMENTOS OK")
			$(".row .tablaIndicacionesDoctos2").css("color","black");
			$('.row .tablaIndicacionesDoctos2').removeClass("error");
		}


		//return false;




		if (   $("div[id*='na']:empty").length !=0  )
			mensajesError+="Debe agregar al menos un archivo.<br>";

		//Si se opta por otro formato de entrega, especificar cual
		/*
		if ( formatoentrega_id_3.checked ){
			if (!$('#formatoentregaotro').val()){
				$('#formatoentregaotro').parent().parent().addClass("error");
				mensajesError+="Debe indicar cual es el tipo de formato de entrega.<br>";
			} else
				$('#formatoentregaotro').parent().parent().removeClass("error");
		}
        */


		//Si se opta por otro alcance curricular, especificar cual
        if ( $("#alcancecurricular_id option:selected").val() == 99 ){
            if (!$('#alcancecurricularotro').val()){
                $('#alcancecurricularotro').parent().parent().addClass("error");
                mensajesError+="Debe indicar cual es el alcance curricular.<br>";
            } else
                $('#alcancecurricularotro').parent().parent().removeClass("error");
        }


		// Verificar que la fecha de elaboración sea menor a la fecha actual
		if (validaFechaElaboracion(  $('#elaboracion').val()  ) == false){
			$('#elaboracion').parent().parent().addClass("error");
			mensajesError+="La fecha de elaboración del recurso debe ser anterior a la fecha de hoy.<br>";
		}


		//Valida el campo de la versión anterior (si aplica)
		if ( $("#version_id_2").is(':checked'))
		{
			if ( $("input[type='radio'][name='extra1']:checked").length==0 ){
				$("#divVersion").find(".form-group").addClass("error");
				mensajesError+="Especifique si recuerda la clave de control del recurso que va a actualizar.<br>";
			} else {
				if (  $("#extra1_S").is(":checked")) {
					if ($("#versionanterior_recursoanterior_id").val().length == 0  ){

						$("#divNumControl").addClass("error");
						mensajesError+="Escriba la clave de control de la evaluación que se esta actualizando.<br>";
					} else {
					//Validar existencia de numero de control
						if (bnca()==0){
							mensajesError+="El número de control que ingresó no existe.<br>";
						}
					}
				}
				if ( $("#extra1_N").is(":checked")){
					$("#versionanterior_recursoanterior_id").val("");
				}
			}
		}

        //  Valida que se haya escrito una sinópsis
        if (!$("#sinopsis").val()){
            mensajesError += "Debe escribir La sinopsis del recurso.<br>";
        }

		// VAlida que no se sobrepase 1200 caracteres la sinopsis
		if ($("#sinopsis").val().length >= 1200){
			$("#sinopsis").parent().find(".help-block").html('<ul class="list-unstyled"><li>Este campo ha excedido los 600 caracteres</li></ul>');
			$("#sinopsis").parent().parent().addClass("has-error");
			$("#sinopsis").parent().parent().addClass("error");
			mensajesError = mensajesError + "La sinopsis no debe exceder los 1000 caracteres.<br>";
		}
        console.log("   mensajesError: ",mensajesError);
        alert("   mensajesError: "+mensajesError);
		return mensajesError;
	}






	
	
	
	function tablasRelacionadas(){
		var palabrasFaltantes = 0;
		var mensajes ="";
		$("select[name*='palabra.descripcion']").each(function(){	
			if ( !$(this).val() )
				palabrasFaltantes++;
		});
		if (palabrasFaltantes!=0)
			mensajes = "faltan "+palabrasFaltantes+" palabras:";
		return mensajes;					
	}
	
	function clickFormato(e){
		if( $(e).val() == 3  ){
			$('#formatoentregaotro').attr('readonly', false);
			$('#formatoentregaotro').attr('disabled', false);
			$('#formatoentregaotro').parent().show();
			$("label[for='formatoentregaotro']").show();
		} else {
			$('#formatoentregaotro').parent().hide();
			$("label[for='formatoentregaotro']").hide();
		}
	}
	
	function clickAlcance(e){
		//***La siguiente línea se eliminó a petición del usuario Febrero2018
		//$("#duracion").closest(".clearfix").parent().toggle( $(e).val() ==3 || $(e).val() ==4 || $(e).val()==5  );
		$("#alcancecurricularotro, label[for='alcancecurricularotro']").toggle($(e).val() == 99);
	}
	
	
	
	
	function quitarBotones(){
		//Quita botones de quitar palabras, autores y documentos
		$("#tablaPalabras input[type='button'], #tablaAutores input[type='button'], #tablaDocumentos input[type='button']").hide();

		//Quita botones de agregar palabras , autores y documentos
		$("#tablaPalabras tfoot, #tablaAutores tfoot,  #tablaDocumentos tfoot").hide();
		
		// Mostrar botones de agregar documentos y botones cuando hay observaciones relacionadas a documentos
		if (    ($("[name*='observacion_documento.nombrearchivo']:visible").length != 0)   ||     ($("[name*='observacion_documento.tipodocumento']:visible").length != 0 )      ){
			$("#tablaDocumentos input[type='button']").show();
			$("#tablaDocumentos tfoot").show();
		}
	}
	
	
	function validaFechaElaboracion(fechae){
		var auxFecha = new Date(fechae);
		var auxFecha2 = moment(fechae,"DD/MM/YYYY");
		var hoy = moment(new Date());

		if ( auxFecha2.isAfter(hoy)){
			return false
		} else
			return true
	}


	function bnca(){		
		var ant = $('#versionanterior_recursoanterior_id').val();	
		var actual = $("div.numControlNumero").html();
		if(ant.length == 0 ){
			$('#msgBuscarNc').html( "Debe proporcionar la clave de control anterior" ).addClass("form-group clearfix error");
		} else 
		{
			
			if (ant == actual){
				$('#msgBuscarNc').html( "No puede referenciarse a si mismo" ).addClass("form-group clearfix error");
			} else {
				$.ajax({
				  method: "GET",
				  url: "/buscarNC/"+ant,
				  dataType: "json",
				  async: false
				})
				  .success(function( retorno ) { 		
				  	if ( (retorno.estado == "error")){
				  		$('#msgBuscarNc').html( "La clave de control anterior no existe!!!" );
				  		$('#divNumControl').addClass("form-group clearfix error");
				  		return 0;
				  	}
					else {		  
						$('#msgBuscarNc').html(  "Existe, coresponde al recurso: "+retorno.titulo+" del autor "+retorno.autor).removeClass("error");
						return 1;
					}
				  })		  
				  .error(function(data){
				  	$('#msgBuscarNc').html( "Error" );
				  });	
			}
		}
	}
	
	
	function arrayContainsArray (superset, subset) {
			superset.sort();
			subset.sort();
		  if (0 === subset.length) {
		    return false;
		  }
		  return subset.every(function (value) {
		    return (superset.indexOf(value) >= 0);
		  });
		}
	
	
	
	
	function filtradoUnidadesAcademicas(){
		$("#unidadacademica_id").find("option").remove();
		if ($("#niveleducativo_id option:selected").val().length == 0){
            $("#unidadacademica_id").append($("<option></option>").addClass("blank").text("Seleccione primero el nivel educativo"));
        }
		if ($("#niveleducativo_id option:selected").val().length > 0){
			$.ajax({
				  method: "GET",
				  url: "/ajaxUnidadAcademicaFiltrada/"+$("#niveleducativo_id option:selected").val(),
				  dataType: "json"
				})
				  .done(function( retorno ) {
					  if (retorno.length==0){
						  $("#unidadacademica_id").append($("<option></option>").addClass("blank").text("No se encontraron Unidades Académicas")); 
					  } else {
						  $("#unidadacademica_id").append($("<option></option>").addClass("blank").text("Seleccione la Unidad Académica..."));
						  retorno.forEach(function(ua){
							  $("#unidadacademica_id").append($("<option></option>").attr("value",ua.id).text(ua.nombre)); 
							//  console.log("agregado "+ua.id+" - "+ua.nombre)
						  });
					  }
				  })		  
				  .fail(function( jqXHR, textStatus ) {
					  alert( "Request failed: " + textStatus );
				  });           
        }         
    }	


	$(document).on("keyup5", 'input, textarea', function(event){
        var key = event.keyCode || event.charCode;
		if (key == 8 || key == 46){		
			$(this).parent().find(".help-block").html("");
			if ($(this).attr("maxlength") != undefined){
				if (  $(this).val().length > $(this).attr("maxlength")  ){
					$(this).closest(".form-group").addClass("has-error");
					$(this).parent().find(".help-block").html("Se ha alcanzado la longitud máxima para este campo.");
				} else {
					$(this).closest(".form-group").removeClass("has-error");
				}
			}
		}
	});	

        // VAlida campos de tipo hora
    $(".soloHora").blur(function () {
        if ($(this).val()){
            if (!/^(?:\d|[01]\d|2[0-3]):[0-5]\d$/.test($(this).val())) {
                $(this).popover({
                  title: "Error de validación",
                  content: "Este campo solo acepta hora en formato hh:mm",
                  placement: "top"
                });
                $(this).parent().addClass('has-error');
                $(this).popover('show');
            } else {
                $(this).parent().removeClass('has-error');
                $(this).popover('hide');
            }
        }
    });



    //Valida que los campos solo acepten letras, especios, signos de puntuación
    $(document).on("blur",".validaRegExp", function (e) {
        $(this).keydown();
    });

    $(document).on("paste",".validaRegExp", function (e) {
        var patron = $(this).attr("patron");
        var pastedData = e.originalEvent.clipboardData.getData('text');
        if (   !eval("/^"+patron+"$/").test(pastedData)){
            alert("Al menos uno de los caracteres que intenta copiar no es válido.");
            return false;
        }
    });

    $(document).on("keydown",".validaRegExp", function (e) {
        console.log("... validaRegExp   " )
        $(this).parent().find(".help-block").html("");
        tecla = e.keyCode || e.which;
        console.dir( $(this).val() )
        //console.dir( e.shiftKey+"   "+tecla )
        console.dir(e)
        console.log("Tamaños: "+$(this).val().length +"    "+ $(this).attr("maxlength"))
        $(this).closest(".form-group").removeClass("has-error");

        var re = new RegExp($(this).attr("patron"), 'i');
        console.log("re: "+re)
        console.log("key: "+e.key)

        console.log( re.test(e.key)  )
        console.log("tecla: "+ tecla)

        if ( re.test(e.key) || tecla == undefined ){

        } else {
            // Allow: backspace, delete, tab, escape, enter, F5
            if ($.inArray(tecla, [46, 8, 9, 27, 13, 116]) !== -1 ||
                 // Allow: Ctrl+A, Command+A
                (tecla === 65 && (e.ctrlKey === true || e.metaKey === true)) ||
                // Control c
                (tecla === 67 && (e.ctrlKey === true || e.metaKey === true)) ||
                // Alt
                (tecla === 18 && (e.altKey === true)) ||
                // Alt Gr
                (tecla === 225 && (e.key === "AltGraph")) ||
                 // Allow: home, end, left, right, down, up
                (tecla >= 35 && tecla <= 40) ){
                     // let it happen, don't do anything
                console.log("ignorado")
                     return;
            } else {
                console.log("...NO PASA...")
                //console.log(e.key.match(re))
                var patron = $(this).attr("patron").replace("]","");
                patron = patron.replace("]","");
                patron = patron.replace("[","");
                console.log("se encontró algun error")
                var msgError ="Este campo acepta: ";
                let aux=patron;
                if (patron.includes("a-z") ){
                    aux = aux.replace("a-z", "", "gi");
                    aux = aux.replace("A-Z", "", "gi");
                    msgError+= " letras, "
                        console.log("patron aux: "+aux)
                }
                if (patron.includes(" ")){
                    aux = aux.replace(" ", "", "gi");
                    msgError+= " espacios, "
                        console.log("patron aux: "+aux)
                }
                if (patron.includes("0-9")){
                    aux = aux.replace("0-9", "", "gi");
                    msgError+= " números, "
                        console.log("patron aux: "+aux)
                }

                console.log("patron aux: "+aux)

                if (aux.length>0){
                    msgError+=" y los caracteres ";
                    for (let c of aux){
                        msgError+=c+"  ";
                    }
                }

                $(this).closest(".form-group").addClass("has-error");
                $(this).parent().find(".help-block").html(msgError.substring(0, msgError.length-2));
                e.preventDefault();
            }


        }
    });
        
        
	
	
	