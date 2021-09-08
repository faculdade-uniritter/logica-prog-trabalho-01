package exercicios;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia dois valores inteiros. Logo após troque os valores entre
estas variáveis. 
 */

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int valor1 = leia.nextInt();
		System.out.print("Digite o valor 2: ");
		int valor2 = leia.nextInt();
		
		int guardaV1 = valor1;
		valor1 = valor2;
		valor2 = guardaV1;
		
		System.out.println("Valor 1 é: " + valor1);
		System.out.println("Valor 2 é: " + guardaV1);
	
		

	}

}
