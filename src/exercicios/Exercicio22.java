package exercicios;

import java.util.Scanner;

/**
 * 22 � Fa�a um programa que receba o valor do sal�rio m�nimo e o valor do sal�rio de um
funcion�rio, calcule e mostre a quantidade de sal�rios m�nimos que ganha esse funcion�rio.
 * 
 */

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite o valor do sal�rio m�nimo: ");
		double salarioMinimo = leia.nextDouble();
		
		System.out.print("Digite o sal�rio de um funcion�rio: ");
		double salarioFuncionario = leia.nextDouble();
		
		double quantidadeSalarios = salarioFuncionario/salarioMinimo;
		
		System.out.print("A quantidade de Sal�rios M�nimos que ganha esse funcion�rio �: " +quantidadeSalarios);
		
		
		
	}
}