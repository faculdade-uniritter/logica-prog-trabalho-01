package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Fa�a um algoritmo que leia dois n�meros e mostre: 
 */

public class E {

	public static void main(String[] args) {
		// exercicio E - A raiz quadrada de cada um deles - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um n�mero: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um n�mero: ");
		int numeroLido2 = leia.nextInt();
		
		double raizquadradadadonumero1 = Math.sqrt(numeroLido);
		double raizquadradadanumero2 =Math.sqrt(numeroLido2);
		
		System.out.println("A RAIZ QUADRADADA DO 1� NUMERO FOI: " + raizquadradadadonumero1);
		System.out.println("A RAIZ QUADRADADA DO 2� NUMERO FOI: " + raizquadradadanumero2);
		
		

		// exercicio E - A raiz quadrada de cada um deles - fim

	}
}