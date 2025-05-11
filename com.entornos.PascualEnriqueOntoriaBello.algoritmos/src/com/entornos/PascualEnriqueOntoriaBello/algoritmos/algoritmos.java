package com.entornos.PascualEnriqueOntoriaBello.algoritmos;

public  class algoritmos {
	/*
	 * Constructor sin parametros.
	 */
	public algoritmos() {
	}
	
	/*
	 * Metodo fibonacci
	 * @return devuelve numero de fibonacci del numero introducido por parametro
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
	
}


