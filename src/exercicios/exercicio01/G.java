package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Fa�a um algoritmo que leia dois n�meros e mostre: 
 *
 */

public class G {

	public static void main(String[] args) {
		// exercicio g - O primeiro elevado ao segundo n�mero. Ou Seja, o primeiro � a base e o segundo o expoente- inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um n�mero: ");
		int numeroLido = leia.nextInt();
		System.out.println();
		System.out.print("digite um n�mero: ");
		int numeroLido2 = leia.nextInt();
		double resultado =Math.pow(numeroLido, numeroLido2);
		
		System.out.println("o resultado �: " +resultado);

		// exercicio g - O primeiro elevado ao segundo n�mero. Ou Seja, o primeiro � a base e o segundo o expoente - fim

	}
}