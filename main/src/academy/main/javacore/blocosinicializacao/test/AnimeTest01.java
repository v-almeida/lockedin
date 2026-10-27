package academy.main.javacore.blocosinicializacao.test;

import academy.main.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        
        for (int eps : anime.getEps()){
            System.out.print(eps + " ");
        }
    }

}
