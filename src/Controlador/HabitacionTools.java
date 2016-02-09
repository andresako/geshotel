package Controlador;

import Modelo.Habitacion;
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

public class HabitacionTools {

    private Hotel hotel;
    private final SessionFactory sessionFactory;
    
    
    public HabitacionTools(Hotel hotel) {        
        sessionFactory = NewHibernateUtil.getSessionFactory();
        this.hotel = hotel;
    }

    public DefaultListModel getListaHab() {
        ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
        DefaultListModel dlm = new DefaultListModel();

        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Habitacion where hotel = " + hotel.getIdhotel());
        List<Habitacion> lista = q.list();
        Iterator<Habitacion> iter = lista.iterator();
        tx.commit();
        session.close();

        while (iter.hasNext()) {
            Habitacion Hab = (Habitacion) iter.next();
            listaHabitaciones.add(Hab);
            dlm.addElement("Nº: "+ Hab.getIdhabitacion() + ", "+ Hab.getNumcamas() + " camas.");
        }
        return dlm;
    }
    
}
