package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import com.Restaurantes.Restaurantes.entity.ClientesOrdemAlfabetica;
import com.Restaurantes.Restaurantes.entity.QtdProdutosPratos;
import com.Restaurantes.Restaurantes.repositorio.ClientesOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.QtdProdutosPratosRepositorio;
=======

<<<<<<< HEAD
import com.Restaurantes.Restaurantes.repositorio.ViewContaPratoPedidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewListaProdutoPrecoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;
import com.Restaurantes.Restaurantes.views.ViewListaProdutoPreco;
=======
>>>>>>> c5e7219f35a31d9b58618960fa4554d96986bdd7
import com.Restaurantes.Restaurantes.repositorio.ViewProdutosAlfaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewTotalPratosPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewProdutosAlfa;
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9
import com.Restaurantes.Restaurantes.views.ViewSomaPagoCliente;
import com.Restaurantes.Restaurantes.views.ViewTotalPratosPedido;

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
 
	private ViewTotalPratosPedidoRepositorio totalPratos;
	@Autowired
	private ViewProdutosAlfaRepositorio produtosAlfa;
	
	
 
	
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
<<<<<<< HEAD
		
		
    @Autowired
	private ViewContaPratoPedidosRepositorio repositorios;
			
    @GetMapping("listarContaPratoPedidos")
	public List<ViewContaPratoPedidos> listarContaPratoPedidos(){
				
		return repositorios.findAll();
    }
		
		
	}
	
<<<<<<< HEAD

	@GetMapping("ListarClientesOrdemAlfabetica")
	public List<ClientesOrdemAlfabetica> listarClientesOrdem(){
		
		return repo.findAll();
	}
=======
	
=======
	
>>>>>>> c5e7219f35a31d9b58618960fa4554d96986bdd7
	@GetMapping("totalpratospedido")
	public List<ViewTotalPratosPedido> listarTotalPratosPedido(){
		
		return totalPratos.findAll();
		
	}
	
	@GetMapping("produtosordemalfabetica")
	public List<ViewProdutosAlfa> listarProdutosAlfa(){
		
		return produtosAlfa.findAll();
		

	}
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9

<<<<<<< HEAD
	@GetMapping("listarprodutospratos")
	public List<QtdProdutosPratos> listarQtdprodutospagos(){
		
		return reposi.findAll();
		
	}
}



 

	 
=======
>>>>>>> c5e7219f35a31d9b58618960fa4554d96986bdd7
