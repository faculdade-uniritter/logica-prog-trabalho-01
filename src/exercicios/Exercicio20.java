package exercicios;

import java.util.Scanner;

/**
 *20 – Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e
mostre a comissão e o salário final do funcionário.

 * 
 */

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	
		double comissao = 0.04;
		
		
		System.out.print("Digite o salário fixo: ");
		double salario = leia.nextDouble(); 
		
		System.out.print("Digite o valor das vendas: ");
		double valorVendas  = leia.nextDouble(); 
		
		double salarioFixo  = salario*comissao;
		double salarioFinal = salario+salarioFixo;

		System.out.println("Comissão é: " + salarioFixo);
		System.out.println("Salário Final é: " +salarioFinal);
		
		
		

		

	

	}
}