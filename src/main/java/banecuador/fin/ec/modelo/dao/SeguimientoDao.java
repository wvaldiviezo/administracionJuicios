/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.dao;

import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wvaldiviezo
 */
public interface SeguimientoDao extends GenericDao<Seguimiento, Integer>{
    
   public List<Seguimiento> buscarSeguimientosPorJuicio(int juCodigo);
   public ArrayList listaDiligencias(List<Seguimiento>listado,int juCodigo);
   public Seguimiento seguimientosJuicios (int juCodigo);
   public List<Seguimiento> seguimientos(Juicio juicio) ;
    
}
