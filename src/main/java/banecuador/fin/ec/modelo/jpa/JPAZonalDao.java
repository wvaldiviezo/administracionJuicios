/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.ZonalDao;
import banecuador.fin.ec.modelo.entidad.Oficina;
import banecuador.fin.ec.modelo.entidad.Zonal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

/**
 *
 * @author wvaldiviezo
 */
public class JPAZonalDao extends JPAGenericDao<Zonal, Integer> implements ZonalDao {

    public JPAZonalDao() {
        super(Zonal.class);
    }        
}
