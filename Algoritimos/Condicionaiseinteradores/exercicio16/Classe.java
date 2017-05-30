package exercicio16;
import java.util.*;

public class Classe {

    private static final int PESSOAS = 2;
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        for(int i = 0; i < PESSOAS; i++){
            Pessoa novaPessoa = new Pessoa();

            System.out.println("Nome: ");
                novaPessoa.setNome(input.nextLine());
            System.out.println("Idade: ");
                novaPessoa.setIdade(input.nextInt());
            input.nextLine();
            listaDePessoas.add(novaPessoa);
        }

        Pessoa maisNova, maisVelha;
        maisNova = maisVelha = listaDePessoas.get(0);

        for(Pessoa pessoa:listaDePessoas){
            if(pessoa.getIdade() > maisVelha.getIdade())
                maisVelha = pessoa;
            else if(pessoa.getIdade() < maisNova.getIdade())
                maisNova = pessoa;
        }

        System.out.printf("Mais nova: %s - %d", maisNova.getNome(), maisNova.getIdade());
        System.out.println(" ");
        System.out.printf("Mais velha: %s - %d", maisVelha.getNome(), maisVelha.getIdade());         
    }

    static class Pessoa {
        int idade;
        String nome;

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade(){ return idade; }
        public String getNome(){ return nome; }
    }
}