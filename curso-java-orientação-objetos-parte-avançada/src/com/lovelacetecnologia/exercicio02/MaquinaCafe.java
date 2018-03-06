package com.lovelacetecnologia.exercicio02;

public class MaquinaCafe {

	private int acucarDisponivel;

	public int getAcucarDisponivel() {
		return acucarDisponivel;
	}

	public void setAcucarDisponivel(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}

	public void fazerCafe(int quantidadeAcucar) {

		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente para fazer seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");

		}
		
	public void fazerCafe() {
		
		if(acucarDisponivel < 10) {
			
			System.out.println("Não há açucar suficiente para fazer seu café.");
			
		}else {
			
			acucarDisponivel -= 10;
			System.out.println("Fazendo cafezinho com 10 gramas de açucar.");	
			
			}
			
		}
		
	}

}
