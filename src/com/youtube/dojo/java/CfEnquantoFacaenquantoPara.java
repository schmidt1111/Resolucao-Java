package com.youtube.dojo.java;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CfEnquantoFacaenquantoPara {
	public static void main(String[] args) {
		int contador = 7;
				//é validado (true) para ser executado
		while (contador < 10) {
			System.out.println(contador++);  //contador + 1 = incrementado direto no contador print
			System.out.println("primeiro");
			//contador ++;
		}
							//é executado uma vez e depois validado
		do {											//sabe quantas vezes quer executar
			System.out.println("Dentro do do while");
		}while (contador < 10); {
		System.out.println(contador++);
		System.out.println("segundo");
		}

	for (int i = 0; i<10; i++) {
		System.out.println("O valor de i é: "+ i);
	}
	
	}
}
