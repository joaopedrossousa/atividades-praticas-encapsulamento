import br.com.alura.atividades.Divisao;

import java.util.Scanner;

public class DivComStackTracing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divisao divisao = new Divisao();

        System.out.println("Informe o numero a ser dividio: ");
        Integer numeroInformado = scanner.nextInt();
        divisao.setNumero(numeroInformado);
        scanner.nextLine();

        System.out.println("Informe o divisor: ");
        Integer divisorInformado = scanner.nextInt();
        divisao.setDivisor(divisorInformado);
        scanner.close();

        divisao.divide();

    }
}
