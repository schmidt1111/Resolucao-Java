package com.youtube.dojo.java;

public class CFSeifsenao1 {
	public static void main(String[] args) {
	
		int idade = 19;
		String status;
		
		/*if (idade < 18) {
			status = "N�o � adulto";
		}else {
			status = "adulto";
		}*/
		
		//instru��o QUATERNARIA
		//O que vem antes dos dois pontos � true, depois � false (true:false)
		//status = idade <18 ? "N�o � adulto": "adulto";
		
		//Os valores tem que bater com o tipo da vari�vel que foi declarada
		status = idade < 15?"infantil" : idade>=15 && idade < 18 ? "juvenil" : "adulto";
		System.out.println(status);
}
}
