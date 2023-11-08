package sv.edu.udb.www.practica_springmvc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import sv.edu.udb.www.practica_springmvc.entities.Autores;

import java.util.List;

public class AutoresModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();

    public List<Autores> listarAutores() {
        Session ses = factory.openSession();
        try {
            Query consulta = ses.createQuery("SELECT a FROM Autores a");
            List<Autores> lista = consulta.list();
            ses.close();
            return lista;
        } catch (Exception e) {
            ses.close();
            return null;
        }
    }
}