package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;

@Repository
public interface ViewContaPratoPedidosRepositorio extends JpaRepository<ViewContaPratoPedidos, Integer> {

}
