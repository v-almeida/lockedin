package academy.main.javacore.construtores.test;

import academy.main.javacore.construtores.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("CDZ", "TV", 12, "Ação", "Bandai");
        //anime.init("CDZ", "TV", 12, "Ação");
        anime.imprime();
    }

}
