package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.NivelRiesgo;
import banecuador.fin.ec.modelo.entidad.Oficina;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import banecuador.fin.ec.modelo.entidad.TipoAccion;
import banecuador.fin.ec.modelo.entidad.Zonal;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "actualizarJuicio")
@ViewScoped
@SessionScoped
public class ActualizarJuicio implements Serializable {

    private static final long serialVersionUID = 1L;

    private Juicio juicioAct;
    private Zonal zonal;
    private Oficina oficina;
    private Oficina OficinaRecuperado;
    private NivelRiesgo nivelRiesgo;
    private TipoAccion tipoAccion;
    private Funcionario funcionario;
    private Seguimiento seguimiento;
    
    
    private int FuncionarioID;
    private int TipoAccionID;
    private int NivelRiesgoID;
    private int OficinaID;
    private int ZonalID;
       
    private List<TipoAccion> ltsTipoAcciones;
    private List<Funcionario> ltsFuncionarios;
    private List<NivelRiesgo> ltsNivelRiesgos;
    private List<Oficina> ltsOficinas;
    private List<Oficina> ltsOficinaSeleccionado;
    private List<Zonal> ltsZonalOficina;

    private Oficina zonaSeleccionado = new Oficina();
    
    public Oficina getOficinaRecuperado() {
        return OficinaRecuperado;
    }

    public void setOficinaRecuperado(Oficina OficinaRecuperado) {
        this.OficinaRecuperado = OficinaRecuperado;
    }

    public List<Oficina> getLtsOficinas() {
        ltsOficinas = JPAFactoryDao.getFactory().getOficinaDao().buscarOficinaPorZonal(String.valueOf(this.ZonalID));
        return ltsOficinas;
    }

    public void setLtsOficinas(List<Oficina> ltsOficinas) {
        this.ltsOficinas = ltsOficinas;
    }

    public List<Oficina> getLtsOficinaSeleccionado() {
        return this.ltsOficinaSeleccionado;
    }

    public void setLtsOficinaSeleccionado(List<Oficina> ltsOficinaSeleccionado) {
        this.ltsOficinaSeleccionado = ltsOficinaSeleccionado;
    }

    public Oficina getZonaSeleccionado() {
        return zonaSeleccionado;
    }

    public void setZonaSeleccionado(Oficina zonaSeleccionado) {
        this.zonaSeleccionado = zonaSeleccionado;
    } 

    public List<Zonal> getLtsZonalOficina() {
        ltsZonalOficina = JPAFactoryDao.getFactory().getZonalDao().find();
        return ltsZonalOficina;
    }

    public void setLtsZonalOficina(List<Zonal> ltsZonalOficina) {
        this.ltsZonalOficina = ltsZonalOficina;
    } 
        
    public ActualizarJuicio() {
        this.tipoAccion = new TipoAccion();
        this.nivelRiesgo = new NivelRiesgo();
        this.oficina = new Oficina();
        this.juicioAct = new Juicio();
//        this.juicioAct = new Juicio();
//        ltsTipoAcciones = null;
//
//        this.FuncionarioID = 0;
//        ltsFuncionarios = null;
//        this.TipoAccionID = 0;
//
//        this.nivelRiesgo = new NivelRiesgo();
//
//        this.NivelRiesgoID = 0;
//
//        this.OficinaID = 0;
//
//        ltsNivelRiesgos = null;

    }

    /*Método para actualizar la información de un registro de un juicio*/
    public void actualizarInformacion() {
        try {
            System.out.println("entro actualizar información");
            
            this.nivelRiesgo.setNrCodigo(this.NivelRiesgoID);
            this.juicioAct.setNrCodigo(nivelRiesgo);
            
            this.oficina.setOfCodigo(OficinaID);
            this.juicioAct.setOfCodigo(oficina);
            
            this.tipoAccion.setTaCodigo(this.TipoAccionID);
            this.juicioAct.setTaCodigo(tipoAccion);        

            JPAFactoryDao.getFactory().getJuicioDao().update(juicioAct);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Juicio actualizado exitosamente"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Juicios NO actualizado "));
        }
    }

    //Getter & Setters
    public Juicio getJuicioAct() {
        return this.juicioAct;
    }

    public void setJuicioAct(Juicio juicioAct) {
        this.juicioAct = juicioAct;
        this.TipoAccionID = juicioAct.getTaCodigo().getTaCodigo();                         
        this.NivelRiesgoID = juicioAct.getNrCodigo().getNrCodigo();
        
        System.out.println("Ingresa seteo combos");
        this.OficinaID = juicioAct.getOfCodigo().getOfCodigo();
         
        String[] atributo = { "ofCodigo" };
        String oficinaSeleccionado = String.valueOf(this.OficinaID);
        String[] values = { oficinaSeleccionado }; 
        
        oficina = (Oficina) JPAFactoryDao.getFactory().getOficinaDao().read(OficinaID);
        
        this.ZonalID = oficina.getZoCodigo().getZoCodigo();
        String zonalSeleccionado = String.valueOf(this.ZonalID); 
        
        this.ltsOficinas = JPAFactoryDao.getFactory().getOficinaDao().buscarOficinaPorZonal(zonalSeleccionado);
        
    }

    public Zonal getZonal() {
        return zonal;
    }

    public void setZonal(Zonal zonal) {
        this.zonal = zonal;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(NivelRiesgo nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public TipoAccion getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(TipoAccion tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public int getFuncionarioID() {
        return FuncionarioID;
    }

    public void setFuncionarioID(int FuncionarioID) {
        this.FuncionarioID = FuncionarioID;
    }

    public List<Funcionario> getLtsFuncionarios() {
        ltsFuncionarios = JPAFactoryDao.getFactory().getFuncionarioDao().find();
        return ltsFuncionarios;
    }

    public void setLtsFuncionarios(List<Funcionario> ltsFuncionarios) {
        this.ltsFuncionarios = ltsFuncionarios;
    }

    public int getTipoAccionID() {
        return TipoAccionID;
    }

    public void setTipoAccionID(int TipoAccionID) {
        this.TipoAccionID = TipoAccionID;
    }

    public List<TipoAccion> getLtsTipoAcciones() {
        ltsTipoAcciones = JPAFactoryDao.getFactory().getTipoAccionDao().find();
        return ltsTipoAcciones;
    }

    public void setLtsTipoAcciones(List<TipoAccion> ltsTipoAcciones) {
        this.ltsTipoAcciones = ltsTipoAcciones;
    }

    public int getNivelRiesgoID() {
        return NivelRiesgoID;
    }

    public void setNivelRiesgoID(int NivelRiesgoID) {
        this.NivelRiesgoID = NivelRiesgoID;
    }

    public int getOficinaID() {
        return OficinaID;
    }

    public void setOficinaID(int OficinaID) {
        this.OficinaID = OficinaID;
    }

    public List<NivelRiesgo> getLtsNivelRiesgos() {
        ltsNivelRiesgos = JPAFactoryDao.getFactory().getNivelRiesgoDao().find();
        return ltsNivelRiesgos;
    }

    public void setLtsNivelRiesgos(List<NivelRiesgo> ltsNivelRiesgos) {
        this.ltsNivelRiesgos = ltsNivelRiesgos;
    }

    public int getZonalID() {        
        return ZonalID;
    }

    public void setZonalID(int ZonalID) {
        this.ZonalID = ZonalID;
    }

}
