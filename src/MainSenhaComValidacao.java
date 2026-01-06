import br.com.alura.atividades.Senha;
import br.com.alura.atividades.excecoes.ExcedeuCaracteresSenhaException;
import br.com.alura.atividades.excecoes.SenhaIncorretaException;

import java.util.Scanner;

public class MainSenhaComValidacao {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        Senha senha = new Senha();

        System.out.println("Informe a Senha: ");
        String senhaInformada = scanner.nextLine();
        senha.setSenhaInformada(senhaInformada);

        try{
            senha.validarSenha();
            System.out.println("Programa Encerrado...");
        }catch (SenhaIncorretaException | ExcedeuCaracteresSenhaException e){
            System.out.println(e.getMessage());
        }




    }
}
