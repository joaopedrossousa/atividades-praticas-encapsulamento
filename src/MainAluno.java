import br.com.teste.atividadespraticas.Aluno;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int cont = 1;

        System.out.println("Infome o nome do Aluno: ");
        String nomeAluno = entrada.nextLine();
        aluno.setNome(nomeAluno);

        while(true){
            System.out.println("Informe a nota [%d]: ".formatted(cont));
            double notaAluno = entrada.nextDouble();
            aluno.setNota(notaAluno);
            System.out.println("Deseja informar outra nota? [1]SIM [2]NÃO");
            int opcaoSelecionada = entrada.nextInt();
            cont += 1;
            if (opcaoSelecionada == 2){
                break;
            }
        }
        System.out.println("Deseja calcular a média das notas lançadas? [1]SIM [2]NÃO");
        int opcaoSelecionada = entrada.nextInt();
        if (opcaoSelecionada == 1){
            System.out.println("-----------------------");
            System.out.println("BOLETIM ESCOLAR");
            System.out.println("-----------------------");
            System.out.println("Nome Aluno: " + aluno.getNome());
            System.out.println("Média: %.1f".formatted(aluno.mediaNotas()));
            if (aluno.mediaNotas() >= 4 && aluno.mediaNotas() < 7){
                System.out.println("Aluno ficou de exame...");
            }else if (aluno.mediaNotas() < 4){
                System.out.println("Aluno reprovado...");
            }else{
                System.out.println("Aluno aprovado....");
            }
        }else if (opcaoSelecionada == 2){
            System.out.println("-----------------------");
            System.out.println("BOLETIM ESCOLAR");
            System.out.println("-----------------------");
            System.out.println("Nome Aluno: " + aluno.getNome());
            if (aluno.mediaNotas() >= 4 && aluno.mediaNotas() < 7){
                System.out.println("Aluno ficou de exame...");
            }else if (aluno.mediaNotas() < 4){
                System.out.println("Aluno reprovado...");
            }else{
                System.out.println("Aluno aprovado....");
            }
        }else {
            System.out.println("Opção inválida....");
        }

    }
}
