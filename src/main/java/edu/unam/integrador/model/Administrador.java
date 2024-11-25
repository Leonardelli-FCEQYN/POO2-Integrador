package edu.unam.integrador.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Administrador extends Usuario {

    public void agregarProducto(Producto producto) {
    }

    public void actualizarProducto(Producto producto) {
    }

    public List<Pedido> consultarHistorialVentas() {
        return List.of();
    }

    public void aplicarDescuentosAutomaticos(List<Producto> productos) {
        for (Producto producto : productos) {
        }
    }
}
