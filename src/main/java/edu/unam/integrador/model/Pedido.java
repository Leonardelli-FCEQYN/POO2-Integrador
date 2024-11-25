package edu.unam.integrador.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> productos;
    
    private double precioTotal;
    private List<Descuento> descuentos;
    private String estado = "Pendiente";

    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void agregarDescuento(Descuento descuento) {
        descuentos.add(descuento);
        precioTotal -= descuento.getValor();
        if (precioTotal < 0) {
            precioTotal = 0; 
        }
    }
}
