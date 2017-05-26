package exercicio09Pendente;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String clima;
		System.out.println("Como está o clima : ");
		clima = scanner.next();

		int temperatura;
		System.out.println("Digite a temperatura : ");
		temperatura = scanner.nextInt();
		
		if (clima.equals("Sol") && temperatura == 0) {
			System.out.println("Usará blusa");
			}

			if (clima.equals("Sol") && temperatura > 30) {
			System.out.println("Usará saia");
			}

			if (clima.equals("Sol") && temperatura <= 30 && temperatura >= 23) {
			System.out.println("Usará Shorts");
			}
			
			if (clima.equals("Sol") && temperatura < 23 && temperatura >0) {
					System.out.println("Usará calça Jeans");
			}
			
		if (clima.equals("nublado") && temperatura > 25) {
				System.out.println("Usará vestido");
				}
			if (clima.equals("nublado") && temperatura <= 25) {
				System.out.println("Usará calça de moletom e sobretudo");
				}		
						
			
		if (clima.equals("chovendo") && temperatura == 0) {
			System.out.println("Usará bota e calça  jean");
			
			}
			if (clima.equals("chovendo") && temperatura <= 10 && temperatura >0) {
				System.out.println("Usará blusa e um casaco de lã");
			}
			if (clima.equals("chovendo") && temperatura > 10 && temperatura <25) {
				System.out.println("Usará camiseta");
			}
			if (clima.equals("chovendo") && temperatura >= 25) {
				System.out.println("Usará uma blusa regata");
			
				
			
		
			
		}
		scanner.close();
		}

	
		
	}
