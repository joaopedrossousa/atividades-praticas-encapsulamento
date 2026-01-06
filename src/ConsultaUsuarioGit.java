import br.com.alura.atividades.InformacoesUserGit;
import br.com.alura.atividades.UsuarioGit;
import br.com.alura.atividades.excecoes.ErroConsultaGitHubException;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaUsuarioGit {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o usuario do GitHub: ");

        String nomeInformado = scanner.nextLine();

        String urlRequisicao = "https://api.github.com/users/" + nomeInformado;

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlRequisicao))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //troubleshoot da resposta da api, 200 = ok, 404 = not found
            //System.out.println(response);
            //imprime o json
            //System.out.println(response.body());

            //System.out.println(response.statusCode());

            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado...");
            }

            Gson gson = new Gson();

            String json = response.body();

            InformacoesUserGit informacoesUserGit = gson.fromJson(json, InformacoesUserGit.class);

            //testando saída
            //System.out.println(informacoesUserGit);

            System.out.println();

            UsuarioGit usuarioGit = new UsuarioGit(informacoesUserGit);

            System.out.println(usuarioGit);


        } catch (InterruptedException | IOException e) {
            System.out.println("Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();

        } catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
