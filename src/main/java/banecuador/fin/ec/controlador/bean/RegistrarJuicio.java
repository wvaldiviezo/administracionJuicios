package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.NivelRiesgo;
import banecuador.fin.ec.modelo.entidad.Oficina;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import banecuador.fin.ec.modelo.entidad.TipoAccion;

import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "juicioRegistrar")
@ViewScoped
public class RegistrarJuicio implements Serializable {

    private List<TipoAccion> ltsTipoAcciones;
    private List<NivelRiesgo> ltsNivelRiesgos;

    private List<Funcionario> ltsFuncionarios;

    private Juicio juicio;
    private Funcionario funcionario;
    private TipoAccion tipoAccion;
    private NivelRiesgo nivelRiesgo;
    private Seguimiento seguimientoJuicio;
    private Oficina oficina;

    private int FuncionarioID;
    private int TipoAccionID;
    private int NivelRiesgoID;
    private int seguimientoJuicioID;
    private int OficinaID;

    public RegistrarJuicio() {

        ltsTipoAcciones = null;
        ltsNivelRiesgos = null;
        ltsFuncionarios = null;

        this.juicio = new Juicio();
        this.funcionario = new Funcionario();
        this.tipoAccion = new TipoAccion();
        this.nivelRiesgo = new NivelRiesgo();
        this.seguimientoJuicio = new Seguimiento();
        this.oficina = new Oficina();

        this.FuncionarioID = 0;
        this.TipoAccionID = 0;
        this.NivelRiesgoID = 0;

        this.OficinaID = 0;

    }
    
    
    public void limpiar(ComponentSystemEvent event) {
        oficina = null;
    }

    public void registrarJuicio() {
        try {
            this.tipoAccion.setTaCodigo(this.TipoAccionID);
            this.juicio.setTaCodigo(tipoAccion);

            this.nivelRiesgo.setNrCodigo(this.NivelRiesgoID);
            this.juicio.setNrCodigo(nivelRiesgo);

            this.oficina.setOfCodigo(OficinaID);
            this.juicio.setOfCodigo(oficina);

//            this.unidadJudicial.setUjCodigo(this.UnidadJudicialID);
//            this.juicio.setUjCodigo(unidadJudicial);
            juicio.setJuEstadoJuicio("activo");
            JPAFactoryDao.getFactory().getJuicioDao().create(juicio);

            //Envío de  correo
//            emailEnviar mail = new emailEnviar();
//            //mail.setPara(this.juicio.getFuCodigo().getFuCorreo());
//            mail.setPara("Wilmer.valdiviezo@banecuador.fin.ec");
//            mail.setAsunto("Notificación del juicio: " + this.juicio.getJuNumeroJuicio());
//            mail.setContenidoMensaje("Estimado(a),\nNotificación : "+this.juicio.getJuNumeroJuicio()+"\n"+
//                "Número de Juicio: "+this.juicio.getJuNumeroJuicio()+"\n"+
//                "Acccionante: "+this.juicio.getJuOcacionante()+"\n"+
//                "Accionado: "+this.juicio.getJuOcacionado()+"\n"+
//                "Descripción Notificación: "+this.juicio.getJuSeguimiento1());
//            System.out.println("Envia el correo a");
//        mail.enviarCorreo();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Juicio registrado exitosamente"));

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Juicios NO registrado "));
        }
    }
   

    //Método para realizar la actualización del la información con la que se realizó el registro de un juicio
    public void actualizarInformacionJuicio() {
        try {
            JPAFactoryDao.getFactory().getJuicioDao().update(juicio);
            System.out.println("Actualización de la información correcta");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Juicio actualizado exitosamente"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Juicios NO actualizado "));
        }
    }
   

    //getters & setters
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

    public int getFuncionarioID() {
        return FuncionarioID;
    }

    public void setFuncionarioID(int FuncionarioID) {
        this.FuncionarioID = FuncionarioID;
    }

    public int getTipoAccionID() {
        return TipoAccionID;
    }

    public void setTipoAccionID(int TipoAccionID) {
        this.TipoAccionID = TipoAccionID;
    }

    public int getNivelRiesgoID() {
        return NivelRiesgoID;
    }

    public void setNivelRiesgoID(int NivelRiesgoID) {
        this.NivelRiesgoID = NivelRiesgoID;
    }

    public List<TipoAccion> getLtsTipoAcciones() {
        ltsTipoAcciones = JPAFactoryDao.getFactory().getTipoAccionDao().find();
        return ltsTipoAcciones;
    }

    public void setLtsTipoAcciones(List<TipoAccion> ltsTipoAcciones) {
        this.ltsTipoAcciones = ltsTipoAcciones;
    }

    public List<NivelRiesgo> getLtsNivelRiesgos() {
        ltsNivelRiesgos = JPAFactoryDao.getFactory().getNivelRiesgoDao().find();
        return ltsNivelRiesgos;
    }

    public void setLtsNivelRiesgos(List<NivelRiesgo> ltsNivelRiesgos) {
        this.ltsNivelRiesgos = ltsNivelRiesgos;
    }

    public List<Funcionario> getLtsFuncionarios() {
        ltsFuncionarios = JPAFactoryDao.getFactory().getFuncionarioDao().find();
        return ltsFuncionarios;
    }

    public void setLtsFuncionarios(List<Funcionario> ltsFuncionarios) {
        this.ltsFuncionarios = ltsFuncionarios;
    }

    public Seguimiento getSeguimientoJuicio() {
        return seguimientoJuicio;
    }

    public void setSeguimientoJuicio(Seguimiento seguimientoJuicio) {
        this.seguimientoJuicio = seguimientoJuicio;
    }

    public int getSeguimientoJuicioID() {
        return seguimientoJuicioID;
    }

    public void setSeguimientoJuicioID(int seguimientoJuicioID) {
        this.seguimientoJuicioID = seguimientoJuicioID;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public int getOficinaID() {
        return OficinaID;
    }

    public void setOficinaID(int OficinaID) {
        this.OficinaID = OficinaID;
    }

}
