package Utils;


import Model.Cliente;
import Model.Categoria;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jgregorio
 */
public class HibernateTest {

    public static void main(String[] args) throws SQLException {

        Cliente cliente = new Cliente();
        Categoria categoria = new Categoria();

        Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction t = session.beginTransaction();
        //session.save(user);
        //t.commit();
        //System.out.println("ID do Pessoa: " + user.getId());
        
        //user = (Usuario) session.load(Usuario.class, 1L);
        //System.out.println(user.getNome());

        session.close();

    }
}
