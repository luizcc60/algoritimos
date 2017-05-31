package exercicio29;

public class Classe {
	public static void main(String[] args) {
		String primeiroNome = "Luiz Carlos";
		int idade = 23;
		String rua = "Bluemanu";
		String moro = "Pais";
		String bairro = "Itoupava Norte";

		String templateTexto = "Olá, tudo bem? Meu nome é %1$s, tenho %2$s anos de idade, e moro em %3$s desde de que eu nasci. Moro com o(s) meu(s) %4$s, no bairro da %5$s.";
		System.out.println(String.format(templateTexto, primeiroNome, idade, rua, moro, bairro));

	}
}


