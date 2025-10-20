package br.com.teste.atividadespraticas;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    // Setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Método para exibir informações
    public void exibirDadosConta() {
        System.out.println("Titular Conta: " + titular);
        System.out.println("Conta Bancária: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}
