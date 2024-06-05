package laços;
import java.util.Scanner;


	public class Atividade1 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Float n1,n2,n3;
		
		System.out.println("Digite o número A:");
		n1 = sc.nextFloat();
		
		System.out.println("Digite o número B:");
		n2 = sc.nextFloat();
		
		System.out.println("Digite o número C:");
		n3 = sc.nextFloat();
				
		if (n1+n2 > n3) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (n1+n2 < n3) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual C");

		}
			
		sc.close();
			
		}

	}
