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
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByFuCodigo", query = "SELECT f FROM Funcionario f WHERE f.fuCodigo = :fuCodigo"),
    @NamedQuery(name = "Funcionario.findByFuNombres", query = "SELECT f FROM Funcionario f WHERE f.fuNombres = :fuNombres"),
    @NamedQuery(name = "Funcionario.findByFuApellidos", query = "SELECT f FROM Funcionario f WHERE f.fuApellidos = :fuApellidos"),
    @NamedQuery(name = "Funcionario.findByFuCorreo", query = "SELECT f FROM Funcionario f WHERE f.fuCorreo = :fuCorreo"),
    @NamedQuery(name = "Funcionario.findByFuEstado", query = "SELECT f FROM Funcionario f WHERE f.fuEstado = :fuEstado")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fu_codigo")
    private Integer fuCodigo;
    @Size(max = 30)
    @Column(name = "fu_nombres")
    private String fuNombres;
    @Size(max = 30)
    @Column(name = "fu_apellidos")
    private String fuApellidos;
    @Size(max = 50)
    @Column(name = "fu_correo")
    private String fuCorreo;
    @Column(name = "fu_estado")
    private Boolean fuEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fuCodigo")
    private List<Seguimiento> seguimientoList;

    public Funcionario() {
    }

    public Funcionario(Integer fuCodigo) {
        this.fuCodigo = fuCodigo;
    }

    public Integer getFuCodigo() {
        return fuCodigo;
    }

    public void setFuCodigo(Integer fuCodigo) {
        this.fuCodigo = fuCodigo;
    }

    public String getFuNombres() {
        return fuNombres;
    }

    public void setFuNombres(String fuNombres) {
        this.fuNombres = fuNombres;
    }

    public String getFuApellidos() {
        return fuApellidos;
    }

    public void setFuApellidos(String fuApellidos) {
        this.fuApellidos = fuApellidos;
    }

    public String getFuCorreo() {
        return fuCorreo;
    }

    public void setFuCorreo(String fuCorreo) {
        this.fuCorreo = fuCorreo;
    }

    public Boolean getFuEstado() {
        return fuEstado;
    }

    public void setFuEstado(Boolean fuEstado) {
        this.fuEstado = fuEstado;
    }

    @XmlTransient
    public List<Seguimiento> getSeguimientoList() {
        return seguimientoList;
    }

    public void setSeguimientoList(List<Seguimiento> seguimientoList) {
        this.seguimientoList = seguimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fuCodigo != null ? fuCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.fuCodigo == null && other.fuCodigo != null) || (this.fuCodigo != null && !this.fuCodigo.equals(other.fuCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Funcionario[ fuCodigo=" + fuCodigo + " ]";
    }
    
}
