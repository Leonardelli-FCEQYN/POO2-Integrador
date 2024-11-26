package edu.unam.integrador.model;

import lombok.Data;

/**
 * Estrategia de pago mediante tarjeta de débito.
 */
@Data
public class PagoTarjetaDebito implements EstrategiaPago {
    /**
     * Realiza el pago mediante tarjeta de débito.
     * @param monto el monto a pagar.
     */
    @Override
    public void pagar(double monto) {
    }
}
