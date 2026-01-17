/**
 * 1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
 *    Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON
 *    representando uma pessoa em um objeto do tipo Pessoa.
 *
 * 2. Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos
 *    estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a
 *    documentação da biblioteca Gson para flexibilizar a conversão.
 *
 * 3. Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora. Em seguida,
 *    implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro
 *    em um objeto do tipo Livro.
 */

package desafios.desafio02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        String json = """
          {
            "nome" : "Lucas",
            "idade" : 26,
            "cidade": "Rio de Janeiro"
          }
        """;

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);

        System.out.println("---------------------------------------");

        String jsonLivro = """
          {
            "titulo" : "O Hobbit",
            "autor" : "J. R. R. Tolkien",
            "editora" : {
                "nome" : "HarperCollins"
            }
          }
        """;

        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println(livro);
    }
}
