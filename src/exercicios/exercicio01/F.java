package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Faça um algoritmo que leia dois números e mostre: 
 * 
 * 
 */

public class F {

	public static void main(String[] args) {
		// exercicio f - o quadrado de cada um dos dois números - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numeroLido = leia.nextInt();
		double quadradoNumeroDigitado1 = Math.pow(numeroLido, 2);
		System.out.println("o quadrado é:" +quadradoNumeroDigitado1);
		System.out.println();
		System.out.print("digite um número: ");
		int numeroLido2 = leia.nextInt();
		double quadradoNumeroDigitado2 = Math.pow(numeroLido2, 2);
		System.out.println("o quadrado é:" +quadradoNumeroDigitado2);	
		

		// exercicio f - o quadrado de cada um dos dois números - fim

	}
}