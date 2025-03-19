$("#btnPreviewFormato").click(function(e){
    e.preventDefault();
    console.log("click")
    var pv = new Object;
    pv.encabezado = $("#encabezado").val();
    pv.asunto = $("#asunto").val();
    pv.cuerpo1 = $("#cuerpo1").val();
    pv.cuerpo2 = $("#cuerpo2").val();
    pv.cuerpo3 = $("#cuerpo3").val();
    pv.cuerpo4 = $("#cuerpo4").val();
    pv.cuerpo5 = $("#cuerpo5").val();
    pv.despedida = $("#despedida").val();
    pv.direccionDEV = $("#direccionDEV").val();
    console.dir(pv)
    cargarPDF(pv);
});


$("#btnPreviewFormato2").click(function(e){
    e.preventDefault();
    console.log("click")
    var token = $("input[name='csrfToken']").val();
    console.log("token:"+token)





                        var pv = new Object;
                        pv.encabezado = $("#encabezado").val();
                        pv.asunto = $("#asunto").val();
                        pv.cuerpo1 = $("#cuerpo1").val();
                        pv.cuerpo2 = $("#cuerpo2").val();
                        pv.cuerpo3 = $("#cuerpo3").val();
                        pv.cuerpo4 = $("#cuerpo4").val();
                        pv.cuerpo5 = $("#cuerpo5").val();
                        pv.despedida = $("#despedida").val();
                        pv.direccionDEV = $("#direccionDEV").val();
                        console.dir(pv)

                                            // Crear un objeto FormData
                                            var file = $('#archFondo')[0].files[0];
                                            var formData = new FormData();
                                            formData.append('laVersion',  $("#laVersion").text());
                                            formData.append('file', file);
                                            formData.append('encabezado', $("#encabezado").val());
                                            formData.append('asunto', $("#asunto").val());
                                            formData.append('cuerpo1', $("#cuerpo1").val());
                                            formData.append('cuerpo2', $("#cuerpo2").val());
                                            formData.append('cuerpo3', $("#cuerpo3").val());
                                            formData.append('cuerpo4', $("#cuerpo4").val());
                                            formData.append('cuerpo5', $("#cuerpo5").val());
                                            formData.append('despedida', $("#despedida").val());
                                            formData.append('direccionDEV', $("#direccionDEV").val());
                                            formData.append("token", token);
                                            $("#frmCreate").attr("method", "POST");
                                            $("#frmCreate").attr("action", "upload");
                                            formData.append('csrfToken', token );


                                            cargarPDF2(formData);




});



// Para generarlo y verlo en pantalla (en el visor que esta en la ventana modal)
async function cargarPDF(parametros) {
    try {

        // Objeto JSON que deseas enviar al servidor

        url = "/previewFormato";
        const response = await fetch(url, {
            method: "POST", // Cambiar a POST para enviar datos
            headers: {
                'Content-Type': 'application/json' // Indicar que el cuerpo es JSON
            },
            body: JSON.stringify(parametros) // Convertir el objeto JSON a una cadena

            //*****************************************
            //Modificar para se envíe con formData

            //Agregar otro evento de itext encabezado para los previews que tomafran la imagen desde el formulario


        });

        if (!response.ok) {
            throw new Error("Error en la solicitud: " + response.statusText);
        }

        const data = await response.blob(); // Convertir la respuesta a un Blob
        console.log("Tamaño del Blob:", data.size); // Verifica el tamaño del Blob

        if (data.size === 0) {
            console.error("El Blob está vacío.");
            return;
        }

        // Crear una URL para el Blob
        const urlBlob = URL.createObjectURL(data);

        // Crear un iframe para mostrar el PDF
        const iframe = '<iframe src="' + urlBlob + '" width="100%" height="100%"></iframe>';

        // Insertar el iframe en el div
        $('#visorPDF').html(iframe);

        // Mostrar el modal (si es necesario)
        $('#myModalOV').modal('show');
    } catch (error) {
        console.log("Error: " + error);
    }
}



async function cargarPDF2(formData) {


        // Crear un objeto FormData
        var file = $('#archFondo')[0].files[0];

        if (1==1){
            formData.forEach(function(value, key){
                console.log(key + ' = ' + value);
            });
            url = "/previewFormato2";
            const response = await fetch(url, {
                method: "POST", // Cambiar a POST para enviar datos
                body: formData,
                credentials: 'include',
            });

            if (!response.ok) {
                throw new Error("Error en la solicitud: " + response.statusText);
            }

            const data = await response.blob(); // Convertir la respuesta a un Blob
            console.log("Tamaño del Blob:", data.size); // Verifica el tamaño del Blob

            if (data.size === 0) {
                console.error("El Blob está vacío.");
                return;
            }

            // Crear una URL para el Blob
            const urlBlob = URL.createObjectURL(data);

            // Crear un iframe para mostrar el PDF
            const iframe = '<iframe src="' + urlBlob + '" width="100%" height="100%"></iframe>';

            // Insertar el iframe en el div
            $('#visorPDF').html(iframe);

            // Mostrar el modal (si es necesario)
            $('#myModalOV').modal('show');
        }

}





