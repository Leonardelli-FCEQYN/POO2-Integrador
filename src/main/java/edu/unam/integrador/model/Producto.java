package edu.unam.integrador.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name="productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String categoria;
    private String descripcion;
    private String imagen;
    private int stock;
    private double precio;

    @ManyToOne
    private Usuario usuario;

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", descripcion=" + descripcion
                + ", imagen=" + imagen + ", stock=" + stock + ", precio=" + precio + "]";
    }

    
}
