package br.com.alura.atividades;

public class Titulo implements Comparable <Titulo>{
    private String nome;

    public Titulo (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroNome) {
        return this.getNome().compareTo(outroNome.getNome());
    }
}
