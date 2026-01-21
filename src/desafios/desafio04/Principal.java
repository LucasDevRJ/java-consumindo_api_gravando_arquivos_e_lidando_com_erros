/**
 * 1. Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
 * "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
 * 2. Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia
 * um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 * 3. Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
 * Utilize o método setPrettyPrinting para alcançar esse resultado.
 * 4. Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um
 * objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */

package desafios.desafio04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("arquivo.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Conteúdo a ser gravado no arquivo.");
        bufferedWriter.close();
        System.out.println("-----------------------------------------");
        Titulo titulo = new Titulo("corações de ferro", 2014, 134);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonTitulo = gson.toJson(titulo);
        System.out.println(jsonTitulo);
        System.out.println("-----------------------------------------");
        Veiculo veiculo = new Veiculo("Ford", "Corolla", 2014);
        String jsonVeiculo = gson.toJson(veiculo);
        System.out.println(jsonVeiculo);
    }
}
