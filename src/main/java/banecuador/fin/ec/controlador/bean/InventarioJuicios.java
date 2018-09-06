/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "inventarioJuicios")
@ViewScoped
public class InventarioJuicios implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Juicio> ltsJuiciosACN1;
    private List<Juicio> ltsJuiciosACN2;
    private List<Juicio> ltsJuiciosACN3;
    private List<Juicio> ltsJuiciosACN4;
    private List<Juicio> ltsJuiciosACN5;
    /*--------------------------*/
    private List<Juicio> ltsJuiciosJCiN1;
    private List<Juicio> ltsJuiciosJCiN2;
    private List<Juicio> ltsJuiciosJCiN3;
    private List<Juicio> ltsJuiciosJCiN4;
    private List<Juicio> ltsJuiciosJCiN5;
    /*--------------------------*/
    private List<Juicio> ltsJuiciosJCoN1;
    private List<Juicio> ltsJuiciosJCoN2;
    private List<Juicio> ltsJuiciosJCoN3;
    private List<Juicio> ltsJuiciosJCoN4;
    private List<Juicio> ltsJuiciosJCoN5;
    /*--------------------------*/
    private List<Juicio> ltsJuiciosJLaN1;
    private List<Juicio> ltsJuiciosJLaN2;
    private List<Juicio> ltsJuiciosJLaN3;
    private List<Juicio> ltsJuiciosJLaN4;
    private List<Juicio> ltsJuiciosJLaN5;
    /*--------------------------*/
    private List<Juicio> ltsJuiciosJPeN1;
    private List<Juicio> ltsJuiciosJPeN2;
    private List<Juicio> ltsJuiciosJPeN3;
    private List<Juicio> ltsJuiciosJPeN4;
    private List<Juicio> ltsJuiciosJPeN5;
    /*--------------------------*/
    private List<Juicio> ltsJuiciosTEN1;
    private List<Juicio> ltsJuiciosTEN2;
    private List<Juicio> ltsJuiciosTEN3;
    private List<Juicio> ltsJuiciosTEN4;
    private List<Juicio> ltsJuiciosTEN5;
    /*--------------------------*/
    private List<Juicio> totales1;
    private List<Juicio> totales2;
    private List<Juicio> totales3;
    private List<Juicio> totales4;
    private List<Juicio> totales5;
    /*--------Reporte-Inventario-Juicios----------------*/
    private List<Juicio> InJuiAccCons;
    private List<Juicio> InJuiCiviles;
    private List<Juicio> InJuiContenciosos;
    private List<Juicio> InJuiLaborales;
    private List<Juicio> InJuiPenales;
    private List<Juicio> InJuitramEspec;
    private List<Juicio> InJuiTotalCB;
    /*Segunda columna*/
    private List<Juicio> InJuiAccConsCC;
    private List<Juicio> InJuiJuiCivilesCC;
    private List<Juicio> InJuiJuiContenciososCC;
    private List<Juicio> InJuiJuiLaboralesCC;
    private List<Juicio> InJuiJuiPenalesCC;
    private List<Juicio> InJuiTramEspecialesCC;
    private List<Juicio> InJuiTotalJuiciosCC;
    /*Tercera Columna*/
    private List<Juicio> InJuiAccConsSC;
    private List<Juicio> InJuiJuiCivilesSC;
    private List<Juicio> InJuiJuiContenciososSC;
    private List<Juicio> InJuiJuiLaboralesSC;
    private List<Juicio> InJuiJuiPenalesSC;
    private List<Juicio> InJuiTramEspecialesSC;
    private List<Juicio> InJuiTotalJuiciosSC;

    //getters & setters
    public List<Juicio> getLtsJuiciosACN1() {
        ltsJuiciosACN1 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio1();
        return ltsJuiciosACN1;
    }

    public void setLtsJuiciosACN1(List<Juicio> ltsJuiciosACN1) {
        this.ltsJuiciosACN1 = ltsJuiciosACN1;
    }

    public List<Juicio> getLtsJuiciosACN2() {
        ltsJuiciosACN2 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio2();
        return ltsJuiciosACN2;
    }

    public void setLtsJuiciosACN2(List<Juicio> ltsJuiciosACN2) {
        this.ltsJuiciosACN2 = ltsJuiciosACN2;
    }

    public List<Juicio> getLtsJuiciosACN3() {
        ltsJuiciosACN3 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio3();
        return ltsJuiciosACN3;
    }

    public void setLtsJuiciosACN3(List<Juicio> ltsJuiciosACN3) {
        this.ltsJuiciosACN3 = ltsJuiciosACN3;
    }

    public List<Juicio> getLtsJuiciosACN4() {
        ltsJuiciosACN4 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio4();
        return ltsJuiciosACN4;
    }

    public void setLtsJuiciosACN4(List<Juicio> ltsJuiciosACN4) {
        this.ltsJuiciosACN4 = ltsJuiciosACN4;
    }

    public List<Juicio> getLtsJuiciosACN5() {
        ltsJuiciosACN5 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio5();
        return ltsJuiciosACN5;
    }

    public void setLtsJuiciosACN5(List<Juicio> ltsJuiciosACN5) {
        this.ltsJuiciosACN5 = ltsJuiciosACN5;
    }

    /*-------------------*/
    public List<Juicio> getLtsJuiciosJCiN1() {
        ltsJuiciosJCiN1 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio11();
        return ltsJuiciosJCiN1;
    }

    public void setLtsJuiciosJCiN1(List<Juicio> ltsJuiciosJCiN1) {
        this.ltsJuiciosJCiN1 = ltsJuiciosJCiN1;
    }

    public List<Juicio> getLtsJuiciosJCiN2() {
        ltsJuiciosJCiN2 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio21();
        return ltsJuiciosJCiN2;
    }

    public void setLtsJuiciosJCiN2(List<Juicio> ltsJuiciosJCiN2) {
        this.ltsJuiciosJCiN2 = ltsJuiciosJCiN2;
    }

    public List<Juicio> getLtsJuiciosJCiN3() {
        ltsJuiciosJCiN3 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio31();
        return ltsJuiciosJCiN3;
    }

    public void setLtsJuiciosJCiN3(List<Juicio> ltsJuiciosJCiN3) {
        this.ltsJuiciosJCiN3 = ltsJuiciosJCiN3;
    }

    public List<Juicio> getLtsJuiciosJCiN4() {
        ltsJuiciosJCiN4 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio41();
        return ltsJuiciosJCiN4;
    }

    public void setLtsJuiciosJCiN4(List<Juicio> ltsJuiciosJCiN4) {
        this.ltsJuiciosJCiN4 = ltsJuiciosJCiN4;
    }

    public List<Juicio> getLtsJuiciosJCiN5() {
        ltsJuiciosJCiN5 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio51();
        return ltsJuiciosJCiN5;
    }

    public void setLtsJuiciosJCiN5(List<Juicio> ltsJuiciosJCiN5) {
        this.ltsJuiciosJCiN5 = ltsJuiciosJCiN5;
    }

    /*-------------------*/
    public List<Juicio> getLtsJuiciosJCoN1() {
        ltsJuiciosJCoN1 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio12();
        return ltsJuiciosJCoN1;
    }

    public void setLtsJuiciosJCoN1(List<Juicio> ltsJuiciosJCoN1) {
        this.ltsJuiciosJCoN1 = ltsJuiciosJCoN1;
    }

    public List<Juicio> getLtsJuiciosJCoN2() {
        ltsJuiciosJCoN2 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio22();
        return ltsJuiciosJCoN2;
    }

    public void setLtsJuiciosJCoN2(List<Juicio> ltsJuiciosJCoN2) {
        this.ltsJuiciosJCoN2 = ltsJuiciosJCoN2;
    }

    public List<Juicio> getLtsJuiciosJCoN3() {
        ltsJuiciosJCoN3 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio32();
        return ltsJuiciosJCoN3;
    }

    public void setLtsJuiciosJCoN3(List<Juicio> ltsJuiciosJCoN3) {
        this.ltsJuiciosJCoN3 = ltsJuiciosJCoN3;
    }

    public List<Juicio> getLtsJuiciosJCoN4() {
        ltsJuiciosJCoN4 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio42();
        return ltsJuiciosJCoN4;
    }

    public void setLtsJuiciosJCoN4(List<Juicio> ltsJuiciosJCoN4) {
        this.ltsJuiciosJCoN4 = ltsJuiciosJCoN4;
    }

    public List<Juicio> getLtsJuiciosJCoN5() {
        ltsJuiciosJCoN5 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio52();
        return ltsJuiciosJCoN5;
    }

    public void setLtsJuiciosJCoN5(List<Juicio> ltsJuiciosJCoN5) {
        this.ltsJuiciosJCoN5 = ltsJuiciosJCoN5;
    }

    /*---------*/
    public List<Juicio> getLtsJuiciosJLaN1() {
        ltsJuiciosJLaN1 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio13();
        return ltsJuiciosJLaN1;
    }

    public void setLtsJuiciosJLaN1(List<Juicio> ltsJuiciosJLaN1) {
        this.ltsJuiciosJLaN1 = ltsJuiciosJLaN1;
    }

    public List<Juicio> getLtsJuiciosJLaN2() {
        ltsJuiciosJLaN2 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio23();
        return ltsJuiciosJLaN2;
    }

    public void setLtsJuiciosJLaN2(List<Juicio> ltsJuiciosJLaN2) {
        this.ltsJuiciosJLaN2 = ltsJuiciosJLaN2;
    }

    public List<Juicio> getLtsJuiciosJLaN3() {
        ltsJuiciosJLaN3 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio33();
        return ltsJuiciosJLaN3;
    }

    public void setLtsJuiciosJLaN3(List<Juicio> ltsJuiciosJLaN3) {
        this.ltsJuiciosJLaN3 = ltsJuiciosJLaN3;
    }

    public List<Juicio> getLtsJuiciosJLaN4() {
        ltsJuiciosJLaN4 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio43();
        return ltsJuiciosJLaN4;
    }

    public void setLtsJuiciosJLaN4(List<Juicio> ltsJuiciosJLaN4) {
        this.ltsJuiciosJLaN4 = ltsJuiciosJLaN4;
    }

    public List<Juicio> getLtsJuiciosJLaN5() {
        ltsJuiciosJLaN5 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio53();
        return ltsJuiciosJLaN5;
    }

    public void setLtsJuiciosJLaN5(List<Juicio> ltsJuiciosJLaN5) {
        this.ltsJuiciosJLaN5 = ltsJuiciosJLaN5;
    }

    /*------------*/
    public List<Juicio> getLtsJuiciosJPeN1() {
        ltsJuiciosJPeN1 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio14();
        return ltsJuiciosJPeN1;
    }

    public void setLtsJuiciosJPeN1(List<Juicio> ltsJuiciosJPeN1) {
        this.ltsJuiciosJPeN1 = ltsJuiciosJPeN1;
    }

    public List<Juicio> getLtsJuiciosJPeN2() {
        ltsJuiciosJPeN2 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio24();
        return ltsJuiciosJPeN2;
    }

    public void setLtsJuiciosJPeN2(List<Juicio> ltsJuiciosJPeN2) {
        this.ltsJuiciosJPeN2 = ltsJuiciosJPeN2;
    }

    public List<Juicio> getLtsJuiciosJPeN3() {
        ltsJuiciosJPeN3 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio34();
        return ltsJuiciosJPeN3;
    }

    public void setLtsJuiciosJPeN3(List<Juicio> ltsJuiciosJPeN3) {
        this.ltsJuiciosJPeN3 = ltsJuiciosJPeN3;
    }

    public List<Juicio> getLtsJuiciosJPeN4() {
        ltsJuiciosJPeN4 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio44();
        return ltsJuiciosJPeN4;
    }

    public void setLtsJuiciosJPeN4(List<Juicio> ltsJuiciosJPeN4) {
        this.ltsJuiciosJPeN4 = ltsJuiciosJPeN4;
    }

    public List<Juicio> getLtsJuiciosJPeN5() {
        ltsJuiciosJPeN5 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio54();
        return ltsJuiciosJPeN5;
    }

    public void setLtsJuiciosJPeN5(List<Juicio> ltsJuiciosJPeN5) {
        this.ltsJuiciosJPeN5 = ltsJuiciosJPeN5;
    }

    /**/
    public List<Juicio> getLtsJuiciosTEN1() {
        ltsJuiciosTEN1 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio15();
        return ltsJuiciosTEN1;
    }

    public void setLtsJuiciosTEN1(List<Juicio> ltsJuiciosTEN1) {
        this.ltsJuiciosTEN1 = ltsJuiciosTEN1;
    }

    public List<Juicio> getLtsJuiciosTEN2() {
        ltsJuiciosTEN2 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio25();
        return ltsJuiciosTEN2;
    }

    public void setLtsJuiciosTEN2(List<Juicio> ltsJuiciosTEN2) {
        this.ltsJuiciosTEN2 = ltsJuiciosTEN2;
    }

    public List<Juicio> getLtsJuiciosTEN3() {
        ltsJuiciosTEN3 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio35();
        return ltsJuiciosTEN3;
    }

    public void setLtsJuiciosTEN3(List<Juicio> ltsJuiciosTEN3) {
        this.ltsJuiciosTEN3 = ltsJuiciosTEN3;
    }

    public List<Juicio> getLtsJuiciosTEN4() {
        ltsJuiciosTEN4 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio45();
        return ltsJuiciosTEN4;
    }

    public void setLtsJuiciosTEN4(List<Juicio> ltsJuiciosTEN4) {
        this.ltsJuiciosTEN4 = ltsJuiciosTEN4;
    }

    public List<Juicio> getLtsJuiciosTEN5() {
        ltsJuiciosTEN5 = JPAFactoryDao.getFactory().getJuicioDao().tipoJuicio55();
        return ltsJuiciosTEN5;
    }

    public void setLtsJuiciosTEN5(List<Juicio> ltsJuiciosTEN5) {
        this.ltsJuiciosTEN5 = ltsJuiciosTEN5;
    }

    /**/
    public List<Juicio> getTotales1() {
        totales1 = JPAFactoryDao.getFactory().getJuicioDao().total1();
        return totales1;
    }

    public void setTotales1(List<Juicio> totales1) {
        this.totales1 = totales1;
    }

    public List<Juicio> getTotales2() {
        totales2 = JPAFactoryDao.getFactory().getJuicioDao().total2();
        return totales2;
    }

    public void setTotales2(List<Juicio> totales2) {
        this.totales2 = totales2;
    }

    public List<Juicio> getTotales3() {
        totales3 = JPAFactoryDao.getFactory().getJuicioDao().total3();
        return totales3;
    }

    public void setTotales3(List<Juicio> totales3) {
        this.totales3 = totales3;
    }

    public List<Juicio> getTotales4() {
        totales4 = JPAFactoryDao.getFactory().getJuicioDao().total4();
        return totales4;
    }

    public void setTotales4(List<Juicio> totales4) {
        this.totales4 = totales4;
    }

    public List<Juicio> getTotales5() {
        totales5 = JPAFactoryDao.getFactory().getJuicioDao().total5();
        return totales5;
    }

    public void setTotales5(List<Juicio> totales5) {
        this.totales5 = totales5;
    }

    /*-----Reporte Inventario Juicios*/
    public List<Juicio> getInJuiAccCons() {
        InJuiAccCons = JPAFactoryDao.getFactory().getJuicioDao().InJuiAccCons();
        return InJuiAccCons;
    }

    public void setInJuiAccCons(List<Juicio> InJuiAccCons) {
        this.InJuiAccCons = InJuiAccCons;
    }

    public List<Juicio> getInJuiCiviles() {
        InJuiCiviles = JPAFactoryDao.getFactory().getJuicioDao().InJuiCiviles();
        return InJuiCiviles;
    }

    public void setInJuiCiviles(List<Juicio> InJuiCiviles) {
        this.InJuiCiviles = InJuiCiviles;
    }

    public List<Juicio> getInJuiContenciosos() {
        InJuiContenciosos = JPAFactoryDao.getFactory().getJuicioDao().InJuiContenciosos();
        return InJuiContenciosos;
    }

    public void setInJuiContenciosos(List<Juicio> InJuiContenciosos) {
        this.InJuiContenciosos = InJuiContenciosos;
    }

    public List<Juicio> getInJuiLaborales() {
        InJuiLaborales = JPAFactoryDao.getFactory().getJuicioDao().InJuiLaborales();
        return InJuiLaborales;
    }

    public void setInJuiLaborales(List<Juicio> InJuiLaborales) {
        this.InJuiLaborales = InJuiLaborales;
    }

    public List<Juicio> getInJuiPenales() {
        InJuiPenales = JPAFactoryDao.getFactory().getJuicioDao().InJuiPenales();
        return InJuiPenales;
    }

    public void setInJuiPenales(List<Juicio> InJuiPenales) {
        this.InJuiPenales = InJuiPenales;
    }

    public List<Juicio> getInJuitramEspec() {
        InJuitramEspec = JPAFactoryDao.getFactory().getJuicioDao().InJuitramEspec();
        return InJuitramEspec;
    }

    public void setInJuitramEspec(List<Juicio> InJuitramEspec) {
        this.InJuitramEspec = InJuitramEspec;
    }

    public List<Juicio> getInJuiTotalCB() {
        InJuiTotalCB = JPAFactoryDao.getFactory().getJuicioDao().InJuiTotalCB();
        return InJuiTotalCB;
    }

    public void setInJuiTotalCB(List<Juicio> InJuiTotalCB) {
        this.InJuiTotalCB = InJuiTotalCB;
    } 
    /**/

    public List<Juicio> getInJuiAccConsCC() {
        InJuiAccConsCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiAccConsCC();
        return InJuiAccConsCC;
    }

    public void setInJuiAccConsCC(List<Juicio> InJuiAccConsCC) {
        this.InJuiAccConsCC = InJuiAccConsCC;
    }

    public List<Juicio> getInJuiJuiCivilesCC() {
        InJuiJuiCivilesCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiCivilesCC();
        return InJuiJuiCivilesCC;
    }

    public void setInJuiJuiCivilesCC(List<Juicio> InJuiJuiCivilesCC) {
        this.InJuiJuiCivilesCC = InJuiJuiCivilesCC;
    }

    public List<Juicio> getInJuiJuiContenciososCC() {
        InJuiJuiContenciososCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiContenciososCC();
        return InJuiJuiContenciososCC;
    }

    public void setInJuiJuiContenciososCC(List<Juicio> InJuiJuiContenciososCC) {
        this.InJuiJuiContenciososCC = InJuiJuiContenciososCC;
    }

    public List<Juicio> getInJuiJuiLaboralesCC() {
        InJuiJuiLaboralesCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiLaboralesCC();
        return InJuiJuiLaboralesCC;
    }

    public void setInJuiJuiLaboralesCC(List<Juicio> InJuiJuiLaboralesCC) {
        this.InJuiJuiLaboralesCC = InJuiJuiLaboralesCC;
    }

    public List<Juicio> getInJuiJuiPenalesCC() {
        InJuiJuiPenalesCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiPenalesCC();
        return InJuiJuiPenalesCC;
    }

    public void setInJuiJuiPenalesCC(List<Juicio> InJuiJuiPenalesCC) {
        this.InJuiJuiPenalesCC = InJuiJuiPenalesCC;
    }

    public List<Juicio> getInJuiTramEspecialesCC() {
        InJuiTramEspecialesCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiTramEspecialesCC();
        return InJuiTramEspecialesCC;
    }

    public void setInJuiTramEspecialesCC(List<Juicio> InJuiTramEspecialesCC) {
        this.InJuiTramEspecialesCC = InJuiTramEspecialesCC;
    }

    public List<Juicio> getInJuiTotalJuiciosCC() {
        InJuiTotalJuiciosCC = JPAFactoryDao.getFactory().getJuicioDao().InJuiTotalJuiciosCC();
        return InJuiTotalJuiciosCC;
    }

    public void setInJuiTotalJuiciosCC(List<Juicio> InJuiTotalJuiciosCC) {
        this.InJuiTotalJuiciosCC = InJuiTotalJuiciosCC;
    }
    
    /*Tercera columna*/

    public List<Juicio> getInJuiAccConsSC() {
        InJuiAccConsSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiAccConsSC();
        return InJuiAccConsSC;
    }

    public void setInJuiAccConsSC(List<Juicio> InJuiAccConsSC) {
        this.InJuiAccConsSC = InJuiAccConsSC;
    }

    public List<Juicio> getInJuiJuiCivilesSC() {
        InJuiJuiCivilesSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiCivilesSC();
        return InJuiJuiCivilesSC;
    }

    public void setInJuiJuiCivilesSC(List<Juicio> InJuiJuiCivilesSC) {
        this.InJuiJuiCivilesSC = InJuiJuiCivilesSC;
    }

    public List<Juicio> getInJuiJuiContenciososSC() {
        InJuiJuiContenciososSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiContenciososSC();
        return InJuiJuiContenciososSC;
    }

    public void setInJuiJuiContenciososSC(List<Juicio> InJuiJuiContenciososSC) {
        this.InJuiJuiContenciososSC = InJuiJuiContenciososSC;
    }

    public List<Juicio> getInJuiJuiLaboralesSC() {
        InJuiJuiLaboralesSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiLaboralesSC();
        return InJuiJuiLaboralesSC;
    }

    public void setInJuiJuiLaboralesSC(List<Juicio> InJuiJuiLaboralesSC) {
        this.InJuiJuiLaboralesSC = InJuiJuiLaboralesSC;
    }

    public List<Juicio> getInJuiJuiPenalesSC() {
        InJuiJuiPenalesSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiJuiPenalesSC();
        return InJuiJuiPenalesSC;
    }

    public void setInJuiJuiPenalesSC(List<Juicio> InJuiJuiPenalesSC) {
        this.InJuiJuiPenalesSC = InJuiJuiPenalesSC;
    }

    public List<Juicio> getInJuiTramEspecialesSC() {
        InJuiTramEspecialesSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiTramEspecialesSC();
        return InJuiTramEspecialesSC;
    }

    public void setInJuiTramEspecialesSC(List<Juicio> InJuiTramEspecialesSC) {
        this.InJuiTramEspecialesSC = InJuiTramEspecialesSC;
    }

    public List<Juicio> getInJuiTotalJuiciosSC() {
        InJuiTotalJuiciosSC = JPAFactoryDao.getFactory().getJuicioDao().InJuiTotalJuiciosSC();
        return InJuiTotalJuiciosSC;
    }

    public void setInJuiTotalJuiciosSC(List<Juicio> InJuiTotalJuiciosSC) {
        this.InJuiTotalJuiciosSC = InJuiTotalJuiciosSC;
    }
    

}
