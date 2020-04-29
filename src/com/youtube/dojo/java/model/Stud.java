package com.youtube.dojo.java.model;

public class Stud {
private String matricula;
private String nome;
private double[] notas;
private String data;

public Stud(String matricula, String nome, double[] notas) {
	this.matricula = matricula;
	this.nome = nome;
	this.notas = notas;
}
public Stud(String matricula, String nome, double[] notas, String data) {
	this(matricula, nome, notas); //construtor só pode ser chamado em outro metodo construtor, sempre a primeira linha e não tem ponto depois do this
	this.data = data;
}
public Stud() {
	
}

public void imprime() {
	System.out.println(this.nome);
	System.out.println(this.matricula);
	for(double nota: notas) {
		System.out.println(nota + "");
	}
	System.out.println(this.data);
}

public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double[] getNotas() {
	return notas;
}
public void setNotas(double[] notas) {
	this.notas = notas;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}


}
