package exercicio25;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String endereco = "Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC";
	

		
		int posicao = endereco.indexOf("R");
		int posicao2 = endereco.indexOf(",");
		
		
		String nasc2 = endereco.substring(posicao, posicao2);
		System.out.println(nasc2);
		
		
		
		String endereco2 = "SC - Blumenau, rua Joiville nº 2011";
		
		int posicao3 = endereco2.indexOf("r");
		int posicao4 = endereco2.lastIndexOf("e");
		posicao4++;
		
		
		String nasc3 = endereco2.substring(posicao3, posicao4);
		System.out.println(nasc3);
		
		scanner.close();
	}

}