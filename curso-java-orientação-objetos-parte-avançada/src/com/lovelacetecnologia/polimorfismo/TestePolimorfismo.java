package com.lovelacetecnologia.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setSaldo(4000);
		
		TestePolimorfismo.imprimirSaldo(conta);
		
		
		//--------------------------------------------------
		
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		TestePolimorfismo.imprimirSaldo(contaCorrente);
		
		//--------------------------------------------------
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		TestePolimorfismo.imprimirSaldo(contaPoupanca);
		
		
	}

	public static void imprimirSaldo(Conta conta) {
		
		System.out.println("Saldo da conta : R$" + conta.getSaldo());
		
		if(conta instanceof ContaCorrente) {
			
			ContaCorrente cc = (ContaCorrente)conta;
			
			System.out.println("");
			
		}else if (conta instanceof ContaPoupanca) {
			
		}
		
		
		
	}
	
}
