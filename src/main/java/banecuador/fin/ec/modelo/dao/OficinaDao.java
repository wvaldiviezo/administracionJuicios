/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.dao;

import banecuador.fin.ec.modelo.entidad.Oficina;
import java.util.List;

/**
 *
 * @author wvaldiviezo
 */
public interface OficinaDao extends GenericDao<Oficina, Integer>{
    List<Oficina> buscarOficinaPorZonal(String zoCodigo);
}
