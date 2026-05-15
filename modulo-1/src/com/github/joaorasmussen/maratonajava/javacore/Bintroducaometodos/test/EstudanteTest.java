package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Impressora;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Impressora impressora = new Impressora();

        estudante01.nome  = "Cinderela";
        estudante01.idade = 17;
        estudante01.genero  = 'F';

        estudante02.nome  = "Zeus";
        estudante02.idade  = 18;
        estudante02.genero  = 'M';

        impressora.imprime(estudante01);
        System.out.println("-----------");
        impressora.imprime(estudante02);

    }
}
