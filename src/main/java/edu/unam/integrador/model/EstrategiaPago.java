package edu.unam.integrador.model;

/**
 * Interfaz que define la estrategia de pago.
 */
public interface EstrategiaPago {
    /**
     * Realiza el pago de un monto especificado.
     * @param monto el monto a pagar.
     */
    void pagar(double monto);
}
