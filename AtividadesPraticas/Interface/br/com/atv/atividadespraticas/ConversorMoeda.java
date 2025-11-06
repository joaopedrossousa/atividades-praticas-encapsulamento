package br.com.atv.atividadespraticas;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorEmDollar;

    public double getValorEmDollar() {
        return valorEmDollar;
    }

    public void setValorEmReal(double valorEmReal) {
        this.valorEmDollar = valorEmReal;
    }

    @Override
    public double converterDolarParaReal() {
        double conversaoReal = getValorEmDollar() * 5.34;
        return conversaoReal;
    }
}
