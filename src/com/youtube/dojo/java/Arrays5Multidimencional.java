package com.youtube.dojo.java;

public class Arrays5Multidimencional {

	public static void main(String[] args) {
		int [] [] dias = new int [2] [2];
		dias [0][0] = 30;
		dias [0][1] = 10;
		dias [1][0] = 20;
		dias [1][1] = 5;
		
		for(int i=0; i < dias.length; i++) {
			System.out.println(dias[i]); //endereco de memoria
			
			for (int j= 0; j < dias[i].length; j++ ) {
				System.out.println(dias[i] [j]); //busca valores que contem no i
			}
		}
		for(int[] ref : dias) {
			for(int dia: ref) {
				System.out.println(dia);
			}
		}
	}
}
