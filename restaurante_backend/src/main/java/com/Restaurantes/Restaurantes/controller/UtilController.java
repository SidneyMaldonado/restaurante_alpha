package com.Restaurantes.Restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PratoRepositorio;

@RestController
@RequestMapping("util")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9876"} )
public class UtilController {
	
	
	@Autowired
	private ClienteRepositorio clirepo;
	@Autowired
	private PratoRepositorio prarepo;
	@Autowired
	private PedidoRepositorio pedrepo;
	
	// matheus
	@PostMapping("somar")
	public double somar( double a, double b) {
		double r;
		r = a + b;
		return r;
	}
			

	// Valber
	@GetMapping("pi")
	public double pi() {
		return 3.14159;
	}
	
	//Vander
	@PostMapping("delta")
	public double bx1( double a, double b, double c) {
		
		double x1;
		double delta = (b*b) - 4 * a * c;
		return delta;
	}
	
	
	// matheus
	@GetMapping("qtd_clientes")
	public int quant_cliente() {
		return (int) this.clirepo.count();
	}
			
	// valber
	@GetMapping("qtd_pratos")
	public int quant_prato() {
		return (int) prarepo.count();
	}
			
	// vander
	@GetMapping("qtd_pedidos")
	public int quant_pedido() {
		return (int) pedrepo.count();
	}



}
