package exercicio28;

public class Classe {
	public static void main(String[] args) {
		String primeiroNome = "Vinícius";

		String templateTexto = "Meu nome é %1$s. E de novo meu nome é %1$s";
		System.out.println(String.format(templateTexto, primeiroNome));

	}
}
