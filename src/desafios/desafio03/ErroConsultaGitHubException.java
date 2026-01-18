package desafios.desafio03;

public class ErroConsultaGitHubException extends RuntimeException {

    private String mensagem;

    public ErroConsultaGitHubException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
