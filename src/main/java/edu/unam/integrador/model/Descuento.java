package edu.unam.integrador.model;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Representa un descuento aplicado a un pedido.
 */
@Entity
@Data
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    private double valor;
}
