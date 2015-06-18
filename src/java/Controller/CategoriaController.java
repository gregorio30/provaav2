/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Dao.CategoriaDao;
import Dao.CategoriaDaoImp;
import Model.Categoria;
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
public class CategoriaController {

    private Categoria categoria;
    private DataModel listaCategorias;

    public DataModel getListarCstegorio() {
        List<Categoria> lista = new CategoriaDaoImp().list();
        listaCategorias = new ListDataModel(lista);
        return listaCategorias;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String prepararAdicionarCategoria(){
        categoria = new Categoria();
        return "gerenciarCategoria";
    }

    public String prepararAlterarCategoria(){
        categoria = (Categoria)(listaCategorias.getRowData());
        return "gerenciarCategoria";
    }

    public String excluirCategoria(){

        Categoria categoriaTemp = (Categoria)(listaCategorias.getRowData());
        CategoriaDao dao = new CategoriaDaoImp();
        dao.remove(categoriaTemp);
        return "index";

    }

    public String adicionarCategoria(){

        CategoriaDao dao = new CategoriaDaoImp();
        dao.save(categoria);
        return "index";
        
    }

    public String alterarCategoria(){

        CategoriaDao dao = new CategoriaDaoImp();
        dao.update(categoria);
        return "index";

    }

}
