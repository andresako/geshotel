package Controlador;

import Modelo.Hotel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author andres
 */
public class HotelTools {

    private final SessionFactory sessionFactory;

    public HotelTools() {
        sessionFactory = NewHibernateUtil.getSessionFactory();

    }

    private ArrayList<Hotel> listaHoteles;

    public DefaultListModel getListaHot() {
        listaHoteles = new ArrayList<>();
        DefaultListModel dlm = new DefaultListModel();

        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Hotel");
        List<Hotel> lista = q.list();
        Iterator<Hotel> iter = lista.iterator();
        tx.commit();
        session.close();

        while (iter.hasNext()) {
            Hotel hot = (Hotel) iter.next();
            listaHoteles.add(hot);
            dlm.addElement(hot);
        }
        return dlm;
    }

}