async function abrirModalMostrarPDF(losBytes) {
    try{
        const data = new Blob([losBytes], { type: 'application/pdf' });
        const urlBlob = URL.createObjectURL(data);
        const iframe = '<iframe src="' + urlBlob + '" width="100%" height="100%"></iframe>';


        $('#visorPDF').html(iframe);
        $('#myModalOV').modal('show');
    } catch (error) {
              console.log("Error: " + error);
          }
}

async function upload0(){
    // Crear un objeto FormData
    var file = $('#archFondo')[0].files[0];
    var formData = new FormData();
    formData.append('file', file);
    formData.append('encabezado', $("#encabezado").val());
    formData.append('asunto', $("#asunto").val());
    formData.append('cuerpo1', $("#cuerpo1").val());
    formData.append('cuerpo2', $("#cuerpo2").val());
    formData.append('cuerpo3', $("#cuerpo3").val());
    formData.append('cuerpo4', $("#cuerpo4").val());
    formData.append('cuerpo5', $("#cuerpo5").val());
    formData.append('despedida', $("#despedida").val());
    formData.append('direccionDEV', $("#direccionDEV").val());
   // formData.append('csrfToken', "@CSRF.formField")

    console.dir(formData)

    // Realizar la solicitud con fetch
        const response = await fetch("/upload", {
            method: "POST",
            body: formData
        });

        if (!response.ok) {
            throw new Error("Error en la solicitud: " + response.statusText);
        }

        const data = await response.blob(); // Convertir la respuesta a un Blob
        console.log("Tamaño del Blob:", data.size); // Verifica el tamaño del Blob

        if (data.size === 0) {
            console.error("El Blob está vacío.");
            return;
        }

        // Crear una URL para el Blob
        const urlBlob = URL.createObjectURL(data);

        // Crear un iframe para mostrar el PDF
        const iframe = '<iframe src="' + urlBlob + '" width="100%" height="100%"></iframe>';

        // Insertar el iframe en el div
        $('#visorPDF').html(iframe);

        // Mostrar el modal (si es necesario)
        $('#myModalOV').modal('show');



}


// Para guardar el formato que esta en el visor (el visor esta en la ventana modal)
$("#btnGenerarGuardarModal").click(function(){
        console.log("click")
        var url = "/generaOficioValoracionAJAX";

        var id= $("#laVersion").val();
        var encabezado = $("#encabezado").val();
        var asunto = $("#asunto").val();
        var cuerpo1 = $("#cuerpo1").val();
        var cuerpo2 = $("#cuerpo1").val();
        var cuerpo3 = $("#cuerpo1").val();
        var cuerpo4 = $("#cuerpo1").val();
        var cuerpo5 = $("#cuerpo1").val();
        var despedida = $("#despedida").val();
        var direccionDEV = $("#direccionDEV").val();

        const parametros = {
            id: $("#laVersion").val(),
            activo : $("input[type='radio'][name='activo']:checked").val(),
            encabezado : $("#encabezado").val(),
            asunto : $("#asunto").val(),
            cuerpo1 : $("#cuerpo1").val(),
            cuerpo2 : $("#cuerpo1").val(),
            cuerpo3 : $("#cuerpo1").val(),
            cuerpo4 : $("#cuerpo1").val(),
            cuerpo5 : $("#cuerpo1").val(),
            despedida : $("#despedida").val(),
            direccionDEV : $("#direccionDEV").val()
        }


        /*
        const parametros = {
            idRecurso: id,
            folio: folio,
            fecha: fecha,
            recepcion: folRecepcion,
            iniciales: iniciales
        };
        */
        //var $x = LlamadaAjax("/saveFormato", "POST", JSON.stringify({parametros}));
        var token = $("input[name='csrfToken']").val();
        var file = $('#archFondo')[0].files[0];
        var formData = new FormData();
        formData.append('version',  $("#laVersion").text());
        formData.append('activo',  $("input[name='activo']:checked").val());
        formData.append('file', file);
        formData.append('encabezado', $("#encabezado").val());
        formData.append('asunto', $("#asunto").val());
        formData.append('cuerpo1', $("#cuerpo1").val());
        formData.append('cuerpo2', $("#cuerpo2").val());
        formData.append('cuerpo3', $("#cuerpo3").val());
        formData.append('cuerpo4', $("#cuerpo4").val());
        formData.append('cuerpo5', $("#cuerpo5").val());
        formData.append('despedida', $("#despedida").val());
        formData.append('direccionDEV', $("#direccionDEV").val());
        //formData.append("token", token);
        $("#frmCreate").attr("method", "POST");
        $("#frmCreate").attr("action", "upload");
        console.dir(formData)
        for (let [nombre, valor] of formData.entries()) {
            console.log(`${nombre}: ${valor}`);
        }
        formData.append('csrfToken', token );
        console.dir(formData)
        $.ajax({
            url: '/saveFormato',
            type: 'POST',
            data: formData,
            processData: false,
            contentType: false,
            success: function(data) {
                console.dir( data );
                if (data.estado=="agregado"){
                    $.notify({
                        title: "Correcto:",
                        message: data.mensaje+"<br><br>...regresando a <strong>formato de oficio de valoración</strong>."
                    }, {type: 'success'});
                    $('#myModalOV').modal('hide');
                    setTimeout(() => {
                        location.href = '/formatoOV';
                    }, "2000");
                }
                if (data.estado=="error"){
                    $.notify({
                        title: "Error:",
                        message: data.mensaje+"<br><br>No fue posible agregar un nuevo formato."
                    }, {type: 'danger'});
                }
            },
            error: function(request, status, error) {
                alert(request.responseText);
            }
        });
});


