package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Funcionario;
import com.Restaurantes.Restaurantes.repositorio.FuncionarioRepositorio;

@RestController
@RequestMapping("funcionarios")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9876"} )
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepositorio repositorio;
	
	@GetMapping("listar")
	public List<Funcionario> listarfuncionario(){
		return repositorio.findAll();	
	}
	
	@PostMapping("incluir")
	public void incluir(@RequestBody Funcionario novoFuncionario) {
		repositorio.save(novoFuncionario);
		repositorio.flush();
	}

}
