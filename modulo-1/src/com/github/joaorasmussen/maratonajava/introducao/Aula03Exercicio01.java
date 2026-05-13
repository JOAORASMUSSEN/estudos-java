package com.github.joaorasmussen.maratonajava.introducao;
/*
EX:
crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome fictício>, morando no endereço <endereço fictício>,
confirmo que recebi o salário <salário fictício>, na data <data>
 */
public class Aula03Exercicio01 {
    public static void main(String[] args) {
        String nome = "Ronaldo";
        String endereco = "Rua São Paulo 432";
        double salario = 1800.00;
        String dataRecebimento = "05/05/2026";

        System.out.printf("Eu %s, morando no endereço %s, " +
                "confirmo que recebi o salário de R$%.2f, na data %s \n",
                nome, endereco, salario, dataRecebimento);

        //outra forma
        String relatorio ="Eu "+nome+" morando no endereço "+endereco+
                " confirmo que recebi o salário de "+salario+", na data "+dataRecebimento;
        System.out.println(relatorio);

    }
}
