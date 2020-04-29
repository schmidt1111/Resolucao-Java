package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Carro;

public class CarroTest {
	public static void main(String[] args) {
		//criando objeto
		Carro carro = new Carro ();
		//printando antes da atribuicao
		System.out.println(carro);  //faz referencia ao endereco de memoria onde esta o objeto Carro
		System.out.println(carro.placa);//null porque ela foi inicializada automaticamente null, tipo referencia
		System.out.println(carro.velocidademaxima); // é zero pq tipo primitivo inicializa automaticamente por int=0;
		System.out.println(carro.modelo);
		//atribuindo valores as variaveis
		carro.placa = "DSE3214";
		carro.modelo = "Gol";
		carro.velocidademaxima = 100;
		//printando atributos com valores
		System.out.println(carro);  
		System.out.println(carro.placa);
		System.out.println(carro.velocidademaxima); 
		System.out.println(carro.modelo);
	}

}
