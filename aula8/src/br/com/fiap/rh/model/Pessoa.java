package br.com.fiap.rh.model;

public class Pessoa {

    private String nome;
    private int idade;


    public Pessoa() {
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void maioridadePessoa(){
        if(this.idade < 18){
            System.out.println("Pessoa do nome " + this.nome + " não cadastrada. Menor de idade");
        } else if(this.idade >= 18 && this.idade < 65) {
            System.out.println("Pessoa do nome " + this.nome + " cadastrada com sucesso");
        } else {
            System.out.println("Pessoa do nome " + this.nome + " não cadastrada. Aposentado");
        }
    }

    public void cadastrarPessoa(char caracter){
        switch(caracter){
            case 'A': {
                System.out.println("Nome inicado com A e pode ser cadastrado");
                break;
            }
            case 'E': {
                System.out.println("Nome inicado com E e pode ser cadastrado");
                break;
            }
            case 'I': {
                System.out.println("Nome inicado com I e pode ser cadastrado");
                break;
            }

        }
    }

    public void listarIdade(){

        int idades[] = {12, 10, 15, 20, 25};

        //for(int i=0; idades.lenght; i++){
        //    System.out.println("Idade = " + idades[i]);
       // }

        //for(int x : idades){
            //System.out.println("Idade = " + x);
        //}

        //int i = 0;
        //while (i < idades.length) {
        //    System.out.println("Idade = " + idades[i]);
        //    i++;
        //}

        int i = 0;
        do{
            i++;
            System.out.println("Idade = " + idades[i]);
        }while(i < idades.length);


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}