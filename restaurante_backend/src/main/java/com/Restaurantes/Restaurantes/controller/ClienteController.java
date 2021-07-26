package com.Restaurantes.Restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Cliente;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@PostMapping("incluir")
    public void salvar( @RequestBody Cliente novoCliente) {
		
		if(novoCliente.getEmail().matches("^([0-9a-zA-Z]+([_.-]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[0-9,a-z,A-Z,.,-]*(.){1}[a-zA-Z]{2,4})+$")) {
			this.clienteRepositorio.save(novoCliente);
	        this.clienteRepositorio.flush();
		}else {
			System.out.println("Erro ao inserir email");
		}
			     
    }
}
