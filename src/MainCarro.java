import br.com.atv.atividadespraticas.Carro;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setModeloCarro("Renault Sandero");
        carro.setPrecoCarroAno1(28900.99);
        carro.setPrecoCarroAno2(30500.99);
        carro.setPrecoCarroAno3(23500.00);

        //Saída
        carro.exibirInfoCarro();


    }
}
