package exercicios;

import java.util.Scanner;

/**
 *20 � Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as vendas. 
Fa�a um programa que receba o sal�rio fixo de um funcion�rio e o valor de suas vendas, calcule e
mostre a comiss�o e o sal�rio final do funcion�rio.

 * 
 */

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	
		double comissao = 0.04;
		
		
		System.out.print("Digite o sal�rio fixo: ");
		double salario = leia.nextDouble(); 
		
		System.out.print("Digite o valor das vendas: ");
		double valorVendas  = leia.nextDouble(); 
		
		double salarioFixo  = salario*comissao;
		double salarioFinal = salario+salarioFixo;

		System.out.println("Comiss�o �: " + salarioFixo);
		System.out.println("Sal�rio Final �: " +salarioFinal);
		
		
		

		

	

	}
}