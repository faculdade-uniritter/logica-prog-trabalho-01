package exercicios;

import java.util.Scanner;

/**
 *14 – Faça um algoritmo que receba o nome, o valor e o valor de desconto de um
determinado produto. Mostre o nome, valor do produto, o valor de desconto e valor a
pagar.

 */

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = leia.next();	
		
		
		
		
		System.out.print("Digite o valor do produto: ");
		double valorProduto = leia.nextDouble();
		
		
		System.out.print("Digite o valor de desconto do produto: ");
		double valorDesconto = leia.nextDouble();
		
		
		System.out.println("O nome do produto é: " +nomeProduto);
		
		System.out.println("O valor produto é: " +valorProduto);
		
		System.out.println("O valor de desconto do produto é: " +valorDesconto);
		
		
		double valorLiquido = valorProduto-valorDesconto;
		System.out.println("O valor a pagar é: " +valorLiquido);
		
		
	
		

	}

}
