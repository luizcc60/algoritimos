package exercicio.numero1itemg;

import java.util.ArrayList;

public class Classe {
	public static void main(String[] args) {
		for(int i=1;  i<=100; i++){
            if(i%2==0){
                ArrayList<Integer> d=new ArrayList<Integer>();
                d.add(i);
                System.out.println(d);

            }

        }
    }
}
