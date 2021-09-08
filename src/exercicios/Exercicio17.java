package exercicios;

import java.util.Scanner;

/**
 * 17 – Faça um algoritmo que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.

 * 
 */

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Tempo do evento: ");
		int tempoEvento = leia.nextInt();

		int segundosPorHora = 60 * 60;
		int horas = tempoEvento / segundosPorHora;
		int horasEmSegundos = horas * segundosPorHora;

		int segundosPorMinuto = 60;
		int saldoEmSegundos = tempoEvento - (horas * segundosPorHora);
		int minutos = saldoEmSegundos / segundosPorMinuto;
		int minutosEmSegundos = minutos * segundosPorMinuto;

		int segundos = tempoEvento - horasEmSegundos - minutosEmSegundos;

		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

	

	}
}