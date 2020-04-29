package com.youtube.dojo.java;

public class CFParaSeSenao {
	public static void main(String[] args) {
		
		int valor = 100000;
		
		for (int i=0; i<=valor; i++) {
			if( i % 2 == 0) {
				System.out.println("pares = " + i);
			} else {
				System.out.println("impar = " + i);
			}
		}
	}
}
