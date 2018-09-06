/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.entidad;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "oficina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oficina.findAll", query = "SELECT o FROM Oficina o"),
    @NamedQuery(name = "Oficina.findByOfCodigo", query = "SELECT o FROM Oficina o WHERE o.ofCodigo = :ofCodigo"),
    @NamedQuery(name = "Oficina.findByOfDescripcion", query = "SELECT o FROM Oficina o WHERE o.ofDescripcion = :ofDescripcion"),
    @NamedQuery(name = "Oficina.findByOfEstado", query = "SELECT o FROM Oficina o WHERE o.ofEstado = :ofEstado")})
public class Oficina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "of_codigo")
    private Integer ofCodigo;
    @Size(max = 100)
    @Column(name = "of_descripcion")
    private String ofDescripcion;
    @Column(name = "of_estado")
    private Boolean ofEstado;
    @JoinColumn(name = "zo_codigo", referencedColumnName = "zo_codigo")
    @ManyToOne(optional = false)
    private Zonal zoCodigo;
    @OneToMany(mappedBy = "ofCodigo")
    private List<Juicio> juicioList;

    public Oficina() {
    }

    public Oficina(Integer ofCodigo) {
        this.ofCodigo = ofCodigo;
    }

    public Integer getOfCodigo() {
        return ofCodigo;
    }

    public void setOfCodigo(Integer ofCodigo) {
        this.ofCodigo = ofCodigo;
    }

    public String getOfDescripcion() {
        return ofDescripcion;
    }

    public void setOfDescripcion(String ofDescripcion) {
        this.ofDescripcion = ofDescripcion;
    }

    public Boolean getOfEstado() {
        return ofEstado;
    }

    public void setOfEstado(Boolean ofEstado) {
        this.ofEstado = ofEstado;
    }

    public Zonal getZoCodigo() {
        return zoCodigo;
    }

    public void setZoCodigo(Zonal zoCodigo) {
        this.zoCodigo = zoCodigo;
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
        hash += (ofCodigo != null ? ofCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oficina)) {
            return false;
        }
        Oficina other = (Oficina) object;
        if ((this.ofCodigo == null && other.ofCodigo != null) || (this.ofCodigo != null && !this.ofCodigo.equals(other.ofCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Oficina[ ofCodigo=" + ofCodigo + " ]";
    }
    
}
