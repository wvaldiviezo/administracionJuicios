/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wvaldiviezo
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsCodigo", query = "SELECT u FROM Usuario u WHERE u.usCodigo = :usCodigo"),
    @NamedQuery(name = "Usuario.findByUsUsuario", query = "SELECT u FROM Usuario u WHERE u.usUsuario = :usUsuario"),
    @NamedQuery(name = "Usuario.findByUsClave", query = "SELECT u FROM Usuario u WHERE u.usClave = :usClave"),
    @NamedQuery(name = "Usuario.findByTipousuario", query = "SELECT u FROM Usuario u WHERE u.tipousuario = :tipousuario"),
    @NamedQuery(name = "Usuario.findByUsEstado", query = "SELECT u FROM Usuario u WHERE u.usEstado = :usEstado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "us_codigo")
    private Integer usCodigo;
    @Size(max = 20)
    @Column(name = "us_usuario")
    private String usUsuario;
    @Size(max = 15)
    @Column(name = "us_clave")
    private String usClave;
    @Size(max = 1)
    @Column(name = "tipousuario")
    private String tipousuario;
    @Column(name = "us_estado")
    private Boolean usEstado;

    public Usuario() {
    }

    public Usuario(Integer usCodigo) {
        this.usCodigo = usCodigo;
    }

    public Integer getUsCodigo() {
        return usCodigo;
    }

    public void setUsCodigo(Integer usCodigo) {
        this.usCodigo = usCodigo;
    }

    public String getUsUsuario() {
        return usUsuario;
    }

    public void setUsUsuario(String usUsuario) {
        this.usUsuario = usUsuario;
    }

    public String getUsClave() {
        return usClave;
    }

    public void setUsClave(String usClave) {
        this.usClave = usClave;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public Boolean getUsEstado() {
        return usEstado;
    }

    public void setUsEstado(Boolean usEstado) {
        this.usEstado = usEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usCodigo != null ? usCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usCodigo == null && other.usCodigo != null) || (this.usCodigo != null && !this.usCodigo.equals(other.usCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Usuario[ usCodigo=" + usCodigo + " ]";
    }
    
}
