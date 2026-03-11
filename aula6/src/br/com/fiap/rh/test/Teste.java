package br.com.fiap.rh.test;

import br.com.fiap.rh.model.Aluno;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Digite seu gênero:");
        String genero = entrada.next();

        System.out.println("Você é aluno ou professor?");
        String cargo = entrada.next();

        System.out.println("Qual é a sua turma?");
        String turma = entrada.next();

        if (cargo.toLowerCase().equals("professor")) {
            System.out.println("Qual a sua matéria responsável?");
            String materia = entrada.next();
        }

        System.out.println("Seu nome é " + nome + ", sua idade é " + idade + ", seu gênero é " + genero + " você é " + cargo + " e sua turma é " + turma);


        entrada.close();

    }


}
