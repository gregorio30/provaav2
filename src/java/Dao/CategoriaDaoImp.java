/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Categoria;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jgregorio
 */
public class CategoriaDaoImp implements CategoriaDao {

    public void save(Categoria categoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(categoria);
        t.commit();
    }
    public Categoria getCategoria(long idcategoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Categoria) session.load(Categoria.class, idcategoria);
    }
    public List<Categoria> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Categoria").list();
        t.commit();
        return lista;
    }
    public void remove(Categoria categoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(categoria);
        t.commit();
    }
    public void update(Categoria categoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(categoria);
        t.commit();
    }
}
