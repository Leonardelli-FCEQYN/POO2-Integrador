package edu.unam.integrador.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String categoria;
    private String descripcion;
    private String imagen;
    private double precio;
    private int stock;
    @ElementCollection
    private List<String> palabrasClave;

    @ManyToOne
    private Usuario usuario;
}
