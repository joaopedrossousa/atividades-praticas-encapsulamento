package br.com.atv.atividadespraticas;

public class ContaCorrente extends ContaBancaria{
    private double tarifaPorOperacao = 2;

    public double getTarifa() {
        return tarifaPorOperacao;
    }

    @Override
    public void depositarSaldo(double valDepositado){
        double saldoAtual = getSaldo();
        super.depositarSaldo(valDepositado);
        cobrarTarifa();

    }
    @Override
    public void sacarSaldo(double valSacado) {
        super.sacarSaldo(valSacado);
        cobrarTarifa();

    }


    public void cobrarTarifa(){
        System.out.println("Foi aplicada uma taxa de %.1f %% nessa transação...".formatted(getTarifa()));
        double saldoAtual = getSaldo();
        saldoAtual -= saldoAtual * (getTarifa() / 100);
        setSaldo(saldoAtual);

    }
}
