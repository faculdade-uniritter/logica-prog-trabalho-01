package exercicios;

import java.util.Scanner;

/**
 * 27 - Ler um número inteiro e imprimir seu quadrado.
 * 
 */

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		
		int valor1 = leia.nextInt();
		
		double valorQuadradro = valor1*valor1;
				
		System.out.print("O valor quadrado do número é: " +valorQuadradro);
		
		double valorQuadrado = leia.nextDouble();
		
		
	}
}