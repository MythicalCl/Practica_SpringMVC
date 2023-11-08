package sv.edu.udb.www.practica_springmvc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sv.edu.udb.www.practica_springmvc.entities.Libros;

import java.util.List;

public class LibrosModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();

    public int insertarLibro(Libros libro) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.save(libro);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }

    public int modificarLibro(Libros libro) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.update(libro);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }

    public int eliminarLibro (String codigo) {
        Session ses = factory.openSession();
        try{
            Libros libro = (Libros)ses.get(Libros.class, codigo);
            if (libro != null){
                Transaction tran = ses.beginTransaction();
                ses.delete(libro);
                tran.commit();
                ses.close();
                return 1;
            }
            ses.close();
            return 0;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }

    public Libros obtenerLibro(String codigo){
        Session ses = factory.openSession();
        try{
            Libros libro = (Libros)ses.get(Libros.class,codigo);
            ses.close();
            return libro;
        } catch (Exception e) {
            ses.close();
            return null;
        }
    }

    public List<Libros> listarLibros(){
        Session ses = factory.openSession();
        try{
            Query consulta= ses.createQuery("select l from Libros l");
            List<Libros> lista = consulta.list();
            ses.close();
            return lista;
        } catch (Exception e){
            ses.close();
            return null;
        }
    }

}
