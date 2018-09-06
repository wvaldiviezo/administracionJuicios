/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wvaldiviezo
 */
@Entity
@Table(name = "tipo_accion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAccion.findAll", query = "SELECT t FROM TipoAccion t"),
    @NamedQuery(name = "TipoAccion.findByTaCodigo", query = "SELECT t FROM TipoAccion t WHERE t.taCodigo = :taCodigo"),
    @NamedQuery(name = "TipoAccion.findByTaDescripcion", query = "SELECT t FROM TipoAccion t WHERE t.taDescripcion = :taDescripcion")})
public class TipoAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ta_codigo")
    private Integer taCodigo;
    @Size(max = 20)
    @Column(name = "ta_descripcion")
    private String taDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taCodigo")
    private List<Juicio> juicioList;

    public TipoAccion() {
    }

    public TipoAccion(Integer taCodigo) {
        this.taCodigo = taCodigo;
    }

    public Integer getTaCodigo() {
        return taCodigo;
    }

    public void setTaCodigo(Integer taCodigo) {
        this.taCodigo = taCodigo;
    }

    public String getTaDescripcion() {
        return taDescripcion;
    }

    public void setTaDescripcion(String taDescripcion) {
        this.taDescripcion = taDescripcion;
    }

    @XmlTransient
    public List<Juicio> getJuicioList() {
        return juicioList;
    }

    public void setJuicioList(List<Juicio> juicioList) {
        this.juicioList = juicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taCodigo != null ? taCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAccion)) {
            return false;
        }
        TipoAccion other = (TipoAccion) object;
        if ((this.taCodigo == null && other.taCodigo != null) || (this.taCodigo != null && !this.taCodigo.equals(other.taCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.TipoAccion[ taCodigo=" + taCodigo + " ]";
    }
    
}
