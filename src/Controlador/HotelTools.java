package Controlador;

import Modelo.Categoria;
import Modelo.Hotel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 * @author andres
 */
public class HotelTools {
    
    MyTools MT;

    private final SessionFactory sessionFactory;

    public HotelTools() {
        sessionFactory = NewHibernateUtil.getSessionFactory();
        MT = new MyTools();
    }

    public void rellenarRating(JComboBox combo){
        Session session = sessionFactory.openSession();

        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Categoria");
        List<Categoria> lista = q.list();
        Iterator<Categoria> iter = lista.iterator();
        tx.commit();
        session.close();
        Categoria[] listaC = new Categoria[lista.size()];
        int cnt = 0;
        while (iter.hasNext()) {
            Categoria cat = (Categoria) iter.next();
            listaC[cnt] = cat;
            cnt++;
        }
        combo.setModel(new DefaultComboBoxModel(listaC));
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
    
    public void delHotel(Hotel hotel) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            session.delete(hotel);
            tx.commit();

            MT.mostrarAviso("Borrado correctamente");
        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al borrar");
        } finally {
            session.close();
        }
    }

    public void addHotel(Hotel hotel) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            session.save(hotel);
            tx.commit();

            MT.mostrarAviso("Añadido correctamente");
        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al añadir");
        } finally {
            session.close();
        }
    }

    public void editHotel(Hotel hotel) {
       Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            session.update(hotel);
            tx.commit();

            MT.mostrarAviso("Editado correctamente");
        } catch (ConstraintViolationException e) {
            MT.mostrarError("Error al editar");
        } finally {
            session.close();
        }
    }

}