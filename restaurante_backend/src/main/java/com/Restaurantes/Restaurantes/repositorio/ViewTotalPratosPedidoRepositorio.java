package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.ViewTotalPratosPedido;

@Repository
public interface ViewTotalPratosPedidoRepositorio extends JpaRepository<ViewTotalPratosPedido, Integer>{

}
