package com.entornos.PascualEnriqueOntoriaBello.algoritmos;

public class algoritmos {
	/*
	 * Constructor sin parametros.
	 */
	public algoritmos() {
	}
	
	/*
	 * Metodo que calcula la secuencia de Fibonacci de la posicion indicada en la entrada del parametro.
	 * @param numero de fibonacci apartir del cual se hace el calculo.
	 * @return devuelve numero de fibonacci del numero introducido por parametro.
	 * @throws IllegalArgumentException si el numero introducido por parametro es negativo.
	 */
	public int fibonacci (int numero) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		if (numero < 0) {
            throw new IllegalArgumentException("El numero introducido no es valido.");
        } 
		
		for(int i = 0; i < numero; i++) {
			c = a + b;
			a = b;
			b = c;
			
		}
		return c;
    }
	
	
	/*
	 * Metodo que calcula el factorial de un numero que se le pasa como parametro
	 * @param numero sobre el que se realiza el calculo
	 * @return resultado de sacar factorial del parametro de entrada
	 * @throws IllegalArgumentException si el numero introducido por parametro es negativo.
	 */
	public int factorial(int numero) {
		int factorial = 1;
		if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo para calcular el factorial.");
        } 
		
		for(int i = 1; i<= numero; i++) {
			factorial = factorial * i;
			
		}
		return factorial;
	}
	
	/*
	 * Metodo primo
	 * @return Devuelve un booleano si el numero introducido es primo o no
	 * @param Numero sobre el que se quiere averiguar si es primo o no.
	 * @throws IllegalArgumentException si el numero introducido por parametro es negativo.
	 */
	public boolean primo(int numero) {
		int divisores = 0;
        if (numero < 2) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 2.");
        }
        
        for(int i = 1; i <= numero; i++) {
        	if(numero%i == 0) divisores ++;
        }
        
        return divisores == 2;
    }
}
        
        



