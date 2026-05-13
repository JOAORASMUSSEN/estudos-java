package com.github.joaorasmussen.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for

        int contador = 0;
        System.out.println("Usando while:\n");
        while(contador <= 5){
            System.out.println(contador);
            contador++;
        }
        System.out.println("\n");
        System.out.println("Usando for:\n");
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("Usando do-while:\n");
        contador =0;
        do{
            System.out.println(contador);
            contador++;
        }while(contador <= 5);
    }
}
