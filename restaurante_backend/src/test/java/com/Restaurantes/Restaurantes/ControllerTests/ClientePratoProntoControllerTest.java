package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ClientePratoProntoController;

import com.Restaurantes.Restaurantes.entity.ClientePratoPronto;
import com.Restaurantes.Restaurantes.repositorio.ClientePratoProntoRepositorio;

@SpringBootTest
class ClientePratoProntoControllerTest {
	
	@Autowired
	private ClientePratoProntoRepositorio repositorio;
	@Autowired
	private ClientePratoProntoController controller;

	@Test
	void testListarClientePratoPronto() {
					
			try {
				long expected;
				expected = repositorio.count(); 
				
				List<ClientePratoPronto> lista = controller.listarClientePratoPronto();
				long result = (long)lista.size();
				
				System.out.print("Teste Controller ClientePratoPronto: esperado: " + expected + " obtido:" + result);
		
				if (expected == result) {
				}
		
				assertThat(expected).isEqualTo(result);
			} catch (Exception ex) {
				fail("Erro ao testar o ListarClientePratoPronto:" + ex.getMessage());
			}
			
	}
}