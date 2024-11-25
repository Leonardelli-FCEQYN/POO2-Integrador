package edu.unam.integrador.model;

public class PagoTarjetaDebito implements EstrategiaPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago con Tarjeta de Débito por $" + monto);
    }
}
