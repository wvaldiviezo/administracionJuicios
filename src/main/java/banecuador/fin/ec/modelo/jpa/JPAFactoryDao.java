/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.FactoryDao;
import banecuador.fin.ec.modelo.dao.FuncionarioDao;
import banecuador.fin.ec.modelo.dao.JuicioDao;
import banecuador.fin.ec.modelo.dao.MenuDao;
import banecuador.fin.ec.modelo.dao.NivelRiesgoDao;
import banecuador.fin.ec.modelo.dao.OficinaDao;
import banecuador.fin.ec.modelo.dao.SeguimientoDao;
import banecuador.fin.ec.modelo.dao.TipoAccionDao;
//import banecuador.fin.ec.modelo.dao.UnidadJudicialDao;
import banecuador.fin.ec.modelo.dao.UsuarioDao;
import banecuador.fin.ec.modelo.dao.ZonalDao;
import javax.ejb.Local;

/**
 *
 * @author wvaldiviezo
 */
public class JPAFactoryDao extends FactoryDao {

    @Override
    public FuncionarioDao getFuncionarioDao() {
        return new JPAFuncionarioDao();
    }

    @Override
    public JuicioDao getJuicioDao() {
        return new JPAJuicioDao();
    }

    @Override
    public NivelRiesgoDao getNivelRiesgoDao() {
        return new JPANivelRiesgoDao();
    }

    @Override
    public OficinaDao getOficinaDao() {
        return new JPAOficinaDao();
    }

    @Override
    public SeguimientoDao getSeguimientoDao() {
        return new JPASeguimientoDao();
    }

    @Override
    public TipoAccionDao getTipoAccionDao() {
        return new JPATipoAccionDao();
    }

//    @Override
//    public UnidadJudicialDao getUnidadJudicialDao() {
//        return new JPAUnidadJudicialDao();
//    }

    @Override
    public UsuarioDao getUsuarioDao() {
        return new JPAUsuarioDao();
    }

    @Override
    public ZonalDao getZonalDao() {
        return new JPAZonalDao();
    }

    @Override
    public MenuDao getMenuDao() {
        return new JPAMenuDao();
    }

}
