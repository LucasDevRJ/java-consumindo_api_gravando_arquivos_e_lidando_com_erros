package desafios.desafio03;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHubApi {

    public void pesquisaUsuario() throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        try {
            System.out.print("Digite o usuário que deseja realizar a pesquisa: ");
            var octocat = leitura.nextLine();

            String url = "https://api.github.com/users/" + octocat;

            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest requisicao = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

            if (resposta.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            JsonElement elementoJson = JsonParser.parseString(resposta.body());
            String jsonFormatado = gson.toJson(elementoJson);
            System.out.println(jsonFormatado);

        } catch (IllegalArgumentException | ErroConsultaGitHubException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            leitura.close();
        }
    }
}
