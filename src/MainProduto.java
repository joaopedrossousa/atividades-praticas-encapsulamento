import br.com.teste.atividadespraticas.Produto;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Informe o nome do Produto: ");
        String nomeProduto = entrada.nextLine();
        produto.setNomeProduto(nomeProduto);

        System.out.println("Informe o valor do Produto: ");
        double valorProduto = entrada.nextDouble();
        produto.setPrecoProduto(valorProduto);

        System.out.println("O produto cadastrado foi %s e ele custa R$%.2f...".formatted(produto.getNomeProduto(), produto.getPrecoProduto()));

        entrada.close();


    }
}
