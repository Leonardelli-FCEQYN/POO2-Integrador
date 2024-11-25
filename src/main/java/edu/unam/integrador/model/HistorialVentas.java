package edu.unam.integrador.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import jakarta.persistence.*;
@Entity
public class HistorialVentas {
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pedido> ventas;
    public HistorialVentas() {
        this.ventas = new ArrayList<>();
    }
    public List<Pedido> getVentas() {
        return ventas;
    }
    public void registrarVenta(Pedido pedido) {
        ventas.add(pedido);
        System.out.println("Pedido registrado en el historial: " + pedido.getId());
    }
    public List<Pedido> filtrarPorFecha(Date fechaInicio, Date fechaFin) {
        List<Pedido> resultado = new ArrayList<>();
        for (@SuppressWarnings("unused") Pedido pedido : ventas) {
            System.out.println("Filtrando pedidos entre " + fechaInicio + " y " + fechaFin);
        }
        return resultado;
    }
    public void exportarHistorial(String formato) {
        System.out.println("Exportando historial de ventas en formato: " + formato);
    }
}
