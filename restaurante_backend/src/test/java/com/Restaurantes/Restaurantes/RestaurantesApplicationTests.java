package com.Restaurantes.Restaurantes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.FaturamentoController;
import com.Restaurantes.Restaurantes.repositorio.FaturamentoRepositorio;
import com.sun.tools.javac.util.List;

@SpringBootTest
class FaturamentoControllerTest {
	
	@Autowired
	private FaturamentoRepositorio repo;
	@Autowired
	private FaturamentoController controller;

	@Test
	void testListarFaturamento() {
				
		try {
			   
			   long expected
			   expected = repo.count();
			   
			   List<Faturamento> lista = controller.listarfaturamento();
			   long result = (long)lista.size();
			   
			   System.out.print("Teste controller faturamento: esperado" + expected + "obtido:" + result);
			   
			   if (expected == result) {
					System.out.println(" OK");
				} else {
					System.out.println(" FAIL");
				}
			   
			   assertThat(expected).isEqualTo(result);
		} catch (Exception ex) {
			fail("Erro ao testar o listarFaturamento:" + ex.getMessage());
		}
		
	}
		
	}


