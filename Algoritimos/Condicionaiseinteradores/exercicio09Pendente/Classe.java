package exercicio09Pendente;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String clima;
		System.out.println("Como est� o clima : ");
		clima = scanner.next();

		int temperatura;
		System.out.println("Digite a temperatura : ");
		temperatura = scanner.nextInt();
		
		if (clima.equals("Sol") && temperatura == 0) {
			System.out.println("Usar� blusa");
			}

			if (clima.equals("Sol") && temperatura > 30) {
			System.out.println("Usar� saia");
			}

			if (clima.equals("Sol") && temperatura <= 30 && temperatura >= 23) {
			System.out.println("Usar� Shorts");
			}
			
			if (clima.equals("Sol") && temperatura < 23 && temperatura >0) {
					System.out.println("Usar� cal�a Jeans");
			}
			
		if (clima.equals("nublado") && temperatura > 25) {
				System.out.println("Usar� vestido");
				}
			if (clima.equals("nublado") && temperatura <= 25) {
				System.out.println("Usar� cal�a de moletom e sobretudo");
				}		
						
			
		if (clima.equals("chovendo") && temperatura == 0) {
			System.out.println("Usar� bota e cal�a  jean");
			
			}
			if (clima.equals("chovendo") && temperatura <= 10 && temperatura >0) {
				System.out.println("Usar� blusa e um casaco de l�");
			}
			if (clima.equals("chovendo") && temperatura > 10 && temperatura <25) {
				System.out.println("Usar� camiseta");
			}
			if (clima.equals("chovendo") && temperatura >= 25) {
				System.out.println("Usar� uma blusa regata");
			
				
			
		
			
		}
		scanner.close();
		}

	
		
	}
