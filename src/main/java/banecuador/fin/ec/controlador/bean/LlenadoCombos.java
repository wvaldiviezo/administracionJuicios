/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Oficina;
import banecuador.fin.ec.modelo.entidad.Zonal;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "llenadoCombos")
@SessionScoped
public class LlenadoCombos implements Serializable {

    String zonalID;
    String oficinaID;
    String unidadJudicialID;

    List<Zonal> ltsZonales;
    List<Oficina> ltsOficinas;

    List<Oficina> ltsOficinasEditar;
    
    public LlenadoCombos() {
        zonalID = "0";
        oficinaID = "0";
        unidadJudicialID = "0";

        ltsZonales = null;
        ltsOficinas = null;

        ltsOficinasEditar = null;

        listarZonal();
    }

    public void listarZonal() {
        ltsZonales = JPAFactoryDao.getFactory().getZonalDao().find();
    }

    public void resetCombo() {
        zonalID = "";
        oficinaID = "";
        unidadJudicialID = "";

        ltsOficinas = null;

        listarZonal();
    }


    //getters & setters
    public String getZonalID() {
        return zonalID;
    }

    public void setZonalID(String zonalID) {
        this.zonalID = zonalID;
    }

    public String getOficinaID() {
        return oficinaID;
    }

    public void setOficinaID(String oficinaID) {
        this.oficinaID = oficinaID;
    }

    public String getUnidadJudicialID() {
        return unidadJudicialID;
    }

    public void setUnidadJudicialID(String unidadJudicialID) {
        this.unidadJudicialID = unidadJudicialID;
    }

    public List<Zonal> getLtsZonales() {
        return ltsZonales;
    }

    public void setLtsZonales(List<Zonal> ltsZonales) {
        this.ltsZonales = ltsZonales;
    }

    public List<Oficina> getLtsOficinas() {
        ltsOficinas = JPAFactoryDao.getFactory().getOficinaDao().buscarOficinaPorZonal(zonalID);
        //ltsOficinas = JPAFactoryDao.getFactory().getOficinaDao().find();
        return ltsOficinas;
    }

    public void setLtsOficinas(List<Oficina> ltsOficinas) {
        this.ltsOficinas = ltsOficinas;
    }

    public List<Oficina> getLtsOficinasEditar() {
        return ltsOficinasEditar;
    }

    public void setLtsOficinasEditar(List<Oficina> ltsOficinasEditar) {
        this.ltsOficinasEditar = ltsOficinasEditar;
    }

}
