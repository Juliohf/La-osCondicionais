package laços;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu nome:");
		String nome = sc.nextLine();
	
		System.out.println("Insira sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Você já doou sangue? Digite 1 para sim ou 2 para não:");
		int doou = sc.nextInt();

		
		if(idade >= 18 && idade <= 59) {
			System.out.println("Parabéns " + nome + " você pode doar!");
		} else if (idade >= 60 && idade <= 69 && doou == 1) {
			System.out.println("Parabéns " + nome + " você pode doar!");
		} else {
			System.out.println(nome + " você não pode doar!");

		}
		
		
		
sc.close();

		
		
		
	}

}
