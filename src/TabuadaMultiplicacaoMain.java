import br.com.atv.atividadespraticas.TabuadaMultiplicacao;

import java.util.Scanner;

public class TabuadaMultiplicacaoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();

        System.out.println("Qual numero deseja visualizar a tabuada? ");
        int numInfomado = scanner.nextInt();
        tabuadaMultiplicacao.setNumInformado(numInfomado);

        System.out.println(" ");

        tabuadaMultiplicacao.mostrarTabuada();


    }
}
