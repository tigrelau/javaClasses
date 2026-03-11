package br.com.fiap.rh.model;

public class Professor {

    String nome;
    int idade;
    String genero;
    String cargo;
    String turma;
    String materia;

    void ensinar(){
        System.out.println(nome + " ensina " + materia + " para a turma " + turma);
    }

}
