package laços;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bem vindo ao xtudao, escolha seu pedido:\n1-Cachorro Quente \n2-X-Salada \n3-X-Bacon \n4-Bauru \n5-Refrigerante \n6-Suco de laranja");
	
	int e = sc.nextInt();
	double s = 0;

	
	
	System.out.println("Qual a quantidade?");
	int q = sc.nextInt();
	
	switch (e) {
	case 1:
		s = 10.00;
		break;
	case 2:
		s = 15.00;
		break;
	case 3:
		s = 18.00;
		break;
	case 4:
		s = 12.00;
		break;
	case 5:
		s = 8.00;
		break;
	case 6:
		s = 13.00;
		break;
	case 7:
		System.out.println("opção invalida");
				
	}
	
	System.out.println("O Valor total da sua conta é: R$" + s * q);
	
	
	sc.close();
	
	}

	
	
	}

