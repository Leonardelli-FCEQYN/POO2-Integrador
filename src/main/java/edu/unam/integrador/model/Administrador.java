package edu.unam.integrador.model;
import java.util.List;
import jakarta.persistence.*;
@Entity
public class Administrador extends Usuario{
    
    public void agregarProducto(Producto producto) {
        System.out.println("Producto agregado al catálogo: " + producto.getNombre());
    }
    public void actualizarProducto(Producto producto) {
        System.out.println("Producto actualizado: " + producto.getNombre());
    }
    public List<Pedido> consultarHistorialVentas() {
        System.out.println("Consultando el historial de ventas...");
        return List.of();
    }
    public void aplicarDescuentosAutomaticos(List<Producto> productos) {
        System.out.println("Aplicando descuentos automáticos a los productos...");
        for (Producto producto : productos) {
            System.out.println("Descuento aplicado al producto: " + producto.getNombre());
        }
    }
}
