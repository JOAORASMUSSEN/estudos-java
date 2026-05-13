package com.github.joaorasmussen.maratonajava.introducao;

public class Aula05Exercicio02 {
    //dado um valor entre 1 e 7, imprima se é dia útil ou não
    //considere domingo como 1
    public static void main(String[] args) {

        byte dia = 3;

        switch(dia){
            case 1:
                System.out.println("não é dia útil");
                break;
            case 2:
                System.out.println("é dia útil");
                break;
            case 3:
                System.out.println("é dia útil");
                break;
            case 4:
                System.out.println("é dia útil");
                break;
            case 5:
                System.out.println("é dia útil");
                break;
            case 6:
                System.out.println("é dia útil");
                break;
            case 7:
                System.out.println("não é dia útil");
                break;
            default:
                System.out.println("invalido");
                break;
        }

        //outra forma

        switch(dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("inválido");
        }

    }
}
