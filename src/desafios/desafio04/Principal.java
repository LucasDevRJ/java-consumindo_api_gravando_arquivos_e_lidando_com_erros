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
