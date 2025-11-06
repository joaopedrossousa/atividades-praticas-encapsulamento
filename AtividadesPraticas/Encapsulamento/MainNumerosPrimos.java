import br.com.atv.atividadespraticas.NumerosPrimos;

import java.util.Scanner;

public class MainNumerosPrimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        System.out.println("---------------------");
        System.out.println("Informe um Numero:");
        int numInformado = scanner.nextInt();
        numerosPrimos.setNumInformado(numInformado);


    }
}
