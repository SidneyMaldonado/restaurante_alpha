package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.Console;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;

@SpringBootTest
class ViewControllerTest {

	
	@Autowired
	private ViewSomaPagoClienteRepositorio repositorio;
	
	
	@Test
	void testlistarSomaPagoCliente() {
		
		float expected = repositorio.count();
		List<ViewSomaPagoCliente> registros = repositorio.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar SomaPagoCliente.:");
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
		
	}

}
