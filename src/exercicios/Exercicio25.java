package exercicios;

import java.util.Scanner;

/**
 25 - Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6.A soma das duas médias.A média das médias.

 * 
 */

public class Exercicio25 {

	public static void main(String[] args) {
	
		double mediaAritmetica1 = (8+9+7)/3;
		double mediaAritmetica2 = (4+5+6)/3;
		double somaDasMedias = mediaAritmetica1+mediaAritmetica2;
		double mediaDasMedias = somaDasMedias/2;
		
		System.out.println("A média aritmética dos números 8, 9 e 7 é: " +mediaAritmetica1);
		System.out.println();
		System.out.println("A média aritmética dos números 4, 5 e 6 é: "  +mediaAritmetica2);
		System.out.println();
		System.out.println("A soma das duas médias é: " +somaDasMedias);
		System.out.println();
		System.out.println("A média das médias é: " +mediaDasMedias);
		
		
	}
}