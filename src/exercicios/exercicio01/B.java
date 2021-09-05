package exercicios.exercicio01;

import java.util.Scanner;

/**
 * 
 * Faça um algoritmo que leia dois números e mostre: 
 *
 */
public class B {

	public static void main(String[] args) {
		// exercicio B - A subtração dos dois números- inicio
		Scanner leia = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numeroLido = leia.nextInt();
		System.out.print("digite um número: ");
		int numeroLido2 = leia.nextInt();
		int subtracao = 0;
		subtracao = numeroLido - numeroLido2;
		System.out.println("subtração: " + subtracao);
		// exercicio B - A subtração dos dois números- 	fim
	}

}