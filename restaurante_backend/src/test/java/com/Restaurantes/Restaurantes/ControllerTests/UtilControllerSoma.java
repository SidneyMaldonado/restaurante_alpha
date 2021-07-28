package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.UtilController;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
@SpringBootTest
class UtilControllerSoma {

	@Autowired
	private UtilController controller;
	
	@Autowired
	private ClienteRepositorio repositorio;
	
	
	@Test
	void testsomar() {
		double a = 2;
		double b = 3;
		
		double expected = 5;
		
		double result = controller.somar(a, b);
		
		assertThat(result).isEqualTo(expected);
		
	}

	
	@Test
	void testqtd_clientes() {

		 
	   double expected = repositorio.count();
	   
	   double  result = controller.quant_cliente();
		
		assertThat(result).isEqualTo(expected);
	}
	
	
}
