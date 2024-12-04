package edu.unam.integrador.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

/**
 * Representa un pedido realizado por un usuario.
 */
@Entity
@Table(name="pedidos")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private LocalDate fechaCreacion;
    private LocalDate fechaRecibida;
    private String estado = "Pendiente";
    private double subTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> productos;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Descuento> descuentos;

    @ManyToOne
    private Usuario usuario;
    @OneToOne(mappedBy = "pedido")
    private DetallePedido detalle;
}
