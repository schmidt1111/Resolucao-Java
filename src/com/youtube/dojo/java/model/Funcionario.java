package com.youtube.dojo.java.model;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	public Funcionario(String nome) {  //metodo construtor 
		this.nome = nome;
	}
	public Funcionario() {
		
	}
	public Funcionario(String nome, String cpf, double salario, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}
/*
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public void init(String nome, String cpf, double salario, String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}*/
	
	public void imprimi() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.salario);
		System.out.println(this.rg);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}
