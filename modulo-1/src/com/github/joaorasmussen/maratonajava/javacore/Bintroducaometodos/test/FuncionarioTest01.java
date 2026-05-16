package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("João");
        funcionario01.setIdade(21);
        funcionario01.setSalarios(new double[] {12000,14000,54400});

        funcionario01.imprimeDados();
    }
}
