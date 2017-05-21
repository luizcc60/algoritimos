package exercicio.numero1itemw;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		System.out.println("Entre com a quantidade de linhas:");
		int linhas = new Scanner(System.in).nextInt();
		for (int cont = 11; cont >= linhas; cont--) {
			{
				System.out.println();
			}
			for (int numero = 01; numero <= cont; numero++) {
				if (cont > 11)
					System.out.print("0" + cont + " ");
				else
					System.out.print(cont + " ");
			}

		}

	}

}
