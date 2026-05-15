package com.github.joaorasmussen.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] numeros2 = new int[]{6,67,8,9,0};
        //foreach
        for(int numero : numeros){
            System.out.println(numero);
        }

        System.out.println("\n");
        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

    }
}
