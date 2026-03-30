package com.gabrielveras.heranca;

import java.math.BigDecimal;
import java.util.List;

public class FuncionarioService {

    public void exibirDetalhes(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salario base: R$ " + funcionario.getSalarioBase());
        System.out.println("Bonus: R$ " + funcionario.calcularBonus());
        System.out.println("Salario total: R$ " + funcionario.calcularSalarioTotal());
        System.out.println("---");
    }

    public void listarFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("Total de funcionarios: " + funcionarios.size());
        BigDecimal totalFolha = funcionarios.stream()
                .map(Funcionario::calcularSalarioTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total da folha: R$ " + totalFolha);
    }
}