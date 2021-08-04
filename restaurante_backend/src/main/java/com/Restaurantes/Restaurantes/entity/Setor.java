package com.Restaurantes.Restaurantes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Setor")
public class Setor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigosetor")
	private Integer codigoSetor;
	
	@Column(name="nome")
	private String nome;
	
	public Integer getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