// Para actualizar el formato que esta en el visor (el visor esta en la ventana modal)
$("#btnActualizarModal").click(function(){
    console.log("click actualizar formato")


    // Crear un objeto FormData
    var file = $('#archFondo')[0].files[0];
    var formData = new FormData();
    formData.append('laVersion',  $("#laVersion").text());
    formData.append('activo',  $("input[name='activo']:checked").val());
    formData.append('file', file);
    formData.append('encabezado', $("#encabezado").val());
    formData.append('asunto', $("#asunto").val());
    formData.append('cuerpo1', $("#cuerpo1").val());
    formData.append('cuerpo2', $("#cuerpo2").val());
    formData.append('cuerpo3', $("#cuerpo3").val());
    formData.append('cuerpo4', $("#cuerpo4").val());
    formData.append('cuerpo5', $("#cuerpo5").val());
    formData.append('despedida', $("#despedida").val());
    formData.append('direccionDEV', $("#direccionDEV").val());
    //formData.append("token", token);
    //$("#frmCreate").attr("method", "POST");
    //$("#frmCreate").attr("action", "upload");
    formData.append('csrfToken', $("input[name='csrfToken']").val() );

        for (let [nombre, valor] of formData.entries()) {
            console.log(`${nombre}: ${valor}`);
        }
        console.dir(formData)

       // return false;

    $.ajax({
        url: '/updateFormato',
        type: 'POST',
        data: formData,
        processData: false,
        contentType: false,
        success: function( data ) {
            if (data.estado=="actualizado"){
                $.notify({
                    title: "<strong>Correcto</strong><br>",
                    message: data.mensaje+"...regresando a formato de oficio de valoración."
                }, {type: 'success'});
                $('#myModalOV').modal('hide');
                setTimeout(() => {
                    location.href = '/formatoOV';
                }, "3500");
            }
            if (data.estado=="<strong>error</strong><br>"){
                $.notify({
                    title: "Error:",
                    message: data.mensaje+"<br><br>"
                }, {type: 'danger'});
            }
        },
        error: function(request, status, error) {
            alert(request.responseText);
        }
    });




    /*
    const parametros = {
        idRecurso: id,
        folio: folio,
        fecha: fecha,
        recepcion: folRecepcion,
        iniciales: iniciales
    };
    var $x = LlamadaAjax("/editOficioValoracionFormatoAJAX", "POST", JSON.stringify({parametros}));
    $.when($x).done(function(data){
        console.dir(data)
        if (data.estado=="actualizado"){
            $.notify({
                title: "Correcto:",
                message: data.mensaje+"<br><br>...regresando a evaluaciones concluidas."
            }, {type: 'success'});
            $('#myModalOV').modal('hide');
            setTimeout(() => {
                location.href = '/mostrarEvaluacionesConcluidas/0/lg';
            }, "2000");
        }
        if (data.estado=="error"){
            $.notify({
                title: "Error:",
                message: data.mensaje+"<br><br>...regresando a evaluaciones concluidas"
            }, {type: 'danger'});
        }
    });
    */
});


// Al oprimir el botón de subir archivo, se lanza el evento en el input type=file
$("#btnCargarImaFondo").click(function(e){
    e.preventDefault();
    $("#archFondo").click();
});

// Cuando se seleccione un archivo en el input type=file, poner el nombre del archivo al div msgNombreArchivo
$("#archFondo").change(function(){
    fic = $(this).val().split('\\');
    $("#msgNombreArchivo").text(  fic[fic.length-1] );
});


