import br.com.teste.atividadespraticas.Livro;

import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Livro: ");
        String livroInformado = entrada.nextLine();
        livro.setLivro(livroInformado);

        System.out.println("Informe o Autor:");
        String autorInformado = entrada.nextLine();
        livro.setAutor(autorInformado);

        livro.exibirDetalhes();



    }
}
