package com.lovelacetecnologia.heranca;

public class Pessoa {

	protected String nome;
	protected  int idade;

	
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
	
	public void seApresentar() {
		
		System.out.println("Olá , eu sou o " + nome + " , e tenho idade " + idade + " anos ");
	}

}
