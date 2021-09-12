package exercicios;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia três valores reais e calcule x’ e x” de acordo com
 * a fórmula abaixo
 * 
 * x',x" = -b+- raizquadrada b²-4*a*c dividido 2*a
 * 
 * @see https://bhaskaracalculator.netlify.app/
 * 
 */

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o valor A: ");
		double valorA = leia.nextDouble();// 27

		System.out.print("Digite o valor B: ");
		double valorB = leia.nextDouble();// 48

		System.out.print("Digite o valor C: ");
		double valorC = leia.nextDouble();// 12

	
		double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;

		double x1 = -valorB + Math.sqrt(delta);
		x1 = x1 / (2 * valorA);

		double x2 = -valorB - Math.sqrt(delta);
		x2 = x2 / (2 * valorA);

		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);

	}

}
