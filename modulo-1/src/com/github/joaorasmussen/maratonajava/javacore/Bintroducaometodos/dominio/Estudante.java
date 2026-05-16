package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char genero;

    public void imprime(){
        //this: referência que aponta pro objeto atual
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.genero);
    }
}
