package CalculadoraTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		
		int resultado = Calculadora.suma(2, 3);
		
		//Para esta prueba, espero que la suma me debe 5 (3+2)
		Assert.assertEquals(5, resultado); //lo que espero, y lo que tengo
		
	} //testSumar
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3); 
		Assert.assertEquals(6, resultado); //lo que espero, y lo que tengo
		
	} //testMultiplicar
	
	
	@Test
	void testDividir() {
		float resultado = Calculadora.dividir(6.0f, 2.0f); //3
		assertEquals(3, resultado); //lo que espero, y lo que tengo
		
	} //testDividir

	
}
