package com.lovelacetecnologia.heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Jogador j = new Jogador();
		Tecnico t = new Tecnico();
		
		j.setNome("Leonel Messi");
		j.setIdade(29);
		
		t.setNome("Titi");
		t.setIdade(56);
		
		j.seApresentar();
		t.seApresentar();
		
		j.dizerSeAindaJoga();
		
		
		
	}
}
