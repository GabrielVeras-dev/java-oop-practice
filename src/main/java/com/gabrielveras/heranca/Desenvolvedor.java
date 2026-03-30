package com.gabrielveras.heranca;

import java.math.BigDecimal;

// Heranca: Desenvolvedor herda de Funcionario com bonus diferente
public class Desenvolvedor extends Funcionario {

    private final String linguagem;

    public Desenvolvedor(String nome, BigDecimal salarioBase, String linguagem) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
    }

    // Bonus do dev: 20% do salario base
    @Override
    public BigDecimal calcularBonus() {
        return getSalarioBase().multiply(new BigDecimal("0.20"));
    }

    @Override
    public String getCargo() { return "Desenvolvedor"; }

    public String getLinguagem() { return linguagem; }
}