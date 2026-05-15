package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calc =new Calculadora();
        int num1 = 1;
        int num2 = 3;
        //o metodo faz uma cópia do num1 e num2
        calc.alteraDoisNumeros(num1, num2);

        System.out.println("Fora do método");
        System.out.printf("Num1 = %d, Num2 = %d", num1, num2);
    }
}
