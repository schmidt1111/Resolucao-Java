package com.youtube.dojo.java.model;

public class Calculadora {
	public void somaDoisNumeros() {
		System.out.println(5+5);
	}
	public void subtraiDoisNumeros() {
		System.out.println(5-5);
	}
	public void multiplicaDoisNumeros(int numa, int numb) {
		System.out.println(numa * numb);
	}
	public double divideDoiNumeros (double numa, double numb) {
		/*double resultado = numa/numb;   //há uma forma mais simples
		return resultado;*/
		if(numb !=0) {
		return numa/numb;
		}
		return 0;
	}
	public void imprimeDoisNumerosDivididos(double numa, double numb) {
		if(numb !=0) {
			System.out.println (numa/numb);
			return;
		} else {
			System.out.println("Não é possivel dividir por zero");
		}
	}
	public void alteraDoisValores(int a, int b) {
		a = 30;
		b = 40;
		
		System.out.println("Imprime dentro do metodo"); //
		System.out.println("numa = "+ a+ "| numb = "+ b);
	}
	public void somaArray( int[] numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num; //soma = soma +num
		}
		System.out.println(soma);
	}
	public void somaVarArgs ( int ... numeros) { //vc pode passr array ou os parametros passados com virgula
													//metodo que recebe com array de String.
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
}
