package desafios.desafio03;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Desafio 1");
        Divisor divisor = new Divisor();
        divisor.divide(4, 0);
        System.out.println("--------------------------");
        System.out.println("Desafio 2");
        Usuario usuario = new Usuario();
        usuario.logar("cama");
        System.out.println("--------------------------");
        System.out.println("Desafio 3");
        GitHubApi gitHubApi = new GitHubApi();
        gitHubApi.pesquisaUsuario();
    }
}
