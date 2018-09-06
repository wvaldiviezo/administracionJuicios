/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.UsuarioDao;
import banecuador.fin.ec.modelo.entidad.Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author wvaldiviezo
 */
public class JPAUsuarioDao extends JPAGenericDao<Usuario, Integer> implements UsuarioDao {

    public JPAUsuarioDao() {
        super(Usuario.class);
    }

}
