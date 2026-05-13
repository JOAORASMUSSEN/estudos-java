package com.github.joaorasmussen.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando domingo = 1
        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char genero ='M';
        switch (genero){
            case 'M':
                System.out.println("masculino");
                break;
            case 'F':
                System.out.println("feminino");
                break;
            default:
            System.out.println("Inválido");
            break;
        }
    }
}
