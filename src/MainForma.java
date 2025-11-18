import br.com.teste.atividadespraticas.Circulo;
import br.com.teste.atividadespraticas.Forma;
import br.com.teste.atividadespraticas.Quadrado;

import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args) {
        Circulo circuloUm = new Circulo();
        Quadrado quadradoUm = new Quadrado();
        Circulo circuloDois = new Circulo();
        Quadrado quadradoDois = new Quadrado();

        circuloUm.setRaio(4.6);
        circuloDois.setRaio(2.5);
        quadradoUm.setLado(2);
        quadradoDois.setLado(8);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circuloUm);
        listaDeFormas.add(circuloDois);
        listaDeFormas.add(quadradoUm);
        listaDeFormas.add(quadradoDois);

        for (Forma forma : listaDeFormas){
            if (forma instanceof Circulo){
                System.out.println("Area do Circulo: %.1fm³".formatted(forma.calcularArea()));
            }else {
                System.out.println("Area do Quadrado: %.1fm²".formatted(forma.calcularArea()));
            }
        }






    }
}
