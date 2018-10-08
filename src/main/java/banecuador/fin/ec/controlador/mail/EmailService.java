package banecuador.fin.ec.controlador.mail;

import banecuador.fin.ec.modelo.dto.Mensaje;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.EnumMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author eoleas
 */

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class EmailService {
    @Resource(name = "mail/banecuador")
    private Session mailSession;
    
    private static final Map<TipoEmail, GeneradorMail> MAP_GENERADOR = new EnumMap<TipoEmail, GeneradorMail>(TipoEmail.class);
    private static final Logger LOGGER = Logger.getAnonymousLogger();
    
    @EJB
    private GeneradorMailJuicio generadorMailJuicio;
    
    @XmlType(name = "tipoEmail")
    @XmlEnum
    public enum TipoEmail {
        NOTIFICACION_JUICIO("");

        private String codigo;

        TipoEmail(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String toString() {
            return this.codigo;
        }
    }
    
    @PostConstruct
    public void inicializar() {
        MAP_GENERADOR.put(TipoEmail.NOTIFICACION_JUICIO, generadorMailJuicio);
    }
    
    private void procesarDestinatarios(Message mensaje, Message.RecipientType tipoDestinatario, String to, String toName) throws MessagingException, UnsupportedEncodingException {
        //si la dirección de email tiene una coma, entonces significa que es una lista
        StringTokenizer st = new StringTokenizer(to, ",");
        int tokenCount = st.countTokens();
        InternetAddress[] destinatarios = new InternetAddress[tokenCount];
        for (int i = 0; st.hasMoreTokens(); i++) {
            String msgTo = st.nextToken();
            if (msgTo != null && msgTo.trim().length() > 0) {
                //si el email se envia a una sola dirección se muestra el nombre.
                if (tokenCount == 1 && toName != null && toName.length() > 0) {
                    destinatarios[i] = new InternetAddress(msgTo, toName);
                } else {
                    //Caso contrario se muestra la dirección email.
                    destinatarios[i] = new InternetAddress(msgTo);
                }
            }
        }
        mensaje.setRecipients(tipoDestinatario, destinatarios);
    }
    
    private void setTo(Message mensaje, String to, String toName) throws MessagingException, UnsupportedEncodingException {
        this.procesarDestinatarios(mensaje, Message.RecipientType.TO, to, toName);
    }
    
    private void setCC(Message mensaje, String cc, String ccName) throws MessagingException, UnsupportedEncodingException {
        this.procesarDestinatarios(mensaje, Message.RecipientType.CC, cc, ccName);
    }
    
    private void setBCC(Message mensaje, String bcc, String bccName) throws MessagingException, UnsupportedEncodingException {
        this.procesarDestinatarios(mensaje, Message.RecipientType.BCC, bcc, bccName);
    }
    
    private void setFrom(Message mensaje, String from, String fromName) throws MessagingException, UnsupportedEncodingException {
        if (fromName != null && fromName.length() > 0) {
            mensaje.setFrom(new InternetAddress(from, fromName));
        } else {
            mensaje.setFrom(new InternetAddress(from));
        }
    }
    
    private void setReplyTo(Message mensaje, String replyTo, String replyToName) throws MessagingException, UnsupportedEncodingException {
        if (replyToName != null && replyToName.length() > 0) {
            InternetAddress[] address = {new InternetAddress(replyTo, replyToName)};
            mensaje.setReplyTo(address);
        } else {
            InternetAddress[] address = {new InternetAddress(replyTo)};
            mensaje.setReplyTo(address);
        }
    }
    
    private void asignarDestinatarios(Mensaje productor, Message mensaje) throws UnsupportedEncodingException, MessagingException {
        if (productor.getCC() != null) {
            setCC(mensaje, productor.getCC(), productor.getCcName());
        }
        if (productor.getBCC() != null) {
            setBCC(mensaje, productor.getBCC(), productor.getBccName());
        }
        if (productor.getFrom() != null) {
            setFrom(mensaje, productor.getFrom(), productor.getFromName());
        }
        if (productor.getReplyTo() != null) {
            setReplyTo(mensaje, productor.getReplyTo(), productor.getReplyToName());
        }
    }
    
    private void setSubject(Message mensaje, String subject) throws MessagingException {
        if (subject != null && subject.trim().length() > 0) {
            mensaje.setSubject(subject);
        }
    }
    
    private void setBody(Multipart mp, String body) throws MessagingException {
        MimeBodyPart mbpMsgtext = new MimeBodyPart();
        mbpMsgtext.setContent(body, "text/html");
        mp.addBodyPart(mbpMsgtext);
    }
    
    private void setHeader(Message mensaje, String name, String value) throws MessagingException {
        if ((name != null && name.trim().length() > 0) && (value != null && value.trim().length() > 0)) {
            mensaje.setHeader(name, value);
        }
    }
    
    private void setPriority(Message mensaje, String priorityValue) throws MessagingException {
        if (priorityValue != null && priorityValue.trim().length() > 0) {
            mensaje.setHeader("X-Priority", priorityValue);
        }
    }
    
    private void agregarArchivo(Multipart mp, String archivoNombre) throws MessagingException {
        MimeBodyPart mbpFile = new MimeBodyPart();
        //Adjunto el archivo al mensaje
        FileDataSource fds = new FileDataSource(archivoNombre);
        mbpFile.setDataHandler(new DataHandler(fds));
        mbpFile.setFileName(fds.getName());

        mp.addBodyPart(mbpFile);
    }
    
    private void destinatariosEmail(Mensaje msg, Message mensaje, Multipart mp) throws Exception {
        try {
            asignarDestinatarios(msg, mensaje);
            setSubject(mensaje, msg.getSubject());
            setBody(mp, msg.getBody());
            setHeader(mensaje, msg.getNameHeader(), msg.getValueHeader());
            setPriority(mensaje, msg.getPriorityValue());
            if (msg.getArchivosAdjuntos() != null) {
                for (String archivo : msg.getArchivosAdjuntos()) {
                    agregarArchivo(mp, archivo);
                }
            }
        } catch (MessagingException ex) {
            LOGGER.log(Level.WARNING, "Error al setear los destinatarios: " + msg.getTo(), ex);
            throw new Exception("Error al setear los destinatarios: " + msg.getTo(), ex);
        } catch (UnsupportedEncodingException ex) {
            throw new Exception("Error al setear los destinatarios: " + msg.getTo(), ex);
        }
    }
    
    private void enviar(Multipart mp, Mensaje msg) throws Exception {
        try {
            Message mensaje = new MimeMessage(mailSession);
            setTo(mensaje, msg.getTo(), msg.getToName());
            destinatariosEmail(msg, mensaje, mp);
            
            mensaje.setContent(mp);
            mensaje.setSentDate(new Date());
            mensaje.saveChanges();
            
            mensaje.addHeader("Disposition-notification-To", mailSession.getProperty("mail.from"));
            String correos = (msg.getTo() != null) ? msg.getTo() : msg.getFrom();
            LOGGER.log(Level.INFO, "Correo enviado a: {0}", correos);
            Transport.send(mensaje);
        } catch (SendFailedException ex) {
            if (msg.getCC() != null) {
                LOGGER.log(Level.SEVERE, "Existe direcciones de correo no validas : {0} CC: {1}", new Object[]{msg.getTo(), msg.getBCC()});
            } else {
                LOGGER.log(Level.SEVERE, "Existe direcciones de correo no validas : {0}", msg.getTo());
            }
            throw new Exception(ex);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    private Mensaje armarMensajeTipoNotificacion(TipoEmail tipoEmail, Map<String, Object> parametros) throws Exception {
        if (MAP_GENERADOR.containsKey(tipoEmail)) {
            return MAP_GENERADOR.get(tipoEmail).generarMail(parametros);
        }
        return null;
    }
    
    public void procesar(Map<String, Object> parametros) throws Exception {
        try {
            Object obj = parametros.get("tipoEmail");
            if (obj instanceof TipoEmail) {
                TipoEmail tipoEmail = (TipoEmail) obj;
                Mensaje mensaje = armarMensajeTipoNotificacion(tipoEmail, parametros);
                
                if (mensaje != null && !"".equals(mensaje.getTo())) {
                    Multipart mp = new MimeMultipart();
                    enviar(mp, mensaje);
                    LOGGER.log(Level.INFO, "MAIL ENVIADO {0} A {1}", new Object[]{tipoEmail.name(), mensaje.getTo()});
                } else {
                    LOGGER.log(Level.WARNING, "MAIL NO ENVIADO {0} NO SE GENER\u00d3 EL MAIL O NO EXISTEN REMITENTES ", tipoEmail.name());
                }
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "No se puede enviar notificacion a : {0}", e.getMessage());
            throw e;
        }
    }
    
    public static String cambiarTildes(String cadena) {
        return cadena.replaceAll("Á", "&Aacute;").replaceAll("É", "&Eacute;").replaceAll("Í", "&Iacute;").replaceAll("Ó", "&Oacute;").replaceAll("Ú", "&Uacute;")
                .replaceAll("á", "&aacute;").replaceAll("é", "&eacute;").replaceAll("í", "&iacute;").replaceAll("ó", "&oacute;").replaceAll("ú", "&uacute;");
    }
    
    public static String templateEmail(String detalle) {
        StringBuilder templateEmail = new StringBuilder();
        templateEmail.append(ConstantesEmail.HTML_INI);
        templateEmail.append(ConstantesEmail.STYLE);
        templateEmail.append(ConstantesEmail.BODY_INICIAL);
        templateEmail.append(ConstantesEmail.DIV_INICIAL);
        templateEmail.append(ConstantesEmail.TABLE_INICIAL);
        templateEmail.append(ConstantesEmail.HEAD_TABLE_INICIAL);
        templateEmail.append(ConstantesEmail.HEAD_TABLE_FINAL);
        templateEmail.append(ConstantesEmail.FILA_INICIAL);
        templateEmail.append(ConstantesEmail.COL_INICIAL);
        templateEmail.append(ConstantesEmail.ENTER);
        templateEmail.append(ConstantesEmail.COL_FINAL);
        templateEmail.append(ConstantesEmail.FILA_FINAL);
        templateEmail.append(ConstantesEmail.FILA_INICIAL);
        templateEmail.append(ConstantesEmail.COL_INICIAL);
        templateEmail.append(ConstantesEmail.ENTER);
        templateEmail.append(cambiarTildes(detalle));
        templateEmail.append(ConstantesEmail.COL_FINAL);
        templateEmail.append(ConstantesEmail.FILA_FINAL);
        templateEmail.append(ConstantesEmail.FILA_INICIAL);
        templateEmail.append(ConstantesEmail.COL_INICIAL);
        templateEmail.append(ConstantesEmail.ENTER);
        templateEmail.append(ConstantesEmail.ENTER);
        templateEmail.append(ConstantesEmail.ENTER);
        templateEmail.append(ConstantesEmail.COL_FINAL);
        templateEmail.append(ConstantesEmail.FILA_FINAL);
        templateEmail.append(ConstantesEmail.TABLE_FINAL);
        templateEmail.append(ConstantesEmail.DIV_FINAL);
        templateEmail.append(ConstantesEmail.BODY_FINAL);

        return templateEmail.toString();
    }
}