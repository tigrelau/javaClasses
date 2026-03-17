package br.com.fiap.rh.test;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Você é:");
        System.out.println("1- Aluno");
        System.out.println("2- Professor");
        System.out.println("Digite a opção desejada (1 ou 2): ");

        int opcao = entrada.nextInt();

        entrada.nextLine();

        if (opcao == 1){
            System.out.println("Bem-vindo a área do aluno");

            System.out.println("Digite seu nome: ");
            String nomeAluno = entrada.nextLine();

            System.out.println("Digite sua idade: ");
            int idadeAluno = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Digite seu gênero: ");
            String generoAluno = entrada.nextLine();

            System.out.println("Digite sua matrícula: ");
            String matriculaAluno = entrada.nextLine();

            System.out.println("Digite seu curso: ");
            String cursoAluno = entrada.nextLine();

            System.out.println("Digite sua turma: ");
            String turmaAluno = entrada.nextLine();

            Aluno alunoTeste = new Aluno(nomeAluno, idadeAluno, generoAluno, matriculaAluno, cursoAluno, turmaAluno);
            System.out.println("Olá " + alunoTeste.getNome() + ", você tem " + alunoTeste.getIdade() + " anos, é do gênero " + alunoTeste.getGenero() + ", está cursando " + alunoTeste.getCurso() + " na turma " + alunoTeste.getTurma() + ", e sua matrícula é " + alunoTeste.getMatricula() + ".");

            alunoTeste.cursar();
        } else if (opcao == 2){

            System.out.println("Bem-vindo a área do professor");

            System.out.print("Digite seu nome: ");
            String nomeProfessor = entrada.nextLine();


            System.out.println("Digite sua idade : ");
            int idadeProfessor = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Digite seu gênero: ");
            String generoProfessor = entrada.nextLine();

            System.out.print("Digite por qual matéria é responsável: ");
            String materiaProfessor = entrada.nextLine();

            Professor professorTeste = new Professor(nomeProfessor, idadeProfessor, generoProfessor, materiaProfessor);
            System.out.print("Olá " + professorTeste.getNome() + ", você tem " + professorTeste.getIdade() + "anos, é do gênero " + professorTeste.getGenero() + " e é responsável por ensinar " + professorTeste.getMateria() + ".");

            professorTeste.lecionar();

        } else {
            System.out.print("Opção inválida! Tente novamente.");
        }
        
        entrada.close();
    }


}
