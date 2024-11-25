package edu.unam.integrador.model;

import lombok.Data;

@Data
public class ContextoPago {
    private EstrategiaPago estrategia;

    public void pagar(double monto) {
        if (estrategia == null) {
        } else {
            estrategia.pagar(monto);
        }
    }
}
