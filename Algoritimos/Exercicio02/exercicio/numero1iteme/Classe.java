package exercicio.numero1iteme;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um n�mero:");
		num = scanner.nextInt();
		
		for (int aux = 0; aux <= num; aux++){
			System.out.println(aux);
		}
		
		scanner.close();
	}
}
