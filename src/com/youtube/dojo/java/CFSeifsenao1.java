package com.youtube.dojo.java;

public class CFSeifsenao1 {
	public static void main(String[] args) {
	
		int idade = 19;
		String status;
		
		/*if (idade < 18) {
			status = "Não é adulto";
		}else {
			status = "adulto";
		}*/
		
		//instrução QUATERNARIA
		//O que vem antes dos dois pontos é true, depois é false (true:false)
		//status = idade <18 ? "Não é adulto": "adulto";
		
		//Os valores tem que bater com o tipo da variável que foi declarada
		status = idade < 15?"infantil" : idade>=15 && idade < 18 ? "juvenil" : "adulto";
		System.out.println(status);
}
}
