package exercicios;

import java.util.Scanner;

/**
 * Elaborar um programa que leia tr�s valores (A, B e C) e apresente como resultado final
a soma dos quadrados dos tr�s valores lidos.
 *
 */

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o ValorA: ");
		int valorA = leia.nextInt();
		double quadradoValorA = Math.pow(valorA, 2);
		System.out.print("O quadrado do Valor A �: " +quadradoValorA);
		System.out.println();
		System.out.print("Digite o ValorB: ");
		int valorB = leia.nextInt();
		double quadradoValorB = Math.pow(valorB, 2);
		System.out.print("O quadrado do Valor B �: " +quadradoValorB);
		System.out.println();
		System.out.print("Digite o ValorC: ");
		int valorC = leia.nextInt();
		double quadradoValorC = Math.pow(valorC, 2);
		System.out.print("O quadrado do Valor C �: " +quadradoValorC);
		System.out.println();
		double Soma = quadradoValorA+quadradoValorB+quadradoValorC;
		System.out.print("A soma dos quadrados do Valor A, Valor B e Valor C �: " +Soma);

	}

}
