package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.FuncionarioController;
import com.Restaurantes.Restaurantes.entity.Funcionario;
import com.Restaurantes.Restaurantes.repositorio.FuncionarioRepositorio;

@SpringBootTest
class FuncionarioControllerTest {
	
	@Autowired
	private FuncionarioController controller;
	@Autowired
	private FuncionarioRepositorio repositorio;
	

	@Test
	void testListarFuncionario() {
		try {
			long expected = repositorio.count();
			List<Funcionario>lista = controller.listarfuncionario();
			long result = (long)lista.size();
			System.out.println("Teste de listar funcionários: \nEsperado: "+ expected + "\nObtido: "+ result);
			
			if(expected == result) {
				System.out.println("Teste Ok");
			} else {
				System.out.println("Fail");
			}
			
			assertThat(expected).isEqualTo(result);
			
		}
		catch (Exception msg){
			fail("Erro ao testar o banco de dados" + msg.getMessage());
		}
	}
	
	@Test
	void testIncluirFuncionario() {
		try {
			long expected = repositorio.count()+1;
			Funcionario novo = new Funcionario();
			novo.setCodigo(0);
			novo.setNome("teste");
			novo.setSalario(100.11);
			
			repositorio.save(novo);
			repositorio.flush();
			
			long result = repositorio.count();
			assertThat(expected).isEqualTo(result);
			
			if(expected == result) {
				System.out.println("Teste incluir funcionário validado!");
			}
			else {
				System.out.println("Teste incluir funcionário falhou");
			}

		}
		catch (Exception msg) {
			fail("Erro ao testar incluir funcionário" + msg.getMessage());
		}
	}

}
