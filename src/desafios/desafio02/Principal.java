/**
 * 1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
 * Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON
 * representando uma pessoa em um objeto do tipo Pessoa.
 */

package desafios.desafio02;

import com.google.gson.Gson;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        String json = """
          {
            "nome" : "Lucas",
            "idade" : 26,
            "cidade": "Rio de Janeiro"
          }
        """;

        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);

        System.out.println("---------------------------------------");

    }
}
