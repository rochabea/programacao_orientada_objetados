package questaon2;

import java.util.Scanner;

public class questao2{ 
	
	public static void metmedia()
	{
		Scanner sc = new Scanner(System.in);
		String NomeEstudante;
		int nota1, nota2;
		float media;
		System.out.printf("%nInforme o seu nome: ");
		NomeEstudante = sc.next();
		System.out.printf("%nInforme a sua nota: ");
		nota1 = sc.nextInt();
		System.out.printf("%nInforme a sua nota: ");
		nota2 = sc.nextInt();
		media = (float)(nota1+nota2)/2;
		System.out.printf("%nO nome informado foi: " + NomeEstudante);
		System.out.printf("%nA primeira nota informada foi " + nota1 + "  e a segunda nota informada foi" + nota2);
		System.out.printf("%nA media final do aluno é "+ media);
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int entrada;
		System.out.printf("1 - Fabiano %n2 - Hialley %n3 - Marcelo %n4 - João");
		System.out.printf("%nDigite a opção do seu professor: ");
		entrada = sc.nextInt();
		
		
		switch(entrada) {
		case 1:
			System.out.printf("Seu professor é o Fabiano");
			metmedia();
			break;
		case 2:
			System.out.printf("Sua professora é a Hialley");
			metmedia();
			break;
		case 3:
			System.out.printf("Seu professor é o Marcelo");
			metmedia();			
			break;
		case 4:
			System.out.printf("Seu professor é o João");
			metmedia();
			break;
		default:
			System.out.printf("Opção inválida, escolha um professor que ministre a matéria");
		}
		sc.close();
	}

}
