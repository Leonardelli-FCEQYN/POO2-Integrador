package edu.unam.integrador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unam.integrador.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {



}
