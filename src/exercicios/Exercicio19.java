package exercicios;

import java.util.Scanner;

/**
 * 19 � Fa�a um programa que receba o pre�o por litro de um combust�vel, a
 * quantidade de quil�metros por litro de um determinado carro, e a dist�ncia a
 * percorrer desejada.
 * 
 * Seu programa dever� exibir quantos litros ser�o necess�rios para percorrer
 * esta dist�ncia e quanto ser� gasto.
 * 
 * 
 * 
 */

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.print("Digite o pre�o por litro de combust�vel: ");
		double precoPorLitro  = leia.nextDouble(); 
		
		System.out.print("Digite a quantidade de quil�metros por litro: ");
		double quilometrosPorLitro  = leia.nextDouble(); 
		
		System.out.print("Digite a dist�ncia desejada: ");
		double distanciaDesejada  = leia.nextDouble(); 
		double litrosNecessarios = distanciaDesejada / quilometrosPorLitro;
		double valorGasto = litrosNecessarios*precoPorLitro;
		
		System.out.println("Total em Litros: " +litrosNecessarios);
		System.out.println("Total gasto: " +valorGasto);
		
		
		

		

	

	}
}