package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Calculadora;

public class ParametrosTest {
public static void main(String[] args) {
	Calculadora calc = new Calculadora ();
	int numa = 5;
	int numb = 10;
	calc.alteraDoisValores(5, 10);
	System.out.println("Imprime dentro do teste");
	System.out.println("numa = "+ numa+ "| numb = "+ numb);
}
}
