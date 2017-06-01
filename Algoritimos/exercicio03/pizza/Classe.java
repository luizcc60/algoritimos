package pizza;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String pizzaCal;
		System.out.println("Qual valor da pizza de calabresa? ");
		pizzaCal = scanner.nextLine();
		int pizzaCal2 = Integer.parseInt(pizzaCal);

		String pizzaQuatro;
		System.out.println("Qual valor da pizza de 4 queijos? ");
		pizzaQuatro = scanner.nextLine();
		int pizzaQuatro2 = Integer.parseInt(pizzaQuatro);
		
		String pizzaFrango;
		System.out.println("Qual valor da pizza de frango? ");
		pizzaFrango = scanner.nextLine();
		int pizzaFrango2 = Integer.parseInt(pizzaFrango);

		String pizzaLombo;
		System.out.println("Qual valor da pizza de lombinho? ");
		pizzaLombo = scanner.nextLine();
		int pizzaLombo2 = Integer.parseInt(pizzaLombo);

		String pizzaCoracao;
		System.out.println("Qual valor da pizza de coração? ");
		pizzaCoracao = scanner.nextLine();
		int pizzaCoracao2 = Integer.parseInt(pizzaCoracao);

		String pizzaCarne;
		System.out.println("Qual valor da pizza de Carne? ");
		pizzaCarne = scanner.nextLine();
		int pizzaCarne2 = Integer.parseInt(pizzaCarne);

		String pizzaStrog;
		System.out.println("Qual valor da pizza de strogonoff de srango? ");
		pizzaStrog = scanner.nextLine();
		int pizzaStrog3 = Integer.parseInt(pizzaStrog);

		String pizzaStrog2;
		System.out.println("Qual valor da pizza de strogonoff de carne? ");
		pizzaStrog2 = scanner.nextLine();
		int pizzaStrog4 = Integer.parseInt(pizzaStrog2);

		String pizzaCincoQ;
		System.out.println("Qual valor da pizza de 5 Queijos? ");
		pizzaCincoQ = scanner.nextLine();
		int pizzaCincoQ2 = Integer.parseInt(pizzaCincoQ);

		String pizzaBanana;
		System.out.println("Qual valor da pizza de banana split? ");
		pizzaBanana = scanner.nextLine();
		int pizzaBanana2 = Integer.parseInt(pizzaBanana);

		String pizzaSonho;
		System.out.println("Qual valor da pizza de sonho de valsa? ");
		pizzaSonho = scanner.nextLine();
		int pizzaSonho2 = Integer.parseInt(pizzaSonho);

		String pizzaPrestigio;
		System.out.println("Qual valor da pizza de prestigio? ");
		pizzaPrestigio = scanner.nextLine();
		int pizzaPrestigio2 = Integer.parseInt(pizzaPrestigio);

		String pizzaChoco;
		System.out.println("Qual valor da pizza de chocolate preto? ");
		pizzaChoco = scanner.nextLine();
		int pizzaChoco2 = Integer.parseInt(pizzaChoco);

		String pizzaChocoB;
		System.out.println("Qual valor da pizza de chocolate branco? ");
		pizzaChocoB = scanner.nextLine();
		int pizzaChocoB2 = Integer.parseInt(pizzaChocoB);

		String pizzaCoco;
		System.out.println("Qual valor da pizza de coco? ");
		pizzaCoco = scanner.nextLine();
		int pizzaCoco2 = Integer.parseInt(pizzaCoco);

		// MOSTRA PREÇO
		String primeiro = "Pizza calabresa";
		String segundo = "Pizza 4 queijos";
		String terceiro = "Pizza frango";
		String quarto = "Pizza lombinho";
		String quinto = "Pizza coração";
		String sexto = "Pizza carne";
		String setimo = "Pizza strogonoff de frango";
		String oitavo = "Pizza strogonoff de carne";
		String nono = "Pizza 5 queijos";
		String decimo = "Pizza banana split";
		String decimop = "Pizza sonho de valsa";
		String decimos = "Pizza prestígio";
		String decimot = "Pizza chocolate preto";
		String decimoq = "Pizza chocolate branco";
		String decimoqq = "Pizza coco";

		System.out.println(primeiro + "  R$:" + pizzaCal2 + ",00");
		System.out.println(segundo + "  R$:" + pizzaQuatro2 + ",00");
		System.out.println(terceiro + "  R$:" + pizzaFrango2 + ",00");
		System.out.println(quarto + "  R$:" + pizzaLombo2 + ",00");
		System.out.println(quinto + "  R$:" + pizzaCoracao2 + ",00");
		System.out.println(sexto + "  R$:" + pizzaCarne2 + ",00");
		System.out.println(setimo + "  R$:" + pizzaStrog3 + ",00");
		System.out.println(oitavo + "  R$:" + pizzaStrog4 + ",00");
		System.out.println(nono + "  R$:" + pizzaCincoQ2 + ",00");
		System.out.println(decimo + "  R$:" + pizzaBanana2 + ",00");
		System.out.println(decimop + "  R$:" + pizzaSonho2 + ",00");
		System.out.println(decimos + "  R$:" + pizzaPrestigio2);
		System.out.println(decimot + "  R$:" + pizzaChoco2);
		System.out.println(decimoq + "  R$:" + pizzaChocoB2);
		System.out.println(decimoqq + "  R$:" + pizzaCoco);

		String pedido;
		System.out.println("Qual sabor o senhor deseja? ");
		pedido = scanner.nextLine();

		if (pedido.equals(primeiro)) {
			System.out.println(pizzaCal +",00");
		}else if(pedido.equals(segundo)){
			System.out.println((pizzaQuatro +",00"));
		}else if(pedido.equals(terceiro)){
			System.out.println((pizzaFrango +",00"));
		}else if(pedido.equals(quarto)){
			System.out.println((pizzaLombo +",00"));
		}else if(pedido.equals(quinto)){
			System.out.println((pizzaCoracao +",00"));
		}else if(pedido.equals(sexto)){
			System.out.println((pizzaCarne +",00"));
		}else if(pedido.equals(setimo)){
			System.out.println((pizzaStrog +",00"));
		}else if(pedido.equals(oitavo)){
			System.out.println((pizzaStrog2 +",00"));
		}else if(pedido.equals(nono)){
			System.out.println((pizzaCincoQ +",00"));
		}else if(pedido.equals(decimo)){
			System.out.println((pizzaBanana +",00"));
		}else if(pedido.equals(decimop)){
			System.out.println((pizzaSonho +",00"));
		}else if(pedido.equals(decimos)){
			System.out.println((pizzaPrestigio +",00"));
		}else if(pedido.equals(decimot)){
			System.out.println((pizzaChoco +",00"));
		}else if(pedido.equals(decimoq)){
			System.out.println((pizzaChocoB2 +",00"));
		}else if(pedido.equals(decimoqq)){
			System.out.println((pizzaCoco2 +",00"));
		}
			scanner.close();

	}
}
