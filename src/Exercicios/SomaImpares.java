package Exercicios;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2;
		int impares = 0;
		
		System.out.println("Digite o 1° número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o 2° número: ");
		numero2 = leia.nextInt();
		
		if(numero1 < numero2) {
			for (int contador = numero1 + 1; contador < numero2; contador++) {
				if (contador % 2 != 0) {
					impares += contador;
					}
			}
		}else {
			for (int contador = numero2 + 1; contador < numero1; contador++) {
				if (contador % 2 != 0) {
					impares += contador;
					
				}
			}
		}
		System.out.println(impares);
		leia.close();
		
	}

}