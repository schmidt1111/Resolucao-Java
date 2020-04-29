package com.youtube.dojo.java;

public class CFParaSeSenao1 {
	public static void main(String[] args) {
		
		double valortotal =3000;
		
		for (int parcela =1; parcela <= valortotal; parcela++) {
			double valorParcela = valortotal / parcela;
				
				if (valorParcela >=1000) {
					System.out.println("Parcela " + parcela + " R$" + valorParcela);
				} else {
					System.out.println("Saindo do laço");
					
				}
				System.out.println("Fora do laço");
			
				
				/*codigo mais limpo mudando a logica
				 * if(valorParcela < 1000 ){
				 * break; 
				 * } */

		}
		
		
	}
}
