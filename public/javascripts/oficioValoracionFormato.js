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

// Para generarlo y verlo en pantalla
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





