package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.Restaurantes.Restaurantes.entity.QtdProdutosPratos;
import com.Restaurantes.Restaurantes.repositorio.QtdProdutosPratosRepositorio;


@SpringBootTest
class QtdProdutosPratosTest {

	@Autowired 
	private QtdProdutosPratosRepositorio repositorio;
	//--------
	@Test
	void testListarProdutosPratos() {
		 
		float expected = repositorio.count();
		List<QtdProdutosPratos> registros = repositorio.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar ProdutosPratos.:");
		
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
	}

}
