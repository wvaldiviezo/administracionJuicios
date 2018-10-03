/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "verDiligencia")
@SessionScoped
public class VerDiligencia implements Serializable {

    private static final long serialVersionUID = 1L;

    private Juicio juicioDiligencia;
    private Juicio numJuicio;
    private List<Juicio> ltsDilegenciasPorJuicio;
    
    private ArrayList ltsDiligencias;
    
    private Seguimiento seguimiento;
    private List<Seguimiento> ltsSeguimientos;
    
    public VerDiligencia(){
        this.juicioDiligencia = new Juicio();
    }
    
    
    //Getters & Setters

    public ArrayList getLtsDiligencias() {
         //this.ltsDiligencias = null;
        if (this.ltsDiligencias == null) {
          //this.ltsDiligencias = JPAFactoryDao.getFactory().getSeguimientoDao().listaDiligencias(this.juicioDiligencia.getJuCodigo());
        }
        return this.ltsDiligencias; 
    }

    public void setLtsDiligencias(ArrayList ltsDiligencias) {
        this.ltsDiligencias = ltsDiligencias;
    }
    
    

    public Juicio getJuicioDiligencia() {
        return juicioDiligencia;
    }

    public void setJuicioDiligencia(Juicio juicioDiligencia) {  
        //this.juicioDiligencia = juicioDiligencia;
        //this.ltsSeguimientos = JPAFactoryDao.getFactory().getSeguimientoDao().find();
        //this.ltsDiligencias = JPAFactoryDao.getFactory().getSeguimientoDao().listaDiligencias(ltsSeguimientos,this.juicioDiligencia.getJuCodigo());
        this.ltsSeguimientos = JPAFactoryDao.getFactory().getSeguimientoDao().seguimientos(juicioDiligencia);
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public List<Seguimiento> getLtsSeguimientos() {
        //this.ltsSeguimientos = JPAFactoryDao.getFactory().getSeguimientoDao().seguimientos(juicioDiligencia);
        return ltsSeguimientos;
    }

    public void setLtsSeguimientos(List<Seguimiento> ltsSeguimientos) {
        this.ltsSeguimientos = ltsSeguimientos;
    }

    //método para listar los juicios que tinen diligencias registradas
    public List<Juicio> getLtsDilegenciasPorJuicio() {
        ltsDilegenciasPorJuicio = JPAFactoryDao.getFactory().getJuicioDao().juiciosSeguimientos();
        return ltsDilegenciasPorJuicio;
    }

    public void setLtsDilegenciasPorJuicio(List<Juicio> ltsDilegenciasPorJuicio) {
        this.ltsDilegenciasPorJuicio = ltsDilegenciasPorJuicio;
    }

    public Juicio getNumJuicio() {
        return numJuicio;
    }

    public void setNumJuicio(Juicio numJuicio) {
        this.numJuicio = numJuicio;
    }
    
    
}
