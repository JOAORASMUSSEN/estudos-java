package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;
    private  double media = 0;

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
        media = soma/salarios.length;

        System.out.printf("A média salarial é: %.2f", media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
