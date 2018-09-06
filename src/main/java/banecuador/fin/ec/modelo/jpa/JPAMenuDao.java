package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.MenuDao;
import banecuador.fin.ec.modelo.entidad.Menu;
import javax.ejb.Stateless;

public class JPAMenuDao extends JPAGenericDao<Menu, Integer> implements MenuDao {

    public JPAMenuDao() {
        super(Menu.class);
    }
}
