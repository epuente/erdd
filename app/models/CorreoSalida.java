package models;

import java.io.ByteArrayOutputStream;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import actions.miCorreo;
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

	public static Finder<Long,CorreoSalida> find = new Finder<>(Long.class, CorreoSalida.class);

    public CorreoSalida() {
    }

    public CorreoSalida(miCorreo mc, Recurso r) {
        List<CorreoSalidaPara> listaDirecciones = new ArrayList<>();
        for (String aux : mc.para){
            CorreoSalidaPara csp = new CorreoSalidaPara();
            csp.para = aux;
            listaDirecciones.add(csp);
        }

        para = listaDirecciones;
        recurso = r;
        estado = r.estado;
        asunto = mc.asunto;
        mensaje = mc.mensaje;
        enviado = mc.enviado;
        mensajeoperacion = mc.enviado?"Se envió correctamente...":mc.mensajeError+"...";
    }


    /*
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
			System.out.println("(CorreoSalida) Envio de correo a las "+new Date());


			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText(this.mensaje);
			System.out.println("adjuntos "+this.adjuntos);
			System.out.println("esperando que se envíe....");
			Transport.send(message);
			System.out.println("      Se envio correctamente");
			this.enviado = true;
			this.mensajeoperacion="Se envió correctamente";
		} catch(MessagingException e){
			System.out.println("error: "+e.getMessage());
			this.enviado = false;
			this.mensajeoperacion=e.getLocalizedMessage();
		}
		System.out.println("mensaje "+this.mensaje);
		this.save();
	}
    */
    public void enviar2(){
        miCorreo mc = new miCorreo();
        mc.asunto = this.asunto;
        //mc.mensaje = this.mensaje.substring(0, 5);
        mc.mensaje = this.mensaje;
        List<String> listaDestinatarios = new java.util.ArrayList<>(Collections.emptyList());


        for(CorreoSalidaPara destino :para){
            if (destino!= null)
                listaDestinatarios.add(destino.para);
        }
        mc.para = listaDestinatarios;
        mc.enviar();
        //mc.start();
        if (mc.enviado){
            this.enviado = true;
            this.mensajeoperacion="Se envió correctamente";
        }
        if (!mc.enviado){
            this.enviado = false;
            this.mensajeoperacion=mc.mensajeError;
        }

        System.out.println("mensaje "+this.mensaje);
        this.save();


    }


}
