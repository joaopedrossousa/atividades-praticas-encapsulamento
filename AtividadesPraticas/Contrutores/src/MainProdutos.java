import br.com.formacaojava.atividades.Produto;
import br.com.formacaojava.atividades.ProdutoPerecivel;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProdutos {
    public static void main(String[] args) {

        System.out.println("TERMINAL ERP COMERCIAL");

        //Objetos Simulando um Banco de Dados;
        Produto produtoUm = new Produto(1, "Arroz", 29.99, 10);
        Produto produtoDois = new Produto(2, "Feijão", 13.25, 20);
        Produto produtoTres = new Produto(3, "Café", 16.90, 20);
        Produto produtoQuatro = new Produto(4, "Óleo", 9.99, 10);
        Produto produtoCinco = new Produto(5, "Açucar", 6.90, 10);
        //Objeto da SubClasse Perecível
        ProdutoPerecivel produtoSeis = new ProdutoPerecivel(6,"Filé Tilapia", 46.90, 30, "20/12/2025");


        //Implementação do atributo "Detalhes" aos produtos;
        produtoUm.setDetalhe("Pacote com 3KG, br.com.teste.atividadespraticas.Produto  Não Perecível");
        produtoDois.setDetalhe("Pacote com 1KG, br.com.teste.atividadespraticas.Produto Não Perecível");
        produtoTres.setDetalhe("Pacote com 1KG, br.com.teste.atividadespraticas.Produto Não Perecível");
        produtoQuatro.setDetalhe("Embalagem com 600ML, Não br.com.teste.atividadespraticas.Produto Perecível");
        produtoCinco.setDetalhe("Pacote com 1KG, br.com.teste.atividadespraticas.Produto Não Perecível");
        produtoSeis.setDetalhe("Embalagem com 600g, br.com.teste.atividadespraticas.Produto Perecível");


        ArrayList<Produto> estoqueProdutos = new ArrayList<>();
        estoqueProdutos.add(produtoUm);
        estoqueProdutos.add(produtoDois);
        estoqueProdutos.add(produtoTres);
        estoqueProdutos.add(produtoQuatro);
        estoqueProdutos.add(produtoCinco);
        estoqueProdutos.add(produtoSeis);

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("[1] Exibir Estoque");
            System.out.println("[2] Selecionar br.com.teste.atividadespraticas.Produto");
            System.out.println();
            System.out.println("[3] Sair");
            System.out.println();
            System.out.println("Escolha uma opção:");
            int opcaoSelecionada = entrada.nextInt();

            if (opcaoSelecionada == 1){

                System.out.println();
                System.out.println("Quantidade de Produtos Cadastrados: " + estoqueProdutos.size());
                System.out.println();
                System.out.printf("%-5s %-10s %-15s %-10s%n", "ID", "Qtd", "Nome", "Preço");
                for (int i = 0; i < estoqueProdutos.size(); i++) {
                    System.out.printf("%-5d %-10d %-15s %-10.2f%n",
                            estoqueProdutos.get(i).getID(),
                            estoqueProdutos.get(i).getQuantidade(),
                            estoqueProdutos.get(i).getNome(),
                            estoqueProdutos.get(i).getPreco()
                    );
                }
                System.out.println();
            } else if (opcaoSelecionada == 2) {
                System.out.println("Infome o ID do br.com.teste.atividadespraticas.Produto: ");
                int idInformado = entrada.nextInt();
                System.out.println("Voce selecionou: " +  estoqueProdutos.get(idInformado - 1).getNome());
                System.out.println();
                System.out.println("[1] Alterar Nome do br.com.teste.atividadespraticas.Produto");
                System.out.println("[2] Alterar Preço");
                System.out.println("[3] Alterar Quantidade");
                System.out.println("[4] Exibir Detalhes do br.com.teste.atividadespraticas.Produto: ");
                System.out.println();
                System.out.println("[4] Menu br.com.alura.screenmatch.principal.Principal");
                System.out.println("Selecione uma Opção: ");

                opcaoSelecionada = entrada.nextInt();
                entrada.nextLine();

                if (opcaoSelecionada == 1){
                    System.out.println("Nome atual: " + estoqueProdutos.get(idInformado - 1).getNome());
                    System.out.println("Informe o novo nome: ");
                    String novoNome = entrada.nextLine();
                    estoqueProdutos.get(idInformado - 1).setNome(novoNome);
                    System.out.println("Nome Alterado com Sucesso...");
                } else if (opcaoSelecionada == 2) {
                    System.out.println("Preço Atual: " + estoqueProdutos.get(idInformado - 1).getPreco());
                    System.out.println("Informe o novo preço: ");
                    double novoPreco = entrada.nextDouble();
                    estoqueProdutos.get(idInformado - 1).setPreco(novoPreco);
                    System.out.println("Preco Alterado com Sucesso...");
                } else if (opcaoSelecionada == 3) {
                    System.out.println("Estoque atual: " + estoqueProdutos.get(idInformado - 1).getQuantidade());
                    System.out.println("Informe a nova quantidade: ");
                    int novaQuantidade = entrada.nextInt();
                    estoqueProdutos.get(idInformado - 1).setQuantidade(novaQuantidade);
                    System.out.println("Quantidade Alterada com sucesso...");
                } else if (opcaoSelecionada == 4) {
                    System.out.println("br.com.teste.atividadespraticas.Produto Selecionado: " + estoqueProdutos.get(idInformado - 1).getNome());
                    System.out.println(estoqueProdutos.get(idInformado - 1).toString());
                }


            } else if (opcaoSelecionada == 3){
                System.out.println("Encerrando o programa...");
                break;
            }else {
                System.out.println("Opcao Invalida...");
            }




        }
    }
}
