package exercicioscanner9;

import java.util.Scanner;


	public class Classe {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

			int num;
			System.out.println("Digite o primeiro número : ");
			num = scanner.nextInt();
			
			int num2;
			System.out.println("Digite o segundo número : ");
			num2 = scanner.nextInt();
			
			
			if(num <=0 & num2 >10 ){
			System.out.println("True");
			}else{
				System.out.println("False");
				scanner.close();
			}
			
		
			
			
	}

	}

