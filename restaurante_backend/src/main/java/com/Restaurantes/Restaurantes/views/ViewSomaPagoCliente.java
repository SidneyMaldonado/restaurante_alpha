package com.Restaurantes.Restaurantes.views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_pagamento_cliente")
public class ViewSomaPagoCliente {

	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSomaPagamento() {
		return somaPagamento;
	}
	public void setSomaPagamento(Double somaPagamento) {
		this.somaPagamento = somaPagamento;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigocliente")
	private int codigoCliente;
	@Column(name="nome")
	private String nome;
	@Column(name="valorpago")
	private Double somaPagamento;
	
}
