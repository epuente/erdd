//Valida el tamaño de los archivos a subir
//Actualiza el preview
$(document).on('change','#archImaFirma', function(){
    console.log(".....change");

        var aux = $(this).val().split("\\")
        var nombreArchivo = aux[aux.length-1];
        console.log("nom arch:"+nombreArchivo)
        if ($(this).prop("id")=="archImaFirma"){
            imagesPreview(this, '#previewImaFirma');
            $("#archImagenFirmaActual").text(nombreArchivo).show();
            $("#swMini").prop("checked", false);
        }
});


var imagesPreview = function(input, placeToInsertImagePreview) {
    console.log("Desde imagesPreview ")

    console.log("00001");
    $(placeToInsertImagePreview).html("");
    if (input.files) {
        console.log("00002");
        var filesAmount = input.files.length;
        console.log("tam archivo: "+filesAmount);
            for (i = 0; i < filesAmount; i++) {
            console.log("i="+i);
            var reader = new FileReader();
            reader.onload = function(event) {
            /*
                console.log(event.target.result)
                $("#carruselContenido").html(event.target.result);
                    const objetoJSON = JSON.stringify(event.target.result);
                    console.log(objetoJSON);
                    */

                $($.parseHTML('<img>'))
                        .attr('src', event.target.result)
                        //.attr('width', "400px").attr('height', "200px")
                        //.attr('class', 'img-fluid')
                        .attr('class','img-responsive')
                        //.attr('style', 'margin-left: auto; margin-right: auto; width:100%')
                        .appendTo(placeToInsertImagePreview);
            }
            reader.readAsDataURL(input.files[i]);
            //console.log(input.files[i])
        }

    }
}

// Cuando se le da click para subir archivo
$("#btnCargarImaFirma").click(function(e){
    e.preventDefault();
    $("[name='imagenfirma']").click();
});