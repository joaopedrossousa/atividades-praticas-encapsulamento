package br.com.atv.atividadespraticas;

public class Livro implements Calculavel {
    private String nomeLivro;
    private double precoLivro;
    private int quantLivro;

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    public int getQuantLivro() {
        return quantLivro;
    }

    public void setQuantLivro(int quantLivro) {
        this.quantLivro = quantLivro;
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.10;
        double precoFinal = (quantLivro * precoLivro) * (1 - desconto);
        return precoFinal;
    }
}
