package exercicios;

import java.util.Scanner;

/**
 * 18 - O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 


Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo que
leia o custo de f�brica de um carro e escreva o custo ao consumidor.


 * 
 */

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		
		double percentagemDistribuidor = 0.28;
		double impostosFabrica = 0.45;
		
		System.out.print("Custo de F�brica de um carro �: ");
		double custoFabrica  = leia.nextDouble();
		
		
		double custoComPercentDistribuido = custoFabrica * percentagemDistribuidor;  
		double custoComPercentImpostoFabrica = custoFabrica * impostosFabrica;
		double custoConsumidor = custoFabrica + custoComPercentDistribuido + custoComPercentImpostoFabrica;
		
		System.out.print("Custo ao Consumidor �: " + custoConsumidor);
		
		
		

		

	

	}
}