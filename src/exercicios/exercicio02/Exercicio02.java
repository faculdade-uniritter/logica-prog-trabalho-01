package exercicios.exercicio02;

import java.util.Scanner;

/**
 * Elaborar um programa que leia três valores do tipo inteiro (A, B e C) e
 * apresente como o resultado final o quadrado da soma dos três valores lidos
 *
 */

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o ValorA: ");
		int valorA = leia.nextInt();
		System.out.print("Digite o ValorB: ");
		int valorB = leia.nextInt();
		System.out.print("Digite o ValorC: ");
		int valorC = leia.nextInt();
		double Soma = valorA + valorB + valorC;
		System.out.print("A soma do valor A, valor B e valor C é: " + Soma);
		System.out.print("O quadrado da soma do valor A, valor B e valor C é: " + Math.pow(Soma, 2));

	}

}
