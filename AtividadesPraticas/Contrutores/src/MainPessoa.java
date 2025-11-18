import br.com.formacaojava.atividades.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();

            System.out.println("Informe o nome da Pessoa [%d]: ".formatted(i + 1));
            String nomeInformado = entrada.nextLine();
            pessoa.setNome(nomeInformado);

            System.out.println("Informe a idade da Pessoa [%d]: ".formatted(i + 1));
            int idadeInformada = entrada.nextInt();
            pessoa.setIdade(idadeInformada);

            entrada.nextLine();

            listaDePessoas.add(pessoa);

            System.out.println();
        }

        System.out.println("Quantidade de Usuários Cadastrados: " + listaDePessoas.size());

        System.out.println("Primeiro Usuário Cadastrado: " + listaDePessoas.getFirst());

        System.out.println();

        System.out.println("Lista de Usuários: ");

        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }
}
