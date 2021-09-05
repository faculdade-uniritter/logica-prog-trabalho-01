package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Faça um algoritmo que leia dois números e mostre: 
 *
 */

public class G {

	public static void main(String[] args) {
		// exercicio g - O primeiro elevado ao segundo número. Ou Seja, o primeiro é a base e o segundo o expoente- inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numeroLido = leia.nextInt();
		System.out.println();
		System.out.print("digite um número: ");
		int numeroLido2 = leia.nextInt();
		double resultado =Math.pow(numeroLido, numeroLido2);
		
		System.out.println("o resultado é: " +resultado);

		// exercicio g - O primeiro elevado ao segundo número. Ou Seja, o primeiro é a base e o segundo o expoente - fim

	}
}