package com.github.joaorasmussen.maratonajava.javacore.Csobrecargametodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.init("Naruto", "TV", 68);
        anime.init("Naruto", "TV", 68, "Ação");
//            anime.setGenero("Ação");
//        anime.setNome("Naruto");
//        anime.setTipo("TV");
//        anime.setEpisodios(68);
        anime.imprime();
    }
}
