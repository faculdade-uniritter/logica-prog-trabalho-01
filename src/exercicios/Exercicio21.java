package exercicios;

import java.util.Scanner;

/**
 * 21 – Faça um algoritmo que receba o peso de uma pessoa em Kg, e mostre: a) O
 * novo peso se essa pessoa engordar 15%; b) O novo peso se essa pessoa
 * emagrecer 20%;
 * 
 */

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite o seu peso: ");
		double peso = leia.nextDouble();
		double pesoEngorda = 0.15;
		double totalPesoEngorda = peso * pesoEngorda;
		double novoPesoEngorda = peso + totalPesoEngorda;
		double pesoEmagrece = 0.2;
		double totalPesoEmagrece = peso * pesoEmagrece;
		double novoPesoEmagrece = peso - totalPesoEmagrece;

		
		System.out.println("Peso atual: " + peso);
		System.out.println("Peso engorda: " +novoPesoEngorda);
		System.out.println("Peso emagrece: " + novoPesoEmagrece);

	}
}