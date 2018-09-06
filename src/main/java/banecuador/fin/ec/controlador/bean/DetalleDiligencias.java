/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "detalleDiligencias")
//@ViewScoped
@SessionScoped
public class DetalleDiligencias implements Serializable {

    private List<Juicio> ltsJuicios;
    private List<Funcionario> ltsFuncionarios;
    private List<Juicio> ltsJuiciosFiltrados;
    private List<Seguimiento> ltsSeguimientos;
    
    private Juicio juicio;

    private Seguimiento seguimiento;

    //Getters & Setters
    public List<Juicio> getLtsJuicios() {
        return ltsJuicios;
    }

    public void setLtsJuicios(List<Juicio> ltsJuicios) {
        this.ltsJuicios = ltsJuicios;
    }

    public List<Funcionario> getLtsFuncionarios() {
        return ltsFuncionarios;
    }

    public void setLtsFuncionarios(List<Funcionario> ltsFuncionarios) {
        this.ltsFuncionarios = ltsFuncionarios;
    }

    public List<Juicio> getLtsJuiciosFiltrados() {
        return ltsJuiciosFiltrados;
    }

    public void setLtsJuiciosFiltrados(List<Juicio> ltsJuiciosFiltrados) {
        this.ltsJuiciosFiltrados = ltsJuiciosFiltrados;
    }

    public List<Seguimiento> getLtsSeguimientos(int juCodigo) {
        this.ltsSeguimientos = null;
        if (this.ltsSeguimientos == null)
        {
            ltsSeguimientos = JPAFactoryDao.getFactory().getSeguimientoDao().buscarSeguimientosPorJuicio(juCodigo);
        }
        return ltsSeguimientos;
    }

    public void setLtsSeguimientos(List<Seguimiento> ltsSeguimientos) {
        this.ltsSeguimientos = ltsSeguimientos;
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) { 
        this.seguimiento = seguimiento;
    }

    public Juicio getJuicio() {
        return juicio;
    }

    public void setJuicio(Juicio juicio) {
        this.juicio = juicio;
    }
    
    
}
