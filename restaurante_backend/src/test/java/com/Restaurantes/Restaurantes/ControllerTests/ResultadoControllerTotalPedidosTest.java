package com.Restaurantes.Restaurantes.ControllerTests;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ResultadoController;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;

@SpringBootTest
class ResultadoControllerTotalPedidosTest {
	
	@Autowired
	private ResultadoController controller;
	@Autowired
	private PedidoRepositorio pedrepo;

	@Test
	void testTotalPedidos() {
		try {
			//faz a consulta no banco para buscar o total para comparação
			Double soma = 0.0;
			List<Pedido> pedidos = pedrepo.findAll();
			for(Pedido p: pedidos) {
				soma += p.getPreco();
			}
			
			Double expected = soma; 
			//ou executa o método para trazer o resultado do banco e declara-o como valor experado
			//Double expected = 2354.9000000000015 valorno momento da consulta
			Double result = controller.totalPedidos();
			
			System.out.println("Teste Total de Pedidos: esperado: " + expected + " obtido:" + result);
			
			assertThat(expected).isEqualTo(result);
			
			if(expected.equals(result)) {
				System.out.println("OK");
			} else {
				System.out.println("FAIL");
			}
					
			
		}
		catch (Exception msg) {
			fail("Erro ao mostrar total de pedidos" + msg.getMessage());
		}
		
	}

}
