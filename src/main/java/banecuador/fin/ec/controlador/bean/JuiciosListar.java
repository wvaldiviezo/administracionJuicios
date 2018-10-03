/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.NivelRiesgo;
import banecuador.fin.ec.modelo.entidad.TipoAccion;
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
@ManagedBean(name = "juiciosListar")
@ViewScoped
public class JuiciosListar implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Juicio> ltsJuicios;
    private List<Funcionario> ltsFuncionarios;
    private List<TipoAccion> ltsTipoAcciones;
    private List<NivelRiesgo> ltsNivelRiesgos;
    
    private List<Juicio> ltsJuiciosFiltrados;

    private Juicio juicio;
    private Funcionario funcionario;
    private TipoAccion tipoAccion;
    private NivelRiesgo nivelRiesgo;

    @ManagedProperty("#{verJuicio}")
    private VerJuicio ctrVerJuicio;
    
    @ManagedProperty("#{actualizarJuicio}")
    private ActualizarJuicio ctrActualizarJuicio;
    
    @ManagedProperty("#{registrarDiligencia}")
    private RegistrarDiligencia ctrRegistrarDiligencia;
    
    @ManagedProperty("#{verDiligencia}")
    private VerDiligencia ctrVerDiligencia;
    
    private Juicio juActual;
    
    private String estadoDelJuicio;

    //Método que llama al controlador VerJuicio para ver el detalle de la información con la cual se registro un juicio;
    public String verJuicio() {
       //Juicio ju = (Juicio) JPAFactoryDao.getFactory().getJuicioDao().read(Integer.valueOf(juCodigo));
       System.out.println(juActual.getJuCodigo());
       
        getCtrVerJuicio().setJuicioAct(juActual);
        return "verJuicio.banecuador";
    }
    
        //Método que llama al controlador actualizarJuicio para realizar la actualización de la información de un seguimiento del juicio;
    public String actualizarJuicio(int juCodigo) {
        Juicio ju = (Juicio) JPAFactoryDao.getFactory().getJuicioDao().read(Integer.valueOf(juCodigo));
        getCtrActualizarJuicio().setJuicioAct(ju);
        return "actualizarJuicio.banecuador";
    }
    
    //Método para eliminar
    public String eliminarJuicio(int juCodigo) {
        JPAFactoryDao.getFactory().getJuicioDao().deleteByID(Integer.valueOf(juCodigo));
        return "bienvenida.banecuador";
    }
    
    //mètodo para registrar una diligencia de un juicio
    public String registrarDiligencia (int juCodigo) {
        Juicio ju = (Juicio) JPAFactoryDao.getFactory().getJuicioDao().read(Integer.valueOf(juCodigo));
        getCtrRegistrarDiligencia().setJuicio(ju);
        return "registroDiligencia.banecuador";
    }
    
    //mètodo para ver las Diligencias de un Juicio
    public String verDiligencia () {
        //Juicio ju = (Juicio) JPAFactoryDao.getFactory().getJuicioDao().read(Integer.valueOf(juCodigo));
        getCtrVerDiligencia().setJuicioDiligencia(juActual);
        return "verDiligencia.banecuador";
    }

    //Getters & Setters
    public List<Juicio> getLtsJuicios() {
//        this.ltsJuicios = null;
//        if (this.ltsJuicios == null) {
            //ltsJuicios = JPAFactoryDao.getFactory().getJuicioDao().find();
            ltsJuicios = JPAFactoryDao.getFactory().getJuicioDao().ltsJuiciosDescendente();
//        }
        return this.ltsJuicios;
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

    public List<TipoAccion> getLtsTipoAcciones() {
        return ltsTipoAcciones;
    }

    public void setLtsTipoAcciones(List<TipoAccion> ltsTipoAcciones) {
        this.ltsTipoAcciones = ltsTipoAcciones;
    }

    public List<NivelRiesgo> getLtsNivelRiesgos() {
        return ltsNivelRiesgos;
    }

    public void setLtsNivelRiesgos(List<NivelRiesgo> ltsNivelRiesgos) {
        this.ltsNivelRiesgos = ltsNivelRiesgos;
    }

    public Juicio getJuicio() {
        return juicio;
    }

    public void setJuicio(Juicio juicio) {
        this.juicio = juicio;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TipoAccion getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(TipoAccion tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(NivelRiesgo nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public VerJuicio getCtrVerJuicio() {
        return ctrVerJuicio;
    }

    public void setCtrVerJuicio(VerJuicio ctrVerJuicio) {
        this.ctrVerJuicio = ctrVerJuicio;
    }

    public String getEstadoDelJuicio() {
        return estadoDelJuicio;
    }

    public void setEstadoDelJuicio(String estadoDelJuicio) {
        this.estadoDelJuicio = estadoDelJuicio;
    }

    public List<Juicio> getLtsJuiciosFiltrados() {
        return ltsJuiciosFiltrados;
    }

    public void setLtsJuiciosFiltrados(List<Juicio> ltsJuiciosFiltrados) {
        this.ltsJuiciosFiltrados = ltsJuiciosFiltrados;
    }

    public ActualizarJuicio getCtrActualizarJuicio() {
        return ctrActualizarJuicio;
    }

    public void setCtrActualizarJuicio(ActualizarJuicio ctrActualizarJuicio) {
        this.ctrActualizarJuicio = ctrActualizarJuicio;
    }

    public RegistrarDiligencia getCtrRegistrarDiligencia() {
        return ctrRegistrarDiligencia;
    }

    public void setCtrRegistrarDiligencia(RegistrarDiligencia ctrRegistrarDiligencia) {
        this.ctrRegistrarDiligencia = ctrRegistrarDiligencia;
    }

    public VerDiligencia getCtrVerDiligencia() {
        return ctrVerDiligencia;
    }

    public void setCtrVerDiligencia(VerDiligencia ctrVerDiligencia) {
        this.ctrVerDiligencia = ctrVerDiligencia;
    }

    public Juicio getJuActual() {
        return juActual;
    }

    public void setJuActual(Juicio juActual) {
        this.juActual = juActual;
    }
    
}
