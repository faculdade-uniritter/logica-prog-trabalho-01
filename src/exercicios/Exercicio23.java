package exercicios;

import java.util.Scanner;

/**
 23 � Uma determinada empresa paga a seus funcion�rios um sal�rio de R$ 200,00 . Esta
empresa determinou que ser� dado um aumento de 20% para todos os funcion�rios.
Calcule o sal�rio reajustado dos funcion�rios.
 * 
 */

public class Exercicio23 {

	public static void main(String[] args) {
	
		double salarioAtual = 200;
		double aumentoSalarial = 0.2;
		double reajusteSalarial = salarioAtual*aumentoSalarial;
		double novoSalario = salarioAtual+reajusteSalarial;
		
		System.out.println("O sal�rio atual dos funcion�rios da empresa �: " +salarioAtual);
		System.out.println();
		System.out.println("Ocorreu um aumento salarial de 20% para todos os funcion�rio: " +reajusteSalarial);
		System.out.println();
		System.out.println("O novo sal�rio dos funcion�rios ser�: " +novoSalario);
		
		
		
	}
}