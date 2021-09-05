package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Faça um algoritmo que leia dois números e mostre: 
 */

public class E {

	public static void main(String[] args) {
		// exercicio E - A raiz quadrada de cada um deles - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um número: ");
		int numeroLido2 = leia.nextInt();
		
		double raizquadradadadonumero1 = Math.sqrt(numeroLido);
		double raizquadradadanumero2 =Math.sqrt(numeroLido2);
		
		System.out.println("A RAIZ QUADRADADA DO 1º NUMERO FOI: " + raizquadradadadonumero1);
		System.out.println("A RAIZ QUADRADADA DO 2º NUMERO FOI: " + raizquadradadanumero2);
		
		

		// exercicio E - A raiz quadrada de cada um deles - fim

	}
}