package com.lovelacetecnologia.enumeracao;

public class TesteOperacao {

	public static void main(String[] args) {
		
		OperacaoAritmetica oa  = OperacaoAritmetica.ADICAO;
		
		int resultado = oa.operacao(5, 3);
		
		
		System.out.println("Resultado : " + resultado);
		
		System.out.println("");
		
		
		for(OperacaoAritmetica operacao : OperacaoAritmetica.values()) {
			
			System.out.println(operacao + " -> " + operacao.operacao(4, 2));
		}
		
	}
	
}
