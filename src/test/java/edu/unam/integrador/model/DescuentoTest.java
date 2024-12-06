package edu.unam.integrador.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class DescuentoTest {

    private Descuento descuento;

    @BeforeEach
    void setUp() {
        descuento = new Descuento();
    }

    @Test
    void testGettersAndSetters() {
        descuento.setId(1L);
        descuento.setDescripcion("Descuento de prueba");
        descuento.setValor(10.0);

        assertEquals(1L, descuento.getId());
        assertEquals("Descuento de prueba", descuento.getDescripcion());
        assertEquals(10.0, descuento.getValor());
    }

    @Test
    void testConstructor() {
        Descuento nuevoDescuento = new Descuento();
        nuevoDescuento.setId(2L);
        nuevoDescuento.setDescripcion("Otro descuento");
        nuevoDescuento.setValor(20.0);

        assertEquals(2L, nuevoDescuento.getId());
        assertEquals("Otro descuento", nuevoDescuento.getDescripcion());
        assertEquals(20.0, nuevoDescuento.getValor());
    }
}
