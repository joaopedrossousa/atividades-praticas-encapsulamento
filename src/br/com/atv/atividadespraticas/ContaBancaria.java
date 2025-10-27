package br.com.atv.atividadespraticas;

public class ContaBancaria {
    protected double saldo = 2000;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void consultarSaldo(){
        System.out.println("Saldo Atual: R$%.2f".formatted(getSaldo()));
    }

    public void depositarSaldo(double valDepositado){
        double saldoAtual = getSaldo();
        saldoAtual += valDepositado;
        setSaldo(saldoAtual);

    }

    public void sacarSaldo(double valSacado){
        double saldoAtual = getSaldo();
        if (valSacado <= saldoAtual){
            saldoAtual -= valSacado;
            setSaldo(saldoAtual);
        }else{
            System.out.println("Saldo insuficiente...");
        }
    }
}
