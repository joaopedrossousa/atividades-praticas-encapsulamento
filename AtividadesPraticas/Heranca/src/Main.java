import br.com.teste.atividadespraticas.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero da Conta: ");
        int dadosNumeroConta = entrada.nextInt();
        contaBancaria.setNumeroConta(dadosNumeroConta);
        contaBancaria.setSaldo(2345.50);
        contaBancaria.setTitular("João Pedro Sousa");

        contaBancaria.exibirDadosConta();



        entrada.close();
    }

}
