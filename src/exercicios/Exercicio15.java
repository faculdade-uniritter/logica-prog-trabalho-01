package exercicios;

import java.util.Scanner;

/**
 * 15 – Faça um algoritmo que leia um valor inteiro equivalente a um determinado
 * valor em segundos. Retorne quantas horas, minutos e segundos são compostos
 * por este valor. Por exemplo o valor 3670 (segundos) formaria 1 hora, 1 minuto
 * e 10 segundos.
 * 
 */

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int valorLido = leia.nextInt();

		int segundosPorHora = 60 * 60;
		int horas = valorLido / segundosPorHora;
		int horasEmSegundos = horas * segundosPorHora;

		int segundosPorMinuto = 60;
		int saldoEmSegundos = valorLido - (horas * segundosPorHora);
		int minutos = saldoEmSegundos / segundosPorMinuto;
		int minutosEmSegundos = minutos * segundosPorMinuto;

		int segundos = valorLido - horasEmSegundos - minutosEmSegundos;

		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

	}

}