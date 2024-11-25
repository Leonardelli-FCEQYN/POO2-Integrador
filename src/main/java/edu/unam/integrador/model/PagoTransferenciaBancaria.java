package edu.unam.integrador.model;

import lombok.Data;

@Data
public class PagoTransferenciaBancaria implements EstrategiaPago {
    @Override
    public void pagar(double monto) {
    }
}
