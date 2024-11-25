package edu.unam.integrador.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    @ElementCollection
    private List<String> palabrasClave;
    
    public Producto(Long id, String nombre, String descripcion, double precio, int stock, String categoria, List<String> palabrasClave) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.palabrasClave = palabrasClave;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public boolean esDisponible() {
        return stock > 0;
    }
}
