/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.mail;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author wvaldiviezo
 */
public class emailEnviar {

    private final Logger logger = Logger.getAnonymousLogger();
    private final String servidorSMTP = "mail.banecuador.fin.ec";
    //private final int puertoSMTP = 25;
    private final int puertoSMTP = 587;
    private String cuentaEnvio = "wilmer.valdiviezo@banecuador.fin.ec";
    private String contrasenia = "Wil23Val86";
    private String para;
    private String asunto;
    private String contenidoMensaje;
    private Properties configuracion = new Properties();
    private Date fecha;

    public emailEnviar() {

    }

    public void enviarCorreo() {
        configuracion.put("mail.smtp.auth", "true");
        configuracion.put("mail.smtp.starttls.enable", "true");
        configuracion.put("mail.smtp.host", servidorSMTP);
        configuracion.put("mail.smtp.port", puertoSMTP);
        
        configuracion.put("mail.smtp.ssl.trust", "*");
        configuracion.put("mail.smtp.ssl.enable", "true");
        
        final Session session = Session.getInstance(configuracion, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(cuentaEnvio, contrasenia);
            }

        });

        try {
            final Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(para));
            message.setFrom(new InternetAddress(cuentaEnvio));
            message.setSubject(asunto);
            message.setText(contenidoMensaje);
            message.setSentDate(new Date());
            Transport.send(message);
        } catch (final MessagingException ex) {
            logger.log(Level.WARNING, "Error al enviar email: " + ex.getMessage(), ex);
        }

        System.out.println("pasó el envío de correo");

    }

    public Properties getEmailProperties() {
        final Properties configuracion = new Properties();
        configuracion.put("mail.smtp.auth", "true");
        configuracion.put("mail.smtp.starttls.enable", "true");
        configuracion.put("mail.smtp.host", servidorSMTP);
        configuracion.put("mail.smtp.port", puertoSMTP);
        //configuracion.put("mail.smtp.ssl.trust", "*");
        //configuracion.put("mail.smtp.ssl.enable", "true");
        return configuracion;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

}
