package br.com.banco.model;

public class ContaBancaria {

    public int conta;
    public int agencia;
    public int banco;
    public double saldo;


    public ContaBancaria(){
        System.out.println("Criando construtor sem parametos");
    }


    public ContaBancaria(int conta, int agencia, int banco, double saldo) {
        System.out.println("Criando construtor com parametros");
        this.conta = conta;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;

    }

    public void transferir(int banco, int agencia, int conta, double valor){
        System.out.println("Transferência realizada com sucesso");
    }


    public void transferir(int agencia, int conta, double valor) {
        System.out.println("Transferência realizada com sucesso");
    }

    public void transferir(double valor, int banco, int agencia, int conta) {
        System.out.println("Transferência realizada com sucesso");
    }


    // Sobrecarga de métodos
    // assinatura de métodos
    // public void transferir(int banco, int agencia, int conta, double valor)
    // public void transferir(int banco2, int banco2, int conta2, double valor2) - mesma assinatura - erro de sobrecarga
    //public void transferir(int agencia, int conta, double valor) - assinatura diferente - sobrecarga OK
    //public void transferir(double valor, int banco, int agencia, int conta) - assinatura diferente - sobrecarga OK


    public void imprimir(){
        System.out.print("O saldo na conta " + this.conta + " da agência " + this.agencia + " é" + this.saldo);
    }
}
