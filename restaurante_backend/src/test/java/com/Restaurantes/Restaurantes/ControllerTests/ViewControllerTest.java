package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.Console;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.repositorio.ViewContaPratoPedidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewListaProdutoPrecoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;
import com.Restaurantes.Restaurantes.views.ViewListaProdutoPreco;
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
		}
		
	}
	
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
	

	
	

}
