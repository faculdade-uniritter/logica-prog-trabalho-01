package exercicios.exercicio01;

import java.util.Scanner;
/**
 * 
 * Fa�a um algoritmo que leia dois n�meros e mostre: d) A divis�o do primeiro n�mero pelo segundo; e) A raiz quadrada de
 * cada um deles; f) O quadrado de cada um dos dois n�meros; g) O primeiro
 * elevado ao segundo n�mero. Ou Seja, o primeiro � a base e o segundo o
 * expoente.
 *
 */

public class D {
	
	public static void main(String[] args) {
		// exercicio D - A divis�o do primeiro n�mero pelo segundo - inicio
				Scanner leia = new Scanner(System.in);
				System.out.print("digite um n�mero: ");
				int numeroLido = leia.nextInt();
				System.out.print("digite um n�mero: ");
				int numeroLido2 = leia.nextInt();
				int divisao = 0;
				divisao = numeroLido / numeroLido2;
				System.out.println("divis�o: " + divisao);
				// exercicio D - A divis�o do primeiro n�mero pelo segundo - fim
		
		

}
}