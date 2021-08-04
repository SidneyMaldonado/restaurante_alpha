package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Restaurantes.Restaurantes.views.ViewClientesAtendidos;

public interface ViewClientesAtendidosRepositorio extends JpaRepository<ViewClientesAtendidos, Integer> {
}
