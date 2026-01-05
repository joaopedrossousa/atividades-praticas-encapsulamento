import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainListaPolimorfica {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("João");
        listaPolimorfica.add("Pedro");
        System.out.println("Arraylist: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Silva");
        listaPolimorfica.add("Sousa");
        System.out.println("Linked List: " + listaPolimorfica);

    }
}
