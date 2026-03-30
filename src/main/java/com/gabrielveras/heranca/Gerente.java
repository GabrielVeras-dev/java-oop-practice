package com.gabrielveras.heranca;

import java.math.BigDecimal;

// Heranca: Gerente herda de Funcionario e sobrescreve calcularBonus()
public class Gerente extends Funcionario {

    private final String departamento;

    public Gerente(String nome, BigDecimal salarioBase, String departamento) {
        super(nome, salarioBase); // chama construtor da classe pai
        this.departamento = departamento;
    }

    // Bonus do gerente: 30% do salario base
    @Override
    public BigDecimal calcularBonus() {
        return getSalarioBase().multiply(new BigDecimal("0.30"));
    }

    @Override
    public String getCargo() { return "Gerente"; }

    public String getDepartamento() { return departamento; }
}