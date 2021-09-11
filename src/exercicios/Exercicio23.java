package exercicios;

import java.util.Scanner;

/**
 23 – Uma determinada empresa paga a seus funcionários um salário de R$ 200,00 . Esta
empresa determinou que será dado um aumento de 20% para todos os funcionários.
Calcule o salário reajustado dos funcionários.
 * 
 */

public class Exercicio23 {

	public static void main(String[] args) {
	
		double salarioAtual = 200;
		double aumentoSalarial = 0.2;
		double reajusteSalarial = salarioAtual*aumentoSalarial;
		double novoSalario = salarioAtual+reajusteSalarial;
		
		System.out.println("O salário atual dos funcionários da empresa é: " +salarioAtual);
		System.out.println();
		System.out.println("Ocorreu um aumento salarial de 20% para todos os funcionário: " +reajusteSalarial);
		System.out.println();
		System.out.println("O novo salário dos funcionários será: " +novoSalario);
		
		
		
	}
}