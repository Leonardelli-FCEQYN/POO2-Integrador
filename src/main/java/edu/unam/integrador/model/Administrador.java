package edu.unam.integrador.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Clase que representa a un administrador en el sistema.
 * Un administrador puede agregar y actualizar productos,
 * consultar el historial de ventas y aplicar descuentos automáticos.
 */
@Entity
@Data
public class Administrador extends Usuario {

    /**
     * Agrega un nuevo producto al sistema.
     * 
     * @param producto el producto a agregar
     */
    public void agregarProducto(Producto producto) {
    }

    /**
     * Actualiza la información de un producto existente.
     * 
     * @param producto el producto a actualizar
     */
    public void actualizarProducto(Producto producto) {
    }

    /**
     * Consulta el historial de ventas del sistema.
     * 
     * @return una lista de pedidos que representan el historial de ventas
     */
    public List<Pedido> consultarHistorialVentas() {
        return List.of();
    }

    /**
     * Aplica descuentos automáticos a una lista de productos.
     * 
     * @param productos la lista de productos a los que se aplicarán los descuentos
     */
    public void aplicarDescuentosAutomaticos(List<Producto> productos) {
        for (Producto producto : productos) {
        }
    }
}
