package laços;

import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao Banco, qual a operação? \n1-Saldo \n2-Saque \n3- Depósito");
		int op = sc.nextInt();
				
		float saldo = 1000.00f;
		
		switch(op) {
		case 1: 
			System.out.println("Seu saldo é:R$ "+ saldo);
			break;
		case 2: 
			System.out.println("Quanto quer sacar?");
			float saque = sc.nextFloat();
			 if( saque < saldo) {
				 saldo -= saque;
				 System.out.println("Você sacou R$ " + saque + " seu novo saldo é R$ " + saldo);
			 } else {
				System.out.println("Saldo insuficiente, você é pobre!");
			}
			 break;			
		case 3: 
			System.out.println("Quanto você quer depositar?");
			float depo = sc.nextFloat();
			saldo += depo;
			System.out.println("Você depositou R$ " + depo + " seu novo saldo é R$ " + saldo);
			
		case 4: 
		System.out.println("Operação Invalida");
					
		}

		
		sc.close();
	}
}
