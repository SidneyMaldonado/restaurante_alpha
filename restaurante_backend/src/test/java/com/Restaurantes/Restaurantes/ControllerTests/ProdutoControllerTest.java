package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.ProdutoController;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.entity.Produto;
import com.Restaurantes.Restaurantes.repositorio.ProdutoRepositorio;

@SpringBootTest
public class ProdutoControllerTest {

	@Autowired
	private ProdutoRepositorio repositorio;
	@Autowired
	private ProdutoController controller;
	
	@Test
	void testListarProdutos() {
		try {
		long expected;
		expected = repositorio.count();
		
		List<Produto> lista = controller.listarproduto();
		long result = (long)lista.size();
		
		assertThat(expected).isEqualTo(result);
		}catch (Exception ex ) {
			fail("Erro ao testar Listar Clientes :" + ex.getMessage());
		}
		}
	
	@Test
	void testIncluirProduto() {
		try {
		long expected = repositorio.count() + 1;
		
		Produto novo= new Produto();
		novo.setCodigo(0);
		novo.setNome("Agrotoxico");
		novo.setPreco(17.00);
		novo.setQuantidade(2.0);
		
		repositorio.save(novo);
		repositorio.flush();
		
		long result = repositorio.count();
		assertThat(expected).isEqualTo(expected);
		}catch(Exception ex) {
			fail("Erro ao testar incluir Produto :" + ex.getMessage());
		}
		}
}
