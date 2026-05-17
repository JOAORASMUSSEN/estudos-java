package com.github.joaorasmussen.maratonajava.javacore.Eblocosinicializacao.test;

import com.github.joaorasmussen.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //System.out.println(anime.getEpisodios());
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }


    }
}
