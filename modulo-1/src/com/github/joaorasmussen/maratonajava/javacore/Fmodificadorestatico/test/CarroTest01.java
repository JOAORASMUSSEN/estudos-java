package com.github.joaorasmussen.maratonajava.javacore.Fmodificadorestatico.test;

import com.github.joaorasmussen.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes",320);
        Carro c3 = new Carro("Audi", 300);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        Carro.velocidadeLimite = 180;
        //só precisa mudar uma vez por ser static

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
