import br.com.teste.atividadespraticas.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNumeroConta(123456789);
        contaBancaria.setSaldo(2345.50);
        contaBancaria.setTitular("João Pedro Sousa");

        contaBancaria.exibirDadosConta();


    }

}
