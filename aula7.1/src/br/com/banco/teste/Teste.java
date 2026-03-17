package br.com.banco.teste;

import br.com.banco.model.ContaBancaria;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.agencia = 123;
        conta.banco = 456;
        conta.conta = 789;
        conta.setSaldo(1000.0);

        conta.depositar(1000);
        conta.sacar(100);
        conta.sacar(200);

        conta.imprimir();

        ContaBancaria conta2 = new ContaBancaria(321, 654, 987, 2000.0);

        conta.depositar(1000);
        conta.sacar(100);
        conta.sacar(200);

        conta2.imprimir();

        ContaBancaria conta3 = new ContaBancaria(582, 461, 918, 3000.0);
        conta2.imprimir();



    }
}
