package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Fa�a um algoritmo que leia dois n�meros e mostre: 
 *
 */
public class C {

	public static void main(String[] args) {
		// exercicio C - A multiplica��o dos dois n�meros - inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um n�mero: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um n�mero: ");
		int numeroLido2 = leia.nextInt();
		int multiplicacao = 0;
		multiplicacao = numeroLido * numeroLido2;
		System.out.println("multiplica��o: " + multiplicacao);
		// exercicio C - A multiplica��o dos dois n�meros - fim
	}
}