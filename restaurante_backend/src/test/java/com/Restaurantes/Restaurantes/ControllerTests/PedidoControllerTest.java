package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.PedidoController;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;

@SpringBootTest
class PedidoControllerTest {

	@Autowired
	private PedidoRepositorio repositorio;
	@Autowired
	private PedidoController controller;
	
	@Test
	void testListarPedido() {
		try {
			long expected;
			expected = repositorio.count();
			
			List<Pedido> lista = controller.listarpedido();
			long result = (long)lista.size();
			
			System.out.print("Teste de listar pedido: Esperado: " + expected + " obtido: " + result + "\n");
			if(expected == result) {
				System.out.println("Teste Ok");
			} else {
				System.out.println("Fail");
			}
			
			assertThat(expected).isEqualTo(result);
		}
		catch (Exception msg) {
			fail("Erro ao testar o banco de dados: " +msg.getMessage());
			
		}
		
		
	}
	
	@Test
	void testIncluirPedido() {
		try {
			long expected = repositorio.count()+1;
			
			Pedido novo = new Pedido();
			novo.setCodigoPedido(0);
			novo.setCodigoPrato(2);
			novo.setCodigoCliente(3);
			novo.setQuantidade(1.0);
			novo.setPreco(5.0);
			novo.setPronto(true);
			
			repositorio.save(novo);
			repositorio.flush();
			
			long result = repositorio.count();
			assertThat(expected).isEqualTo(result);
			
			if(expected == result) {
				System.out.println("Teste incluir Pedido validado!");
			}
			else {
				System.out.println("Teste incluir Pedido falhou");
			}
						
		}
		catch (Exception msg) {
			fail("Erro ao testar incluir pedido: " +msg.getMessage());
		}
	}

}
