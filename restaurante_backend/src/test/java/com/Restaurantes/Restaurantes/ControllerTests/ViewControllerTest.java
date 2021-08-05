package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.repositorio.ViewContaPratoPedidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewListaProdutoPrecoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;

import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;
import com.Restaurantes.Restaurantes.views.ViewListaProdutoPreco;
import com.Restaurantes.Restaurantes.controller.ViewController;
import com.Restaurantes.Restaurantes.repositorio.ViewProdutosAlfaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewTotalPratosPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewProdutosAlfa;
import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;
import com.Restaurantes.Restaurantes.views.ViewTotalPratosPedido;

@SpringBootTest
class ViewControllerTest {

	 
	@Autowired
	private ViewSomaPagoClienteRepositorio pagoClienteRepositorio;
	@Autowired
	private ViewTotalPratosPedidoRepositorio totalPratos;
	@Autowired
	private ViewProdutosAlfaRepositorio produtosAlfa;
	@Autowired
	private ViewController controller;	
	@Autowired
	private ViewListaProdutoPrecoRepositorio produtoPrecoRepositorio;
<<<<<<< HEAD
	@Autowired
    private ViewClientesAtendidosRepositorio clientesAtendidosRepositorio;
	@Autowired
	private ViewContaPratoPedidosRepositorio pratoPedidoRepositorio;
=======
	
>>>>>>> 22a4bd29fcf1e81e38e85429e3df1fd3348995cf

	
	@Test
	void testlistarSomaPagoCliente() {
		
		float expected = pagoClienteRepositorio.count();
		List<ViewSomaPagoCliente> registros = pagoClienteRepositorio.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar SomaPagoCliente.:");
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
		
	}

	@Test
	void testlistarContaPratoPedidos() {
		
		float expected = pratoPedidoRepositorio.count();
		List<ViewContaPratoPedidos> registros = pratoPedidoRepositorio.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar ContaPratoPedidos.:");
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
	}
	
	@Test
	void testlistarTotalPratosPedido() {
		try {
			long expected = totalPratos.count();
			List<ViewTotalPratosPedido>lista = controller.listarTotalPratosPedido();
			long result = (long)lista.size();
			System.out.println("Teste de listar pratos por pedido: \nEsperado: "+ expected + "\nObtido: "+ result);
			
			if(expected == result) {
				System.out.println("Teste Ok");
			} else {
				System.out.println("Fail");
			}
			
			assertThat(expected).isEqualTo(result);
			
		} catch (Exception msg){
			fail("Erro ao testar o banco de dados" + msg.getMessage());
		}
	}
	
	@Test
	void testlistarProdutoPreco() {
		
		float expected = produtoPrecoRepositorio.count();
		List<ViewListaProdutoPreco> registros = produtoPrecoRepositorio.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar ContaPratoPedidos.:");
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
		
	}

	@Test
	void testlistarProdutosAlfa() {
		try {
			long expected = produtosAlfa.count();
			List<ViewProdutosAlfa>lista = controller.listarProdutosAlfa();
			long result = (long)lista.size();
			System.out.println("Teste de listar produtos por nome: \nEsperado: "+ expected + "\nObtido: "+ result);
			
			if(expected == result) {
				System.out.println("Teste Ok");
			} else {
				System.out.println("Fail");
			}
			
			assertThat(expected).isEqualTo(result);
			
		}
		catch (Exception msg){
			fail("Erro ao testar o banco de dados" + msg.getMessage());
		}
	}
	
	
}
