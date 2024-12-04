package edu.unam.integrador.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unam.integrador.model.DetallePedido;
import edu.unam.integrador.repositories.DetallePedidoRepository;

@Service
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedido save(DetallePedido detallePedido){
        return detallePedidoRepository.save(detallePedido);
    }

}
