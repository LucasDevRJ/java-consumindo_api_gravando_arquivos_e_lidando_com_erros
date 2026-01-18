package desafios.desafio03;

public class Divisor {

    public void divide(int dividendo, int divisor) {
        try {
            int divisao = dividendo / divisor;
            System.out.println(dividendo + " ÷ " + divisor + " = " + divisao);
        } catch (ArithmeticException erro) {
            System.out.println("Erro de Aritmética! Não dá para o divisor ser 0.");
            System.out.println("Erro: " + erro.getMessage());
        }
    }

}
