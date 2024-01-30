package controllers;

import java.util.List;

import models.ClasificadorEjemplo;
import play.libs.Json;
import play.mvc.Result;

public class TiporecursoController extends ControladorSeguro{
	
    public static Result list(){
    	List<ClasificadorEjemplo> ejemplos = ClasificadorEjemplo.find
    			.fetch("tiporecurso")
    			.orderBy("tiporecurso.descripcion")
    			.findList();
    	String aux = "";
    	for(ClasificadorEjemplo ejemplo : ejemplos){
    		aux+="<tr><td>"+ejemplo.tiporecurso.descripcion+"</td></tr>";
    	}    
System.out.println("Ejemplos :"+aux);    	
		return ok (Json.toJson(ejemplos));
    }	
	

}
