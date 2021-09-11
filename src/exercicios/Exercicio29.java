package exercicios;

import java.util.Scanner;

/**
 *29 - Ler uma temperatura em graus Celsius e transformá-la em graus Fahrenheit.
Formula: F = (9*C+160)/5
 * 
 */

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		float temperaturaCelsius = leia.nextFloat();
		
		float temperaturaFahrenheit = ( 9 * temperaturaCelsius + 160 ) / 5;
			
		System.out.print("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);
		temperaturaCelsius = leia.nextFloat();
		
		leia.close();
	}
}