package desafios.desafio02;

public class Livro {

    private String titulo;
    private String autor;
    private Editora editora;

    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Título = " + titulo + " | Autor = " + autor + " | Editora = " + editora.getNome();
    }
}
