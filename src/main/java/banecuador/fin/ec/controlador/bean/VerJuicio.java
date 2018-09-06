/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.controlador.bean;

import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.NivelRiesgo;
import banecuador.fin.ec.modelo.entidad.Oficina;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import banecuador.fin.ec.modelo.entidad.TipoAccion;

import banecuador.fin.ec.modelo.entidad.Zonal;
import banecuador.fin.ec.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wvaldiviezo
 */
@ManagedBean(name = "verJuicio")
@SessionScoped
public class VerJuicio implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
     private Juicio juicioAct;
     private Zonal zonal;
     private Oficina oficina;
     private NivelRiesgo nivelRiesgo;
     private TipoAccion tipoAccion;
     private Funcionario funcionario;
     
     private Seguimiento seguimiento;
     
     private int FuncionarioID;
     
     private List<Funcionario> ltsFuncionarios;
     
     
     public VerJuicio(){
         this.FuncionarioID = 0;
         ltsFuncionarios = null;
     }
     
    public void actualizarseguimiento(){
        

        
           //this.juicioAct.setFuCodigo(funcionario);
        //JPAFactoryDao.getFactory().getJuicioDao().update(this.juicioAct);
    }
     
     
     //getter & setter

    public Juicio getJuicioAct() {
        return juicioAct;
    }

    public void setJuicioAct(Juicio juicioAct) {
        this.juicioAct = juicioAct;
    }

    public Zonal getZonal() {
        return zonal;
    }

    public void setZonal(Zonal zonal) {
        this.zonal = zonal;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(NivelRiesgo nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public TipoAccion getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(TipoAccion tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getFuncionarioID() {
        return FuncionarioID;
    }

    public void setFuncionarioID(int FuncionarioID) {
        this.FuncionarioID = FuncionarioID;
    }

    public List<Funcionario> getLtsFuncionarios() {
        ltsFuncionarios = JPAFactoryDao.getFactory().getFuncionarioDao().find();
        return ltsFuncionarios;
    }

    public void setLtsFuncionarios(List<Funcionario> ltsFuncionarios) {
        this.ltsFuncionarios = ltsFuncionarios;
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }
    
}
