/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.dao;

import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;

/**
 *
 * @author wvaldiviezo
 */
public abstract class FactoryDao {
    
    protected static FactoryDao factory = new JPAFactoryDao();
    
    public static FactoryDao getFactory() {
        return factory;
    }
    
    //public abstract EmpleadoDAO getEmpleadoDAO();
    public abstract FuncionarioDao getFuncionarioDao();
    public abstract JuicioDao getJuicioDao();
    public abstract NivelRiesgoDao getNivelRiesgoDao();
    public abstract OficinaDao getOficinaDao();
    public abstract SeguimientoDao getSeguimientoDao();
    public abstract TipoAccionDao getTipoAccionDao();
    //public abstract UnidadJudicialDao getUnidadJudicialDao();
    public abstract UsuarioDao getUsuarioDao();
    public abstract ZonalDao getZonalDao();
    public abstract MenuDao getMenuDao();
}
