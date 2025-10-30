import br.com.atv.atividadespraticas.CalculadoraSalaRetangular;

import java.util.Scanner;

public class CalculadoraSalaRetangularMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        System.out.println("Informe a Altura da Sala em Metros: ");
        double alturaInformada = scanner.nextDouble();
        calculadoraSalaRetangular.setAlturaRetangulo(alturaInformada);

        System.out.println("Informe a Largura do Retangulo em Metros: ");
        double larguraInformada = scanner.nextDouble();
        calculadoraSalaRetangular.setLarguraRetangulo(larguraInformada);

        System.out.println(" ");
        System.out.println("Area da  Sala: %.1f m²".formatted(calculadoraSalaRetangular.calcularArea()));
        System.out.println("Perimetro da Sala: %.1f m ".formatted(calculadoraSalaRetangular.calcularPerimetro()));




    }
}
