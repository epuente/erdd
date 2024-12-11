package actions;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
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
    private String puerto;
	private String de;
    public boolean enviado = false;
    public String mensajeError;
    public List<ByteArrayOutputStream> adjuntos;
    public List<String> nombresAdjuntos;
    private String logoDEV = "<div><img src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHUAAABpCAIAAACLcvsLAAABhGlDQ1BJQ0MgcHJvZmlsZQAAKJF9kT1Iw0AcxV8/RJFKBwtKUchQnSyIijhqFYpQIdQKrTqYXPoFTRqSFBdHwbXg4Mdi1cHFWVcHV0EQ/ABxdnBSdJES/5cUWsR4cNyPd/ced+8Af6PCVDM4DqiaZaSTCSGbWxW6XxHEMMKIYkBipj4niil4jq97+Ph6F+dZ3uf+HH1K3mSATyCeZbphEW8QT29aOud94ggrSQrxOfGYQRckfuS67PIb56LDfp4ZMTLpeeIIsVDsYLmDWclQiaeIY4qqUb4/67LCeYuzWqmx1j35C0N5bWWZ6zSHkMQiliBCgIwayqjAQpxWjRQTadpPePijjl8kl0yuMhg5FlCFCsnxg//B727NwuSEmxRKAF0vtv0xAnTvAs26bX8f23bzBAg8A1da219tADOfpNfbWuwICG8DF9dtTd4DLneAwSddMiRHCtD0FwrA+xl9Uw7ovwV619zeWvs4fQAy1FXqBjg4BEaLlL3u8e6ezt7+PdPq7wdm1nKiJU3N5gAAAAlwSFlzAAALEwAACxMBAJqcGAAAAAd0SU1FB+gEHQ8gNjBS7MsAAAlgSURBVHja7ZvZU1vXGcDzJ/SxT33JSx8605m+dTJNFzeNx+OkaZPGWxoSZ+LQBqdxTAxOzJbgBWzHNsRmcTGLAAPG7IidsFjsIMwmEAghJCEJCe37gvtllJHv3Hu59+reK8905vvmGz/Ivt8553fP+bZz/dIzlETKS4gA+SJfFOSLfJEvCvJFvsgXBfkiXxTki3yRLwryRb7IFwX5Il/ki4J8kS8K8kW+yBcF+f6/8XU7nEF/APElhK9Bo7UYjMguIXx1KvXS5DSCSwhf2LaPC0v29/cRnPh8fV5vYXKqGT1Dgvi2lVaAIrKE8FUtK9J//nuDZhuRic83FAzePv2fwjPnGTxvJLIfDIbsDs+WZndsQtneJW+TyqW9T0dkq8sKrWXPGY5E4pqZ1+1enp6dHRrlp6uz86FQKKHsbGbLU9n46tx8wO8XxPepbCLtZ78bbungPjaAnpzZyMmXHjpe9cd3K0GTUxsftUxrdXtcwqNxW3v5yHswqBBtLX6QOLiKWfmlXx2ODlTw8TmX3cGTbzgcvv3hZ2BFrViL/QjFxcbSytaaEv6W4VlAuaEyAuUo4qje/L5/W2thfqr43CWBcKOqWVtPBFwor775wz+IA/VU1/PkC1jheXC+Tpst+ovH6YI3FrVbnXsjzHYMwTMMjSqOvCeJIX7tRFVT+2wwGD4oUYltDYF672x6OAFeQlpRSxqo9MssnnwhZ4Dnc159B7xw9Jfxrj6i6fWFJU4RUm06mVxH3MiXb3a7XD7aE5P39kei8AWdG34iLlzDtvbiL/5E9kUl5Xz4AlMgC8/n/e107MeBhmai6YWxSa61n37v3TMPiYgvftPudvtoPT6cGFH45r52Ag6cWHD3I5HyjCukIb56+c8mnZ4PX716K2riVlLKc0ybW2Ax+ju4Iafdzn1+q0o9OAci4vw7vaFQmDYjbCkqq8sv4Ki1V2/dPPkvWsTdknqx+K7MzFHt9z1s5Jk/zAyORE1ANI8QEiz16lpTYWn7/cpd/Q7pEQh9zC6vtXOOyBcU0jhRFg8zhMyMuvF/3F9anXD7fp/v+rEzJONX30zyuj08+XY+kESt/FhcbGtZuhNG05p84aBM5fksA8FPLzwm8oXQZzTZxdpiXZW11C1WmXVNeNtkpLWTanlxYpp/fVF+6fLzKWbnxUIcUZw2O6TZsICJ7v4IY7oWk6kZFWkLl1aMiMXX43Llvn6SCgIqDoHVRMavj5BsPvg6N8JYN7HwvXHiE6K5ki8yIPJsr6sgr1yanB6obyr67CKcvuxX/r65rOA+V8jMTn/eQOR7+JTEbHGKhXh+dIzKF9YS8Pl522y8U0wyCFmEke1Ms/DN/M1R1gD97aFjO1tx9yVaKF64p39RLL5wjErPZ1KnOtom5WcQKimqW+cSNln4siZJ8AIgneAx4021icQ3PadNxCwVZkWdPMzWZtmL1xSE63spaSRTEPA9LrdQvtREmqiwgJXpOX7rDwZDbyRVE/lC3uZ0ekVE3FEmoc65saA4XjtQoVDtQMgRoX8GyTkDX1iAkPVnXZOStrBsQikiX8hkSF0CHk0JqE2oEO5fyOYYyVn43v30wkFw4YB43W4h6y+TPCHxhShXUSNr75LHpX2DS/odK+0Qsz+M0jQlUtK4NyXAyVLDml6tEaf/2/Dd3YP4TvUPCdxfTW0zJL68FV7MzNwmves8m867KQFVb6xSjam0vEa0/vpwcwctXEjIfB6hvrKje14svqAnk+sCAZpdCdkkNdBxaUrsRyJVOfnUZMntdIrGVzm/mLjWtbh8QQ/KoFuKyng0JVblT6lPyUdkYt4POe122hRieWpWON+G5ikR4b79Ua3fH6Rfhc0GB47qRhmaEgG/n9otKj53KRwKi8kXCi3aRN28YxDO93bRgFhwDx2vGn7CVEBO9g7G1ZSQdXRTk1HdpjreNbLwVazppweGqDNzO4TWsuFw5NS/66ik3k+pL6saraiVxVRSN86sj5qnlesG1kZ2YXIqdSGKWTnN5eHeHrVwbb9fyWOZLHwhW3JYbdTbGofVKpCvemuXCheI2+yeZ4kRtWKNGuhomxJN398n/TPIo1n7gnz4ZudJVWpT9IqIqPxqYqJI6sepfO+VDT1LpEDxxtqU2FZuUF/DzCDP9h4734KSQbPBSEoDpweHhaxz1+wgXnfGtES8LiWt2C00B5/YlAiHw8WffyXiJSk7XwgdcJa7JXXEIcszrgjxvHl3emnDVKL5goxJe6lbuPryTZ/XC7nBk/YualiDHc17OHa+sGz402l3XnvrA+Ko1Jshblc4+/VNB6ZlL4BvMBCIfs5B0pxX37n6ZpLomT4nvqBDo4qNxWWiY3p06168g/kDwaqHYwxp1gvgC6JaWuF49wxZc+yrj8TyfSOpWquzDDW1EbcwEOe+bVdWdeczW5nT2OsFfS+AL+S8ddcLufCd6v9B4Fhc+YKmpDXZ7W5i7nLl6D8hUQuFwnaHh1YhjkFm2tO/mMpGNlYmTM5seL0Bny/IT+FZOCWsy7bumqmXaSSFfJn2vjFRfEFz8qVOh5t4EwUlo8vhuvvfIREr3aPvV//1gxp+Cs9CoQw5D7xd5qWNtkqZrw62VkVoRsfHFzT3RrfD4SamE5BLAOLyGlm8HEkfmoirmVc7wSkxLI22wxDTx4UloviiuPmCpmW3wcFfGJvM+u1bP33ddj4TyjzwA9yRgWXZhDJxfEF1epartjX5Ai1cWJd9z/oi+JI+LY3p8U8ezi9sgReryy+Izun6sTO6TbVyw5Cc2si8bAiVXX0LwWB4XWVMKF+N1swa6GqufEflO94tWphl4dvYynTFUPxg2GxxaJTr1bk3wGF9/cu/jHf1OZ2e+sdTtBsZPCMkv1brT41tm91NW8WJomfTm0IceokWg5HUXSn4+JzwsMaVr8frv100cPiUhGEzAk3Trt1iNMk6e0q+yCi7+O3Olka/Y4WgB9EGdjr4k5qGifkFDQR3cjU1qYSgJDrcL7NadwxcD7h8dCzW44Yqw6DRipgLcvr/AR6P3+XyMWuskerzeIzb2ujVJwANsm0ieIXweoymONS064AAcJDuWV3x/l8PnUo91Nw+Ju3h8XWECHxRkC/yRb4oyBf5oiBf5It8UZAv8kW+KMgX+SJfFOSLfFGQL/JFvijIF/kiXxTki3yRLwryRb4oyBf5Il8U5It8kS+KQPkf5YVHwLqjM1MAAAAASUVORK5CYII=\" alt=\"Imagen logo DEV\" style=\"width: 58px; height: 57px;\"></div>";
    private String fecha;


	public void enviar(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
		Ctacorreo cc =Ctacorreo.find.byId(1L);
		host = cc.hostname;
        puerto = cc.puerto;
		de = cc.cuenta;
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);

		properties.setProperty("mail.smtp.port", puerto); //TLS Port
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", "*");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");


		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(cc.cuenta, cc.contrasenia);
			}
		};
		Session session = Session.getInstance(properties, auth);
		//Session session = Session.getDefaultInstance(properties);

		MimeMessage message = new MimeMessage(session);
		try {
            message.setFrom(new InternetAddress(this.de));
            for (String destino : para) {
                if (destino != null)
                    if (!destino.isEmpty())
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
            }
            message.setSubject(this.asunto + " [Prueba del sistema]");
            message.setText(this.mensaje);
            message.setContent( "<table><tr><td>"+logoDEV+"</td><td><h3>&nbsp;&nbsp;&nbsp;&nbsp;Sistema de Evaluación de Recursos Didácticos Digitales</h3></td></tr></table>" + this.mensaje, "text/html; charset=utf-8" );
            //System.out.println("(miCorreo) Envio de correo a las "+new Date());

            // Attach
            if (this.adjuntos != null) {
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

            try {
                Transport.send(message);
                fecha = sdf.format(new Date());
                this.enviado = true;
            } catch (MessagingException e) {
                System.out.println("Excepción de Messaging: " + e.getMessage());
            }
            for (String p : para) {
                System.out.println("      Se envió correctamente a " + p+" a las "+  fecha );
            }

        }catch (Exception e){
            System.out.println("Ocurrió uns excepción "+e);
            this.mensajeError = e.getMessage();
        }
	}
	
	@Override
    public void run() {
        System.out.println("Con Thread ");
        this.enviar();
    }	
}
