/**
 * 3. Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest
 * e HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis
 * sobre essa receita.
 */

package desafios.desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDBAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a receita desejada: ");
        String receita = entrada.nextLine();

        receita = receita.replaceAll(" ", "+");
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
