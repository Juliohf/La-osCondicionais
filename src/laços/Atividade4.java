package laços;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Vertebrado ou Invertebrado?");
		String v = sc.nextLine();
				
		System.out.println("Ave, Mamifero, Inseto ou Anelídeo?");
		String m = sc.nextLine();
				
		System.out.println("Carnivoro, Onivoro, Herbivoro ou Hematofago?");
		String c = sc.nextLine();
		
		
		if (v.equalsIgnoreCase("vertebrado") && m.equalsIgnoreCase("ave") && c.equalsIgnoreCase("carnivoro") ) {
			System.out.println("É uma Águia");
		} else if (v.equalsIgnoreCase("vertebrado") && m.equalsIgnoreCase("ave") && c.equalsIgnoreCase("onivoro") ) {
			System.out.println("É uma Pomba");
		} else if (v.equalsIgnoreCase("vertebrado") && m.equalsIgnoreCase("mamifero") && c.equalsIgnoreCase("onivoro") ) {
			System.out.println("É um Homem");
		} else if (v.equalsIgnoreCase("vertebrado") && m.equalsIgnoreCase("mamifero") && c.equalsIgnoreCase("herbivoro") ) {
			System.out.println("É uma Vaca");	
		} else if (v.equalsIgnoreCase("invertebrado") && m.equalsIgnoreCase("inseto") && c.equalsIgnoreCase("hematofago") ) {
			System.out.println("É uma Pulga");
		} else if (v.equalsIgnoreCase("invertebrado") && m.equalsIgnoreCase("inseto") && c.equalsIgnoreCase("herbivoro") ) {
			System.out.println("É uma Lagarta");
		} else if (v.equalsIgnoreCase("invertebrado") && m.equalsIgnoreCase("Anelideo") && c.equalsIgnoreCase("hematofago") ) {
			System.out.println("É uma Sanguessuga");	
		} else if (v.equalsIgnoreCase("invertebrado") && m.equalsIgnoreCase("Anelideo") && c.equalsIgnoreCase("onivoro") ) {
			System.out.println("É uma Minhoca");	
		} else {
			System.out.println("Não existe!");
		}
	
		
		sc.close();
	}
}
