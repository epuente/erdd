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

public class miCorreo extends Thread{
	public List<String> para;
	public String asunto;
	public String mensaje;
	private String host;
	private String de;
    public boolean enviado = false;
    public String mensajeError;
    public List<ByteArrayOutputStream> adjuntos;
    public List<String> nombresAdjuntos;
	
	public void enviar(){
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
				return new PasswordAuthentication(cc.cuenta, cc.contrasenia);
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
			message.setSubject(this.asunto+" [Prueba del sistema]");
			message.setText(this.mensaje);
			message.setContent(this.mensaje, "text/html; charset=utf-8");
			//System.out.println("(miCorreo) Envio de correo a las "+new Date());

            // Attach
            if (this.adjuntos!=null) {
                MimeBodyPart textBodyPart = new MimeBodyPart();
                textBodyPart.setText(this.mensaje);
                ByteArrayOutputStream outputStream = this.adjuntos.get(0);
                byte[] bytes = outputStream.toByteArray();
                //construct the pdf body part
                DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
                MimeBodyPart pdfBodyPart = new MimeBodyPart();
                pdfBodyPart.setDataHandler(new DataHandler(dataSource));
                pdfBodyPart.setFileName(nombresAdjuntos.get(0) + ".pdf");

                //construct the mime multi part
                MimeMultipart mimeMultipart = new MimeMultipart();
                mimeMultipart.addBodyPart(textBodyPart);
                mimeMultipart.addBodyPart(pdfBodyPart);
                message.setContent(mimeMultipart);
            }
            // Termina attach


            /////////////////////////////  SE COMENTA LA SIGUIENTE LINEA PUESTO QUE NO FUNCIONA EL MAIL SMTP DE MICROSOFT
			try {
                Transport.send(message);
                this.enviado = true;
            } catch (Exception e){
                System.out.println("Ocucció un excepción "+e);
                this.mensajeError = e.getMessage();
            }

			for(String p : para){
				System.out.println("      Se envió correctamente a "+p);
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
