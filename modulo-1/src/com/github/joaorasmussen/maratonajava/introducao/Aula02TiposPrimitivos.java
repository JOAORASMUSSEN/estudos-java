package com.github.joaorasmussen.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    //psvm: atalho
    public static void main(String [] args){
        // int, double, float, char, byte, short, long, boolean
        int integerNumber = 10;
        double decimalNumber = 10.5;
        float decimalNumberShort = 10.5f;
        char characterLetter = 'A';
        byte smallIntegerNumber = 100;
        short shortIntegerNumber = 1000;
        long longIntegerNumber = 100000L;
        //o que muda é o tamanho de cada data type
        boolean trueOrFalse = true;

        System.out.println("O número é "+ integerNumber);
        System.out.println(trueOrFalse);

        //casting

        int idade = (int) 10000000000000L;//forçando o long entrar no int
        System.out.println(idade);

        //Strings
        String texto = "Isso é um texto";
        //escreve sout + tab: atalho
        System.out.println(texto);

    }
}
