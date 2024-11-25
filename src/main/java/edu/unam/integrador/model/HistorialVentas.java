package edu.unam.integrador.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class HistorialVentas {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pedido> ventas;

    public HistorialVentas() {
        this.ventas = new ArrayList<>();
    }

    public List<Pedido> filtrarPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Pedido> resultado = new ArrayList<>();
        for (Pedido pedido : ventas) {
            if (pedido.getFechaCreacion().isBefore(fechaInicio) && pedido.getFechaCreacion().isAfter(fechaFin)) {
                resultado.add(pedido);
            }
        }
        return resultado;
    }

    public void exportarHistorial(String formato) {
    }
}
