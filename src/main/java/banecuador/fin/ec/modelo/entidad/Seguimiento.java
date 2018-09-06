/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wvaldiviezo
 */
@Entity
@Table(name = "seguimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguimiento.findAll", query = "SELECT s FROM Seguimiento s"),
    @NamedQuery(name = "Seguimiento.findBySeCodigo", query = "SELECT s FROM Seguimiento s WHERE s.seCodigo = :seCodigo"),
    @NamedQuery(name = "Seguimiento.findBySeDescripcion", query = "SELECT s FROM Seguimiento s WHERE s.seDescripcion = :seDescripcion"),
    @NamedQuery(name = "Seguimiento.findBySeFechaDiligencia", query = "SELECT s FROM Seguimiento s WHERE s.seFechaDiligencia = :seFechaDiligencia"),
    @NamedQuery(name = "Seguimiento.findBySeEstado", query = "SELECT s FROM Seguimiento s WHERE s.seEstado = :seEstado")})
public class Seguimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "se_codigo")
    private Integer seCodigo;
    @Size(max = 250)
    @Column(name = "se_descripcion")
    private String seDescripcion;
    @Column(name = "se_fecha_diligencia")
    @Temporal(TemporalType.DATE)
    private Date seFechaDiligencia;
    @Size(max = 15)
    @Column(name = "se_estado")
    private String seEstado;
    @JoinColumn(name = "fu_codigo", referencedColumnName = "fu_codigo")
    @ManyToOne(optional = false)
    private Funcionario fuCodigo;
    @JoinColumn(name = "ju_codigo", referencedColumnName = "ju_codigo")
    @ManyToOne(optional = false)
    private Juicio juCodigo;

    public Seguimiento() {
    }

    public Seguimiento(Integer seCodigo) {
        this.seCodigo = seCodigo;
    }

    public Integer getSeCodigo() {
        return seCodigo;
    }

    public void setSeCodigo(Integer seCodigo) {
        this.seCodigo = seCodigo;
    }

    public String getSeDescripcion() {
        return seDescripcion;
    }

    public void setSeDescripcion(String seDescripcion) {
        this.seDescripcion = seDescripcion;
    }

    public Date getSeFechaDiligencia() {
        return seFechaDiligencia;
    }

    public void setSeFechaDiligencia(Date seFechaDiligencia) {
        this.seFechaDiligencia = seFechaDiligencia;
    }

    public String getSeEstado() {
        return seEstado;
    }

    public void setSeEstado(String seEstado) {
        this.seEstado = seEstado;
    }

    public Funcionario getFuCodigo() {
        return fuCodigo;
    }

    public void setFuCodigo(Funcionario fuCodigo) {
        this.fuCodigo = fuCodigo;
    }

    public Juicio getJuCodigo() {
        return juCodigo;
    }

    public void setJuCodigo(Juicio juCodigo) {
        this.juCodigo = juCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seCodigo != null ? seCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguimiento)) {
            return false;
        }
        Seguimiento other = (Seguimiento) object;
        if ((this.seCodigo == null && other.seCodigo != null) || (this.seCodigo != null && !this.seCodigo.equals(other.seCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Seguimiento[ seCodigo=" + seCodigo + " ]";
    }
    
}
