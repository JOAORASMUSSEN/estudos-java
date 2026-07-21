package com.github.joaorasmussen.maratonajava.javacore.Gassociacao.test;

import com.github.joaorasmussen.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.github.joaorasmussen.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 =  new Professor("Newton");
        Professor professor2 = new Professor("Einstein");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Cambrige", professores);

        escola.imprime();

    }
}
