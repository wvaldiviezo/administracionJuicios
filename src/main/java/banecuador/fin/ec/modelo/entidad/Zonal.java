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
@Table(name = "zonal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zonal.findAll", query = "SELECT z FROM Zonal z"),
    @NamedQuery(name = "Zonal.findByZoCodigo", query = "SELECT z FROM Zonal z WHERE z.zoCodigo = :zoCodigo"),
    @NamedQuery(name = "Zonal.findByZoDescripcion", query = "SELECT z FROM Zonal z WHERE z.zoDescripcion = :zoDescripcion"),
    @NamedQuery(name = "Zonal.findByZoEstado", query = "SELECT z FROM Zonal z WHERE z.zoEstado = :zoEstado")})
public class Zonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "zo_codigo")
    private Integer zoCodigo;
    @Size(max = 20)
    @Column(name = "zo_descripcion")
    private String zoDescripcion;
    @Column(name = "zo_estado")
    private Boolean zoEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zoCodigo")
    private List<Oficina> oficinaList;

    public Zonal() {
    }

    public Zonal(Integer zoCodigo) {
        this.zoCodigo = zoCodigo;
    }

    public Integer getZoCodigo() {
        return zoCodigo;
    }

    public void setZoCodigo(Integer zoCodigo) {
        this.zoCodigo = zoCodigo;
    }

    public String getZoDescripcion() {
        return zoDescripcion;
    }

    public void setZoDescripcion(String zoDescripcion) {
        this.zoDescripcion = zoDescripcion;
    }

    public Boolean getZoEstado() {
        return zoEstado;
    }

    public void setZoEstado(Boolean zoEstado) {
        this.zoEstado = zoEstado;
    }

    @XmlTransient
    public List<Oficina> getOficinaList() {
        return oficinaList;
    }

    public void setOficinaList(List<Oficina> oficinaList) {
        this.oficinaList = oficinaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zoCodigo != null ? zoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zonal)) {
            return false;
        }
        Zonal other = (Zonal) object;
        if ((this.zoCodigo == null && other.zoCodigo != null) || (this.zoCodigo != null && !this.zoCodigo.equals(other.zoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Zonal[ zoCodigo=" + zoCodigo + " ]";
    }
    
}
