package exercicioscannerr12;


import java.util.Scanner;

public class ClasseD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
		int num2;
		System.out.println("Digite 2° número:");
		num2 = scanner.nextInt();
		int num3;
		System.out.println("Digite 3° número");
		num3 = scanner.nextInt();
		
		int mult = num*num3;
		int soma = mult + (num2*num2*num2);
		System.out.println(soma);
		
				
		if(soma <10 || soma>1 ){
		System.out.println("True");
	}else{
		System.out.println("False");
		}
		
		
		scanner.close();
	}
}