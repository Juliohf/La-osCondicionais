package laços;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o nome do Colaborador?");
		String nome = sc.nextLine();
		
		System.out.println("Qual o código do Colaborador? \n1-Gerente \n2-Vendedor \n3-Supervisor \n4-Motorista \n5-Estoquista \n6-Técnico de TI.");
		int cod = sc.nextInt();
		
		System.out.println("Qual o salário do Colaborador?");
		float sal = sc.nextFloat();
		
		float pc = 0.0f;
				
		switch (cod) {
		case 1: 
			pc = 10.0f;
			break;
		case 2: 
			pc = 7.0f;
			break;
		case 3: 
			pc = 9.0f;
			break;
		case 4: 
			pc = 6.0f;	
			break;
		case 5: 
			pc = 5.0f;	
			break;
		case 6: 
			pc = 8.0f;	
			break;

		}
		
		float fim = sal + (pc / 100 * sal);
				
		System.out.println("O salário atualizado de " + nome +  "é: R$ " + fim);
		
		sc.close();
	}

}
