import br.com.atv.atividadespraticas.ContaBancaria;
import br.com.atv.atividadespraticas.ContaCorrente;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------");
            System.out.println("     CAIXA ELETRONICO     ");
            System.out.println("--------------------------");
            System.out.println("Selecione uma Opção: ");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Consultar Saldo");
            System.out.println("[4] Sair");
            int opcaoSelecionada = scanner.nextInt();
            System.out.println("--------------------------");

            if (opcaoSelecionada == 1){
                System.out.println("Informe a quantia a ser depositada: ");
                double quantiaDeposito = scanner.nextDouble();
                contaBancaria.depositarSaldo(quantiaDeposito);


            } else if (opcaoSelecionada == 2) {
                System.out.println("Informe a quantia a ser sacada: ");
                double quantiaSaque = scanner.nextDouble();
                contaBancaria.sacarSaldo(quantiaSaque);


            } else if (opcaoSelecionada == 3) {
                System.out.println(" ");
                contaBancaria.consultarSaldo();

                
            } else if (opcaoSelecionada == 4){
                System.out.println(" ");
                System.out.println("Encerrando Sistema...");
                break;
            }


        }
    }
}
