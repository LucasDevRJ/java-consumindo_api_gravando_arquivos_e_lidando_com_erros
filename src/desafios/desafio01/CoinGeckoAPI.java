/**
 * 2. Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
 * à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.
 */

package desafios.desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGeckoAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a criptomoeda desejada: ");
        String criptomoeda = entrada.nextLine();

        criptomoeda = criptomoeda.replaceAll(" ", "+");
        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=brl";

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
