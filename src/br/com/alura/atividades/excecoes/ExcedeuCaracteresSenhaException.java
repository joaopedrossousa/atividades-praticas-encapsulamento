package br.com.alura.atividades.excecoes;

public class ExcedeuCaracteresSenhaException extends RuntimeException {
    public ExcedeuCaracteresSenhaException(String message) {
        super(message);
    }
}
