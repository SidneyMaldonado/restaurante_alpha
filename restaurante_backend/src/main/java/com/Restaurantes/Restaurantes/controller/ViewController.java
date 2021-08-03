package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.repositorio.ViewContaPratoPedidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewListaProdutoPrecoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;
import com.Restaurantes.Restaurantes.views.ViewListaProdutoPreco;
import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;

@RestController
@RequestMapping("views")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9876"} )


public class ViewController {
	
	@Autowired
	private ViewSomaPagoClienteRepositorio repositorio;
	
	
	@GetMapping("listarSomaPagoCliente")
	public List<ViewSomaPagoCliente> listarSomaPagoCliente(){
		
		return repositorio.findAll();
	}
		
		
    @Autowired
	private ViewListaProdutoPrecoRepositorio repo;
		
		
	@GetMapping("listarProdutoPreco")
	public List<ViewListaProdutoPreco> listarProdutoPreco(){
			
		return repo.findAll();
	}
		
		
    @Autowired
	private ViewContaPratoPedidosRepositorio repositorios;
			
    @GetMapping("listarContaPratoPedidos")
	public List<ViewContaPratoPedidos> listarContaPratoPedidos(){
				
		return repositorios.findAll();
    }
		
		
	}
	
	

