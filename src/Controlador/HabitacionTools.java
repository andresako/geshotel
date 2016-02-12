package Controlador;

import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Huesped;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 * @author andres
 */
public class HabitacionTools {

    private MyTools MT;
    private Hotel hotel;
    private ArrayList<Habitacion> listaHabitaciones;
    private final SessionFactory sessionFactory;

    public HabitacionTools(Hotel hotel) {
        sessionFactory = NewHibernateUtil.getSessionFactory();
        this.hotel = hotel;
        MT = new MyTools();
    }

    public DefaultListModel getListaHab() {
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
            dlm.addElement(Hab);
        }
        return dlm;
    }

    public void addHabitacion(Habitacion hab) {
        Session session = sessionFactory.openSession();
        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.save(hab);
            tx.commit();

            
        } catch (ConstraintViolationException e) {
            MT.mostrarError("Al crear habitacion");
        } finally {
            session.close();
        }
    }

    public void setHabitaciones() {
        listaHabitaciones = new ArrayList<>();

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
        }
    }

    public void delHabitacion(Habitacion hab) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        int resp = 1;
        try {
            tx = session.beginTransaction();
            session.delete(hab);
            tx.commit();

        } catch (ConstraintViolationException e) {
            resp = MT.mostrarPreguntaSiNo("La habitacion tiene alguien dentro!,\nDesea tirarlo a la calle?");
        } finally {
            session.close();
        }
        if (resp == 0) {
            machacarHabitacion(hab);
        }
    }

    public void editHabitacion(Habitacion habitacion) {

        Session session = sessionFactory.openSession();
        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.update(habitacion);
            tx.commit();

        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al editar");
        } finally {
            session.close();
        }
    }

    private void machacarHabitacion(Habitacion hab) {

        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            Huesped[] listaHuespedes = new HuespedTools().conTecho(hab);

            for (int y = 0; y < listaHuespedes.length; y++) {
                listaHuespedes[y].setHabitacion(null);
                session.update(listaHuespedes[y]);

            }
            session.delete(hab);
            tx.commit();

        } catch (Exception e) {
            MT.mostrarError("Error al borrar\n" + e.getClass());
        } finally {
            session.close();
        }
    }

}
