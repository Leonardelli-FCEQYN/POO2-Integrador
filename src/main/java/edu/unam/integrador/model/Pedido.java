package edu.unam.integrador.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

/**
 * Representa un pedido realizado por un usuario.
 */
@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private LocalDate fechaCreacion;
    private LocalDate fechaRecibida;
    private String estado = "Pendiente";
    private double precioTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> productos;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Descuento> descuentos;

    @ManyToOne
    private Usuario usuario;
    @OneToOne(mappedBy = "pedido")
    private DetallePedido detalle;

    /**
     * Calcula el precio total del pedido, teniendo en cuenta los productos y los descuentos.
     * @return el precio total del pedido.
     */
    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        for (Descuento descuento : descuentos) {
            total -= descuento.getValor();
        }
        return total;
    }

    /**
     * Agrega un descuento al pedido.
     * @param descuento el descuento a agregar.
     */
    public void agregarDescuento(Descuento descuento) {
        descuentos.add(descuento);
    }
}
