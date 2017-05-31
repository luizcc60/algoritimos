package exercicio26;

public class Classe {
	public static void main(String[] args) {
		String data = "25/05/2015";
		
		//Primeira etapa
		int posicao = data.indexOf("");
		int posicao2 = data.indexOf("/");
		
		String nasc2 = data.substring(posicao, posicao2);
		
		
		
		
		
		//Segunda etapa
		int posicao3 = data.indexOf("0");
		int posicao4 = data.lastIndexOf("/");
		
		
		String nasc3 = data.substring(posicao3, posicao4);
		
		
		//Terceira etapa
		
		int posicao5 = data.lastIndexOf("2");
	
				
				
		String nasc4 = data.substring(posicao5);
		
		System.out.println("O dia é "+nasc2+" do mês " +nasc3+ " do ano " +nasc4);
		
		
		
		
	}

}
