package desafios.desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooksAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o título do livro: ");
        String titulo = entrada.nextLine();

        titulo = titulo.replaceAll(" ", "+");
        String url = "https://www.googleapis.com/books/v1/volumes?q=" + titulo;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
