package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.Restaurantes.Restaurantes.controller.ClienteLoginController;
import com.Restaurantes.Restaurantes.entity.ClienteAutorizado;
import com.Restaurantes.Restaurantes.entity.ClienteLogin;

class ClienteLoginControllerTest {

	@Autowired
	private ClienteLoginController boi;
	
	
	@Test
	void testLogar() {
		// qual aclasse que voce tem que enviar?
		ClienteLogin tatu = new ClienteLogin();
		tatu.setCodCliente(1);
		tatu.setSenha("a");
		
		Boolean expected = true;
		Boolean result;
		
		
		// qual classe que vai retornar
		ClienteAutorizado auto;
		
		auto = boi.logar(tatu);
		
		result = auto.getAutorizado();
		
		assertThat(result).isEqualTo(expected);
		
	}

}
