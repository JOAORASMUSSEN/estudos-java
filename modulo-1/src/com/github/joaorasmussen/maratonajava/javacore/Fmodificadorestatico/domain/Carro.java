package com.github.joaorasmussen.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    //não pertence mais ao objeto, pertence a classe

    public Carro(String marca, double velocidadeMaxima){
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Nome "+this.marca);
        System.out.println("Velocidade Máxima "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite "+ Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return marca;
    }

    public void setNome(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
