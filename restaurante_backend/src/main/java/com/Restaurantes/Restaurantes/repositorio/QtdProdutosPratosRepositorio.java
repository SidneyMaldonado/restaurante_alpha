package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.QtdProdutosPratos;

@Repository
public interface QtdProdutosPratosRepositorio extends JpaRepository<QtdProdutosPratos, Integer> {

}
