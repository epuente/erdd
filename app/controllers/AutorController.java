package controllers;

import static play.data.Form.form;

import models.RecursoAutor;
import play.data.DynamicForm;
import play.mvc.Result;
import views.html.Autor.*;

public class AutorController extends ControladorSeguroCoordinador {
	public static Result list(){
		return ok( list.render(RecursoAutor.find.where().eq("autorfuncion.id",1L).findList()));
	}
	
	
	public static Result editEmail(Long idAutor ){
		return ok(edit.render(RecursoAutor.find.byId(idAutor)));
	}
	
	public static Result updateEmail(Long idAutor){
		DynamicForm requestData = form().bindFromRequest(); 
		RecursoAutor autor = RecursoAutor.find.byId(idAutor);
		autor.correo.email = requestData.get("autor.correo");
		autor.update();
		flash("success","Se actualizó el correo del autor del recurso '"+autor.recurso.titulo+"'");
		return redirect("/autores");
	}
}
