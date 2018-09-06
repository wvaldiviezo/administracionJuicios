/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.NivelRiesgoDao;
import banecuador.fin.ec.modelo.entidad.NivelRiesgo;
import javax.ejb.Stateless;

/**
 *
 * @author wvaldiviezo
 */
public class JPANivelRiesgoDao extends JPAGenericDao<NivelRiesgo, Integer> implements NivelRiesgoDao {

    public JPANivelRiesgoDao() {
        super(NivelRiesgo.class);
    }
}
