/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.mail;

import banecuador.fin.ec.modelo.dto.Mensaje;
import java.util.Map;

/**
 *
 * @author eoleas
 */
public interface GeneradorMail {
    public Mensaje generarMail(Map<String, Object> parametros) throws Exception;
}
