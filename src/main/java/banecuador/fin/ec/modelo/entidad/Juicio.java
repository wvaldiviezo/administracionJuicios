/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wvaldiviezo
 */
@Entity
@Table(name = "juicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juicio.findAll", query = "SELECT j FROM Juicio j"),
    @NamedQuery(name = "Juicio.findByJuCodigo", query = "SELECT j FROM Juicio j WHERE j.juCodigo = :juCodigo"),
    @NamedQuery(name = "Juicio.findByJuNumeroJuicio", query = "SELECT j FROM Juicio j WHERE j.juNumeroJuicio = :juNumeroJuicio"),
    @NamedQuery(name = "Juicio.findByJuFechaInicio", query = "SELECT j FROM Juicio j WHERE j.juFechaInicio = :juFechaInicio"),
    @NamedQuery(name = "Juicio.findByJuOcacionante", query = "SELECT j FROM Juicio j WHERE j.juOcacionante = :juOcacionante"),
    @NamedQuery(name = "Juicio.findByJuOcacionado", query = "SELECT j FROM Juicio j WHERE j.juOcacionado = :juOcacionado"),
    @NamedQuery(name = "Juicio.findByJuMotivoAccion", query = "SELECT j FROM Juicio j WHERE j.juMotivoAccion = :juMotivoAccion"),
    @NamedQuery(name = "Juicio.findByJuEstadoJuicio", query = "SELECT j FROM Juicio j WHERE j.juEstadoJuicio = :juEstadoJuicio"),
    @NamedQuery(name = "Juicio.findByJuCuantia", query = "SELECT j FROM Juicio j WHERE j.juCuantia = :juCuantia"),
    @NamedQuery(name = "Juicio.findByJuUsuarioRegistra", query = "SELECT j FROM Juicio j WHERE j.juUsuarioRegistra = :juUsuarioRegistra"),
    @NamedQuery(name = "Juicio.findByJuFechaRegistro", query = "SELECT j FROM Juicio j WHERE j.juFechaRegistro = :juFechaRegistro"),
    @NamedQuery(name = "Juicio.findByJuUsuarioActualiza", query = "SELECT j FROM Juicio j WHERE j.juUsuarioActualiza = :juUsuarioActualiza"),
    @NamedQuery(name = "Juicio.findByJuFechaActualiza", query = "SELECT j FROM Juicio j WHERE j.juFechaActualiza = :juFechaActualiza"),
    @NamedQuery(name = "Juicio.findByJuUnidadJudicial", query = "SELECT j FROM Juicio j WHERE j.juUnidadJudicial = :juUnidadJudicial")})
