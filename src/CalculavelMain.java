import br.com.atv.atividadespraticas.Livro;
import br.com.atv.atividadespraticas.ProdutoFisico;

import java.util.Scanner;

public class CalculavelMain {
    public static void main(String[] args) {

        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Selecione uma opção:
                [1] Comprar Livro
                [2] Produto Físico
                """);
        int opcaoSelecionada = scanner.nextInt();

        if (opcaoSelecionada == 1) {

            livro.setNomeLivro("Percy Jackson e o Ladrão de Raios");
            livro.setPrecoLivro(199.90);

            System.out.println("------------------------");
            System.out.println("""
                    Livros disponíveis:
                    %s
                    Preço: R$%.2f
                    
                    Quantas unidades?   
                    """.formatted(livro.getNomeLivro(), livro.getPrecoLivro()));

            livro.setQuantLivro(scanner.nextInt());
            System.out.println("""
                    Total: R$%.2f
                    Total com desconto: R$%.2f
                    """.formatted(livro.getPrecoLivro() * livro.getQuantLivro(),livro.calcularPrecoFinal()));

        }else if (opcaoSelecionada == 2){

            produtoFisico.setNomeProduto("Action Figure - Naruto");
            produtoFisico.setPrecoProduto(89.90);

            System.out.println("""
                    Produtos disponíveis:
                    %s
                    Preço: R$%.2f
                    
                    Quantas unidades?   
                    """.formatted(produtoFisico.getNomeProduto(), produtoFisico.getPrecoProduto()));
            produtoFisico.setQuantProduto(scanner.nextInt());
            System.out.println("""
                    Total: R$%.2f
                    Total com a Taxa de Importação: R$%.2f
                    """.formatted(produtoFisico.getPrecoProduto() * produtoFisico.getQuantProduto(),produtoFisico.calcularPrecoFinal()));
        }else {
            System.out.println("Opção Invalida...");
        }
    }
}
