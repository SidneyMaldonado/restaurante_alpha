package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.ClientesOrdemAlfabetica;
import com.Restaurantes.Restaurantes.entity.QtdProdutosPratos;
import com.Restaurantes.Restaurantes.repositorio.ClientesOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.QtdProdutosPratosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;

@RestController
@RequestMapping("views")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9876"} )


public class ViewController {
	
	@Autowired
	private ViewSomaPagoClienteRepositorio repositorio;
	@Autowired
	private ClientesOrdemAlfabeticaRepositorio repo;
	@Autowired
	private QtdProdutosPratosRepositorio reposi;
	
	@GetMapping("listarSomaPagoCliente")
	public List<ViewSomaPagoCliente> listarSomaPagoCliente(){
		
		return repositorio.findAll();
		
	}
	
	@GetMapping("ListarClientesOrdemAlfabetica")
	public List<ClientesOrdemAlfabetica> listarClientesOrdem(){
		
		return repo.findAll();
	}

	@GetMapping("listarprodutospratos")
	public List<QtdProdutosPratos> listarQtdprodutospagos(){
		
		return reposi.findAll();
		
	}
}



 

	 