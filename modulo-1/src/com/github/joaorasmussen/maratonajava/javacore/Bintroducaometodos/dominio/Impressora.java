package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Impressora {
    public void imprime(Estudante estudante){
        //parâmetro passado via referência
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.genero);
    }

}
