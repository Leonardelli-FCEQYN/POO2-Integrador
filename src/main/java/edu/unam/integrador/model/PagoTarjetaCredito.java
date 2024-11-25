package edu.unam.integrador.model;

public class PagoTarjetaCredito implements EstrategiaPago{
    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
    }
}
