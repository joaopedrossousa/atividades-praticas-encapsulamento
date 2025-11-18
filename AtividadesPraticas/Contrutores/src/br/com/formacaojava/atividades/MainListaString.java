package br.com.formacaojava.atividades;

import java.util.ArrayList;

public class MainListaString {
    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("João");
        listaString.add("Pedro");
        listaString.add("Silva");
        listaString.add("Sousa");

        listaString.forEach(string -> System.out.println(string));
    }
}
