package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.Restaurantes.Restaurantes.controller.ResultadoController;
import com.Restaurantes.Restaurantes.entity.Faturamento;
import com.Restaurantes.Restaurantes.repositorio.FaturamentoRepositorio;

class ResultadoControllerTestVC {

	@Autowired
	private ResultadoController controller;
	@Autowired
	private FaturamentoRepositorio fatrepo;
	

	@Test
	void testTotalFaturamentos() {
		
		
		try {			
			double soma = 0;
			List<Faturamento> faturamentos = fatrepo.findAll();
			for(Faturamento f: faturamentos) {
				soma += f.getValorpago();
			}
			 double expected = soma;
			 double result = controller.totalFaturamento();
			
			assertThat(expected).isEqualTo(result);
		} catch (Exception ex){
			fail("Erro ao testar o banco de dados: " +ex.getMessage());
			
			
		}
		
	}

}
