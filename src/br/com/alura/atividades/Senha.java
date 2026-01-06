package br.com.alura.atividades;

import br.com.alura.atividades.excecoes.ExcedeuCaracteresSenhaException;
import br.com.alura.atividades.excecoes.SenhaIncorretaException;

public class Senha {

    private String senha = "15182129";
    private String senhaInformada;

    public void setSenhaInformada(String senhaInformada) {
        this.senhaInformada = senhaInformada;
    }

    public void validarSenha(){

        if (senhaInformada.length() != 8){
            throw new ExcedeuCaracteresSenhaException("A senha deve conter 8 caracteres...");

        } else if (!senhaInformada.equals(senha)){
            throw new SenhaIncorretaException("Senha incorreta...");
            
        }

        System.out.println("Senha correta...");

    }
}
