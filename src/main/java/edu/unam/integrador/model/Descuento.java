package edu.unam.integrador.model;
import jakarta.persistence.*;
@Entity
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    private double valor;

    public Descuento(Long id, String descripcion, double valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Descuento{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", valor=" + valor +
                '}';
    }
}
