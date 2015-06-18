/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Dao.ClienteDao;
import Dao.ClienteDaoImp;
import Model.Cliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author jgregorio
 */
@ManagedBean
@SessionScoped
public class ClienteController {

    private Cliente cliente;
    private DataModel listaClientes;

    public DataModel getListarClientes() {
        List<Cliente> lista = new ClienteDaoImp().list();
        listaClientes = new ListDataModel(lista);
        return listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String prepararAdicionarCliente(){
        cliente = new Cliente();
        return "gerenciarVendas";
    }

    public String prepararAlterarCliente(){
        cliente = (Cliente)(listaClientes.getRowData());
        return "gerenciarVendas";
    }

    public String excluirCliente(){

        Cliente clienteTemp = (Cliente)(listaClientes.getRowData());
        ClienteDao dao = new ClienteDaoImp();
        dao.remove(clienteTemp);
        return "index";

    }

    public String adicionarCliente(){

        ClienteDao dao = new ClienteDaoImp();
        dao.save(cliente);
        return "index";
        
    }

    public String alterarCliente(){

        ClienteDao dao = new ClienteDaoImp();
        dao.update(cliente);
        return "index";

    }

}
