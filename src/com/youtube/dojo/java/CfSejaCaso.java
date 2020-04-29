package com.youtube.dojo.java;

public class CfSejaCaso {
	public static void main(String[] args) {
	String fdsabado = "fdsabado";
	String fdsdomingo = "fdsdomingo";
	char sexo = 'M';	
	String dia = "3";
	//unicos tipos para utlizar para comparar (char, int, byte, short, enum e String)

	switch(dia) {
	
	case "1":
		System.out.println("Domingo");
		dia = "fdsdomingo";
		break;
	case "2": 
		System.out.println("Segunda");
		break;
	case "3":
		System.out.println("Terca");
		break;
	case "4":
		System.out.println("Quarta");
		break;
	case "5":
		System.out.println("Quinta");
		break;
	case "6":
		System.out.println("Sexta");
		break;
	case "7":
		dia = "fdsabado";
		System.out.println("Sabado");
		break;
		}
	
	if ((dia == fdsabado) || (dia == fdsdomingo)) {
		System.out.println("Fim de semana");
	} else {
		System.out.println("Dia de semana");
	}
	
	switch (sexo) {
	case 'F':
		System.out.println("Feminino");
		break;
	case 'M':
		System.out.println("Masculino");
		break;
	default:
		System.out.println("Opcao invalida");
		break;
	}
	}
	
}