package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restaurantes.Restaurantes.entity.ProdutoFuncionario;

@Repository
public interface ProdutoFuncionarioRepositorio extends JpaRepository<ProdutoFuncionario, Integer>{

}
