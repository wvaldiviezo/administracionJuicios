/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.JuicioDao;
import banecuador.fin.ec.modelo.entidad.Juicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author wvaldiviezo
 */
public class JPAJuicioDao extends JPAGenericDao<Juicio, Integer> implements JuicioDao {

    public JPAJuicioDao() {
        super(Juicio.class);
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio1() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 1";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio2() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 1";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio3() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 1";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio4() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 1";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio5() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 1";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*--------------------------*/
 /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio11() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 2";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio21() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 2";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio31() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 2";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio41() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 2";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio51() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 2";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*--------------------------*/
 /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio12() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 3";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio22() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 3";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio32() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 3";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio42() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 3";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio52() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 3";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*--------------------------*/
 /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio13() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 4";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio23() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 4";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio33() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 4";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio43() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 4";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio53() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 4";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*--------------------------*/
 /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio14() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 5";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio24() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 5";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio34() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 5";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio44() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 5";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio54() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 5";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*--------------------------*/
 /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio15() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 6";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio25() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo =6";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio35() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 6";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio45() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 6";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*Método que consulta Acciones Constitucionales y nivel 1"*/
    @Override
    public List<Juicio> tipoJuicio55() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'"
                    + "and ta_codigo = 6";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*TOTALES*/
    @Override
    public List<Juicio> total1() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 1 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    @Override
    public List<Juicio> total2() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 2 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    @Override
    public List<Juicio> total3() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 3 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    @Override
    public List<Juicio> total4() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 4 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    @Override
    public List<Juicio> total5() {
        List tiposJuicios1 = null;
        try {
            String consulta = "select count (nr_codigo) from juicio where nr_codigo = 5 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios1 = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios1;
    }

    /*consulta de juicio que tenga seguimientos*/
    @Override
    public List<Juicio> juiciosSeguimientos() {
        List juiSeg = null;
        try {
            String consulta = "SELECT * FROM juicio j, seguimiento s\n"
                    + "WHERE s.ju_codigo = j.ju_codigo and s.ju_codigo  =1";
            Query query = em.createNativeQuery(consulta);
            juiSeg = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay seguimientos para este juicio");
            //return null;
        }
        return juiSeg;
    }

    
    /*QUERYS PARA EL REPORTE INVENTARIO DE JUICIOS*/
    /*Inventario de Juicios Acciones Constitucionales contra el Banco*/
    @Override
    public List<Juicio> InJuiAccCons() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ta_codigo) from juicio where ta_codigo = 1 and ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios Civiles contra el Banco*/
    @Override
    public List<Juicio> InJuiCiviles() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ta_codigo) from juicio where ta_codigo = 2 and ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios Constenciosos contra el Banco*/
    @Override
    public List<Juicio> InJuiContenciosos() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ta_codigo) from juicio where ta_codigo = 3 and ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios Laborales contra el Banco*/
    @Override
    public List<Juicio> InJuiLaborales() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ta_codigo) from juicio where ta_codigo = 4 and ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios Penales contra el Banco*/
    @Override
    public List<Juicio> InJuiPenales() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ta_codigo) from juicio where ta_codigo = 5 and ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios Tramites Especiales contra el Banco*/
    @Override
    public List<Juicio> InJuitramEspec() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ta_codigo) from juicio where ta_codigo = 6 and ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Total de Juicios contra el Banco*/
    @Override
    public List<Juicio> InJuiTotalCB() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_ocacionado) from juicio where ju_ocacionado like '%banecuador%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Acciones Constitucionales Con Cuantia*/
    @Override
    public List<Juicio> InJuiAccConsCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ta_codigo = 1 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Civiles Con Cuantia*/
    @Override
    public List<Juicio> InJuiJuiCivilesCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ta_codigo = 2 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Contenciosos Con Cuantia*/
    @Override
    public List<Juicio> InJuiJuiContenciososCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ta_codigo = 3 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Laborales Con Cuantia*/
    @Override
    public List<Juicio> InJuiJuiLaboralesCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ta_codigo = 4 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Penales Con Cuantia*/
    @Override
    public List<Juicio> InJuiJuiPenalesCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ta_codigo = 5 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Penales Con Cuantia*/
    @Override
    public List<Juicio> InJuiTramEspecialesCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ta_codigo = 6 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Total Juicios Con Cuantia*/
    @Override
    public List<Juicio> InJuiTotalJuiciosCC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia not like '%indeterminada%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Tecera columna del reporte*/
    
    /*Inventario de Juicios - Acciones Constitucionales Sin Cuantia*/
    @Override
    public List<Juicio> InJuiAccConsSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ta_codigo = 1 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Civiles Sin Cuantia*/
    @Override
    public List<Juicio> InJuiJuiCivilesSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ta_codigo = 2 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Contenciosos Sin Cuantia*/
    @Override
    public List<Juicio> InJuiJuiContenciososSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ta_codigo = 3 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Laborales Sin Cuantia*/
    @Override
    public List<Juicio> InJuiJuiLaboralesSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ta_codigo = 4 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Penales Con Cuantia*/
    @Override
    public List<Juicio> InJuiJuiPenalesSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ta_codigo = 5 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Juicios Penales Con Cuantia*/
    @Override
    public List<Juicio> InJuiTramEspecialesSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ta_codigo = 6 and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*Inventario de Juicios - Total Juicios Con Cuantia*/
    @Override
    public List<Juicio> InJuiTotalJuiciosSC() {
        List tiposJuicios = null;
        try {
            String consulta = "select count (ju_cuantia) from juicio where ju_cuantia like '%indeterminada%' and ju_estado_juicio like '%activo%'";
            Query query = em.createNativeQuery(consulta);
            tiposJuicios = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return tiposJuicios;
    }
    
    /*consulta de todos los juicios en orden DESC*/
    @Override
    public List<Juicio> ltsJuiciosDescendente() {
        List juiciosDescendente = null;
        try {
            String consulta = "select j from Juicio j order by j.juCodigo DESC";
            Query query = em.createQuery(consulta);
            juiciosDescendente = query.getResultList();
            //return tiposJuicios1;
        } catch (Exception e) {
            System.out.println("No hay juicios nivel 1");
            //return null;
        }
        return juiciosDescendente;
    }

}
