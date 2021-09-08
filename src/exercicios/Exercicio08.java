package exercicios;

import java.util.Scanner;

/**
 * 08 – Dados 5 números, monte um algoritmo que permita obter como resultado a soma, o
produto e a média dos valores recebidos.
 *
 */

public class Exercicio08 {

	public static void main(String[] args) {
		
		
	int Valor1;
	int Valor2;
	int Valor3;
	int Valor4;
	int Valor5;
	
	
	Valor1=2;
	Valor2=4;
	Valor3=6;
	Valor4=8;
	Valor5=10;
	
	int Soma = Valor1+Valor2+Valor3+Valor4+Valor5;
	int Produto = Valor1*Valor2*Valor3*Valor4*Valor5;
	int Media = (Soma)/5;
	
	System.out.println ("A soma dos números é: " +Soma);
	System.out.println ("O produto dos números é: " +Produto);
	System.out.println ("A média dos números é: " +Media);
	
		
		
				 
		
		

		

	}

}
