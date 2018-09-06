/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.controlador.mail.emailEnviar;
import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "registrarDiligencia")
//@ViewScoped
//@RequestScoped
@SessionScoped
public class RegistrarDiligencia implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Juicio> ltsJuicios;
    private List<Seguimiento> ltsSeguimientos;
    private List<Funcionario> ltsFuncionarios;

    private Juicio juicio;
    private Seguimiento seguimiento;
    private Funcionario funcionario;
    
    private int numJuicioID;
    private int funcionarioID;

    public RegistrarDiligencia() {
        ltsJuicios = null;
        ltsSeguimientos = null;
        ltsFuncionarios = null;

        this.juicio = new Juicio();
        this.seguimiento = new Seguimiento();
        this.funcionario = new Funcionario();
        
        this.numJuicioID = 0;
        this.funcionarioID = 0;
    }
    
    public void registrarDiligencia(){
        try {
            //this.juicio.setJuCodigo(numJuicioID);
            this.seguimiento.setJuCodigo(juicio);
            this.funcionario.setFuCodigo(funcionarioID);
            this.seguimiento.setFuCodigo(funcionario);
            
            JPAFactoryDao.getFactory().getSeguimientoDao().create(seguimiento);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("registrarDiligencia");
            //FacesContext.getCurrentInstance().
            
            
            //envío de correo electrónico
            emailEnviar mail = new emailEnviar();
            mail.setPara(this.seguimiento.getFuCodigo().getFuCorreo());
            mail.setAsunto("Notificación de la Diligencia: ");
            mail.setContenidoMensaje("Estimado(a),\nNotificación del Juicio : " +this.juicio.getJuNumeroJuicio()+ "\n" 
                    + "Descripción de la citación:" + this.seguimiento.getSeDescripcion() + "\n" 
                    + "Fecha de la diligencia: " + this.seguimiento.getSeFechaDiligencia());
            mail.enviarCorreo();
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Diligencia registrada exitosamente"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Diligencia NO registrada "));
        }
    }
    
    //getters & setters

    public List<Juicio> getLtsJuicios() {
        ltsJuicios = JPAFactoryDao.getFactory().getJuicioDao().find();
        return ltsJuicios;
    }

    public void setLtsJuicios(List<Juicio> ltsJuicios) {
        this.ltsJuicios = ltsJuicios;
    }

    public List<Seguimiento> getLtsSeguimientos() {
        return ltsSeguimientos;
    }

    public void setLtsSeguimientos(List<Seguimiento> ltsSeguimientos) {
        this.ltsSeguimientos = ltsSeguimientos;
    }

    public List<Funcionario> getLtsFuncionarios() {
        ltsFuncionarios = JPAFactoryDao.getFactory().getFuncionarioDao().find();
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

    public int getNumJuicioID() {
        return numJuicioID;
    }

    public void setNumJuicioID(int numJuicioID) {
        this.numJuicioID = numJuicioID;
    }

    public int getFuncionarioID() {
        return funcionarioID;
    }

    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }
    
    
    
}
