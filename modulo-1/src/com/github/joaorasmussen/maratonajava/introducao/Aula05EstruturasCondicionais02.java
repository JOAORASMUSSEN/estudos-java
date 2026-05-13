package com.github.joaorasmussen.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade1 = 14, idade2 = 17,idade3 = 20;
        String categoria;
        if(idade3 < 15){
           categoria = "Categoria infantil";
        } else if (idade3 >=15 && idade3 < 18) {
           categoria = "Categoria juvenil";
        }else{
           categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
