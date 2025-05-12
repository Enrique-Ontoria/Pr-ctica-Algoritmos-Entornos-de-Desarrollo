package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.entornos.PascualEnriqueOntoriaBello.algoritmos.*;

class TestResultados {

	//Test Fibonacci Resultados validos
	@Test
    void testFibonacci1() {
        algoritmos A1 = new algoritmos();
        int valorEsperado = 34;
        int valorObtenido = A1.fibonacci(8);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	@Test
    void testFibonacci2() {
        algoritmos A1 = new algoritmos();
        int valorEsperado = 55;
        int valorObtenido = A1.fibonacci(9);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	
	//Test Fibonacci Excepcion
	@Test
    void testFibonacciExcepcion() {
        algoritmos A1 = new algoritmos();
        int valorEsperado = 55;
        int valorObtenido = A1.fibonacci(-4);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	//-------------------------------------------------------------------------------------//
	
	//Test Factorial Resultados validos
	@Test
    void testFactorial1() {
        algoritmos A1 = new algoritmos();
        int valorEsperado = 362880;
        int valorObtenido = A1.factorial(9);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	@Test
    void testFactorial2() {
        algoritmos A1 = new algoritmos();
        int valorEsperado = 24;
        int valorObtenido = A1.factorial(4);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	// Test Factorial Excepcion
	@Test
    void testFactorialExcepcion() {
        algoritmos A1 = new algoritmos();
        int valorEsperado = 55;
        int valorObtenido = A1.factorial(-1);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	//-------------------------------------------------------------------------------------//

	
	//Test Primo Resultados validos
	@Test
    void testPrimo1() {
        algoritmos A1 = new algoritmos();
        boolean valorEsperado = true;
        boolean valorObtenido = A1.primo(3);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	@Test
    void testPrimo2() {
        algoritmos A1 = new algoritmos();
        boolean valorEsperado = false;
        boolean valorObtenido = A1.primo(4);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	//Test Primo Excepcion
	@Test
    void testPrimoExcepcion() {
        algoritmos A1 = new algoritmos();
        boolean valorEsperado = false;
        boolean valorObtenido = A1.primo(-1);
        assertEquals(valorEsperado, valorObtenido);
    }
	
	
	
	

}
