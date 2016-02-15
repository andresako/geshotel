package Controlador;

import Modelo.Habitacion;
import Modelo.Huesped;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 * @author andres
 */
public class HuespedTools {

    private MyTools MT;
    private ArrayList<Huesped> listaHuespedes;
    private final SessionFactory sessionFactory;

    public HuespedTools() {
        sessionFactory = NewHibernateUtil.getSessionFactory();
        MT = new MyTools();
    }

    public void RellenarHuespedes() {
        listaHuespedes = new ArrayList<>();

        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped order by dni ASC");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();

        while (iter.hasNext()) {
            Huesped hues = (Huesped) iter.next();
            listaHuespedes.add(hues);
        }
    }

    public void RellenarHuespedes(String msg) {
        listaHuespedes = new ArrayList<>();

        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped order by dni ASC");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();

        while (iter.hasNext()) {
            Huesped hues = (Huesped) iter.next();
            if (hues.getDni().contains(msg) || hues.getNombre().contains(msg) || hues.getApellidos().contains(msg)) {
                listaHuespedes.add(hues);
            }
        }
        tx.commit();
        session.close();
    }

    public int ContarHuespedes() {
        return listaHuespedes.size();
    }

    public Huesped getHuesped(int pos) {
        return listaHuespedes.get(pos - 1);
    }

    public void addHuesped(Huesped hues) {

        Session session = sessionFactory.openSession();
        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.save(hues);
            tx.commit();

            MT.mostrarAviso("Añadido correctamente");
        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error, el huesped ya existe");
        } finally {
            session.close();
        }
    }

    public void modHuesped(Huesped hues) {

        Session session = sessionFactory.openSession();
        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.update(hues);
            tx.commit();

        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al editar");
        } finally {
            session.close();
        }

    }

    public void delHuesped(Huesped hues) {
        Session session = sessionFactory.openSession();
        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.delete(hues);
            tx.commit();

            MT.mostrarAviso("Borrado correctamente");
        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al borrar");
        } finally {
            session.close();
        }
    }

    public Huesped[] listaTodos(Habitacion habitacion) {
        Huesped[] todos;

        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped where (habitacion = NULL or habitacion = " + habitacion.getIdhabitacion() + ")  and individual = 'N'");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();
        todos = new Huesped[lista.size()];
        int ct = 0;
        while (iter.hasNext()) {
            Huesped hue = (Huesped) iter.next();
            todos[ct] = hue;
            ct++;
        }

        return todos;
    }

    public Huesped[] conTecho(Habitacion habitacion) {
        Huesped[] conTecho;

        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped where habitacion = " + habitacion.getIdhabitacion());
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();
        conTecho = new Huesped[lista.size()];
        int ct = 0;
        while (iter.hasNext()) {
            Huesped hue = (Huesped) iter.next();

            conTecho[ct] = hue;
            ct++;
        }

        return conTecho;

    }

    public void limpiarHabitacion(Integer idhabitacion) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        try {

            tx = session.beginTransaction();
            Query q = session.createQuery("from Huesped where habitacion = " + idhabitacion);
            List<Huesped> lista1 = q.list();
            Iterator<Huesped> iter = lista1.iterator();
            tx.commit();

            while (iter.hasNext()) {
                Huesped hue = (Huesped) iter.next();
                hue.setHabitacion(null);
                tx = session.beginTransaction();
                session.update(hue);
                tx.commit();
            }

        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al limpiar");
        } finally {
            session.close();
        }
    }

    public Huesped[] listaSolos(Habitacion habitacion) {

        Huesped[] solos;
        Session session = sessionFactory.openSession();
        
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped where individual = 'S' and habitacion = null or habitacion = " + habitacion.getIdhabitacion());
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();

        session.close();
        solos = new Huesped[lista.size()];
        int ct = 0;

        while (iter.hasNext()) {
            Huesped hue = (Huesped) iter.next();

            solos[ct] = hue;
            ct++;
        }

        return solos;
    }
}
