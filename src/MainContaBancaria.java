import br.com.teste.atividadespraticas.ContaBancaria;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaUm = new ContaBancaria(102030);
        contaUm.setSaldoConta(1000);
        ContaBancaria contaDois = new ContaBancaria(203040);
        contaDois.setSaldoConta(10000);
        ContaBancaria contaTres = new ContaBancaria(406010);
        contaTres.setSaldoConta(2000);

        ArrayList <ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(contaUm);
        listaContas.add(contaDois);
        listaContas.add(contaTres);

        double maiorSaldo = 0;
        int contaMaiorSaldo = 0;

        for (ContaBancaria conta : listaContas){
            if (conta.getSaldoConta() > maiorSaldo){
                maiorSaldo = conta.getSaldoConta();
                contaMaiorSaldo = conta.getNumeroConta();
            }

        }

        System.out.println("A conta com maior saldo é %d e o saldo é R$%.2f".formatted(contaMaiorSaldo, maiorSaldo));

    }
}
