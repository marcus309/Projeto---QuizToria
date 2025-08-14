package quiztoria1;

public class Pontuacao {
    private static int pontos = 0;

    public static void adicionarPonto() {
        pontos++;
    }

    public static int getPontos() {
        return pontos;
    }

    public static void resetar() {
        pontos = 0;
    }
}
