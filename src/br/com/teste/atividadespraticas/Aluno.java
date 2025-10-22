package br.com.teste.atividadespraticas;

public class Aluno {
    private String nome;
    private double nota;
    private double somaNotas;
    private int contNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
        this.somaNotas += nota;
        this.contNotas += 1;

    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public double mediaNotas(){
        double media = somaNotas / contNotas;
        return media;
    }

}
