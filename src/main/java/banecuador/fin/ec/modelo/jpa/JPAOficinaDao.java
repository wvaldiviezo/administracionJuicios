/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.OficinaDao;
import banecuador.fin.ec.modelo.entidad.Oficina;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author wvaldiviezo
 */

public class JPAOficinaDao extends JPAGenericDao<Oficina, Integer> implements OficinaDao {

    public JPAOficinaDao() {
        super(Oficina.class);
    }

    @Override
    public List<Oficina> buscarOficinaPorZonal(String zoCodigo) {
        List oficinaSeleccionada = null;
        try {
            String consulta = "select * from oficina where zo_codigo=" + zoCodigo;
            Query query = em.createNativeQuery(consulta, Oficina.class);
            oficinaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en buscarOficinaPorZonal");
        }
        return oficinaSeleccionada;
    }
}
