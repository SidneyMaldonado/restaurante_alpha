package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.Restaurantes.Restaurantes.controller.ResultadoController;
import com.Restaurantes.Restaurantes.entity.PedidoPronto;


@SpringBootTest
public class ResultadoControllerPedProntoTest {

 

	@Autowired 
	private ResultadoController controller;
	
	   @Test
	   void testelistapedido_pronto(){
		   long expected = 30;
		   List<PedidoPronto> pedidos = controller.pedidosProntos();
		   
		   long result = pedidos.size();
		   
		    assertThat(expected).isEqualTo(expected);
		    
		 
			}
		   
	   }

	   
	 
	
 
