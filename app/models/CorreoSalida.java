package models;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.MaxLength;
import play.db.ebean.Model;

@Entity
public class CorreoSalida extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	public Recurso recurso;
	
	@ManyToOne
	public Estado estado;
	
	//public List<String> para;
	@OneToMany(mappedBy="correosalida", cascade=CascadeType.ALL)
	public List<CorreoSalidaPara> para;
	
	public String asunto;
	
    @Size(max=900)
    @MaxLength(900)
	public String mensaje;
    
	public List<ByteArrayOutputStream> adjuntos;	
	private String host;
	private String de;
	public Boolean enviado;
	public String mensajeoperacion;
	@CreatedTimestamp
    public Date auditinsert;
	@UpdatedTimestamp
    public Date auditlastupdate;  
    
    public static Finder<Long,CorreoSalida> find = new Finder<Long,CorreoSalida>(Long.class, CorreoSalida.class);
    
	 
	
	public void enviar()  {
		Ctacorreo cc =Ctacorreo.find.byId(1L);
		host = cc.hostname;
		de = cc.cuenta;
		
		Properties properties = System.getProperties();    
		properties.setProperty("mail.smtp.host", host);
		Session session = Session.getDefaultInstance(properties);
		
		MimeMessage message = new MimeMessage(session);
		try{
			message.setFrom(new InternetAddress(this.de));
			for(CorreoSalidaPara destino :para){
				if (destino!= null)
					//if (!destino.isEmpty())
						message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino.para));	
			}
			message.setSubject(this.asunto);
			message.setText(  this.mensaje.substring(0, 5));
System.out.println("mensaje "+  this.mensaje.substring(0, 5)  );			
			message.setContent(this.mensaje, "text/html; charset=utf-8");
			System.out.println("Envio de correo a las "+new Date());			


            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(this.mensaje);
System.out.println("adjuntos "+this.adjuntos);            

	         
			
			Transport.send(message);
				System.out.println("      Se envio correctamente");
				
				this.enviado = true;
				this.mensajeoperacion="Se envió correctamente";
			
	  
		} catch(MessagingException e){
		//	System.out.println("error: "+e.getMessage());	
			this.enviado = false;
			this.mensajeoperacion=e.getLocalizedMessage();
		}
System.out.println("mensaje "+this.mensaje); 
		//this.recurso.id = 6L;
		this.save();
	}	
	
}
