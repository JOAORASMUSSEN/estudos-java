package com.github.joaorasmussen.maratonajava.javacore.Dconstrutores.test;

import com.github.joaorasmussen.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball", "TV", 10, "Luta", "Disney");
        //Anime anime2 = new Anime();
        anime.imprime();
        //System.out.println("---------------");
        //anime2.imprime();
    }
}
