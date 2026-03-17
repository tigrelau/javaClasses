package br.com.banco.teste;

import br.com.banco.model.ContaBancaria;

public class TesteConstrutor {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.agencia = 123;
        conta.banco = 456;
        conta.conta = 789;
        conta.saldo = 1000.0;
        conta.imprimir();

        ContaBancaria conta2 = new ContaBancaria(321, 654, 987, 2000.0);
        conta2.imprimir();

    }

}
