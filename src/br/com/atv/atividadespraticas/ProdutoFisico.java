package br.com.atv.atividadespraticas;

public class ProdutoFisico implements Calculavel {
    private String nomeProduto;
    private double precoProduto;
    private  int quantProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        double taxa = 0.20;
        double precoFinal = (quantProduto * precoProduto) * (1 + taxa);
        return precoFinal;
    }
}
