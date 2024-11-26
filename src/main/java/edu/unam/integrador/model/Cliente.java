package edu.unam.integrador.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * Representa un cliente que realiza compras en la tienda.
 */
@Entity
@Data
public class Cliente extends Usuario {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> carrito = new ArrayList<>();

    /**
     * Busca productos en la tienda por palabra clave y categoría.
     * @param palabraClave la palabra clave para buscar.
     * @param categoria la categoría para buscar.
     * @return una lista de productos que coinciden con los criterios de búsqueda.
     */
    public List<Producto> buscarProducto(String palabraClave, String categoria) {
        return new ArrayList<>();
    }

    /**
     * Escoge un producto para agregar al carrito.
     * @param producto el producto a escoger.
     */
    public void escogerProducto(Producto producto) {
    }

    /**
     * Agrega un producto al carrito de compras.
     * @param producto el producto a agregar.
     */
    public void agregarProductoAlCarrito(Producto producto) {
        carrito.add(producto);
    }

    /**
     * Elimina un producto del carrito de compras.
     * @param producto el producto a eliminar.
     */
    public void eliminarProductoDelCarrito(Producto producto) {
        carrito.remove(producto);
    }

    /**
     * Realiza la compra de los productos en el carrito.
     * @return el pedido realizado.
     */
    public Pedido realizarCompra() {
        Pedido pedido = new Pedido();
        pedido.setProductos(new ArrayList<>(carrito));
        pedido.setPrecioTotal(pedido.calcularPrecioTotal());
        carrito.clear();
        return pedido;
    }

    /**
     * Calcula el total del carrito con los descuentos aplicados.
     * @return el total con descuentos.
     */
    public double verTotalConDescuentos() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
}
