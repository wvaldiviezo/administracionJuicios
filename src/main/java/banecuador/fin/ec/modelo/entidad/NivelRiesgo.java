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
@Table(name = "nivel_riesgo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelRiesgo.findAll", query = "SELECT n FROM NivelRiesgo n"),
    @NamedQuery(name = "NivelRiesgo.findByNrCodigo", query = "SELECT n FROM NivelRiesgo n WHERE n.nrCodigo = :nrCodigo"),
    @NamedQuery(name = "NivelRiesgo.findByNrDescripcion", query = "SELECT n FROM NivelRiesgo n WHERE n.nrDescripcion = :nrDescripcion")})
public class NivelRiesgo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nr_codigo")
    private Integer nrCodigo;
    @Size(max = 15)
    @Column(name = "nr_descripcion")
    private String nrDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrCodigo")
    private List<Juicio> juicioList;

    public NivelRiesgo() {
    }

    public NivelRiesgo(Integer nrCodigo) {
        this.nrCodigo = nrCodigo;
    }

    public Integer getNrCodigo() {
        return nrCodigo;
    }

    public void setNrCodigo(Integer nrCodigo) {
        this.nrCodigo = nrCodigo;
    }

    public String getNrDescripcion() {
        return nrDescripcion;
    }

    public void setNrDescripcion(String nrDescripcion) {
        this.nrDescripcion = nrDescripcion;
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
        hash += (nrCodigo != null ? nrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelRiesgo)) {
            return false;
        }
        NivelRiesgo other = (NivelRiesgo) object;
        if ((this.nrCodigo == null && other.nrCodigo != null) || (this.nrCodigo != null && !this.nrCodigo.equals(other.nrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.NivelRiesgo[ nrCodigo=" + nrCodigo + " ]";
    }
    
}
