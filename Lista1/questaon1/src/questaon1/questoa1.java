package questaon1;

import java.util.Scanner;

public class questoa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char continuar = 's';
		
		System.out.println("Bem-vindo a nossa calculadora! Informe seu nome e dois valores para que seja feita uma divisão.");
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		while(continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o nome completo do cliente: ");
			String nomeCompleto = sc.nextLine();
			
			System.out.printf("Digite o primeiro valor: ");
			int valor1 = sc.nextInt();
			
			System.out.printf("Digite o segundo valor:");
			int valor2 = sc.nextInt();
			
			sc.nextLine();
			double resultado = (double)valor1/valor2;
			
			System.out.println("------------------------------------");
			System.out.println("\tResultado");
			System.out.println("------------------------------------");
			System.out.println("Nome do usuário: " + nomeCompleto);
			System.out.println("\nPrimeiro valor inserido: " + valor1 );
			System.out.println("Segundo valor inserido: " + valor2);
			System.out.println("\nResultado da divisão: " + resultado);
			
			
			
			System.out.println("\nDeseja realizar outro cálculo? (sim/não)");
			/* sc.nextLine(); */
			continuar = sc.nextLine().charAt(0);
		}
		System.out.println("\nInfelizmente acabou :((");
		sc.close();
	}

}
