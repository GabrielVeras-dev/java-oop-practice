package com.gabrielveras.encapsulamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Encapsulamento: todos os campos sao private.
// O saldo nao pode ser alterado diretamente — apenas via metodos controlados.
public class ContaBancaria {

    private final String titular;
    private BigDecimal saldo;
    private final List<String> extrato;

    public ContaBancaria(String titular, BigDecimal saldoInicial) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular nao pode ser vazio");
        }
        if (saldoInicial == null || saldoInicial.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo inicial nao pode ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
        this.extrato = new ArrayList<>();
        this.extrato.add("Conta aberta com saldo inicial: R$ " + saldoInicial);
    }

    // Metodo package-private — acessivel apenas dentro do pacote
    void depositar(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de deposito deve ser positivo");
        }
        this.saldo = this.saldo.add(valor);
        this.extrato.add("Deposito: + R$ " + valor);
    }

    void sacar(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo");
        }
        if (valor.compareTo(this.saldo) > 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        this.saldo = this.saldo.subtract(valor);
        this.extrato.add("Saque: - R$ " + valor);
    }

    // Getters — somente leitura
    public String getTitular() { return titular; }
    public BigDecimal getSaldo() { return saldo; }

    // Retorna copia imutavel do extrato
    public List<String> getExtrato() {
        return Collections.unmodifiableList(extrato);
    }
}