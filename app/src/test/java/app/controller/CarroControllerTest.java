package app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import app.entity.Carro;
import app.repository.CarroRepository;

@SpringBootTest
public class CarroControllerTest {

	
	@Autowired
	CarroController carroController;
		
	@MockitoBean
	CarroRepository carroRepository;
	
	@Test
	void cenario01() {
		List<Carro> lista = new ArrayList<>();
		lista.add(new Carro());
		
		//when(carroRepository.findAll().thenReturn(lista));
		
		
		ResponseEntity<List<Carro>> retorno = this.carroController.findAll();
		assertEquals(HttpStatus.OK, retorno.getStatusCode());
	}
}
