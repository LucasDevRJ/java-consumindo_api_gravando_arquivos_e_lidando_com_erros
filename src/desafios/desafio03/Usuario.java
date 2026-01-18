package desafios.desafio03;

public class Usuario {

    public void logar(String senha) {
       try {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
            }
       } catch (SenhaInvalidaException erro) {
           System.out.println("Erro: " + erro.getMessage());
       }
    }
}
