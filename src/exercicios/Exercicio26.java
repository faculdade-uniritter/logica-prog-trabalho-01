package exercicios;

import java.util.Scanner;

/**
 * 26 - Informar tr�s n�meros inteiros e imprimir a m�dia.
 * 
 */

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o n�mero inteiro 1: ");
		int valor1 = leia.nextInt();

		System.out.print("Digite o n�mero inteiro 2: ");
		int valor2 = leia.nextInt();

		System.out.print("Digite o n�mero inteiro 3: ");
		int valor3 = leia.nextInt();

		double soma = valor1 + valor2 + valor3;

		double media = soma / 3;

		System.out.print("A m�dia dos n�meros ser�: " + media);

	}
}