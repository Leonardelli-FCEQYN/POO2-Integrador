package edu.unam.integrador.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Cliente extends Usuario {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> carrito = new ArrayList<>();

    public List<Producto> buscarProducto(String palabraClave, String categoria) {
        return new ArrayList<>();
    }

    public void escogerProducto(Producto producto) {
    }

    public void agregarProductoAlCarrito(Producto producto) {
        carrito.add(producto);
    }

    public void eliminarProductoDelCarrito(Producto producto) {
        carrito.remove(producto);
    }

    public Pedido realizarCompra() {
        Pedido pedido = new Pedido();
        pedido.setProductos(new ArrayList<>(carrito));
        pedido.setPrecioTotal(pedido.calcularPrecioTotal());
        carrito.clear();
        return pedido;
    }

    public double verTotalConDescuentos() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
}
