package br.com.formacaojava.atividades;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(int ID, String nome, double preco, int quantidade, String dataValidade) {
        super(ID, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    //Reformulação do metodo toString para a função "Exibir Detalhes br.com.teste.atividadespraticas.Produto"
    @Override
    public String toString() {
        return  "ID: " + getID() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Estoque Atual: " + getQuantidade() + "\n" +
                "Preço Atual: " + String.format("%.2f", getPreco()) + "\n" +
                "Detalhes: " + getDetalhe() + "\n" +
                "Data de Validade: " + getDataValidade() + "\n"
                ;
    }
}
