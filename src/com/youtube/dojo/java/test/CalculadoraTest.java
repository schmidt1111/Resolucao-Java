package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(5, 5);
		double result = calc.divideDoiNumeros(5, 0);
		System.out.println(result);
		calc.imprimeDoisNumerosDivididos(5, 0);
		
		int[] numeros = new int[] {1,2,3,4,5};
		calc.somaArray (numeros);
		
		calc.somaVarArgs(numeros);
	}

}
