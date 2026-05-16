package com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.test;

import com.github.joaorasmussen.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "João";
        funcionario01.idade = 21;
        funcionario01.salarios = new double[]{15000, 20000, 4000};

        funcionario01.imprimeDados();
    }
}
