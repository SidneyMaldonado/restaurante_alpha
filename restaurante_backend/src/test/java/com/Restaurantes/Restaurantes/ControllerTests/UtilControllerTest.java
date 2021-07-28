package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.UtilController;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;


@SpringBootTest
class UtilControllerTest {
	
	@Autowired
	private UtilController controller;
	@Autowired
	private PedidoRepositorio repo;

	@Test
	void testBx1() {
		try {
			double a = 1;
			double b = 4;
			double c = 3;
			double expected = 4;
			double result = controller.bx1(a, b, c);
			
			assertThat(expected).isEqualTo(result);
			
			if (expected == result) {
				System.out.println("Cálculo do Delta OK");
			} else {
				System.out.println(" Cálculo do Delta FAIL");
			}
		
		}
		catch (Exception msg){
			fail("Erro ao testar Delta:" + msg.getMessage());
		}
	}
	
	@Test
	void testQtd_pedidos() {
		try {
			long expected = repo.count();
			int result = controller.quant_pedido();
				
			System.out.print("Teste Qtd_pedidos: esperado: " + expected + " obtido:" + result);
			
			
			if ((int)expected == result) {
				System.out.println("Teste quantidade de Pedidos OK");
			} else {
				System.out.println("Teste quantidade de Pedidos FAIL");
			}
			assertThat(expected).isEqualTo(result);
			
		}
		catch (Exception msg) {
			fail("Erro ao testar quantidade de pedidos:" + msg.getMessage());
		}
		
	}

}
