package br.com.teste.atividadespraticas;

public class Circulo implements Forma{
    private double raio;
    private double pi = 3.14;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return  pi * (getRaio() * getRaio());
    }
}
