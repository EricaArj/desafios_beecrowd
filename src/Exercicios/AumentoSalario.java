package Exercicios;

import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double salarioAtual, salarioNovo;

		System.out.println("Digite seu salério atual: ");
		salarioAtual = leia.nextDouble();

		if (salarioAtual <= 400) {
			salarioNovo = salarioAtual + (salarioAtual * 0.15);
			System.out.println("Novo salério: " + salarioNovo);
			System.out.println("Reajuste ganho: " + (salarioNovo - salarioAtual));
			System.out.println("Em percentual: 15%");
		}

		if (salarioAtual >= 400.01 && salarioAtual <= 800) {
			salarioNovo = salarioAtual + (salarioAtual * 0.12);
			System.out.println("Novo salério: " + salarioNovo);
			System.out.println("Reajuste ganho: " + (salarioNovo - salarioAtual));
			System.out.println("Em percentual: 12%");
		}

		if (salarioAtual >= 800.01 && salarioAtual <= 1200) {
			salarioNovo = salarioAtual + (salarioAtual * 0.10);
			System.out.println("Novo salério: " + salarioNovo);
			System.out.println("Reajuste ganho: " + (salarioNovo - salarioAtual));
			System.out.println("Em percentual: 10%");
		}

		if (salarioAtual >= 1200.01 && salarioAtual <= 2000) {
			salarioNovo = salarioAtual + (salarioAtual * 0.07);
			System.out.println("Novo salério: " + salarioNovo);
			System.out.println("Reajuste ganho: " + (salarioNovo - salarioAtual));
			System.out.println("Em percentual: 7%");
		}

		if (salarioAtual >= 2000.01) {
			salarioNovo = salarioAtual + (salarioAtual * 0.04);
			System.out.println("Novo salério: " + salarioNovo);
			System.out.println("Reajuste ganho: " + (salarioNovo - salarioAtual));
			System.out.println("Em percentual: 4%");
		}
		leia.close();

	}

}