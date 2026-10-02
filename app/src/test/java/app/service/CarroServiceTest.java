package app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarroServiceTest {

	@Autowired
	CarroService carroService;
	
	@Test
	void cenario01() {
		List<Integer> lista = new ArrayList<>();
		lista.add(2);
		lista.add(4);
		lista.add(5);
		
		int retorno = this.carroService.somar(lista);
		assertEquals(11, retorno);
	}
	
	/* 
	Incluído o seguinte codigo no metodo somar para validar esse cenario
	if(lista.get(i) != null) 
	*/
	@Test
	void cenario02() {
		List<Integer> lista = new ArrayList<>();
		lista.add(null);
		lista.add(4);
		lista.add(5);
		
		int retorno = this.carroService.somar(lista);
		assertEquals(9, retorno);
	}
	
	@Test
	void cenario03() {
		List<Integer> lista = new ArrayList<>();
		lista.add(null);
		lista.add(4);
		lista.add(5);
		
		assertThrows(Exception.class, () -> {
			int retorno = this.carroService.somar(lista);
		});
	}
}
