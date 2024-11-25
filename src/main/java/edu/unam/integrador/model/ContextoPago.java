package edu.unam.integrador.model;

public class ContextoPago {
    private EstrategiaPago estrategia;

    public void setEstrategiaPago(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void pagar(double monto) {
        if (estrategia == null) {
            System.out.println("Error: No se ha configurado una estrategia de pago.");
        } else {
            estrategia.pagar(monto);
        }
    }
}
