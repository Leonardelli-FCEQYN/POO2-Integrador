package edu.unam.integrador.model;

import lombok.Data;

/**
 * Estrategia de pago mediante transferencia bancaria.
 */
@Data
public class PagoTransferenciaBancaria implements EstrategiaPago {
    /**
     * Realiza el pago mediante transferencia bancaria.
     * @param monto el monto a pagar.
     */
    @Override
    public void pagar(double monto) {
    }
}
