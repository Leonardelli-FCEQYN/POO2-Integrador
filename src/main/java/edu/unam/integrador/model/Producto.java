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
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    @ElementCollection
    private List<String> palabrasClave;
}
