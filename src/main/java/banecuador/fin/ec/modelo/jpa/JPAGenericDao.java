/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.GenericDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author wvaldiviezo
 */
public class JPAGenericDao<T, ID> implements GenericDao<T, ID> {

    private Class<T> persistentClass;

    protected EntityManager em;

    public JPAGenericDao(Class<T> persistentClass) {

        this.persistentClass = persistentClass;
        this.em = Persistence.createEntityManagerFactory("juiciosPU").createEntityManager();
        this.em.setFlushMode(FlushModeType.COMMIT);
    }

    public void create(T entity) {
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            try {
                em.flush();
            } catch (Exception e) {

            }
        }
    }

    public T read(ID id) {
        return em.find(persistentClass, id);
    }

    public void update(T entity) {

        try {
            em.flush();
        } catch (Exception e) {

        }

//        //em.getTransaction().begin();
        if (em.getTransaction().isActive() == false) {
            em.getTransaction().begin();
        }
        try {
            em.merge(entity);
//            em.se
//            if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
//            }
//            //em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            try {
                em.flush();
            } catch (Exception e) {

            }
        }

    }

    public void delete(T entity) {
        em.getTransaction().begin();
        try {
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

    }

    /*
	 * Elimina un registro por id
	 * @see cc.biblio.recreo.modelo.dao.GenericDAO#deleteByID(java.lang.Object)
     */
    public void deleteByID(ID id) {
        T entity = this.read(id);
        if (entity != null) {
            this.delete(entity);
        }

    }

    /*
	 * Obtiene todos los registros de una clase dada
	 * @see cc.biblio.recreo.modelo.dao.GenericDAO#find()
     */
    @SuppressWarnings("unchecked")
    public List<T> find() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
        //se establece la calusula from
        Root<T> root = criteriaQuery.from(this.persistentClass);
        //se establece la clausula select
        criteriaQuery.select(root);
        Query query = em.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<T> find(String[] attributes, String[] values) {
        // Se crea un criterio de consulta
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
        // Se establece la clausula FROM
        Root<T> root = criteriaQuery.from(this.persistentClass);
        // Se establece la clausula SELECT
        criteriaQuery.select(root); // criteriaQuery.multiselect(root.get(atr))
        // Se configuran los predicados, combinados por AND
        Predicate predicate = criteriaBuilder.conjunction();
        for (int i = 0; i < attributes.length; i++) {
            Predicate sig = criteriaBuilder.like(root.get(attributes[i]).as(String.class), values[i]);
            // Predicate sig =
            // criteriaBuilder.like(root.get(attributes[i]).as(String.class),values[i]);
            predicate = criteriaBuilder.and(predicate, sig);
        }
        // Se establece el WHERE
        criteriaQuery.where(predicate);

        Query query = em.createQuery(criteriaQuery);
        return query.getResultList();

    }

    @SuppressWarnings("unchecked")
    public List<T> find(String[] attributes, String[] values, String order, int index, int size) {
        // Se crea un criterio de consulta
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
        // Se establece la clausula FROM
        Root<T> root = criteriaQuery.from(this.persistentClass);
        // Se establece la clausula SELECT
        criteriaQuery.select(root); // criteriaQuery.multiselect(root.get(atr))
        // Se configuran los predicados, combinados por AND
        Predicate predicate = criteriaBuilder.conjunction();
        for (int i = 0; i < attributes.length; i++) {
            Predicate sig = criteriaBuilder.like(root.get(attributes[i]).as(String.class), values[i]);
            // Predicate sig =
            // criteriaBuilder.like(root.get(attributes[i]).as(String.class),
            // values[i]);
            predicate = criteriaBuilder.and(predicate, sig);
        }
        // Se establece el WHERE
        criteriaQuery.where(predicate);
        // Se establece el orden
        if (order != null) {
            criteriaQuery.orderBy(criteriaBuilder.asc(root.get(order)));
        }
        // Se crea el resultado
        if (index >= 0 && size > 0) {
            TypedQuery<T> tq = em.createQuery(criteriaQuery);
            tq.setFirstResult(index);
            tq.setMaxResults(size); // Se realiza la query
            return tq.getResultList();
        } else {
            // Se realiza la query
            Query query = em.createQuery(criteriaQuery);
            return query.getResultList();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> read1(ID id) {
        // TODO Auto-generated method stub
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
        Query query = em.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
