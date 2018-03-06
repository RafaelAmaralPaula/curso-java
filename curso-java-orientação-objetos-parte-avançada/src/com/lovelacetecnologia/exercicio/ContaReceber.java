package com.lovelacetecnologia.exercicio;

public class ContaReceber extends Conta {

   public void cancelar() {
	   
	   super.cancelar();
	   
	   if(getValor() >= 50) {
		   
		   System.out.println("INFEZLIMENTE só permitiremos o cancelamento de contas a receber para contas abaixo desse valor");
	   }
	   
   }
	
}
