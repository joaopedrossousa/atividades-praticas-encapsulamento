package br.com.alura.atividades;

public class UsuarioGit {
    private String nomeUsuario;
    private Integer numSeguidores;

    public UsuarioGit(InformacoesUserGit informacoesUserGit) {
        this.nomeUsuario = informacoesUserGit.name();
        this.numSeguidores = informacoesUserGit.followers();
    }

    @Override
    public String toString() {
        return "---------------------------------------" + "\n" +
                "Nome do Usuário: " + nomeUsuario + "\n" +
                "Número de Seguidores: " + numSeguidores + "\n" +
                "---------------------------------------";

    }
}
