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
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByCodigomenu", query = "SELECT m FROM Menu m WHERE m.codigomenu = :codigomenu"),
    @NamedQuery(name = "Menu.findByNombremenu", query = "SELECT m FROM Menu m WHERE m.nombremenu = :nombremenu"),
    @NamedQuery(name = "Menu.findByTipomenu", query = "SELECT m FROM Menu m WHERE m.tipomenu = :tipomenu"),
    @NamedQuery(name = "Menu.findByTipousuariomenu", query = "SELECT m FROM Menu m WHERE m.tipousuariomenu = :tipousuariomenu"),
    @NamedQuery(name = "Menu.findByUrlmenu", query = "SELECT m FROM Menu m WHERE m.urlmenu = :urlmenu"),
    @NamedQuery(name = "Menu.findByEstadomenu", query = "SELECT m FROM Menu m WHERE m.estadomenu = :estadomenu")})
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigomenu")
    private Integer codigomenu;
    @Size(max = 50)
    @Column(name = "nombremenu")
    private String nombremenu;
    @Size(max = 1)
    @Column(name = "tipomenu")
    private String tipomenu;
    @Size(max = 1)
    @Column(name = "tipousuariomenu")
    private String tipousuariomenu;
    @Size(max = 100)
    @Column(name = "urlmenu")
    private String urlmenu;
    @Column(name = "estadomenu")
    private Boolean estadomenu;
    @OneToMany(mappedBy = "codigosubmenu")
    private List<Menu> menuList;
    @JoinColumn(name = "codigosubmenu", referencedColumnName = "codigomenu")
    @ManyToOne
    private Menu codigosubmenu;

    public Menu() {
    }

    public Menu(Integer codigomenu) {
        this.codigomenu = codigomenu;
    }

    public Integer getCodigomenu() {
        return codigomenu;
    }

    public void setCodigomenu(Integer codigomenu) {
        this.codigomenu = codigomenu;
    }

    public String getNombremenu() {
        return nombremenu;
    }

    public void setNombremenu(String nombremenu) {
        this.nombremenu = nombremenu;
    }

    public String getTipomenu() {
        return tipomenu;
    }

    public void setTipomenu(String tipomenu) {
        this.tipomenu = tipomenu;
    }

    public String getTipousuariomenu() {
        return tipousuariomenu;
    }

    public void setTipousuariomenu(String tipousuariomenu) {
        this.tipousuariomenu = tipousuariomenu;
    }

    public String getUrlmenu() {
        return urlmenu;
    }

    public void setUrlmenu(String urlmenu) {
        this.urlmenu = urlmenu;
    }

    public Boolean getEstadomenu() {
        return estadomenu;
    }

    public void setEstadomenu(Boolean estadomenu) {
        this.estadomenu = estadomenu;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Menu getCodigosubmenu() {
        return codigosubmenu;
    }

    public void setCodigosubmenu(Menu codigosubmenu) {
        this.codigosubmenu = codigosubmenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigomenu != null ? codigomenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.codigomenu == null && other.codigomenu != null) || (this.codigomenu != null && !this.codigomenu.equals(other.codigomenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banecuador.fin.ec.modelo.entidad.Menu[ codigomenu=" + codigomenu + " ]";
    }
    
}
