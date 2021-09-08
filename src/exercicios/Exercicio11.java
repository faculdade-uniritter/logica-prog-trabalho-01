package exercicios;

import java.util.Scanner;

/**
 * 11 – Faça um programa que leia o Nome, Valor Hora e Total de Horas
 * Trabalhadas de um funcionário. Calcule e exiba: O salário bruto; O valor
 * doVale Transporte (6% do Salário Bruto); O desconto de Imposto de Renda (11%
 * do Salário Bruto); O salário líquido.
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
		System.out.println("O Salário Bruto é: " + salarioBruto);
		double valeTransporte = salarioBruto*0.06;
		System.out.println("O Desconto do Vale Transporte é: " + valeTransporte);
		double impostoRenda = salarioBruto*0.11;
		System.out.println("O Desconto do Imposto de Renda é: " +impostoRenda);
		double salarioLiquido = salarioBruto-valeTransporte-impostoRenda;
		System.out.println("O salário Líquido é: " +salarioLiquido);
		
		
	
		

	}

}
