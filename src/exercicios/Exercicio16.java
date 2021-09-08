package exercicios;

import java.util.Scanner;

/**
 * 16 – Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses
 * e dias e mostre-a expressa apenas em dias.
 * 
 */

public class Exercicio16 {

	public static void main(String[] args) {

		int diasDoAno = 365;
		int diasDoMes = 30;
		
		System.out.println("Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.");
		
		Scanner leia = new Scanner(System.in);
		System.out.println("");

		System.out.print("Digite anos: ");
		int ano = leia.nextShort(); // 35

		System.out.print("Digite meses: ");
		int mes = leia.nextShort(); // 5

		System.out.print("Digite dias: ");
		int dia = leia.nextShort(); // 15

		int anosConvertidosEmDias = ano * diasDoAno;
		int mesesConvertidosEmDias = mes * diasDoMes;
		int dias = anosConvertidosEmDias + mesesConvertidosEmDias + dia;

		System.out.println("É: " + dias);

	}
}