package br.com.alura.atividades;

public class Divisao {
    private Integer numero;
    private  Integer divisor;

    public void setDivisor(Integer divisor) {
        this.divisor = divisor;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void divide(){
        try {
            System.out.println("Resultado da divisão: " + numero / divisor);
        }catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero...");
        }
    }
}
