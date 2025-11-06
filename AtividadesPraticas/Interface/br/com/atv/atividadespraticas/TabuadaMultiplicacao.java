package br.com.atv.atividadespraticas;

public class TabuadaMultiplicacao implements Tabuada{
    private int numInformado;

    public int getNumInformado() {
        return numInformado;
    }

    public void setNumInformado(int numInformado) {
        this.numInformado = numInformado;
    }

    @Override
    public void mostrarTabuada() {
        int num = getNumInformado();

        for (int i = 0; i < 11; i++) {
            System.out.println("%d X %d = %d".formatted(num, i, num * i));

        }
    }
}
