package com.youtube.dojo.java;

public class Arrays3foreach {
	public static void main(String[] args) {
		int [] numeros = new int [5];
		int [] numeros2 = {1,2,3,4,5};   			//atribuindo valores para o arrays = tamanho = 5; index = 0 até 4.
		int [] numeros3 = new int[] {1,2,3,4,5};	//nao pode definir tamanho dentro 
		
		for(int i=0; i < numeros2.length; i++) {
			System.out.println("numeros 2 [" +i + "] = " + numeros2[i]);
		}
		for(int aux : numeros3) {
			//System.out.println(aux);
			System.out.println(numeros3[aux]);
		}
		
	}

}
