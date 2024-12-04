package edu.unam.integrador.services;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<Pedido> findAllPedidos(){
        List<Pedido> lista = pedidoRepository.findAll();
        ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>(lista);
        return listaPedidos;
    }

    public String generarNumeroPedido(){
        int numero = 0;
        String numeroConcatenado = "";
        ArrayList<Pedido> pedidos = findAllPedidos();
        ArrayList<Integer> numeros = new ArrayList<>();

        pedidos.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));

        if (pedidos.isEmpty()){
            numero = 1;
        } else {
            numero = numeros.stream().max(Integer::compare).get();
            numero++;
        }

        if (numero<10){
            numeroConcatenado="00000"+ String.valueOf(numero); //000009
        } else if(numero<100){
            numeroConcatenado="0000"+ String.valueOf(numero); //000099
        } else if (numero<1000){
            numeroConcatenado="000"+ String.valueOf(numero); //000999
        } else if (numero<10000){
            numeroConcatenado="00"+ String.valueOf(numero); //009999
        }

        return numeroConcatenado;
    }

}
