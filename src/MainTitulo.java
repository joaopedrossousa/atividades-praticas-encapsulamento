import br.com.alura.atividades.Titulo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class MainTitulo {
    public static void main(String[] args) {
        Titulo nomeUm = new Titulo("João");
        Titulo nomeDois = new Titulo("Pedro");
        Titulo nomeTres = new Titulo("Aurélia");
        Titulo nomeQuatro = new Titulo("Ellen");

        List<Titulo> listaNomes = new LinkedList<>();

        listaNomes.add(nomeUm);
        listaNomes.add(nomeDois);
        listaNomes.add(nomeTres);
        listaNomes.add(nomeQuatro);

        Collections.sort(listaNomes);

        System.out.println(listaNomes);


    }
}
