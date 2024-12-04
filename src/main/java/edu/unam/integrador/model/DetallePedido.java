package edu.unam.integrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Representa el detalle de un pedido.
 */
@Entity
@Table(name="detalles_pedidos")
@Data
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;

    @OneToOne
    private Pedido pedido;

    @ManyToOne
    private Producto producto;
}
