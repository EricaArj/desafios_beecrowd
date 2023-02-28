package Exercicios;

import java.util.Scanner;

public class SelecaoVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[100];
		
		
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Valor para a posição [" + indice + "]");
			vetor[indice] = leia.nextInt();
		}
		
		for(int contador = 0; contador < vetor.length; contador++) {
			if(vetor[contador] <= 10) {
				System.out.println("A[" + contador + "] = " + vetor[contador]);
			}
			
		}
	}

}