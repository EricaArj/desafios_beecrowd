package Exercicios;

import java.util.Scanner;

public class ValidacaoNota {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2;
		double media = 0;

		do {
			System.out.println("Digite a 1° nota: ");
			nota1 = leia.nextDouble();
			
			if (nota1 >= 0 && nota1 <= 10) {
				System.out.println("Digite a 2° nota: ");
				nota2 = leia.nextDouble();
				if (nota2 >= 0 && nota2 <= 10) {
					media = (nota1 + nota2) / 2;
					System.out.println("Média = " + media);
				} else
					System.out.println("Nota inválida");
			} else
				System.out.println("Nota inválida");
		} while (media == 0);
		leia.close();
	}

}