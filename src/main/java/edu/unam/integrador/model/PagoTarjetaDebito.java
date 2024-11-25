package edu.unam.integrador.model;

import lombok.Data;

@Data
public class PagoTarjetaDebito implements EstrategiaPago {
    @Override
    public void pagar(double monto) {
    }
}
