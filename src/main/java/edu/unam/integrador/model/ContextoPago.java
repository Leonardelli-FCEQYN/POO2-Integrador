package edu.unam.integrador.model;

import lombok.Data;

/**
 * Contexto que utiliza una estrategia de pago para realizar un pago.
 */
@Data
public class ContextoPago {
    private EstrategiaPago estrategia;

    /**
     * Realiza el pago utilizando la estrategia de pago configurada.
     * @param monto el monto a pagar.
     */
    public void pagar(double monto) {
        if (estrategia == null) {
        } else {
            estrategia.pagar(monto);
        }
    }
}
