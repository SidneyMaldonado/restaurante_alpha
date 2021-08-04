package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qtd_produtos_pratos")
public class QtdProdutosPratos {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="nome")
	 private String Nome;
	 @Column(name="qtd_produtos")
	 private double QtdProdutos;
	

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getQtdProdutos() {
		return QtdProdutos;
	}
	public void setQtdProdutos(double qtdProdutos) {
		QtdProdutos = qtdProdutos;
	}
	
	 
	  
	
	 
	
}
