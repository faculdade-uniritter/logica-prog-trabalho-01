package exercicios;

import java.util.Scanner;

/**
 25 - Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
n�meros 4, 5 e 6.A soma das duas m�dias.A m�dia das m�dias.

 * 
 */

public class Exercicio25 {

	public static void main(String[] args) {
	
		double mediaAritmetica1 = (8+9+7)/3;
		double mediaAritmetica2 = (4+5+6)/3;
		double somaDasMedias = mediaAritmetica1+mediaAritmetica2;
		double mediaDasMedias = somaDasMedias/2;
		
		System.out.println("A m�dia aritm�tica dos n�meros 8, 9 e 7 �: " +mediaAritmetica1);
		System.out.println();
		System.out.println("A m�dia aritm�tica dos n�meros 4, 5 e 6 �: "  +mediaAritmetica2);
		System.out.println();
		System.out.println("A soma das duas m�dias �: " +somaDasMedias);
		System.out.println();
		System.out.println("A m�dia das m�dias �: " +mediaDasMedias);
		
		
	}
}