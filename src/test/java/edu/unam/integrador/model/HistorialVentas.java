package edu.unam.integrador.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;




class HistorialVentasTest {

    private HistorialVentas historialVentas;
    private Pedido pedido1;
    private Pedido pedido2;

    @BeforeEach
    void setUp() {
        historialVentas = new HistorialVentas();
        pedido1 = new Pedido();
        pedido1.setFechaCreacion(LocalDate.of(2023, 1, 1));
        pedido2 = new Pedido();
        pedido2.setFechaCreacion(LocalDate.of(2023, 2, 1));
        historialVentas.getVentas().add(pedido1);
        historialVentas.getVentas().add(pedido2);
    }

    @Test
    void testFiltrarPorFecha() {
        LocalDate fechaInicio = LocalDate.of(2022, 12, 31);
        LocalDate fechaFin = LocalDate.of(2023, 1, 2);
        List<Pedido> resultado = historialVentas.filtrarPorFecha(fechaInicio, fechaFin);
        assertEquals(1, resultado.size());
        assertTrue(resultado.contains(pedido1));
        assertFalse(resultado.contains(pedido2));
    }

    @Test
    void testFiltrarPorFechaSinResultados() {
        LocalDate fechaInicio = LocalDate.of(2023, 3, 1);
        LocalDate fechaFin = LocalDate.of(2023, 3, 31);
        List<Pedido> resultado = historialVentas.filtrarPorFecha(fechaInicio, fechaFin);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void testExportarHistorial() {
        // This method is not implemented yet, so we just test that it can be called without exceptions
        assertDoesNotThrow(() -> historialVentas.exportarHistorial("PDF"));
    }
}