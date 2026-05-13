package com.github.joaorasmussen.maratonajava.introducao;

public class Aula06Exercicio02 {
    //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
    //condição: valor da parcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;
        double min = 1000;
        int contador = 0;
        while(valorCarro >= min){
            valorCarro -= min;
            contador++;
        }
        System.out.println(contador);

        double valorCarro2 = 30000;
        for(int parcela = 1; parcela <= valorCarro2; parcela++) {
            double valorParcela = valorCarro2 / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.printf("Parcela %d R$%.2f\n", parcela, valorParcela);
        }
    }
}
