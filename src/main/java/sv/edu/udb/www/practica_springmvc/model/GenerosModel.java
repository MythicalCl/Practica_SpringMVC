package sv.edu.udb.www.practica_springmvc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import sv.edu.udb.www.practica_springmvc.entities.Generos;

import java.util.List;

public class GenerosModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();

    public List<Generos> listarGeneros() {
        Session ses = factory.openSession();
        try {
            Query consulta = ses.createQuery("SELECT g FROM Generos g");
            List<Generos> lista = consulta.list();
            ses.close();
            return lista;
        } catch (Exception e) {
            ses.close();
            return null;
        }
    }
}