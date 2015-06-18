/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Categoria;
import java.util.List;

/**
 *
 * @author jgregorio
 */
public interface CategoriaDao {

    public void save(Categoria categoria);
    public Categoria getCategoria(long idcategoria);
    public List<Categoria> list();
    public void remove(Categoria categoria);
    public void update(Categoria categoria);

}
