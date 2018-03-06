package com.lovelacetecnologia.classeabstratas;

public class ProdutoPerecivel extends Produto{

	 String dataValdade;
	
	public void imprimirDescricao() {
		
		System.out.println("-------------------------------------------------");
		System.out.println("DESCRIÇÃO -> " + super.getDescricao());
		System.out.println("VENCIMENTO -> " + dataValdade);
		
	}

}
