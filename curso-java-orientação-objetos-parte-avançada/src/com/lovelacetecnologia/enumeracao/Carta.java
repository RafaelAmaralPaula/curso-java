package com.lovelacetecnologia.enumeracao;

public class Carta {

	private int numero;
	private Naipe naipe;

	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
	public void imprimir() {
		System.out.println("Sou "+ naipe + " de " + numero  + " e tenho cor " + naipe.getCor() );
		
	}

}
