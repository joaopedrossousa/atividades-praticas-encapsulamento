import br.com.teste.atividadespraticas.Produto;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Informe o nome do br.com.teste.atividadespraticas.Produto: ");
        String nomeProduto = entrada.nextLine();
        produto.setNomeProduto(nomeProduto);

        System.out.println("Informe o valor do br.com.teste.atividadespraticas.Produto: ");
        double valorProduto = entrada.nextDouble();
        produto.setPrecoProduto(valorProduto);

        System.out.println("Deseja aplicar desconto para vendas avista? [1] SIM [2] NÃO");
        int opcaoDesconto = entrada.nextInt();

        if (opcaoDesconto == 1){
            System.out.println("Infome um percentual de desconto a ser aplicado, Ex: 10 == 10%: ");
            int percentDesconto = entrada.nextInt();
            System.out.println("---------------------------");
            System.out.println("PRODUTO CADASTRADO");
            System.out.println("---------------------------");
            System.out.println("Nome do br.com.teste.atividadespraticas.Produto: " +produto.getNomeProduto());
            System.out.println("Preço Original: R$%.2f".formatted(produto.getPrecoProduto()));
            System.out.println("Preço com Desconto: R$%.2f".formatted(produto.aplicaDesconto(percentDesconto)));


        }else if (opcaoDesconto == 2){
            System.out.println("---------------------------");
            System.out.println("PRODUTO CADASTRADO");
            System.out.println("---------------------------");
            System.out.println("Nome do br.com.teste.atividadespraticas.Produto: " +produto.getNomeProduto());
            System.out.println("Preço Original: R$%.2f".formatted(produto.getPrecoProduto()));

        }else{
            System.out.println("Opção invalida...");
        }
        entrada.close();
    }
}
