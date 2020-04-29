package com.youtube.dojo.java;

public class CFSeifsesenao {
	public static void main (String[] args) {
		/*idade < 15                categoria infantil
		 * idade >=15 && idade < 18            juvenil
		 * idade >= 18                          adulto 		 */
	
		int idade = 12;
		String categoria;

		if (idade < 15) {
			categoria = " Categoria Infantil.";
			
		} else if (idade >= 15 && idade < 18) {
			categoria = " Categoria juvenil.";

		} else {
			categoria = "Categoria adulto.";
		}
		System.out.println(categoria);
	}
}
