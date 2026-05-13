package com.github.joaorasmussen.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade1 = 20, idade2 = 17;

        if(idade2 >= 18){
            System.out.println("Pode dirigir");
        }else{
            System.out.println("Não pode dirigir");
        }

        boolean isAutorizadoBeberAlcool = idade2 >= 18;

        if(isAutorizadoBeberAlcool){
            System.out.println("Pode beber");
        }
        if(!isAutorizadoBeberAlcool){
            System.out.println("Não pode beber");
        }
    }
}
