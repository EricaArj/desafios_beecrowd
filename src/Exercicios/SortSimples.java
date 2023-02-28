package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[3];
		
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetor[indice] = leia.nextInt();
		}
		
		Arrays.sort(vetor);
		
		for(var numero : vetor)
			System.out.println(numero);
		
	}

}