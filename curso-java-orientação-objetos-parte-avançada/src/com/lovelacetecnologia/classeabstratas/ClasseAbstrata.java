package com.lovelacetecnologia.classeabstratas;

public class ClasseAbstrata {

	public static void main(String[] args) {

		Produto produtoPerecivel = new ProdutoPerecivel();
		produtoPerecivel.setDescricao("CAIXA DE LEITE");

		ProdutoPerecivel perecivel = (ProdutoPerecivel) produtoPerecivel;
		perecivel.dataValdade = "01/09/2018";

		produtoPerecivel.imprimirDescricao();
	}

}
