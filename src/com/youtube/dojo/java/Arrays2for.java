package com.youtube.dojo.java;

public class Arrays2for {

	public static void main(String[] args) {
		
		//	VALORES PADRÃO DE INICIALIZAÇÃO
		//	byte, short, int long float, double = 0
		//	char = "\u0000", ' ' 
		//	boolean = false
		//	referencia = null
		int[] idades = new int[1];
		char [] idade = new char [2];
		boolean [] idad = new boolean[3];
		String [] ida = new String[4];
	
		//printar o arrays com seus valores padrões
		for (int i=0; i < idades.length; i++) {
			System.out.println("Idade "+(i+1) + " = " + idades[i]);
		}
		
		for(int j=0; j< idade.length; j++) {
			System.out.println("Idade " + (j+1) + " = " + idade[j]);				
		}
		
		for(int k = 0; k < idad.length; k++) {
			System.out.println("Idade "+ + (k+1) + " = "+ idad[k]);				
		}
		
		for (int l=0; l< ida.length; l++) {
			System.out.println("Idade "+ (l+1) + " = " + ida[l]);
		}
	
	}
}
