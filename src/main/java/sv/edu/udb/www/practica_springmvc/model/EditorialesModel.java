package sv.edu.udb.www.practica_springmvc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.edu.udb.www.practica_springmvc.entities.Editoriales;

import java.util.ArrayList;
import java.util.List;

public class EditorialesModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();

    public int insertarEditorial(Editoriales editorial) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.save(editorial);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }

    public List<Editoriales> listarEditoriales() {
        SessionFactory sesFac = HibernateUtil.getSessionFactory();
        Session ses = sesFac.openSession();
        ArrayList<Editoriales> listaEditoriales = new ArrayList<Editoriales>();
        String sql = "from Editoriales";
        listaEditoriales = (ArrayList<Editoriales>) ses.createQuery(sql).list();
        return listaEditoriales;
    }

    public Editoriales obtenerEditorial(String codigo) {
        Session ses = factory.openSession();
        try {
            Editoriales editorial = (Editoriales) ses.get(Editoriales.class, codigo);
            ses.close();
            return editorial;
        } catch (Exception e) {
            ses.close();
            return null;
        }
    }

    public int modificarEditorial(Editoriales editorial) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.update(editorial);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }

    public int eliminarEditorial(String id) {
        int filasAfectadas = 0;
        Session ses = factory.openSession();
        try {
            Editoriales editorial = (Editoriales) ses.get(Editoriales.class,
                    id);
            if (editorial != null) {
                Transaction tran = ses.beginTransaction();
                ses.delete(editorial);
                tran.commit();
                filasAfectadas = 1;
            }
            ses.close();
            return filasAfectadas;
        } catch (Exception e) {
            ses.close();
            return filasAfectadas;
        }
    }
}