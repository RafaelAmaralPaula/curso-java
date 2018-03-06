package com.lovelacetecnologia.objetosThis;

public class TesteThis {

	String fabricante;
	String modelo;
	String cor;
	int anoFabricacao;
	boolean biCombustivel;
	Proprietario proprietario;
	
	
	void ligar () {
		
		if(modelo != null) {
			
			System.out.println("Ligando Carro : " + modelo);
		}
		
	}
	
   void alterarModelo(String modelo) {
	   
	 if( modelo != null) {
		 
		 this.modelo = modelo;
		 
	 }
   }
	
	
	
}
