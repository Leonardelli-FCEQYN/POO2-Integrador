package edu.unam.integrador.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;



class EstrategiaPagoTest {

    @Test
    void testPagar() {
        // Arrange
        EstrategiaPago estrategiaPago = Mockito.mock(EstrategiaPago.class);
        double monto = 100.0;

        // Act
        estrategiaPago.pagar(monto);

        // Assert
        verify(estrategiaPago, times(1)).pagar(monto);
    }
}
