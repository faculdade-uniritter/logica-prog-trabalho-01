package exercicios;

import java.util.Scanner;

/**
 * 11 � Fa�a um programa que leia o Nome, Valor Hora e Total de Horas
 * Trabalhadas de um funcion�rio. Calcule e exiba: O sal�rio bruto; O valor
 * doVale Transporte (6% do Sal�rio Bruto); O desconto de Imposto de Renda (11%
 * do Sal�rio Bruto); O sal�rio l�quido.
 *
 */

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = leia.next();
		System.out.print("Digite o seu valor por Hora Trabalhada: ");
		double valorHora = leia.nextDouble();
		System.out.print("Digite o total de Horas Trabalhadas: ");
		double totalHoras = leia.nextDouble();
		double salarioBruto = valorHora * totalHoras;
		System.out.println("O Sal�rio Bruto �: " + salarioBruto);
		double valeTransporte = salarioBruto*0.06;
		System.out.println("O Desconto do Vale Transporte �: " + valeTransporte);
		double impostoRenda = salarioBruto*0.11;
		System.out.println("O Desconto do Imposto de Renda �: " +impostoRenda);
		double salarioLiquido = salarioBruto-valeTransporte-impostoRenda;
		System.out.println("O sal�rio L�quido �: " +salarioLiquido);
		
		
	
		

	}

}
