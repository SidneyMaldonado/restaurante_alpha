package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ClienteController;
import com.Restaurantes.Restaurantes.entity.Cliente;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;

@SpringBootTest
public class ClienteControllerTest {

	
	@Autowired
	private ClienteRepositorio repo;
	@Autowired 
	private ClienteController controller;
	
	
	@Test
	void testeListarCliente() {
		
		try {
		long expected;
		expected = repo.count();
		
		List<Cliente>lista = controller.listarcliente();
		long result = (long)lista.size();
		
		System.out.print("Teste Controller Cliente: esperado: " + expected + " obtido: " + result);
		
		if (expected == result) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
		
		assertThat(expected). isEqualTo(result);
		}	catch (Exception ex) {
			fail("Erro ao testar o banco de dados: "+ ex. getMessage());
		}
	}
	
	 @Test
	void testeIncluirCliente() {
		 try {
		 long expected = repo.count() +1;
		 
		 Cliente novo = new Cliente();
		 novo.setNome("Outro Cliente");
		 novo.setEmail("j@gmail.com");
		 novo.setSenha("123456");
		 
		 repo.save(novo);
		 repo.flush();
		 
		 
		 long result = repo.count();
		 assertThat(expected).isEqualTo(result);
		 }catch (Exception ex) {
			 fail("Erro ao testar incluir Cliente : " + ex.getMessage());
		 } 
	 } 
	
	 
	 
	 
}
