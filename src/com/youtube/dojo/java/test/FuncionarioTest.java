package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Funcionario;

public class FuncionarioTest {
public static void main(String[] args) {
	//Funcionario funcionario = new Funcionario(""); //pode passar até vazio desde que seja uma string, 
	//funcionario.init("Chica da silva", "111111111111", 5.700, "222222222222");
	
	Funcionario funcionario = new Funcionario ("Chica da silva", "111111111111", 5.700, "222222222222");
	Funcionario funcionarios = new Funcionario ();
	funcionario.imprimi();
	funcionarios.imprimi();
	
	//  Metodo init faz a funçao em uma linha
	//funcionario.setNome("Chica da Silva");
	//funcionario.setCpf("11111111111");
	//funcionario.setSalario(5.500);
	
	
}
}
