package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.Console;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
import com.Restaurantes.Restaurantes.repositorio.ViewContaPratoPedidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewListaProdutoPrecoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;
import com.Restaurantes.Restaurantes.views.ViewListaProdutoPreco;
=======
import com.Restaurantes.Restaurantes.controller.FuncionarioController;
import com.Restaurantes.Restaurantes.controller.ViewController;
import com.Restaurantes.Restaurantes.entity.Funcionario;
import com.Restaurantes.Restaurantes.repositorio.ViewProdutosAlfaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewTotalPratosPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewProdutosAlfa;
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9
import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;
import com.Restaurantes.Restaurantes.views.ViewTotalPratosPedido;

@SpringBootTest
class ViewControllerTest {

	
	@Autowired
	private ViewSomaPagoClienteRepositorio repositorio;
	@Autowired
	private ViewTotalPratosPedidoRepositorio totalPratos;
	@Autowired
	private ViewProdutosAlfaRepositorio produtosAlfa;
	@Autowired
	private ViewController controller;
	
	
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
	
<<<<<<< HEAD
	@Autowired
	private ViewContaPratoPedidosRepositorio repositorios;
	
	
	@Test
	void testlistarContaPratoPedidos() {
		
		float expected = repositorios.count();
		List<ViewContaPratoPedidos> registros = repositorios.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar ContaPratoPedidos.:");
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
=======
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
			
		}
		catch (Exception msg){
			fail("Erro ao testar o banco de dados" + msg.getMessage());
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9
		}
		
	}
	
<<<<<<< HEAD
	@Autowired
	private ViewListaProdutoPrecoRepositorio repo;
	
	
	@Test
	void testlistarProdutoPreco() {
		
		float expected = repo.count();
		List<ViewListaProdutoPreco> registros = repo.findAll();
		float result = registros.size();
		
		assertThat( result ).isEqualTo(expected);
		System.out.print("Teste de Listar ContaPratoPedidos.:");
		if (result == expected) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
		
	}
	

	
	
=======
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
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9

}
