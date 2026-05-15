package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        int resultado1 = calculadora.multiplicaDoisNumeros(10,4);
        System.out.println(resultado1);

        double resultado2 = calculadora.divideDoisNumeros(24, 4);
        System.out.println(resultado2);

        calculadora.imprimeDivisaoDeDoisNumeros(10,0);

    }
}
