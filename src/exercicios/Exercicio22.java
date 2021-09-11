package exercicios;

import java.util.Scanner;

/**
 * 22 – Faça um programa que receba o valor do salário mínimo e o valor do salário de um
funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
 * 
 */

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite o valor do salário mínimo: ");
		double salarioMinimo = leia.nextDouble();
		
		System.out.print("Digite o salário de um funcionário: ");
		double salarioFuncionario = leia.nextDouble();
		
		double quantidadeSalarios = salarioFuncionario/salarioMinimo;
		
		System.out.print("A quantidade de Salários Mínimos que ganha esse funcionário é: " +quantidadeSalarios);
		
		
		
	}
}