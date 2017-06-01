package exercicio16;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		//Pergunte o nome da pessoa e a sua idade.
		//Pergunte o nome de outra pessoa e sua idade.
		//Imprima o nome da pessoa mais velha e a idade dela, 
		//e o nome da pessoa mais nova e a idade dela, 
		//utilizando apenas um Sysout.
		//Sendo considerado a idade uma variável int.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome da Pessoa 1:");
		String pessoa1 = scanner.nextLine();
		System.out.println("Informe a idade da Pessoa 1:");
		int idade1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Informe o nome da Pessoa 2:");
		String pessoa2 = scanner.nextLine();
		System.out.println("Informe a idade da Pessoa 2:");
		int idade2 = Integer.parseInt(scanner.nextLine());
		
		String[] pessoaMaisVelha = new String[2];
		String[] pessoaMaisNova = new String[2];
		if(idade1 > idade2){
			pessoaMaisVelha[0] = pessoa1;
			pessoaMaisVelha[1] = String.valueOf(idade1);
			pessoaMaisNova[0] = pessoa2;
			pessoaMaisNova[1] = String.valueOf(idade2);
		}else if(idade2 > idade1){
			pessoaMaisVelha[0] = pessoa2;
			pessoaMaisVelha[1] = String.valueOf(idade2);
			pessoaMaisNova[0] = pessoa1;
			pessoaMaisNova[1] = String.valueOf(idade1);
		}
		
		System.out.println("A pessoa "+pessoaMaisVelha[0]+" com "+pessoaMaisVelha[1]+" anos, é a mais velha e a pessoa "
				+pessoaMaisNova[0]+" com "+pessoaMaisNova[1]+" anos, é a mais nova.");
		
		scanner.close();
	}
}
