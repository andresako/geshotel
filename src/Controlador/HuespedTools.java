package Controlador;

import Modelo.Huesped;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author andres
 */
public class HuespedTools {

    private final SessionFactory sessionFactory;
    private ArrayList<Huesped> listaHuespedes;

    public HuespedTools() {

        sessionFactory = NewHibernateUtil.getSessionFactory();
        listaHuespedes = new ArrayList<>();
    }

    public void RellenarHuespedes() {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();

        while (iter.hasNext()) {
            Huesped hues = (Huesped) iter.next();
            listaHuespedes.add(hues);
        }
    }

    public int ContarHuespedes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Huesped getHuesped(int pos) {
        return listaHuespedes.get(pos - 1);
    }
}