package com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "João";

        System.out.println(estudante.idade);
        System.out.println(estudante.genero);
        System.out.println(estudante.nome);

        System.out.println("--------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.genero);
        System.out.println(estudante2.nome);


    }
}
