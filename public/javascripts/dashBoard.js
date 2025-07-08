$("[data-nombre='btnTipo']").click(function(e){
    e.preventDefault();
    if (  $(this).attr("data-tipo")=="nuevo" ){
        $("[data-tipo='nuevo']").addClass("activo").removeClass("inactivo");
        $("[data-tipo='anterior']").addClass("inactivo").removeClass("activo");
        $("#dashNuevo").show();
        $("#dashAnterior").hide();
    }
    if (  $(this).attr("data-tipo")=="anterior" ){
        $("[data-tipo='anterior']").addClass("activo").removeClass("inactivo");
        $("[data-tipo='nuevo']").addClass("inactivo").removeClass("activo");

        $("#dashNuevo").hide();
        $("#dashAnterior").show();
    }
    if (  $(this).attr("data-tipo")=="log" ){
        openNav();
    }
    console.dir($(this).attr("data-tipo"));
});


$(".miPanel").click(function(){
    window.location = $(this).data("liga");
});