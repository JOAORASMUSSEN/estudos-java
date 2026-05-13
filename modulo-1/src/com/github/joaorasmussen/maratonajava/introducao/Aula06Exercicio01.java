package com.github.joaorasmussen.maratonajava.introducao;

public class Aula06Exercicio01 {
    public static void main(String[] args) {
        //imprima todos os números pares entre 0 e 100
        int num = 0;
        while(num <= 100){
            if(num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }

        //usando for

        for(int i = 0; i <= 100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
