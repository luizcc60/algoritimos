package exercicio28;

public class Classe {
	public static void main(String[] args) {
		String primeiroNome = "Vin�cius";

		String templateTexto = "Meu nome � %1$s. E de novo meu nome � %1$s";
		System.out.println(String.format(templateTexto, primeiroNome));

	}
}
