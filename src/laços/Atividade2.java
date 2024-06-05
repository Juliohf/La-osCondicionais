package laços;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0 && x >= 0) {
			System.out.println("O número digitado é par e positivo!");
		} else if (x % 2 != 0 && x >= 0) {
			System.out.println("O número digitado é ímpar e positivo!");
		} else if (x % 2 == 0 && x < 0) {
			System.out.println("O número digitado é par e negativo!");
		} else  {
			System.out.println("O número digitado é ímpar e negativo!");
		}
		
		sc.close();
		

	}

}
