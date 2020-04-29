package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Professor;

public class ProfTest {
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
	 
	 System.out.println("Dentro do prof Test");
	 
	// prof.imprimi(prof);  //se passa uma variavel de referencia voce passa o endereço de memoria desse objeto;
	// prof.imprimi(prof2);
	 prof.imprimi();
	 prof2.imprimi();
	 
	}
}


