package exercicio10;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double num1;
	System.out.println("Digite o primeiro n�mero double");
	num1 = scanner.nextDouble();
	
	double num2;
	System.out.println("Digite o segundo n�mero double");
	num2 = scanner.nextDouble();
	
	double soma = num1+num2;
	
	if(soma>20){
		System.out.println(soma+ " � maior que 20");
	}
	
	if(soma>30){
		System.out.println(soma+ " � maior que 30");
	}
	if(soma>10 || soma>20){
		System.out.println(soma+ " � maior que 10");
	}
	if(soma % 5==0 && soma%10==0){
		System.out.println("� multiplo de 5 ou 10");
		
	}
	if((soma % 5==0 && soma%10==0)|| num1 == 5){
		System.out.println("Multiplo de 5 ou de 10 ou � igual a 5");
	}
	scanner.close();
	
}
}
