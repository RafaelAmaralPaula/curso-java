package com.lovelacetecnologia.objetosThis;

public class ExemploThis {

	public static void main(String[] args) {
		
		TesteThis carro = new TesteThis();
				
         carro.modelo = "Palio";
         
         System.out.println("Modelo antes : " + carro.modelo);
         
         carro.alterarModelo("Fiat");
         
         System.out.println("");
         
         System.out.println("Carro : " + carro.modelo);
         
		
		
	}

}
