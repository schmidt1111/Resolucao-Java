package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Professor;

public class ProfessorTest {
 public static void main(String[] args) {
	 Professor prof = new Professor();
	 prof.nome = "Luna Maria";
	 prof.matricula = "11111";
	 prof.rg = "11111111111";
	 prof.cpf = "11111111111111";
	 
	 Professor prof2 = new Professor();
	 prof2.nome = "Maria Clara";
	 prof2.matricula = "22222";
	 prof2.rg = "22222222222";
	 prof2.cpf = "2222222222222";
	 
	 System.out.println("Nome: "+ prof.nome + "| Matricula: "+ prof.matricula+ "| RG: "+ prof.rg+ "| CPF: "+ prof.cpf);
	 System.out.println("-----------------------------------------------------------------------------------------------");
	 System.out.println("Nome: "+ prof2.nome + "| Matricula: "+ prof2.matricula+ "| RG: "+ prof2.rg+ "| CPF: "+ prof2.cpf);
 }
}

