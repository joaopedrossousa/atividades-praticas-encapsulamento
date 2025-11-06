import br.com.atv.atividadespraticas.ConversorMoeda;

import java.util.Scanner;

public class ConversorMoedaMain {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em Dollar ($): ");
        double valorInformadoReal = scanner.nextDouble();
        conversorMoeda.setValorEmReal(valorInformadoReal);

        System.out.println("""
                Valor Informado: $%.2f
                Conversão para Real: R$%.2f 
                """.formatted(conversorMoeda.getValorEmDollar(), conversorMoeda.converterDolarParaReal()));

    }
}
