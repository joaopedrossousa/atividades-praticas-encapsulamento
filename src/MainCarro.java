import br.com.atv.atividadespraticas.Carro;
import br.com.atv.atividadespraticas.ModeloCarro;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        ModeloCarro modeloCarro = new ModeloCarro();

        carro.setModeloCarro("Renault Sandero");
        carro.setPrecoCarroAno1(28900.99);
        carro.setPrecoCarroAno2(30500.99);
        carro.setPrecoCarroAno3(23500.00);
        modeloCarro.setAnoModelo(2010);
        modeloCarro.setTipoCarro("Hatch");
        modeloCarro.setPotenciaMotor("97 CV");

        //Saída
        //carro.exibirInfoCarro();
        modeloCarro.exibirInfoCarro();


    }
}
