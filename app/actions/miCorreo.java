package actions;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import models.Ctacorreo;
import actions.miCorreo;


public class miCorreo extends Thread{
	public List<String> para;
	public String asunto;
	public String mensaje;
	private String host;
	private String de;
	
	private void enviar(){
		Ctacorreo cc =Ctacorreo.find.byId(1L);
		host = cc.hostname;
		de = cc.cuenta;		
		Properties properties = System.getProperties();    
		properties.setProperty("mail.smtp.host", host);
		
		properties.setProperty("mail.smtp.port", "587"); //TLS Port
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");	
		
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(cc.cuenta, "ctaPoli5");
			}
		};
		Session session = Session.getInstance(properties, auth);		
		//Session session = Session.getDefaultInstance(properties);
		
		MimeMessage message = new MimeMessage(session);
		try{
			message.setFrom(new InternetAddress(this.de));
			for(String destino :para){
				if (destino!= null)
					if (!destino.isEmpty())
						message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));	
			}
			message.setSubject(this.asunto);
			message.setText(this.mensaje);
			message.setContent(this.mensaje, "text/html; charset=utf-8");
			System.out.println("Envio de correo a las "+new Date());			
			Transport.send(message);
			for(String p : para){
				System.out.println("      Se envio correctamente a "+p);
			}
	  
		} catch(MessagingException e){
			System.out.println("error: "+e.getMessage());	
	
		}
	}
	
	@Override
    public void run() {
        System.out.println("Con Thread ");
        this.enviar();
    }	
}
