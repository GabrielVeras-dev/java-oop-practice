package com.gabrielveras.encapsulamento;

import java.math.BigDecimal;

public class ContaService {

    public void depositar(ContaBancaria conta, BigDecimal valor) {
        conta.depositar(valor);
        System.out.println("Deposito de R$ " + valor + " realizado para " + conta.getTitular());
    }

    public void sacar(ContaBancaria conta, BigDecimal valor) {
        conta.sacar(valor);
        System.out.println("Saque de R$ " + valor + " realizado por " + conta.getTitular());
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, BigDecimal valor) {
        origem.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferencia de R$ " + valor
                + " de " + origem.getTitular()
                + " para " + destino.getTitular());
    }

    public void exibirExtrato(ContaBancaria conta) {
        System.out.println("\n--- Extrato de " + conta.getTitular() + " ---");
        conta.getExtrato().forEach(System.out::println);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}