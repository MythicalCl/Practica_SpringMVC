package sv.edu.udb.www.practica_springmvc.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "generos", schema = "inventario_libros", catalog = "")
public class Generos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_genero", nullable = false)
    private int idGenero;
    @Basic
    @Column(name = "nombre_genero", nullable = false, length = 40)
    private String nombreGenero;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @OneToMany(mappedBy = "generosByIdGenero")
    private Collection<Libros> librosByIdGenero;

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<Libros> getLibrosByIdGenero() {
        return librosByIdGenero;
    }

    public void setLibrosByIdGenero(Collection<Libros> librosByIdGenero) {
        this.librosByIdGenero = librosByIdGenero;
    }
}
