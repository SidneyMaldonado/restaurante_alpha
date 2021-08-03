package com.Restaurantes.Restaurantes.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vw_qtd_pratos_pedido")
public class ViewTotalPratosPedido {
	
	@Id
	@Column(name="codigopedido")
	private Integer codigoPedido;
	
	@Column(name="quantidade_pratos")
	private Integer quantidadePratos;

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Integer getQuantidadePratos() {
		return quantidadePratos;
	}

	public void setQuantidadePratos(Integer quantidadePratos) {
		this.quantidadePratos = quantidadePratos;
	}

}
