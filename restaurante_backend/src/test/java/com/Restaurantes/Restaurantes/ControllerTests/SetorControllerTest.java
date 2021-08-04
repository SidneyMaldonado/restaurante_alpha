package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.controller.SetorController;
import com.Restaurantes.Restaurantes.entity.Setor;
import com.Restaurantes.Restaurantes.repositorio.SetorRepositorio;

@SpringBootTest
class SetorControllerTest {
	
	@Autowired 
	private SetorController setorController;
	@Autowired
	private SetorRepositorio setorRepositorio;
	

	@Test
	void testListarSetor() {
		try {
			long expected = setorRepositorio.count();
			List<Setor>lista = setorController.listarsetor();
			long result = (long)lista.size();
			System.err.println("Teste de listar setores: \n Esperado: "+ expected + "\nObtido: " +result);
			
			if(expected == result) {
				System.out.println("Teste Ok!");
			} else {
				System.out.println("Fail");
			}
			
			assertThat(expected).isEqualTo(result);
			
		} catch (Exception msg){
			fail("Erro ao fazer consulta" + msg.getMessage());
		}
		
	}

}
