/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.mail;

import banecuador.fin.ec.modelo.dto.Mensaje;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author eoleas
 */

@Stateless
@LocalBean
public class GeneradorMailJuicio implements GeneradorMail {
    
    @Override
    public Mensaje generarMail(Map<String, Object> parametros) throws Exception {
        Mensaje msg = null;
        String detalle = null;
        
        String correoFuncionario = (String) parametros.get("fu_correo");
        String asunto = (String) parametros.get("notif_asunto");
        
        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss");
        
        msg = new Mensaje();
        parametros.put("fechaFormato", fechaFormato);
        parametros.put("horaFormato", horaFormato);
        
        switch((EmailService.TipoEmail) parametros.get("tipoEmail"))  {
            case NOTIFICACION_JUICIO :
                detalle = armarDetalleNotif(parametros);
                break;
            default:
                break;
        }
        
        if (detalle != null && correoFuncionario != null && !correoFuncionario.isEmpty()) {
            msg.setTo(correoFuncionario);
            msg.setSubject(asunto);
            msg.setBody(EmailService.templateEmail(detalle));
        }
        
        return msg;
    }
    
    private String armarDetalleNotif(Map<String, Object> mapCorreo) {
        SimpleDateFormat fechaFormato = (SimpleDateFormat) mapCorreo.get("fechaFormato");
        SimpleDateFormat horaFormato = (SimpleDateFormat) mapCorreo.get("horaFormato");
        
        Date fecha = (Date) mapCorreo.get("fec_diligencia");
        String numJuicio = (String) mapCorreo.get("num_juicio");
        String descripcion = (String) mapCorreo.get("desc_juicio");
        String detalle = (String) mapCorreo.get("notif_detalle");
        
        detalle = detalle != null ? detalle.replace("[NUM_JUICIO]", numJuicio)
                .replace("[DESCRIP_CITAC]", descripcion)
                .replace("[FECHA_DILIGENCIA]", fechaFormato.format(fecha))
                .replace("[HORA_DILIGENCIA]", horaFormato.format(fecha)) : "";

       return detalle;         
    }
    
}
