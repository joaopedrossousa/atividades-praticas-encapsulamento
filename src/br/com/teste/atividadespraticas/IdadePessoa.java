package br.com.teste.atividadespraticas;

import java.util.Scanner;

public class IdadePessoa {
    private String nome;
    private int idade;
    Scanner entrada = new Scanner(System.in);

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Metodo que recebe o nome
    public void recebeNome(String nome){
        this.nome = nome;

    }
    // Metodo que recebe a idade
    public void recebeIdade(int idade){
        this.idade = idade;
    }
    //Metodo que informa se é maior de idade ou não
    public void verificarIdade(){

        if (idade >= 18){
            System.out.println("%s é maior de idade...".formatted(nome));
        }else{
            System.out.println("%s é menor de idade...");
        }

    }



}
