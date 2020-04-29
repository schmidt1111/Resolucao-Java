package com.youtube.dojo.java.model;

public class Studant {
	private String nome;
	private int idade;
	private double [] notas;
	private boolean aprovado;  //não tem set para nao haver perigo de mudarem a logica e o metodo get é IS(só para boolean)
	
	
	public void print() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: "+ this.idade);
		
		for(double nota : this.notas) {
		System.out.println(nota);
		}
		System.out.println("Notas: " + this.notas);
	}

	public void  tirarMedia() {
		if(notas == null) {
			System.out.println("Este aluno nao possui notas.");           //tratando a excessao se array for vazio
			return;
		}
		
		double media =0;
		for (double nota : this.notas) {
			media += nota;
		}
	media = media / notas.length;
	
	if (media > 6) {
		this.aprovado = true;
		System.out.println("Aprovado!");
		System.out.println("Media:"+ media);
		} else {
			this.aprovado = false;
	System.out.println("Reprovado!");
	System.out.println("Media: "+ media);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public boolean isAprovado() {
		return aprovado;
	}
}
