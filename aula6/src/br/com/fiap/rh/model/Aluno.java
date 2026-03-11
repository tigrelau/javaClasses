package br.com.fiap.rh.model;

public class Aluno {

    String nome;
    int idade;
    String genero;
    String cargo;
    String turma;

    void estudar(){
        System.out.println(nome +" estuda na turma " + turma);
    }

}
