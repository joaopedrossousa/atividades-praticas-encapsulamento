package br.com.atv.atividadespraticas;

public class NumerosPrimos {
    private int numInformado;

    public int getNumInformado() {
        return numInformado;
    }

    public void setNumInformado(int numInformado) {
        this.numInformado = numInformado;
    }

    public void verificarPrimalidade(int num){
        num = getNumInformado();
        if (num > 1 && num / num == 0 && num % 2 != 0){
            System.out.println("O numero %d é primo...".formatted(num));
        }else{
            System.out.println("O numero %d não é primo...".formatted(num));
        }


    }
}