public class Juicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ju_codigo")
    private Integer juCodigo;
    @Size(max = 100)
    @Column(name = "ju_numero_juicio")
    private String juNumeroJuicio;
    @Column(name = "ju_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date juFechaInicio;
    @Size(max = 250)
    @Column(name = "ju_ocacionante")
    private String juOcacionante;
    @Size(max = 250)
    @Column(name = "ju_ocacionado")
    private String juOcacionado;
    @Size(max = 250)
    @Column(name = "ju_motivo_accion")
    private String juMotivoAccion;
    @Size(max = 15)
    @Column(name = "ju_estado_juicio")
    private String juEstadoJuicio;
    @Size(max = 14)
    @Column(name = "ju_cuantia")
    private String juCuantia;
    @Size(max = 50)
    @Column(name = "ju_usuario_registra")
    private String juUsuarioRegistra;
    @Column(name = "ju_fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date juFechaRegistro;
    @Size(max = 50)
    @Column(name = "ju_usuario_actualiza")
    private String juUsuarioActualiza;
    @Column(name = "ju_fecha_actualiza")
    @Temporal(TemporalType.DATE)
    private Date juFechaActualiza;
    @Size(max = 250)
    @Column(name = "ju_unidad_judicial")
    private String juUnidadJudicial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juCodigo")
    private List<Seguimiento> seguimientoList;
    @JoinColumn(name = "nr_codigo", referencedColumnName = "nr_codigo")
    @ManyToOne(optional = false)
    private NivelRiesgo nrCodigo;
    @JoinColumn(name = "of_codigo", referencedColumnName = "of_codigo")
    @ManyToOne
    private Oficina ofCodigo;
    @JoinColumn(name = "ta_codigo", referencedColumnName = "ta_codigo")
    @ManyToOne(optional = false)
    private TipoAccion taCodigo;

    public Juicio() {
    }

    public Juicio(Integer juCodigo) {
        this.juCodigo = juCodigo;
    }

    public Integer getJuCodigo() {
        return juCodigo;
    }

    public void setJuCodigo(Integer juCodigo) {
        this.juCodigo = juCodigo;
    }

    public String getJuNumeroJuicio() {
        return juNumeroJuicio;
    }

    public void setJuNumeroJuicio(String juNumeroJuicio) {
        this.juNumeroJuicio = juNumeroJuicio;
    }

    public Date getJuFechaInicio() {
        return juFechaInicio;
    }

    public void setJuFechaInicio(Date juFechaInicio) {
        this.juFechaInicio = juFechaInicio;
    }

    public String getJuOcacionante() {
        return juOcacionante;
    }

    public void setJuOcacionante(String juOcacionante) {
        this.juOcacionante = juOcacionante;
    }

    public String getJuOcacionado() {
        return juOcacionado;
    }

    public void setJuOcacionado(String juOcacionado) {
        this.juOcacionado = juOcacionado;
    }

    public String getJuMotivoAccion() {
        return juMotivoAccion;
    }

    public void setJuMotivoAccion(String juMotivoAccion) {
        this.juMotivoAccion = juMotivoAccion;
    }

    public String getJuEstadoJuicio() {
        return juEstadoJuicio;
    }

    public void setJuEstadoJuicio(String juEstadoJuicio) {
        this.juEstadoJuicio = juEstadoJuicio;
    }

    public String getJuCuantia() {
        return juCuantia;
    }

    public void setJuCuantia(String juCuantia) {
        this.juCuantia = juCuantia;
    }

    public String getJuUsuarioRegistra() {
        return juUsuarioRegistra;
    }

    public void setJuUsuarioRegistra(String juUsuarioRegistra) {
        this.juUsuarioRegistra = juUsuarioRegistra;
    }

    public Date getJuFechaRegistro() {
        return juFechaRegistro;
    }

    public void setJuFechaRegistro(Date juFechaRegistro) {
        this.juFechaRegistro = juFechaRegistro;
    }

    public String getJuUsuarioActualiza() {
        return juUsuarioActualiza;
    }

    public void setJuUsuarioActualiza(String juUsuarioActualiza) {
        this.juUsuarioActualiza = juUsuarioActualiza;
    }

    public Date getJuFechaActualiza() {
        return juFechaActualiza;
    }

    public void setJuFechaActualiza(Date juFechaActualiza) {
        this.juFechaActualiza = juFechaActualiza;
    }

    public String getJuUnidadJudicial() {
        return juUnidadJudicial;
    }

    public void setJuUnidadJudicial(String juUnidadJudicial) {
        this.juUnidadJudicial = juUnidadJudicial;
    }

    @XmlTransient
    public List<Seguimiento> getSeguimientoList() {
        return seguimientoList;
    }

    public void setSeguimientoList(List<Seguimiento> seguimientoList) {
        this.seguimientoList = seguimientoList;
    }

    public NivelRiesgo getNrCodigo() {
        return this.nrCodigo;
    }

    public void setNrCodigo(NivelRiesgo nrCodigo) {
        this.nrCodigo = nrCodigo;
    }

    public Oficina getOfCodigo() {
        return ofCodigo;
    }

    public void setOfCodigo(Oficina ofCodigo) {
        this.ofCodigo = ofCodigo;
    }

    public TipoAccion getTaCodigo() {
        return taCodigo;
    }

    public void setTaCodigo(TipoAccion taCodigo) {
        this.taCodigo = taCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (juCodigo != null ? juCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juicio)) {
            return false;
        }
        Juicio other = (Juicio) object;
        if ((this.juCodigo == null && other.juCodigo != null) || (this.juCodigo != null && !this.juCodigo.equals(other.juCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Juicio[ juCodigo=" + juCodigo + " ]";
    }
    
}
