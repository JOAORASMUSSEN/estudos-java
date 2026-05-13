package com.github.joaorasmussen.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +, -, /, *
        int num1 = 30;
        int num2 = 10;
        double divisao = (double) num2/num1;
        System.out.println(num1+num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(divisao);

        //% : operador de resto

        int resto = 20 % 2;
        System.out.println(resto);

        //< e >, <= e >=, == e != :operadores lógicos, devolvem bool
        //não da pra comparar tipos diferentes ex: 10 == "10" é false
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // and = && , or = || , not = !
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLei01 = idade > 30 && salario >4600;
        System.out.println(isDentroDaLei01);

        boolean isDentroDaLei02 = idade > 30 || salario > 4600;
        System.out.println(isDentroDaLei02);

        // = , +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 1000 = 2800
        System.out.println(bonus);
        bonus *= 2; //bonus = bonus *2 = 2800*2 = 5600
        System.out.println(bonus);
    }
}
