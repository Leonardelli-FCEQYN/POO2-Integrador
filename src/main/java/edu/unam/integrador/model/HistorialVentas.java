package edu.unam.integrador.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Representa el historial de ventas de la tienda.
 */
@Data
public class HistorialVentas {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pedido> ventas;

    public HistorialVentas() {
        this.ventas = new ArrayList<>();
    }

    /**
     * Filtra las ventas por un rango de fechas.
     * @param fechaInicio la fecha de inicio del rango.
     * @param fechaFin la fecha de fin del rango.
     * @return una lista de pedidos que se realizaron en el rango de fechas especificado.
     */
    public List<Pedido> filtrarPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Pedido> resultado = new ArrayList<>();
        for (Pedido pedido : ventas) {
            if (pedido.getFechaCreacion().isBefore(fechaInicio) && pedido.getFechaCreacion().isAfter(fechaFin)) {
                resultado.add(pedido);
            }
        }
        return resultado;
    }

    /**
     * Exporta el historial de ventas en el formato especificado.
     * @param formato el formato en el que se exportará el historial.
     */
    public void exportarHistorial(String formato) {
    }
}
