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
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "diligenciasListar")
@ViewScoped
public class DiligenciasListar implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Juicio> ltsJuicios;
    private List<Juicio> ltsJuiciosFiltrados;
    private List<Seguimiento> ltsSeguimientos;
    private List<Seguimiento> ltsSeguimientosFiltrados;
    private List<Funcionario> ltsFuncionarios;

    private Juicio juicio;
    private Seguimiento seguimiento;
    private Funcionario funcionario;

    @ManagedProperty("#{verDiligencia}")
    private VerDiligencia ctrVerDiligencia;

    public String verDiligencia(int juCodJuicio) {
        Seguimiento se = (Seguimiento) JPAFactoryDao.getFactory().getSeguimientoDao().buscarSeguimientosPorJuicio(juCodJuicio);
        getCtrVerDiligencia().setSeguimiento(se);
        return "verDiligencia.banecuador";
    }

//    public String detalleDiligencias(int juCodigo) {
//        Seguimiento ju = (Seguimiento) JPAFactoryDao.getFactory().getSeguimientoDao().read(Integer.valueOf(juCodigo));//talvez se deba hacer referencia a codigo del seguimiento y no al del juCodigo
//        getCtrDetalleDiligencias().setSeguimiento(ju);
//        return "detalleDiligencias.banecuador";
//    }
    //getters & setters
    //Lista para obtener todos los juicios
//    public List<Juicio> getLtsJuicios() {   
//        this.ltsJuicios = null;
//        if (this.ltsJuicios == null) {
//            ltsJuicios = JPAFactoryDao.getFactory().getJuicioDao().juiciosSeguimientos();
//        }
//        return this.ltsJuicios;
//    }

    public void setLtsJuicios(List<Juicio> ltsJuicios) {
        this.ltsJuicios = ltsJuicios;
    }

    //Lista para obtener todos los seguimientos
    public List<Seguimiento> getLtsSeguimientos() {
        //ltsSeguimientos = JPAFactoryDao.getFactory().getSeguimientoDao().find();
        return ltsSeguimientos;
    }

    public void setLtsSeguimientos(List<Seguimiento> ltsSeguimientos) {
        this.ltsSeguimientos = ltsSeguimientos;
    }

    public List<Funcionario> getLtsFuncionarios() {
        return ltsFuncionarios;
    }

    public void setLtsFuncionarios(List<Funcionario> ltsFuncionarios) {
        this.ltsFuncionarios = ltsFuncionarios;
    }

    public Juicio getJuicio() {
        return juicio;
    }

    public void setJuicio(Juicio juicio) {
        this.juicio = juicio;
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Seguimiento> getLtsSeguimientosFiltrados() {
        return ltsSeguimientosFiltrados;
    }

    public void setLtsSeguimientosFiltrados(List<Seguimiento> ltsSeguimientosFiltrados) {
        this.ltsSeguimientosFiltrados = ltsSeguimientosFiltrados;
    }

    public List<Juicio> getLtsJuiciosFiltrados() {
        return ltsJuiciosFiltrados;
    }

    public void setLtsJuiciosFiltrados(List<Juicio> ltsJuiciosFiltrados) {
        this.ltsJuiciosFiltrados = ltsJuiciosFiltrados;
    }

//    public DetalleDiligencias getCtrDetalleDiligencias() {
//        return ctrDetalleDiligencias;
//    }
//
//    public void setCtrDetalleDiligencias(DetalleDiligencias ctrDetalleDiligencias) {
//        this.ctrDetalleDiligencias = ctrDetalleDiligencias;
//    }
    public VerDiligencia getCtrVerDiligencia() {
        return ctrVerDiligencia;
    }

    public void setCtrVerDiligencia(VerDiligencia ctrVerDiligencia) {
        this.ctrVerDiligencia = ctrVerDiligencia;
    }

}
