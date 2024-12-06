package edu.unam.integrador.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;



class ContextoPagoTest {

    private ContextoPago contextoPago;
    private EstrategiaPago estrategiaPagoMock;

    @BeforeEach
    void setUp() {
        contextoPago = new ContextoPago();
        estrategiaPagoMock = Mockito.mock(EstrategiaPago.class);
        contextoPago.setEstrategia(estrategiaPagoMock);
    }

    @Test
    void testPagarConEstrategia() {
        double monto = 100.0;
        contextoPago.pagar(monto);
        verify(estrategiaPagoMock, times(1)).pagar(monto);
    }

    @Test
    void testPagarSinEstrategia() {
        contextoPago.setEstrategia(null);
        contextoPago.pagar(100.0);
        verify(estrategiaPagoMock, times(0)).pagar(anyDouble());
    }
}