package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Fa�a um algoritmo que leia dois n�meros e mostre: 
 *
 */
public class B {

	public static void main(String[] args) {
		// exercicio B - A subtra��o dos dois n�meros- inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um n�mero: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um n�mero: ");
		int numeroLido2 = leia.nextInt();
		int subtracao = 0;
		subtracao = numeroLido - numeroLido2;
		System.out.println("subtra��o: " + subtracao);
		// exercicio B - A subtra��o dos dois n�meros- 	fim
	}

}