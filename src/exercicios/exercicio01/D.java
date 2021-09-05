package exercicios.exercicio01;

import java.util.Scanner;
/**
 * 
 * Faça um algoritmo que leia dois números e mostre: d) A divisão do primeiro número pelo segundo; e) A raiz quadrada de
 * cada um deles; f) O quadrado de cada um dos dois números; g) O primeiro
 * elevado ao segundo número. Ou Seja, o primeiro é a base e o segundo o
 * expoente.
 *
 */

public class D {
	
	public static void main(String[] args) {
		// exercicio D - A divisão do primeiro número pelo segundo - inicio
				Scanner leia = new Scanner(System.in);
				System.out.print("digite um número: ");
				int numeroLido = leia.nextInt();
				System.out.print("digite um número: ");
				int numeroLido2 = leia.nextInt();
				int divisao = 0;
				divisao = numeroLido / numeroLido2;
				System.out.println("divisão: " + divisao);
				// exercicio D - A divisão do primeiro número pelo segundo - fim
		
		

}
}