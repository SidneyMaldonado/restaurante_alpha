package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.entity.PedidoPronto;

public interface PedidoProntoRepositorio extends JpaRepository<PedidoPronto, Integer> {

}
