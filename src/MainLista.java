import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLista {
    public static void main(String[] args) {

        List <String> listaComArray = new ArrayList<>();
        listaComArray.add("Ellen");
        listaComArray.add("Osires");
        listaComArray.add("Maria");
        listaComArray.add("Joyce");

        List <String> listaComLinked = new LinkedList<>();
        listaComLinked.add("João");
        listaComLinked.add("Aurelia");
        listaComLinked.add("Osires");
        listaComLinked.add("Ellen");

        System.out.println("Lista Istanciada com ArrayList: ");
        System.out.println(listaComArray);

        System.out.println();

        System.out.println("Lista Istanciada com LinkedList: ");
        System.out.println(listaComLinked);


    }
}
