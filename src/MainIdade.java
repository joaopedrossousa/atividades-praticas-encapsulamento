import br.com.teste.atividadespraticas.IdadePessoa;

import java.util.Scanner;

public class MainIdade {
    public static void main(String[] args) {
        IdadePessoa receberIdadeNomePessoa = new IdadePessoa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome o nome: ");
        String nomePessoa = entrada.nextLine();
        receberIdadeNomePessoa.recebeNome(nomePessoa);

        System.out.println("Informe a idade: ");
        int idade = entrada.nextInt();
        receberIdadeNomePessoa.recebeIdade(idade);

        System.out.println("Nome Informado: " +receberIdadeNomePessoa.getNome());
        System.out.println("Idade Informada: " +receberIdadeNomePessoa.getIdade());
        receberIdadeNomePessoa.verificarIdade();

    }
}
