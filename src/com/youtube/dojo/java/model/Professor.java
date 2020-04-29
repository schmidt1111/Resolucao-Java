package com.youtube.dojo.java.model;

public class Professor {

	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	
	public void imprimi() {
		System.out.println("Imprime dentro do metodo");
		System.out.println("Nome: "+ this.nome + "| Matricula: "+ this.matricula+ "| RG: "+ this.rg+ "| CPF: "+ this.cpf);
		 System.out.println("-----------------------------------------------------------------------------------------------");
	}
}
