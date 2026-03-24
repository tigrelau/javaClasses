package br.com.fiap.rh.teste;

import br.com.fiap.rh.model.Pessoa;

public class Teste {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Laura", 20);
        pessoa.maioridadePessoa();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdade(20);
        pessoa1.setNome("Teste");
        pessoa1.cadastrarPessoa(pessoa1.getNome().charAt(0));

        pessoa1.listarIdade();
    }
}
