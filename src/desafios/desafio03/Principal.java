/**
 * 1. Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
 *    Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 * 2. Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
 *    uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
 *    (por exemplo, ter pelo menos 8 caracteres).
 * 3. Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
 *    (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada,
 *    ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for
 *    encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
 */

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
