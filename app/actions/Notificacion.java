package actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;

public class Notificacion {
	List<String> topicos;
	String titulo;
	String mensaje;
	
	public Notificacion() {
		try {
			//FileInputStream serviceAccount = new FileInputStream( new File("conf/fberdd-57e76-firebase-adminsdk-4j6o8-dc7c5d3187.json"));
			/*FileInputStream serviceAccount = new FileInputStream( new File("/home/epuente/playFramework/erdd/public/fberdd-57e76-firebase-adminsdk-4j6o8-5639cfd7aa.json"));

			FirebaseOptions options = new FirebaseOptions.Builder()
					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					  .setDatabaseUrl("https://fberdd-57e76.firebaseio.com")
					  .build();
		*/
			FileInputStream serviceAccount =  new FileInputStream( "conf/fberdd-57e76-firebase-adminsdk-4j6o8-5639cfd7aa.json"  );


			
		//	FileInputStream serviceAccount = new FileInputStream( "conf/fberdd-57e76-firebase-adminsdk-4j6o8-5639cfd7aa.json"  );
    		
    		
    		FirebaseOptions options = new FirebaseOptions.Builder()
    		    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
    		    .setDatabaseUrl("https://fberdd-57e76.firebaseio.com")
    		    .build();			
			
			
			
			//if (FirebaseApp.getInstance() == null)	
				FirebaseApp.initializeApp(options);
		    System.out.println("Se ha agregado e inicializado el SDK de firebase-admin al servidor");
    	} 
		catch (FileNotFoundException fnfe) {
    		System.out.println("Archivo no encontrado.  "+fnfe.getMessage());    		
    	}
		catch (java.lang.IllegalStateException e) {
			System.out.println("Excepción de estado.  "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error en notificaciones.   "+e);
		}  
		
	}
	
	
	public void enviar(String topico, String titulo, String mensaje) {
		
		String topic = topico;
		Message message = Message.builder()
	    	    .setNotification(new Notification(titulo, mensaje))
	    	    .setTopic(topic)
	    	    .build();
		
		
		
		try {
			System.out.println("tópico: "+topic);
			String response = FirebaseMessaging.getInstance().send(message);
			System.out.println("    Se envió exitosamente la notificación: " + response);
		} catch (Exception e) {
			System.out.println("ERROR, no fue posible enviar la notificación al celular.     "+e);
		}	
			
	}
	
}
