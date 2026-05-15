package com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //var de referencia do tipo estudante
        //fazendo referencia pra objeto do tipo estudante
        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.genero = 'M';
        estudante.idade = 21;
        System.out.println(estudante.nome);
        System.out.println(estudante.genero);
        System.out.println(estudante.idade);
        System.out.println(estudante);

    }
}
