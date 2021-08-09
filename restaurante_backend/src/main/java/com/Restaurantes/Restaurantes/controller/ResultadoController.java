package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Faturamento;
import com.Restaurantes.Restaurantes.entity.Pedido;
import com.Restaurantes.Restaurantes.entity.PedidoPronto;
import com.Restaurantes.Restaurantes.repositorio.FaturamentoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PedidoProntoRepositorio;
import com.Restaurantes.Restaurantes.repositorio.PedidoRepositorio;

@RestController
@RequestMapping("resultados")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8090", "http://localhost:9876"} )
public class ResultadoController {

	
	@Autowired
	private PedidoProntoRepositorio pedprorepo;
	@Autowired
	private PedidoRepositorio pedrepo;
	@Autowired
	private FaturamentoRepositorio fatrepo;
	
	
	@GetMapping("totalpedidos")
	public double totalPedidos() {
		
		Double soma = 0.00;
		List<Pedido> pedidos = pedrepo.findAll();
		for(Pedido p: pedidos) {
			soma += p.getPreco();
		}
		
		return soma;
	}
	
// matheus
	@GetMapping("pedidopronto")
	public List<PedidoPronto> pedidosProntos() {
		
		List<PedidoPronto> pedidos = pedprorepo.findAll();
		return pedidos;

	}
	
// Valber
	@GetMapping("totalfaturamento")
	public Double totalFaturamento() {
		
		double soma = 0;
		List<Faturamento> faturamentos = fatrepo.findAll();
		for(Faturamento f: faturamentos) {
			soma += f.getValorpago();
		}
		return soma;
	}
	
}
