package com.gabrielveras.heranca;

import java.math.BigDecimal;

// Classe base — define o contrato comum para todos os funcionarios.
// abstract impede instanciacao direta de Funcionario.
public abstract class Funcionario {

    private final String nome;
    private final BigDecimal salarioBase;

    public Funcionario(String nome, BigDecimal salarioBase) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome nao pode ser vazio");
        }
        if (salarioBase == null || salarioBase.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Salario deve ser positivo");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Metodo abstrato — cada subclasse define seu proprio calculo de bonus
    public abstract BigDecimal calcularBonus();

    // Metodo concreto — disponivel para todas as subclasses
    public BigDecimal calcularSalarioTotal() {
        return salarioBase.add(calcularBonus());
    }

    public abstract String getCargo();

    public String getNome() { return nome; }
    public BigDecimal getSalarioBase() { return salarioBase; }
}