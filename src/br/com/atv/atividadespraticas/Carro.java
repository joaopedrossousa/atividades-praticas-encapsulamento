package br.com.atv.atividadespraticas;

public class Carro {
    private String modeloCarro;
    private double precoCarroAno1;
    private double precoCarroAno2;
    private double precoCarroAno3;
    //Recebe Modelo Carro;
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    //Recebe precos carros;
    public void setPrecoCarroAno1(double precoCarroAno1) {
        this.precoCarroAno1 = precoCarroAno1;
    }

    public void setPrecoCarroAno2(double precoCarroAno2) {
        this.precoCarroAno2 = precoCarroAno2;
    }

    public void setPrecoCarroAno3(double precoCarroAno3) {
        this.precoCarroAno3 = precoCarroAno3;
    }

    //Metodo para exibir info;
    public void exibirInfoCarro(){
        System.out.println("Modelo Carro: " +modeloCarro);
        System.out.println("Preço Ano [1]: " +precoCarroAno1);
        System.out.println("Preco Ano [2]: " + precoCarroAno2);
        System.out.println("Preco Ano [3]: " + precoCarroAno3);
    }











}
