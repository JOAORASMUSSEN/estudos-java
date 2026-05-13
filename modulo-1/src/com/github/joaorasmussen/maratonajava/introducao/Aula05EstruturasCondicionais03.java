package com.github.joaorasmussen.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String doar = "Vou doar para caridade";
        String naoDoar ="Não vou doar para caridade";
        //operador ternário: (condicao) ? verdadeiro : falso
        String resultado = (salario > 4000) ? doar : naoDoar;

        System.out.println(resultado);
    }
}
