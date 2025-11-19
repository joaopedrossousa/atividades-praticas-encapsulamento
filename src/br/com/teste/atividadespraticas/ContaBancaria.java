package br.com.teste.atividadespraticas;

public class ContaBancaria {
    private int numeroConta;
    private  double saldoConta;

    public ContaBancaria (int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
