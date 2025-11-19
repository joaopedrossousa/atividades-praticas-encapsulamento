import br.com.teste.atividadespraticas.Produto;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {

        Produto produtoUm = new Produto("Arroz", 22.90);
        Produto produtoDois = new Produto("Feijão", 14.90);
        Produto produtoTres = new Produto("Café", 18.99);

        ArrayList <Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(produtoUm);
        listaProdutos.add(produtoDois);
        listaProdutos.add(produtoTres);

        double sum = 0;

        for (Produto prod : listaProdutos){
            sum += prod.getPreco();
        }

        double average = sum / listaProdutos.size();

        System.out.println("Média de preço dos produtos: R$%.2f".formatted(average));



    }
}
