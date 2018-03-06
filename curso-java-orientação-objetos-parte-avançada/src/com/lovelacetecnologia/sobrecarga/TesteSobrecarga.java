package com.lovelacetecnologia.sobrecarga;

public class TesteSobrecarga {

	public static void main(String[] args) {
		
		CadastroPessoa pessoa = new CadastroPessoa();
		
		Pessoa pessoa1 = new Pessoa("José " , 15);
		pessoa.cadastrar(pessoa1);
		
		
		//--------------------------------------------------------
		
		pessoa.cadastrar("Maria", 25);
		
		
		
		
	}
	
}
