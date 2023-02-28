package Exercicios;

import java.util.Scanner;

public class TiposDeTriangulos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double n1, n2, n3, x;

		System.out.println("Digite um número: ");
		n1 = leia.nextDouble();

		System.out.println("Digite um número: ");
		n2 = leia.nextDouble();

		System.out.println("Digite um número: ");
		n3 = leia.nextDouble();

		if (n1 < n2) {
			x = n1;
			n1 = n2;
			n2 = x;
		}
		if (n2 < n3) {
			x = n2;
			n2 = n3;
			n3 = x;
		}
		if (n1 < n2) {
			x = n1;
			n1 = n2;
			n2 = x;
		}

		if (n1 >= n2 && n1 >= n3) {
			if (n1 >= (n2 + n3)) {
				System.out.println("NAO FORMA TRIANGULO");
				System.exit(0);
			}
			if ((n1 * n1) == (n2 * n2) + (n3 * n3))
				System.out.println("TRIANGULO RETANGULO");
			if ((n1 * n1) > (n2 * n2) + (n3 * n3))
				System.out.println("TRIANGULO OBTUSANGULO");
			if ((n1 * n1) < (n2 * n2) + (n3 * n3))
				System.out.println("TRIANGULO ACUTANGULO");
			if (n1 == n2 && n1 == n3 && n2 == n3)
				System.out.println("TRIANGULO EQUILATERO");
			if ((n1 == n2 || n2 == n3) != (n1 == n2 && n2 == n3))
				System.out.println("TRIANGULO ISOSCELES");

		} else {
			System.out.println("Lado A é menor que algum dos lados");
		}
		leia.close();

	}

}
