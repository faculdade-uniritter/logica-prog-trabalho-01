package exercicios;

import java.util.Scanner;

/**
 * 06 – Faça um algoritmo que leia quatro notas e mostra a média aritmética das mesmas.
 *
 */

public class Exercicio06 {

	public static void main(String[] args) {
		
		
	Scanner leia = new Scanner(System.in);
	System.out.print("Digite Nota1: ");
	int Nota1= leia.nextInt();
	System.out.print("Digite Nota2: ");
	int Nota2= leia.nextInt();
	System.out.print("Digite Nota3: ");
	int Nota3= leia.nextInt();	
	System.out.print("Digite Nota4: ");
	int Nota4= leia.nextInt();
	int Media= (Nota1+Nota2+Nota3+Nota4)/4;
	System.out.println("A média aritmética é: " +Media);	
	
		
		
				 
		
		

		

	}

}
