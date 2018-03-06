package com.lovelacetecnologia.javabean;

public class TesteJavaBean {

	public static void main(String[] args) {

		PesssoaBean p1 = new PesssoaBean();

		p1.setNome("Rafael Amaral");
		p1.setIdade(16);
		p1.setEmail("contato@teste.com");

		System.out.println(p1.getNome() + " tem " + p1.getIdade() + " ano .");

	}

}
