package exercicios;

import java.util.Scanner;

/**
 * 27 - Ler um n�mero inteiro e imprimir seu quadrado.
 * 
 */

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro: ");
		
		int valor1 = leia.nextInt();
		
		double valorQuadradro = valor1*valor1;
				
		System.out.print("O valor quadrado do n�mero �: " +valorQuadradro);
		
		double valorQuadrado = leia.nextDouble();
		
		
	}
}