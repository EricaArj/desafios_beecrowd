package Exercicios;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
        double raio = 0;
        double n = 3.14159;
        double area = 0;
        
        System.out.println("O raio de um círculo: ");
        raio = leia.nextDouble();
        
        area = n * Math.pow(raio,2);
        
        System.out.println("Àrea: " + area);
        
        leia.close();
	}

}