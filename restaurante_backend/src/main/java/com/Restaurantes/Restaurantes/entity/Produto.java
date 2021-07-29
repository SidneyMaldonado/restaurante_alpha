package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="produto")
public class Produto {
		
		@Id
		@Column(name="codigo")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer Codigo;
		
		@NotNull
		@Column(name="nome")
		private String Nome;
		
		@Column(name="preco")
		private Double Preco;
		
		@Column(name="quantidade")
		private Double Quantidade;

		public Integer getCodigo() {
			return Codigo;
		}

		public void setCodigo(Integer codigo) {
			Codigo = codigo;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public Double getPreco() {
			return Preco;
		}

		public void setPreco(Double preco) {
			Preco = preco;
		}

		public Double getQuantidade() {
			return Quantidade;
		}

		public void setQuantidade(Double quantidade) {
			Quantidade = quantidade;
		}
		
		
	
	
}
