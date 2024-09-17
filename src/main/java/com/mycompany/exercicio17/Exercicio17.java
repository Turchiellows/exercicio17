package com.mycompany.exercicio17;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		// INSTANTIATE
		Scanner sc = new Scanner(System.in);
	
		
		
		// DECLARATE
		double a;
		double b;
		int option;
        
	
        
		// MENU
		System.out.println("======================================");
		System.out.println("CHOSE AN OPTION");
		System.out.println("======================================");
		System.out.println("1 - Engenheiro");
		System.out.println("2 - Médico");
		System.out.println("3 - Designer");
		System.out.println("4 - Programador");
		System.out.println("5 - Advogado");
		System.out.print("Your option: ");
		option = sc.nextInt();
        
       

		// OUTPUT
		switch (option) {
			case 1:
				System.out.println("Tibúrcio é engenheiro");
				break;

			case 2:
				System.out.println("Tibúrcio é médico");
				break;

			case 3:
				System.out.println("Tibúrcio é designer");
				break;

			case 4:
				System.out.println("Tibúrcio é programador");
				break;

			case 5:
				System.out.println("Tibúrcio é advogado");
				break;

			default: 
				System.out.println("Tibúrcio é DESEMPREGADO");
		}

    }
}
