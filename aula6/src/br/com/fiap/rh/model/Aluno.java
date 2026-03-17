package br.com.fiap.rh.model;

public class Aluno {

    private String nome;
    private int idade;
    private String genero;
    private String matricula;
    private String curso;
    private String turma;


    public Aluno(String nome, int idade, String genero, String matricula, String curso, String turma){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.matricula = matricula;
        this.curso = curso;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }

    public void cursar(){
        System.out.println("O aluno " + this.nome + " está cursando " + this.curso + ".");
    }

}
