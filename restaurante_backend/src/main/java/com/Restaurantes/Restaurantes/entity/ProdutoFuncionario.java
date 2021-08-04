package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vw_produto_funcionario ")
public class ProdutoFuncionario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigoproduto")
	private Integer codigoproduto;
	
	@Column(name="nomeproduto")
	private String nomeproduto;
	
	@Column(name="nomefuncionario")
	private String nomefuncionario;

	public Integer getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(Integer codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getNomefuncionario() {
		return nomefuncionario;
	}

	public void setNomefuncionario(String nomefuncionario) {
		this.nomefuncionario = nomefuncionario;
	}
	
	
	
}
