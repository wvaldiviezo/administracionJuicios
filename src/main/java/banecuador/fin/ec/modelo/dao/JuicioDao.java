/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.dao;

import banecuador.fin.ec.modelo.entidad.Juicio;
import java.util.List;

/**
 *
 * @author wvaldiviezo
 */
public interface JuicioDao extends GenericDao<Juicio, Integer> {

    public List<Juicio> tipoJuicio1();

    public List<Juicio> tipoJuicio2();

    public List<Juicio> tipoJuicio3();

    public List<Juicio> tipoJuicio4();

    public List<Juicio> tipoJuicio5();

    /*---------------------*/
    public List<Juicio> tipoJuicio11();

    public List<Juicio> tipoJuicio21();

    public List<Juicio> tipoJuicio31();

    public List<Juicio> tipoJuicio41();

    public List<Juicio> tipoJuicio51();

    /*---------------------*/
    public List<Juicio> tipoJuicio12();

    public List<Juicio> tipoJuicio22();

    public List<Juicio> tipoJuicio32();

    public List<Juicio> tipoJuicio42();

    public List<Juicio> tipoJuicio52();

    /*---------------------*/
    public List<Juicio> tipoJuicio13();

    public List<Juicio> tipoJuicio23();

    public List<Juicio> tipoJuicio33();

    public List<Juicio> tipoJuicio43();

    public List<Juicio> tipoJuicio53();

    /*---------------------*/
    public List<Juicio> tipoJuicio14();

    public List<Juicio> tipoJuicio24();

    public List<Juicio> tipoJuicio34();

    public List<Juicio> tipoJuicio44();

    public List<Juicio> tipoJuicio54();

    /*---------------------*/
    public List<Juicio> tipoJuicio15();

    public List<Juicio> tipoJuicio25();

    public List<Juicio> tipoJuicio35();

    public List<Juicio> tipoJuicio45();

    public List<Juicio> tipoJuicio55();

    public List<Juicio> total1();

    public List<Juicio> total2();

    public List<Juicio> total3();

    public List<Juicio> total4();

    public List<Juicio> total5();

    public List<Juicio> juiciosSeguimientos();

    /*Primera columna del reporte*/
    public List<Juicio> InJuiAccCons();

    public List<Juicio> InJuiCiviles();

    public List<Juicio> InJuiContenciosos();

    public List<Juicio> InJuiLaborales();

    public List<Juicio> InJuiPenales();

    public List<Juicio> InJuitramEspec();

    public List<Juicio> InJuiTotalCB();

    /*Segunda columna Reporte*/
    public List<Juicio> InJuiAccConsCC();

    public List<Juicio> InJuiJuiCivilesCC();

    public List<Juicio> InJuiJuiContenciososCC();

    public List<Juicio> InJuiJuiLaboralesCC();

    public List<Juicio> InJuiJuiPenalesCC();

    public List<Juicio> InJuiTramEspecialesCC();

    public List<Juicio> InJuiTotalJuiciosCC();

    /*Tercera columna Reporte*/
    public List<Juicio> InJuiAccConsSC();

    public List<Juicio> InJuiJuiCivilesSC();

    public List<Juicio> InJuiJuiContenciososSC();

    public List<Juicio> InJuiJuiLaboralesSC();

    public List<Juicio> InJuiJuiPenalesSC();

    public List<Juicio> InJuiTramEspecialesSC();

    public List<Juicio> InJuiTotalJuiciosSC();
    
    /*Lista de juicios ordenada DESC*/
    public List<Juicio> ltsJuiciosDescendente();

}
