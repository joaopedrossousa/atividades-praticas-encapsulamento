package br.com.atv.atividadespraticas;

public class ModeloCarro extends Carro{
    protected String potenciaMotor;
    protected int anoModelo;
    protected String tipoCarro;

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void exibirInfoCarro(){
        super.exibirInfoCarro();
        System.out.println("Potencia Motor: " + potenciaMotor);
        System.out.println("Tipo do Modelo: " + tipoCarro);
        System.out.println("Ano do Modelo: " + anoModelo);

    }

}
