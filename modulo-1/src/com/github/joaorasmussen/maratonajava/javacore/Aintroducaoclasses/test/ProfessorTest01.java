package com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Albert Einstein";
        prof.idade = 72;
        prof.genero = 'M';

        System.out.println("Nome: "+prof.nome+"\nIdade: "+prof.idade+"\nGênero: "+prof.genero);
    }
}
