/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Cliente;
import java.util.List;

/**
 *
 * @author jgregorio
 */
public interface ClienteDao {

    public void save(Cliente cliente);
    public Cliente getCliente(long id);
    public List<Cliente> list();
    public void remove(Cliente cliente);
    public void update(Cliente cliente);

}
