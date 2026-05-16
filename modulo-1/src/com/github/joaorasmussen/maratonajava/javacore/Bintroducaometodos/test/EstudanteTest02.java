package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        //estudante01 e 02 referenciam um objeto na memória
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome  = "Cinderela";
        estudante01.idade = 17;
        estudante01.genero  = 'F';

        estudante02.nome  = "Zeus";
        estudante02.idade  = 18;
        estudante02.genero  = 'M';

        estudante01.imprime();
        System.out.println("--------------");
        estudante02.imprime();
    }
}
