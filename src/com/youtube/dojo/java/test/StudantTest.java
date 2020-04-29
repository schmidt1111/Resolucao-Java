package com.youtube.dojo.java.test;

import com.youtube.dojo.java.model.Studant;

public class StudantTest {
	public static void main(String[] args) {
		
		Studant studant = new Studant();
		studant.setNome("Ana Maria");
		studant.setIdade(15);
		studant.setNotas(new double[]{5.5,5.0,6.0});
		
		System.out.println("Nome do aluno:" + studant.getNome());
		
		studant.print();
		
		System.out.println("Valor da primeira nota:" + studant.getNotas()[0]);
		System.out.println("Valor da segunda nota:" + studant.getNotas()[1]);
		System.out.println("Valor da terceira nota:" + studant.getNotas()[2]);
		
		studant.tirarMedia();
		studant.isAprovado();
		
	}
}
