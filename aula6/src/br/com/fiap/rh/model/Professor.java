package br.com.fiap.rh.model;

public class Professor {

    private String nome;
    private int idade;
    private String genero;
    private String materia;

    public Professor(String nome, int idade, String genero, String materia){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.materia = materia;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }

    public void lecionar(){
        System.out.println("O professor " + this.nome + " leciona a matéria de " +this.materia + ".");
    }
}
