package exercicios;

import java.util.Scanner;

/**
 * 13 – Algoritmo que receba o nome da pessoa, ano nascimento e ano atual e calcule e
mostre a idade da pessoa.

 */

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = leia.next();	
		System.out.print("Digite o ano do seu nascimento: ");
		double anoNascimento = leia.nextDouble();
		System.out.print("Digite o ano atual: ");
		double anoAtual = leia.nextDouble();
		double idade = anoAtual-anoNascimento;
		System.out.print("A sua idade é: " +idade);
		
		
	
		

	}

}
