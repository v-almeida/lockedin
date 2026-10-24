package academy.main.javacore.sobrecarga.test;

import academy.main.javacore.sobrecarga.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("CDZ", "TV", 12, "Ação");
        anime.imprime();
    }

}
