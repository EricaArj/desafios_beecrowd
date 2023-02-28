package Exercicios;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for(int contador = 1; contador <= numero; contador ++) {
			System.out.print(contador + "\s");
			System.out.print(contador * contador + "\s");
			System.out.print((contador * contador * contador) + "\n\n");
		}

	}

}
