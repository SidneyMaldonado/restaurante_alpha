package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.ClientesOrdemAlfabetica;

@Repository
public interface ClientesOrdemAlfabeticaRepositorio extends JpaRepository<ClientesOrdemAlfabetica, Integer>{

}
