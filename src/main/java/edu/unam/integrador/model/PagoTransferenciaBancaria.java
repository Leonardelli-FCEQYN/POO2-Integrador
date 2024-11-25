package edu.unam.integrador.model;

public class PagoTransferenciaBancaria implements EstrategiaPago{
    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago con Transferencia Bancaria por $" + monto);
    }
}
