package com.youtube.dojo.java;

public class CFSesenaosesenaosesenao {
	public static void main(String[] args) {
	/*crie uma variavel salario e imprima seu imposto:
	 * salario < 1000                     5%
	 * salario >=1000 && salario < 2000   10%
	 * salario >= 2000 && salario < 4000  15%
	 * salario > 5000                     20%
	 */
		double salario = 5500;
		double salarioimposto = 0;
		
		if(salario < 1000) {
			salarioimposto = salario * 0.05;
		} else if (salario >=1000 && salario < 2000) {
			salarioimposto = salario * 0.1;
		} else if (salario >= 2000 && salario < 4000) {
			salarioimposto = salario * 1.5;
		} else {
			salarioimposto = salario * 2.0;
		}
		System.out.println("O salario mais o imposto é de R$: "+salarioimposto);
}
}
