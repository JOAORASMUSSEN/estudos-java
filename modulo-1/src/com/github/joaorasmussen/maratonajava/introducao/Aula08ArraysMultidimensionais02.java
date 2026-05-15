package com.github.joaorasmussen.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] array = new int[3][];

        int [] array2 = {2, 5, 6, 7};

        array[0] = new int[3];
        array[1] = new int []{1,2,3,4};
        array[2] = array2;

        int [][] array3 ={{0,2},{1,2, 3,4, 5, 6},{1, 2, 3}};

        for(int[] arr : array3){
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.println("\n");
        }

    }
}
