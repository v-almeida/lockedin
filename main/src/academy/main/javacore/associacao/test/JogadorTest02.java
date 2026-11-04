package academy.main.javacore.associacao.test;

import academy.main.javacore.associacao.dominio.Jogador;
import academy.main.javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }

}
