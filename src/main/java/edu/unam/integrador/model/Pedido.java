package edu.unam.integrador.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> productos;
    
    private double precioTotal;
    private List<Descuento> descuentos;
    private String estado;

    public Pedido(List<Producto> productos) {
        this.id = System.currentTimeMillis();
        this.productos = new ArrayList<>(productos);
        this.descuentos = new ArrayList<>();
        this.precioTotal = calcularPrecioTotal();
        this.estado = "Pendiente";
    }

    public Long getId() {
        return id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public List<Descuento> getDescuentos() {
        return descuentos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

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
