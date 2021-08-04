package com.Restaurantes.Restaurantes.views;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vw_conta_prato_pedido")
public class ViewContaPratoPedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigpedido")
	private int codigoPedido;
	@Column(name="quantidadepratospedidos")
	private int quantidade;
	public int getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}
