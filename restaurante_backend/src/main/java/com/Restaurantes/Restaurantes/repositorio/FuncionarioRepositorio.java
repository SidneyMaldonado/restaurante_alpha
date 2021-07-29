package com.Restaurantes.Restaurantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Restaurantes.Restaurantes.entity.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer> {

}
