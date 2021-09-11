package exercicios;

import java.util.Scanner;

/**
 * 28 - Informar dois valores e imprimir o primeiro com um reajuste de 10% e o
 * segundo com 1%de reajuste.
 * 
 * 
 */

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o valor 1: ");

		double valor1 = leia.nextDouble();
		double reajusteValor1 = valor1 * 0.1;
		double novoValor1 = valor1 + reajusteValor1;

		System.out.print("Digite o valor 2: ");

		double valor2 = leia.nextDouble();
		double reajusteValor2 = valor2 * 0.01;
		double novoValor2 = valor2 + reajusteValor2;

		System.out.println("O valor 1 informado foi: " + valor1);
		System.out.println("O valor 1 sofreu um reajuste de 10%: " + reajusteValor1);
		System.out.println("O valor 1 reajustado é: " + novoValor1);
		System.out.println("O valor 2 informado foi: " + valor2);
		System.out.println("O valor 2 sofreu um reajuste de 1%: " + reajusteValor2);
		System.out.println("O valor 2 reajustado é: " + novoValor2);

	}
}