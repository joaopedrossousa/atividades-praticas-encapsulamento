package br.com.formacaojava.atividades;

public class Produto {
    private int ID;
    private String nome;
    private  double preco;
    private int quantidade;
    private String detalhe;

    //Construtor
    public Produto(int ID,String nome, double preco, int quantidade){
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public int getID(){
        return ID;
    }

    public String getDetalhe() {
        return detalhe;
    }
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    //Reformulação do metodo toString para a função "Exibir Detalhes br.com.teste.atividadespraticas.Produto"
    @Override
    public String toString() {
        return  "ID" + getID() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Estoque Atual: " + getQuantidade() + "\n" +
                "Preço Atual: " + String.format("%.2f", getPreco()) + "\n" +
                "Detalhes: " + getDetalhe() + "\n"
                ;
    }
}
