package br.com.alura.atividades.excecoes;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String message) {

        super(message);
    }
}
