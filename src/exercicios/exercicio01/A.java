package exercicios.exercicio01;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia dois números e mostre:
 *
 */
public class A {

	public static void main(String[] args) {
		// exercicio A - A soma dos dois números - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um número: ");
		int numeroLido2 = leia.nextInt();
		int soma = 0;
		soma = numeroLido + numeroLido2;
		System.out.println("soma é:" + soma);
		// exercicio A - A soma dos dois números - fim
	}

}