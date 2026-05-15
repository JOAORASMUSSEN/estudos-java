package com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.joaorasmussen.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        //carro1 e carro2 var de referência

        carro1.marca  = "Volkswagen";
        carro1.modelo  = "Gol";
        carro1.ano = 2017;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 1999;

        System.out.println("Carro 1:");
        System.out.println(" Marca: "+carro1.marca);
        System.out.println(" Modelo: "+carro1.modelo);
        System.out.println(" Ano: "+carro1.ano);

        System.out.println();

        System.out.println("Carro 2:");
        System.out.println(" Marca: "+carro2.marca);
        System.out.println(" Modelo: "+carro2.modelo);
        System.out.println(" Ano: "+carro2.ano);

    }
}
