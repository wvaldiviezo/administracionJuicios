/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.dao;

import java.util.List;

/**
 *
 * @author wvaldiviezo
 */
public interface GenericDao<T, ID>  {
    public void create(T entity);

    public T read(ID id);

    public void update(T entity);

    public void delete(T entity);

    public void deleteByID(ID id);

    public List<T> read1(ID id);

    public List<T> find();

    public List<T> find(String[] attributes, String[] values); //like + and

    public List<T> find(String[] attributes, String[] values, String order, int index, int size);
}
