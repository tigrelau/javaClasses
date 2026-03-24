package br.com.revisao.test;

import br.com.revisao.model.Aluno;

public class Teste {

    public static void main(String[] args){

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(564560);
        aluno1.setNome("Henrique Castro");
        aluno1.setNota(9.8);

        Aluno aluno2 = new Aluno( 123020, "Ni-ki from Enhypen",9.12);

        System.out.println("Aluno 1");
        System.out.println("Matrícula:" + aluno1.getMatricula());
        System.out.println("Nome:" + aluno1.getNome());
        System.out.println("Nota:" + aluno1.getNota());

        System.out.println("Aluno 2");
        System.out.println("Matrícula:" + aluno2.getMatricula());
        System.out.println("Nome:" + aluno2.getNome());
        System.out.println("Nota:" + aluno2.getNota());

    }

}
