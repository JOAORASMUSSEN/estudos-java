package com.github.joaorasmussen.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //array de array
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 1;
        dias[1][1] = 8;
        dias[1][2] = 1;

        dias[2][0] = 3;
        dias[2][1] = 8;
        dias[2][2] = 3;

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length ; j++){
                System.out.println(dias[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("-----------");

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[0].length ; j++){
                //dias[0].length: não funciona para ragged array
                System.out.println(dias[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("-----------");

        for(int[] arr : dias){
            for(int num: arr){
                System.out.println(num);
            }
            System.out.println("\n");
        }

    }
}
