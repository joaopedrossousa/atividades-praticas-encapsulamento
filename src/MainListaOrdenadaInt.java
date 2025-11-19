import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainListaOrdenadaInt {
    public static void main(String[] args) {

        List<Integer> listaOrdenada = new LinkedList<>();

        listaOrdenada.add(10);
        listaOrdenada.add(4);
        listaOrdenada.add(8);
        listaOrdenada.add(3);
        listaOrdenada.add(6);
        listaOrdenada.add(14);
        listaOrdenada.add(0);
        listaOrdenada.add(55);

        Collections.sort(listaOrdenada);
        System.out.println("Lista Ordenada (Ordem Crescente): ");
        System.out.println(listaOrdenada);

    }
}
