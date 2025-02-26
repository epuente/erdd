package controllers;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.avaje.ebean.Ebean;

import play.Routes;
import play.mvc.*;
import play.data.*;

import static play.Play.application;
import static play.data.Form.*;
import views.html.*;
import models.*;

public class Application extends ControladorDefault {


    
    public static class Login {
    	String usuario;
    	String password;
    	public String validate() {
    	    if (Usuario.autenticar(usuario, password) == null) {
    	      return "Invalid user or password";
    	    }
    	    return null;
    	}    	
    }
    
    
    public static Result login(){
    	session().clear();
    	String urlSitio = application().configuration().getString("urlSitio");
        urlSitio = (application().isDev()?"http://":"https://")+urlSitio;
		//String puerto = Play.application().configuration().getString("http.port");
		//String direccionPuerto = direccion+":"+puerto;
    	System.out.println("dirección :"+urlSitio);
    	
    	return ok(login.render(form(Login.class)));
    } 

    public static Result logout(){
    	session().clear();
    	return ok(login.render(form(Login.class)));
    }     
    
    public static Result autentica() {
    	session().clear();		
    	DynamicForm requestData = form().bindFromRequest();	
		String usuario = requestData.get("usuario");
		String password = requestData.get("password");
		Usuario u = Usuario.autenticar(usuario, password); 
		if ( u == null){				
			return ok( "" );
		} else {
	        session("nombre", u.personal.nombreCompleto());
	        StringBuilder roles = new StringBuilder();
	        StringBuilder cvesRoles= new StringBuilder();
	        for (UsuarioRol ur : u.personal.usuario.roles){
	        	roles.append(ur.rol.descripcion).append(" ");
	        	cvesRoles.append(ur.rol.id).append(" ");
	        }
	        if (cvesRoles.toString().contains("1 ")){
	        	session("idAdmin", u.personal.id.toString());
	        }
	        
	        if (cvesRoles.toString().contains("2 ")){
	        	Evaluador e = Evaluador.find.where().eq("personal.id", u.id).findUnique();
	        	session("idEvaluador", e.id.toString());
	        }

	        if (cvesRoles.toString().contains("3 ")){
	        	session("idAdminProceso", u.personal.id.toString());
	        }

			if (cvesRoles.toString().contains("4 ")){
				session("idAdminPM", u.personal.id.toString());
			}
	        session("roles", roles.toString());
	        session("cvesRoles", cvesRoles.toString());
	        
	        
			System.out.println("*******************************");
			System.out.println("****"+u.personal.nombre.toString()+" "+u.personal.paterno.toString()+" "+u.personal.materno.toString()+"****");
			System.out.println("****"+cvesRoles+"****");
			System.out.println("****"+roles+"****");
			System.out.println("****"+session("idAdmin")+"****");
			System.out.println("****"+session("idEvaluador")+"****");
			System.out.println("****"+session("idAdminProceso")+"****");
			System.out.println("****"+session("idAdminPM")+"****");


System.out.println("*******************************");

			return ok(session("cvesRoles"));		
		}
            
        
    }    
    
    
    
    

    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(Routes.javascriptRouter("jsRoutes",
		            /*controllers.routes.javascript.Application.list(),*/
		            /*controllers.routes.javascript.UnidadacademicaController.list2(),*/
		            controllers.routes.javascript.UnidadacademicaController.edit(),
		            controllers.routes.javascript.EvaluacionEvaluadorController.solicitarProrroga()
        		)
            );
    }    

    
    
    
    public static Result cambiarPassword(){
    	DynamicForm requestData = form().bindFromRequest();
System.out.println(requestData);    
System.out.println("tipo: "+session().get("idAdminProceso"));
System.out.println("cvesRoles: "+session().get("cvesRoles"));


		String password = requestData.get("passActual");
		String passwordNuevo = requestData.get("claveAcceso");
		Usuario u = null;
		// Es administrador?
		if( play.mvc.Controller.session().get("cvesRoles").contains("1 ")){
System.out.println("1");			
System.out.println("password "+  password);
System.out.println("passwordNuevo "+  passwordNuevo);
System.out.println("session().get('idAdmin') "+session().get("idAdmin"));
			Personal p = Personal.elAdministrador();
System.out.println("p "+p.nombreCompleto());
			u = Usuario.autenticar(   Usuario.find.where().eq("personal.id", p.id).findUnique().usuario  , password); 		
		}
		//¿Es evaluador?
		if(session().get("cvesRoles").contains("2 ")){
System.out.println("2");
			Evaluador e = Evaluador.find.byId( Long.parseLong(session().get("idEvaluador"))  );
			Personal p =  e.personal;
			
			u = Usuario.autenticar( p.usuario.usuario, password);			
		}		
		
		// ¿Es coordinador?
		if( play.mvc.Controller.session().get("cvesRoles").contains("3 ")){
System.out.println("3");			
System.out.println("password "+  password);
System.out.println("passwordNuevo "+  passwordNuevo);
System.out.println("session().get('idAdminProceso') "+session().get("idAdminProceso"));
			Personal p = Personal.elCoordinador();
System.out.println("p "+p.nombreCompleto());
			u = Usuario.autenticar(   Usuario.find.where().eq("personal.id", p.id).findUnique().usuario  , password); 		
		}		
		
		
System.out.println("u "+u); 
		if ( u == null){			
			return ok( "error:La clave de acceso actual no es correcta." );
		} else {
			
			u.password = passwordNuevo;
			u.update();
			

			return ok("Cambio correcto");
		}
    }
    

    
    public static Result cambiarEmail(){
    	DynamicForm requestData = form().bindFromRequest();
System.out.println(requestData);    	
		String password = requestData.get("pass");
		String email = requestData.get("email");
System.out.println("password "+password);			
System.out.println("email "+email);			
		Usuario u = null;
		// Es administrador?
		if( play.mvc.Controller.session().get("cvesRoles").contains("1 ")){
			Personal p = Personal.elAdministrador();
			u = Usuario.autenticar(   Usuario.find.where().eq("personal.id", p.id).findUnique().usuario  , password); 		
		}
		//¿Es evaluador?
		if(session().get("cvesRoles").contains("2 ")){
			Evaluador e = Evaluador.find.byId( Long.parseLong(session().get("idEvaluador"))  );
			Personal p =  e.personal;
			
			u = Usuario.autenticar( p.usuario.usuario, password);			
		}		
		// ¿Es coordinador?
		if( play.mvc.Controller.session().get("cvesRoles").contains("3 ")){
			Personal p = Personal.elCoordinador();
			u = Usuario.autenticar(   Usuario.find.where().eq("personal.id", p.id).findUnique().usuario  , password); 		
		}		
		if ( u == null){			
			return ok( "error:La clave de acceso actual no es correcta." );
		} else {
System.out.println("email "+email);			
			u.personal.correo = email;
			u.personal.update();
			return ok("Cambio de email correcto");
		}
    }    
    
    

    public static Result leerXL4(){    	
    	try
    	{
            FileInputStream file = new FileInputStream(new File("/home/epuente/criteriosxl2013.xlsx"));
    		//String n = routes.Assets.at("otros/criteriosxl2013.xlsx").toString();
    		//FileInputStream file = new FileInputStream(new File("assets/otros/criteriosxl2013.xlsx"));
            
            
            //Create Workbook instance holding reference to .xlsx file
            //HSSFWorkbook workbook = new HSSFWorkbook(file);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            
            //Get first/desired sheet from the workbook
            //HSSFSheet sheet = workbook.getSheetAt(0);
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            
            int nversion = Ebean.createSqlQuery("SELECT VersionActual() retorno").findUnique().getInteger("retorno");
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                	                
                if (row.getRowNum() >= 2){
System.out.println("Renglon: "+row.getRowNum() +" de "+sheet.getLastRowNum()+" en evaluacion_tabla");                	
		                //For each row, iterate through all the columns
		                Iterator<Cell> cellIterator = row.cellIterator();
		        		EvaluacionTabla evt2 = new EvaluacionTabla();	                
		                while (cellIterator.hasNext()) 
		                {
		                    Cell cell = cellIterator.next();
		                    //Check the cell type and format accordingly
		                    
		                   
		                    
		                    evt2.version = EvaluacionTablaVersion.find.where().eq("version",  nversion).findUnique();
		                     
//System.out.println("  columna "+cell.getColumnIndex());		                    
		                    

		                    // Reactivo
		                    if (cell.getColumnIndex() == 1){
		                    	 int aux = EvaluacionTablaReactivo.find.where().eq("descripcion",cell.getStringCellValue()).findRowCount();
		                    	if ( aux == 0   ){
		                    		EvaluacionTablaReactivo  evtr= new EvaluacionTablaReactivo();		                    		
		                    		evtr.descripcion = cell.getStringCellValue();
		                    		evtr.save();
		                    		evtr.refresh();
		                    		evt2.reactivo = evtr;
		                    	}	else {
		                    		evt2.reactivo = EvaluacionTablaReactivo.find.where().eq("descripcion",cell.getStringCellValue()).findUnique();
		                    	}	                    	
		                    			                    
		                    }
		                    //Aspecto
		                    if (cell.getColumnIndex() == 3){
		                    	if (cell.getStringCellValue().contains("1")){
		                    		evt2.aspecto = Aspecto.find.byId(1L);
		                    	}
		                    	if (cell.getStringCellValue().contains("2")){
		                    		evt2.aspecto = Aspecto.find.byId(2L);
		                    	}
		                    	if (cell.getStringCellValue().contains("3")){
		                    		evt2.aspecto = Aspecto.find.byId(3L);
		                    	}
		                    	if (cell.getStringCellValue().contains("4")){
		                    		evt2.aspecto = Aspecto.find.byId(4L);
		                    	}
		                    }
		                    
		                    
		                    
		                    if (cell.getColumnIndex() == 4){                  	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC4 = new EvaluacionTabla();
		                    		evtC4.version = evt2.version;
		                    		evtC4.reactivo = evt2.reactivo;
		                    		evtC4.aspecto = evt2.aspecto;
		                    		evtC4.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC4.criterio2 = ClasificadorCriterio2.find.byId(1L);
		                    		evtC4.criterio3 = ClasificadorCriterio3.find.byId(2L);
		                    		if ( !evtC4.existe() ){
		                    			evtC4.save();
		                    		}	                    		
	                    		}
		                    }

		                    if (cell.getColumnIndex() == 5){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(1L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(1L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();}
		                    	}		                    	
		                    }
		                    if (cell.getColumnIndex() == 6){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(2L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(3L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }			                    
		                    if (cell.getColumnIndex() == 7){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(2L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(2L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }	
		                    if (cell.getColumnIndex() == 8){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(2L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(1L);
		                    		if ( !evtC5.existe() )		{                    		
		                    			evtC5.save();		     
		                    		}
		                    	}		                    	
		                    }
		                    if (cell.getColumnIndex() == 9){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(3L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(4L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 10){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(3L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(3L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		 
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 11){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(3L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(2L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 12){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(1L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(3L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(1L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }
		                    
		                    if (cell.getColumnIndex() == 13){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(2L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(4L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(6L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }
		                    if (cell.getColumnIndex() == 14){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(2L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(4L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(5L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 15){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(2L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(5L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(6L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 16){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(2L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(5L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(5L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 17){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(2L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(6L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(6L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                    if (cell.getColumnIndex() == 18){             	
		                    	if (cell.getStringCellValue().contains("X")){
		                    		EvaluacionTabla evtC5 = new EvaluacionTabla();
		                    		evtC5.version = evt2.version;
		                    		evtC5.reactivo = evt2.reactivo;
		                    		evtC5.aspecto = evt2.aspecto;	
		                    		evtC5.criterio1 = ClasificadorCriterio1.find.byId(2L);
		                    		evtC5.criterio2 = ClasificadorCriterio2.find.byId(6L);
		                    		evtC5.criterio3 = ClasificadorCriterio3.find.byId(5L);
		                    		if ( !evtC5.existe() ){
		                    			evtC5.save();		
		                    		}
		                    	}		                    	
		                    }		                    
		                }
            	}
            }
            file.close();
            System.out.println("fin de lectura");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
		return ok ("yap");    	
    }    
    
    public static Result Acerca(){
    	return ok(views.html.Acerca.render());
    }
    
    
    public static Result timeOut(){
    	play.mvc.Controller.session().clear();
		return ok(views.html.timeOut.render(form(Login.class)));
    }
    
    
    public static Result errorInicioSesion(){
    	session().clear();
    	System.out.println("Error de inicio de sesión");
    	
    	return ok(errorInicioSesion.render());
    }     
    
    
}
            
