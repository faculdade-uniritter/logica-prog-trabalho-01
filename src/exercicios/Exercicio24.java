package exercicios;

import java.util.Scanner;

/**
 24 – Um consumidor comprou um televisor de 16 polegadas numa determinada loja, o
valor do televisor era de R$ 350,00 em 3 vezes, na compra a vista era fornecido um
desconto de 15%. O consumidor optou pela compra à vista, calcule o valor que ela pagou
pelo televisor.

 * 
 */

public class Exercicio24 {

	public static void main(String[] args) {
	
		double valorTelevisorParcelado = 350;
		double descontoAvista = 0.15;
		double valorComDesconto = valorTelevisorParcelado*descontoAvista;
		double novoValorTelevisor = valorTelevisorParcelado-valorComDesconto;
		
		System.out.println("O valor de um televisor, 16 polegadas, parcelado em 3X é: " +valorTelevisorParcelado);
		System.out.println();
		System.out.println("Em compras à vista é possível fornecer desconto de 15%: " +valorComDesconto);
		System.out.println();
		System.out.println("O valor do televisor com desconto ficará: " +novoValorTelevisor);
		
		
		
	}
}