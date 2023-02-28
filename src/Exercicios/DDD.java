package Exercicios;

import java.util.Scanner;

public class DDD {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int ddd;

		System.out.println("Digite o DDD: ");
		ddd = leia.nextInt();

		switch (ddd) {
		case 98:
			System.out.println("Maranhão");
			break;
		case 11:
			System.out.println("São Paulo");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD não cadastrado");
		}

		leia.close();

	}

}