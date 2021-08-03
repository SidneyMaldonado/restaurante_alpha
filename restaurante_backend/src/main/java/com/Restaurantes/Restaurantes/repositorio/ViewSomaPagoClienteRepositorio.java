package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;

@Repository
public interface ViewSomaPagoClienteRepositorio extends JpaRepository<ViewSomaPagoCliente, Integer>{

}
