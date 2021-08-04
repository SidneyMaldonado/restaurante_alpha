package com.Restaurantes.Restaurantes.ControllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Restaurantes.Restaurantes.entity.Pagamento;
import com.Restaurantes.Restaurantes.repositorio.PagamentoRepositorio;

@SpringBootTest
class PagamentoControllerTest {
	
	@Autowired
	private PagamentoRepositorio repositorio;

	@Test
	void testIncluirPagamento() {
		
		try {
			long expected = repositorio.count()+1;
			
			Pagamento novo = new Pagamento();
			novo.setCodigopagamento(0);
			novo.setCodigopedido(3);
			novo.setValorpago(15.5);
			
			repositorio.save(novo);
			repositorio.flush();
			
			long result = repositorio.count();
			assertThat(expected).isEqualTo(result);
			if(expected == result) {
				System.out.println("Teste incluir Pagamento validado!");
			}
			else {
				System.out.println("Teste incluir Pagamento falhou");
			}
			
		}
		catch (Exception msg){
			fail("Erro ao tentar incluir pagamento: " + msg.getMessage());
			
		}
		
	}

}
