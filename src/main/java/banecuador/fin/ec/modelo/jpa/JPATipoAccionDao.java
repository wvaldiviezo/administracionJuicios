/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.TipoAccionDao;
import banecuador.fin.ec.modelo.entidad.TipoAccion;
import javax.ejb.Stateless;

/**
 *
 * @author wvaldiviezo
 */

public class JPATipoAccionDao extends JPAGenericDao<TipoAccion, Integer> implements TipoAccionDao {

    public JPATipoAccionDao() {
        super(TipoAccion.class);
    }

}
