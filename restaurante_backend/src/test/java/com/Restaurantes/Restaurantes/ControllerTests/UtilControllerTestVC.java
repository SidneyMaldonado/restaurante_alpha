package com.Restaurantes.Restaurantes.ControllerTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import com.Restaurantes.Restaurantes.controller.UtilController;

@SpringBootTest
class UtilControllerTestVC {

	@Autowired
	private UtilController controller;
	
	
	@Test
	void testPi() {
		
		try {	
		      double expected;
		      expected = 3.14159;
		      
		      double result = controller.pi();
		      
		      System.out.print("Teste ControllerPi: esperado: " + expected + " obtido:" + result);
		      if (expected == result) {
					System.out.println(" OK");
				} else {
					System.out.println(" FAIL");
				}
		      assertThat(expected).isEqualTo(result);
		      
		      
		} catch (Exception ex) {
			fail("Erro ao testar o pi:" + ex.getMessage());
		}		         
	}

}


