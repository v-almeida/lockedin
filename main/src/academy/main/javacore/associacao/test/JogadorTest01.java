package academy.main.javacore.associacao.test;

import academy.main.javacore.associacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador("Aaron Rodgers");
        Jogador jogador2 = new Jogador("Tyrese Maxey");
        Jogador jogador3 = new Jogador("LeBron James");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }

}
