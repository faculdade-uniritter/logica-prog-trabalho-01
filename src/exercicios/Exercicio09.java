package exercicios;

import java.util.Scanner;

/**
 * 09 – Faça um algoritmo que efetue as seguintes operações:
a) A vale 10;
b) B vale o dobro de A;
c) C vale a raiz quadrada do dobro de A;
d) D vale a metade da raiz quadrada do dobro de A;
e) E vale o cubo da metade da raiz quadrada do dobro de A;
f) F vale a terça parte do cubo da metade da raiz quadrada do dobro de A.

 *
 */

public class Exercicio09 {

	public static void main(String[] args) {
		
		
	double ValorA;
	ValorA=10;
	double ValorB;
	ValorB= ValorA*2;
	double ValorC;
	double raizquadrada = Math.sqrt(ValorB);
	double ValorD;	
	double metaderaizquadrada = Math.sqrt(ValorB)/2;
	double ValorE;
	double cuboraizquadrada = Math.pow(metaderaizquadrada, 3); 
	double tercapartecubo = Math.pow(metaderaizquadrada, 3)/3;
	

	System.out.println("O Valor A vale: " +ValorA);
	System.out.println("O Valor B vale: " +ValorB);
	System.out.println("O Valor C vale: " +raizquadrada);	
	System.out.println("O Valor D vale "  +metaderaizquadrada);	
	System.out.println("O Valor E vale "  +cuboraizquadrada);
	System.out.println("O Valor F vale "  +tercapartecubo);
	
	
	
	
		
		
				 
		
		

		

	}

}
