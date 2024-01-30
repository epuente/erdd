package actions;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import models.Ctacorreo;
import actions.miCorreo2;


public class miCorreo2 extends Thread{
	public List<String> para;
	public String asunto;
	public String mensaje;
	public List<ByteArrayOutputStream> adjuntos;	
	public List<String> nombresAdjuntos;
	private String host;
	private String de;
	 
	
	private void enviar() {
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


            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(this.mensaje);
            ByteArrayOutputStream outputStream = this.adjuntos.get(0);
	         byte[] bytes = outputStream.toByteArray();
	         //construct the pdf body part
	         DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
	         MimeBodyPart pdfBodyPart = new MimeBodyPart();
	         pdfBodyPart.setDataHandler(new DataHandler(dataSource));
	         pdfBodyPart.setFileName( nombresAdjuntos.get(0)+".pdf");
	                      
	         //construct the mime multi part
	         MimeMultipart mimeMultipart = new MimeMultipart();
	         mimeMultipart.addBodyPart(textBodyPart);
	         mimeMultipart.addBodyPart(pdfBodyPart);  	        
             message.setContent(mimeMultipart);	         
			
			Transport.send(message);
			for(String p : para){
				System.out.println("      Se envio correctamente a "+p);
			}
	  
		} catch(MessagingException e){
			System.out.println("error: "+e.getMessage());	
	
		} catch (Exception e){
			System.out.println("Error:   "+e.getMessage());
		}
	}
	
	@Override
    public void run() {
        System.out.println("Con Thread ");
        this.enviar();
    }	
}
