package exercicios.exercicio01;

import java.util.Scanner;

/**
 * Fa�a um algoritmo que leia dois n�meros e mostre:
 *
 */
public class A {

	public static void main(String[] args) {
		// exercicio A - A soma dos dois n�meros - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um n�mero: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um n�mero: ");
		int numeroLido2 = leia.nextInt();
		int soma = 0;
		soma = numeroLido + numeroLido2;
		System.out.println("soma �:" + soma);
		// exercicio A - A soma dos dois n�meros - fim
	}

}