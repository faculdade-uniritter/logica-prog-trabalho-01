package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Faça um algoritmo que leia dois números e mostre: 
 *
 */
public class C {

	public static void main(String[] args) {
		// exercicio C - A multiplicação dos dois números - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um número: ");
		int numeroLido2 = leia.nextInt();
		int multiplicacao = 0;
		multiplicacao = numeroLido * numeroLido2;
		System.out.println("multiplicação: " + multiplicacao);
		// exercicio C - A multiplicação dos dois números - fim
	}
}