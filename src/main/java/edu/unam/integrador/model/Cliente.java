package edu.unam.integrador.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Cliente extends Usuario{
    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> carrito = new ArrayList<>();


    public List<Producto> buscarProducto(String palabraClave, String categoria) {
        System.out.println("Buscando productos con palabra clave: " + palabraClave + " en categoría: " + categoria);
        return new ArrayList<>();
    }

    public void escogerProducto(Producto producto) {
        System.out.println("Producto seleccionado: " + producto.getNombre());
    }

    public void agregarProductoAlCarrito(Producto producto) {
        carrito.add(producto);
        System.out.println("Producto agregado al carrito: " + producto.getNombre());
    }

    public void eliminarProductoDelCarrito(Producto producto) {
        if (carrito.remove(producto)) {
            System.out.println("Producto eliminado del carrito: " + producto.getNombre());
        } else {
            System.out.println("El producto no se encontró en el carrito.");
        }
    }

    /*public Pedido realizarCompra() {
        Pedido pedido = new Pedido(carrito);
        carrito.clear();
        System.out.println("Compra realizada. Pedido generado.");
        return pedido;
    }*/

    public double verTotalConDescuentos() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        System.out.println("Total con descuentos: $" + total);
        return total;
    }
}
