package br.com.teste.atividadespraticas;

public class Livro {
    private String livro;
    private String autor;

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes(){
        System.out.println("-------------------------");
        System.out.println("       FICHA LIVRO       ");
        System.out.println("-------------------------");
        System.out.println("Livro: " +getLivro());
        System.out.println("Autor: " +getAutor());
    }
}
