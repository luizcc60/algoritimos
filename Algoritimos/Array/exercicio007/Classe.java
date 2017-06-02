package exercicio007;

public class Classe {
	public static void main(String[] args) {

		String[] nome = new String[6];

		nome[0] = "A";
		nome[1] = "B";
		nome[2] = "C";
		nome[3] = "D";
		nome[4] = "E";
		nome[5] = "F";

		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
		
		System.out.println("---------------------------------- ");
		for (int i = 5; i >= 0; i--) {
			System.out.println(nome[i]);
		}
System.out.println("---------------------------------- ");
		for (int i = 0; i < nome.length; i++) {
			if (nome[i].equals("C")) {
				nome[i] = " ";
			}
			System.out.println(nome[i]);
		}

	}

}
