package desafios.desafio04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("arquivo.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Conteúdo a ser gravado no arquivo.");
        bufferedWriter.close();
    }
}
