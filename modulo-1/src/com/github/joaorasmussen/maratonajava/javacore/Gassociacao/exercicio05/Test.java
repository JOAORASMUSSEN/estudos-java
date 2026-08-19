package com.github.joaorasmussen.maratonajava.javacore.Gassociacao.exercicio05;

public class Test {
    public static void main(String[] args) {
        Local local = new Local("IMS");
        Aluno aluno = new Aluno("Luciano", 21);
        Professor professor = new Professor("Isaac Newton", "Física");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Lei da Gravidade",alunosSeminario, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
