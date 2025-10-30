package br.com.atv.atividadespraticas;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double alturaRetangulo;
    private double larguraRetangulo;

    public double getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public void setAlturaRetangulo(double alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }

    public double getLarguraRetangulo() {
        return larguraRetangulo;
    }

    public void setLarguraRetangulo(double larguraRetangulo) {
        this.larguraRetangulo = larguraRetangulo;
    }

    @Override
    public double calcularArea() {
        double base = getLarguraRetangulo();
        double altura = getAlturaRetangulo();
        double areaRetangulo = base * altura;
        return areaRetangulo;
    }

    @Override
    public double calcularPerimetro() {
        double base = getLarguraRetangulo();
        double altura = getAlturaRetangulo();
        double perimetroRetangulo = (base * 2) + (altura * 2);
        return perimetroRetangulo;
    }

}
