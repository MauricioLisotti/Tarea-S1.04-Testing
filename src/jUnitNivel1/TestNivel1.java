package jUnitNivel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestNivel1 {

	@Test
	void ejercicio1() {
		String []meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		List<String> lista = Arrays.asList(meses);
		assertEquals(lista.size(),12);
			
		// terminar
				
	}
	
	@Test
	void no_es_null() {
		String []meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		List<String> lista = Arrays.asList(meses);
		assertNotNull(lista);

	}
	
	@Test
	void pos8() {
		String []meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		List<String> lista = Arrays.asList(meses);
		assertEquals(lista.get(7), "agosto");
		
	}
}
