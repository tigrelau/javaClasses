package br.com.fiap.rh.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String matricula;

    public void estudar() {
            System.out.println("Pessoa do nome "+ this.nome + " , CPF: " + this.cpf + " e matrícula " + this.matricula + " está estudando");
    }

    public void corrigirProva() {
        System.out.println("O professor " + this.nome + " está corrigindo as provas");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
