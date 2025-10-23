package br.com.teste.atividadespraticas;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public double aplicaDesconto(int desconto){
        precoProduto = precoProduto - (precoProduto * desconto / 100);
        return precoProduto;
    }

}
