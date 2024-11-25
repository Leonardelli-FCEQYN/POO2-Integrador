package edu.unam.integrador.model;
import lombok.Data;

@Data
public class ContextoPago {
    private EstrategiaPago estrategia;

    public void pagar(double monto) {
        if (estrategia == null) {
            System.out.println("Error: No se ha configurado una estrategia de pago.");
        } else {
            estrategia.pagar(monto);
        }
    }
}
