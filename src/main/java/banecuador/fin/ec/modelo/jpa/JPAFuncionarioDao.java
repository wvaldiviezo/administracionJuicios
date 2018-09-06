/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banecuador.fin.ec.modelo.jpa;

import banecuador.fin.ec.modelo.dao.FuncionarioDao;
import banecuador.fin.ec.modelo.entidad.Funcionario;
import javax.ejb.Stateless;

/**
 *
 * @author wvaldiviezo
 */

public class JPAFuncionarioDao extends JPAGenericDao<Funcionario, Integer> implements FuncionarioDao{
    
    public JPAFuncionarioDao(){
        super(Funcionario.class);
    }
    
}
