package exercicio011;

public class Classe {
	public static void main(String[] args) {
		boolean[] num = new boolean[6];

		for (int aux = 0; aux < num.length; aux++) {
			if (aux % 2 == 0) {
				num[aux] = true;
			} else {
				num[aux] = false;

			}

		}

		for (int aux = 0; aux < num.length; aux++) {
			System.out.println(num[aux]);
		}
	}
}
