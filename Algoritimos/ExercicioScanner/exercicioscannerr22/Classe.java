package exercicioscannerr22;



public class Classe {

	public static void main(String[] args) {
	

		boolean teste = true;
		boolean outroTeste = false;
		
		System.out.println(teste);
		System.out.println(outroTeste);
		System.out.println("");
		
		
		
		outroTeste = teste;
		System.out.println(teste);
		System.out.println(outroTeste);
		System.out.println("");
		
		boolean teste2 = teste = false;
		System.out.println(teste2);
		System.out.println(outroTeste);
		System.out.println("");

	}

}

