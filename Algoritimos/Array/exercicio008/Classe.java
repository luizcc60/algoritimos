package exercicio008;

public class Classe {
	public static void main(String[] args) {
		int numero[] = new int[5];
		
		numero[0] = 1;
		numero[1] = 2;
		numero[2] = 3;
		numero[3] = 4;
		numero[4] = 5;
		
		for(int aux = 0; aux < 3; aux++)
			System.out.println(numero[aux]);
		for(int aux = 0; aux <5; aux++){
		if(numero[aux]==1){
			numero[aux] = 10;
			
			System.out.println(" ");
		}else if(numero[aux]==5){
			numero[aux] = 10;
		}
		System.out.println(numero[aux]);
		}
	
	}	
	}


