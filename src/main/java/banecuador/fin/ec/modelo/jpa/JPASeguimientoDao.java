/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.SeguimientoDao;
import banecuador.fin.ec.modelo.entidad.Funcionario;
import banecuador.fin.ec.modelo.entidad.Juicio;
import banecuador.fin.ec.modelo.entidad.Seguimiento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author wvaldiviezo
 */

public class JPASeguimientoDao extends JPAGenericDao<Seguimiento, Integer> implements SeguimientoDao {

    public JPASeguimientoDao() {
        super(Seguimiento.class);
    }
//metodo para ser usado en los seguimientos
    @Override
    public List<Seguimiento> buscarSeguimientosPorJuicio(int juCodigo) {
        List seguimientosJuicios = null;
        try {            
            String consulta = "SELECT * FROM  seguimiento s WHERE s.ju_codigo  =" + juCodigo;
            Query query = em.createNativeQuery(consulta);
            seguimientosJuicios = query.getResultList();

        } catch (Exception e) {
            System.out.println("Error en la consulta SQL en seguimientos");
        }
        return seguimientosJuicios;
    }
    
    @SuppressWarnings("rawtypes")
    public ArrayList listaDiligencias(List<Seguimiento> listado,int juCodigo) {
        ArrayList datosSeguimietoJuicios = new ArrayList(); 
		for(Seguimiento list : listado)
		{
                    Integer juicio = Integer.valueOf(list.getJuCodigo().getJuCodigo());
                    if (juicio== juCodigo)
                    {
			Vector datosListadoSeguimiento = new Vector();
			Funcionario datosFuncionario = new Funcionario(); 
			int numeroSeguimiento = list.getSeCodigo();
                        Date fechaSeguimiento  = list.getSeFechaDiligencia();
                        String seDescripcion = list.getSeDescripcion();
                        int fuCodigo = list.getFuCodigo().getFuCodigo();
                        String fechaSegui = (new SimpleDateFormat("dd-MM-yyyy").format(fechaSeguimiento));
			datosFuncionario = JPAFactoryDao.getFactory().getFuncionarioDao().read(fuCodigo);
                        String funcionario = datosFuncionario.getFuApellidos()+" "+datosFuncionario.getFuNombres();
			 
			datosListadoSeguimiento.add(0,numeroSeguimiento);			
			datosListadoSeguimiento.add(1,seDescripcion);
                        datosListadoSeguimiento.add(2,fechaSegui);
			datosListadoSeguimiento.add(3,funcionario);			 
			datosSeguimietoJuicios.add(datosListadoSeguimiento);
                    }
		}
		return datosSeguimietoJuicios;
	}     

    @Override
    public Seguimiento seguimientosJuicios(int juCodigo) {
        List<Seguimiento> seguimientosJuicios = null;
        Seguimiento seguimientoJuicio = null;
        try {
            String consulta = "select * from seguimiento where jucodigo=" + juCodigo;
            Query query = em.createNativeQuery(consulta, Seguimiento.class);
            seguimientosJuicios = query.getResultList();
            seguimientoJuicio = seguimientosJuicios.get(0);
        } catch (Exception e) {
            System.out.println("Error en la consulta SQL en Seguimientos de Juicios");
        }
        return seguimientoJuicio;
    }

    @Override
    public List<Seguimiento> seguimientos(Juicio juicio) {
        int codJuicio = juicio.getJuCodigo();
        List<Seguimiento> seguimientos = null;

        try {
            String consulta = "SELECT * FROM \n"
                    + "  juicio j, \n"
                    + "  seguimiento s\n"
                    + "WHERE \n"
                    + "  s.ju_codigo = j.ju_codigo and \n"
                    + "  s.ju_codigo  =1";
            Query query = em.createNativeQuery(consulta, Seguimiento.class);
            seguimientos = query.getResultList();

        } catch (Exception e) {
            System.out.println("error en la consulta SQL en marcadore estudio historquimica por Estudio");
        }
        return seguimientos;
    }

}
