package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salarios;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for(double salario: this.salarios){
            System.out.println(salario);
        }
         imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios(){
        if(salarios == null){
            return;
        }
        double soma = 0;

        for(double salario: this.salarios){
            soma +=salario;
        }
        double media = soma/salarios.length;

        System.out.printf("A média salarial é: %.2f", media);
    }
}
