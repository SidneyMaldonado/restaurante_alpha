package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ViewController;
import com.Restaurantes.Restaurantes.entity.ProdutoFuncionario;
import com.Restaurantes.Restaurantes.repositorio.ProdutoFuncionarioRepositorio;

@SpringBootTest
public class ProdutoFuncionarioTest {

	@Autowired
	private ProdutoFuncionarioRepositorio produtofunrepositorio;
	@Autowired
	private ViewController controller;
	
	
	@Test 
	 void testeListarProdutosFuncionario() {
		try {
		long expected = produtofunrepositorio.count();
		
		 List<ProdutoFuncionario> lista = controller.listarprodutofuncionario();
		long result = (long)lista.size();
		
		assertThat(expected).isEqualTo(result);
		}catch (Exception ex) {
			fail("Erro ao testar Listar Produto Por funcionario:" + ex.getMessage());
		}
	}
      
	
	
}


 