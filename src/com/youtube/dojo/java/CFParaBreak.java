package com.youtube.dojo.java;

public class CFParaBreak {
public static void main(String[] args) {
		
		double valortotal =3000;
		
		for (int parcela =1; parcela <= valortotal; parcela++) {
			double valorParcela = valortotal / parcela;
				
			if(valorParcela < 1000 ){
					break; 
				}
			System.out.println("Parcela " + parcela + " R$" + valorParcela);

				System.out.println("Fora do laço");
			}
		}
}