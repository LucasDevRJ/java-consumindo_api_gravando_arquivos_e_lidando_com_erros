package desafios.desafio03;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Desafio 1");
        Divisor divisor = new Divisor();
        divisor.divide(4, 0);
        System.out.println("--------------------------");
        System.out.println("Desafio 2");
        Usuario usuario = new Usuario();
        usuario.logar("cama");
    }
}
