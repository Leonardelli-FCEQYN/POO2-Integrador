package edu.unam.integrador.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unam.integrador.model.Pedido;
import edu.unam.integrador.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
