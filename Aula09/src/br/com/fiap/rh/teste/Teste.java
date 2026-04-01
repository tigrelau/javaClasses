package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;
public class Teste {

    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setCpf("1111111111");
        aluno.setCurso("Eng. de Software");
        aluno.setMatricula("RM111111");
        aluno.setNome("Bilili");
        aluno.estudar();

        Professor professor = new Professor();
        professor.setCpf("2222222222");
        professor.setDisciplina("Java");
        professor.setMatricula("RM222222");
        professor.setNome("Bololo");
       professor.estudar();
    }
}
