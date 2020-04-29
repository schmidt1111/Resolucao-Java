package com.youtube.dojo.java;

public class CFParaSeBreak1 {
	public static void main(String[] args) {
		
		double valortotal = 3000;
		for(int parcela = (int) valortotal; parcela >=1; parcela --) {
			double valorparcela = valortotal / parcela;
			
			if (valorparcela <= 1000) {
				continue;
			}
			System.out.println("Parcela " + parcela + "R$ " + valorparcela);
			System.out.println("CODIGO CONSUMINDO MEMORIA");
		}
	}

}
