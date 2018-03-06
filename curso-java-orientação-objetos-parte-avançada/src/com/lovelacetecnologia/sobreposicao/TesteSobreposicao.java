package com.lovelacetecnologia.sobreposicao;

import java.util.Date;

public class TesteSobreposicao  {

	public static void main(String[] args) {
		
		ProdutoPerecivel perecivel = new ProdutoPerecivel();
		perecivel.descricao = "CAIXA DE FÓSFORO";
		perecivel.dataValidade = new Date();
		
		perecivel.identificar();

		
	}
	
}
