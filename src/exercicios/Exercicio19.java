package exercicios;

import java.util.Scanner;

/**
 * 19 – Faça um programa que receba o preço por litro de um combustível, a
 * quantidade de quilômetros por litro de um determinado carro, e a distância a
 * percorrer desejada.
 * 
 * Seu programa deverá exibir quantos litros serão necessários para percorrer
 * esta distância e quanto será gasto.
 * 
 * 
 * 
 */

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.print("Digite o preço por litro de combustível: ");
		double precoPorLitro  = leia.nextDouble(); 
		
		System.out.print("Digite a quantidade de quilômetros por litro: ");
		double quilometrosPorLitro  = leia.nextDouble(); 
		
		System.out.print("Digite a distância desejada: ");
		double distanciaDesejada  = leia.nextDouble(); 
		double litrosNecessarios = distanciaDesejada / quilometrosPorLitro;
		double valorGasto = litrosNecessarios*precoPorLitro;
		
		System.out.println("Total em Litros: " +litrosNecessarios);
		System.out.println("Total gasto: " +valorGasto);
		
		
		

		

	

	}
}