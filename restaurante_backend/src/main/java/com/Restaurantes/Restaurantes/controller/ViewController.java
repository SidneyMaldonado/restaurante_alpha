package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.ClientesOrdemAlfabetica;
import com.Restaurantes.Restaurantes.entity.ProdutoFuncionario;
import com.Restaurantes.Restaurantes.entity.QtdProdutosPratos;
import com.Restaurantes.Restaurantes.repositorio.ClientesOrdemAlfabeticaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ProdutoFuncionarioRepositorio;
import com.Restaurantes.Restaurantes.repositorio.QtdProdutosPratosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewClientesAtendidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewContaPratoPedidosRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewListaProdutoPrecoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewSomaPagoClienteRepositorio;
import com.Restaurantes.Restaurantes.views.ViewClientesAtendidos;
import com.Restaurantes.Restaurantes.views.ViewContaPratoPedidos;
import com.Restaurantes.Restaurantes.views.ViewListaProdutoPreco;
import com.Restaurantes.Restaurantes.repositorio.ViewProdutosAlfaRepositorio;
import com.Restaurantes.Restaurantes.repositorio.ViewTotalPratosPedidoRepositorio;
import com.Restaurantes.Restaurantes.views.ViewProdutosAlfa;
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
 	@Autowired
	private ViewTotalPratosPedidoRepositorio totalPratos;
	@Autowired
	private ViewProdutosAlfaRepositorio produtosAlfa;
    @Autowired
	private ViewListaProdutoPrecoRepositorio produtoPrecoRepositorio;	
    @Autowired
	private ViewContaPratoPedidosRepositorio repositorios;
<<<<<<< HEAD
	@Autowired
	private ProdutoFuncionarioRepositorio produtofunrepositorio; 
    
    
=======
    @Autowired
    private ViewClientesAtendidosRepositorio clientesAtendidosRepositorio;
	
>>>>>>> dc11244d8cda1d459b8c4d2b78b04e6b05c9d7a8
	@GetMapping("listarSomaPagoCliente")
	public List<ViewSomaPagoCliente> listarSomaPagoCliente(){
		
		return repositorio.findAll();
	}
		
	@GetMapping("listarProdutoPreco")
	public List<ViewListaProdutoPreco> listarProdutoPreco(){
			
		return produtoPrecoRepositorio.findAll();
	}

    @GetMapping("listarContaPratoPedidos")
	public List<ViewContaPratoPedidos> listarContaPratoPedidos(){
				
		return repositorios.findAll();
    }
		
	@GetMapping("ListarClientesOrdemAlfabetica")
	public List<ClientesOrdemAlfabetica> listarClientesOrdem(){
		
		return repo.findAll();
	}

	@GetMapping("totalpratospedido")
	public List<ViewTotalPratosPedido> listarTotalPratosPedido(){
		
		return totalPratos.findAll();
		
	}
	
	@GetMapping("produtosordemalfabetica")
	public List<ViewProdutosAlfa> listarProdutosAlfa(){
		
		return produtosAlfa.findAll();
	}
	
	@GetMapping("listarprodutospratos")
	public List<QtdProdutosPratos> listarQtdprodutospagos(){
		
		return reposi.findAll();
		
	}
	
<<<<<<< HEAD
	@GetMapping ("listarprodutofuncionario")
	public List<ProdutoFuncionario> listarprodutofuncionario(){
		
		return produtofunrepositorio.findAll();
=======
	 @GetMapping("listarClientesAtendidos")
	public List<ViewClientesAtendidos> listarClientesAtendidos(){
					
		return clientesAtendidosRepositorio.findAll();
>>>>>>> dc11244d8cda1d459b8c4d2b78b04e6b05c9d7a8
	}
}

