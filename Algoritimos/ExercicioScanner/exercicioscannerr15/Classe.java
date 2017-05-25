package exercicioscannerr15;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		System.out.println("Digite seu nome:");
		nome = scanner.nextLine();
		System.out.println(nome.length());
		
		if(nome.length()<50){
		System.out.println("True");
		}else{
			System.out.println("False");
			scanner.close();
		}
		
	}
}