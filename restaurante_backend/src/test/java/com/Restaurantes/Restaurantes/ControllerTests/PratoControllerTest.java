package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.PratoController;
import com.Restaurantes.Restaurantes.entity.Prato;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;


@SpringBootTest
class PratoControllerTest {

	
	@Autowired
	private PratoRepositorio repo;
	@Autowired
	private PratoController  controller;

	
	@Test
	void testListarPratos() {
		
		try {
			long expected;
			expected = repo.count(); 
			
			List<Prato> lista = controller.listarprato();
			long result = (long)lista.size();
			
			System.out.print("Teste Controller Prato: esperado: " + expected + " obtido:" + result);
	
			if (expected == result) {
				System.out.println(" OK");
			} else {
				System.out.println(" FAIL");
			}
	
			assertThat(expected).isEqualTo(result);
		} catch (Exception ex) {
			fail("Erro ao testar o banco de dados:" + ex.getMessage());
		}
		
	}
	
	@Test
	void testIncluirPrato() {
		
		try {
			long expected = repo.count() + 1;
			
			Prato novo = new Prato();
			novo.setDescricao("Outro Prato");
			novo.setPreco(121.10);
			novo.setCodprato(0);
			
			repo.save(novo);
			repo.flush();

			long result = repo.count();
			assertThat(expected).isEqualTo(result);

		} catch (Exception ex) {
			fail("Erro ao testar incluir prato :" + ex.getMessage());
		}
	}

	@Test
	void testAlterarPrato() {
		
		try {
			double expected = 500.50;
			Prato pra = repo.findById(1).get();
			pra.setPreco(500.50);
			
			repo.save(pra);
			repo.flush();
			
			Prato depois = repo.findById(1).get();
			double result =depois.getPreco();
			
			assertThat(expected).isEqualTo(result);
		} catch (Exception ex) {
			fail("Erro ao testar incluir prato :" + ex.getMessage());
		}
	}

}
