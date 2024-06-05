package laços;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calculadora: Digite o primeiro número");
	float n1 = sc.nextFloat();
	
	System.out.println("Calculadora: Digite o segundo número");
	float n2 = sc.nextFloat();
	
	System.out.println("Qual a operação? \n1-Soma \n2-Substração \n3-Multiplicação \n4-Divisão");		
	int op = sc.nextInt();
			
	float res = 0.0f;
	
	switch(op) {
	case 1: 
	res = n1 + n2;
	System.out.println("O resultado é: " + res);
	break;
	
	case 2: 
	res = n1 - n2;
	System.out.println("O resultado é: " + res);
	break;
	
	case 3: 
	res = n1 * n2;
	System.out.println("O resultado é: " + res);
	break;
	
	case 4: 
	res = n1 / n2;
	System.out.println("O resultado é: " + res);
	break;
	}
		
	sc.close();
	}
}
