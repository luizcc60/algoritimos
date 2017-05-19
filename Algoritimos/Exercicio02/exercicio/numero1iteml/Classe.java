package exercicio.numero1iteml;

public class Classe {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 ==0 && i % 15 == 0) {
				System.out.println(i);
			}
		}
	}
}