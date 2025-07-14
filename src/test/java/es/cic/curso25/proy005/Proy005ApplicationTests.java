package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Proy005ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testLista(){
		List<String> lista = new ArrayList<>();
		lista.add("pernera");
	}

}
