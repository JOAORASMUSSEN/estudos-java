package com.github.joaorasmussen.maratonajava.introducao;

public class Aula05Exercicio01 {
    public static void main(String[] args) {
        double salarioAnual = 95000;
        double primeiroIntervalo = 9.70/100;
        double segundoIntervalo = 37.35/100;
        double terceiroIntervalolo=49.50/100;

        double valorImposto;
        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiroIntervalo;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundoIntervalo;
        }else {
            valorImposto = salarioAnual * terceiroIntervalolo;
        }

        System.out.println("Valor do imposto é: "+valorImposto);
    }
}
